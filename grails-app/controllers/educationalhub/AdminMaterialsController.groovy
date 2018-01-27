package educationalhub

class AdminMaterialsController {

    def index() {
        if (session.mySession)
        {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN")
            {

            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }

        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def addBook() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                [sub: Subjects.list()]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def saveBook() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def exist = Books.findByName(params.name)
                def file = request.getFile('file')
                if (exist) {
                    flash.exist = "The Name of Book is already Used. Try something else."
                    redirect(action: "addBook")
                } else {
                    Books newBook = new Books()
                    newBook.name = params.name
                    newBook.author = params.author
                    newBook.date = params.date
                    newBook.publication = params.publication
                    newBook.sName = Subjects.get(Integer.parseInt(params.sub))
                    newBook.fullPath = grailsApplication.config.uploadFolder + newBook.name
                    newBook.save(flush: true)
                    flash.save = "New Book is Added to the List"
                    redirect(action: "showBook")
                }
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def showBook() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
         if (check.role == "ADMIN")
                    {
                        [book: Books.list()]
                    }
         else {
             flash.check = "Don't try to be smart"
             redirect(controller : "UserLogin", action : "index")
         }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def deleteBook(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def book = Books.get(id)
                book.delete(flush: true)
                flash.delete = "Book is successfully deleted"
                redirect(action: "showBook")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def updateBook(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def book = Books.get(id)
                [book: [book, Subjects.list()]]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def saveUpdateBook(int id){
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                Books newBook = Books.findById(id)
                newBook.name = params.name
                newBook.author = params.author
                newBook.date = params.date
                newBook.publication = params.publication
                newBook.sName = Subjects.get(Integer.parseInt(params.sub))
                newBook.save(flush: true)
                flash.update = "Book is Updated to the List"
                redirect(action: "showBook")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def addPdf() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                [sub: Subjects.list()]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def savePdf() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def file = request.getFile('file')
                def exist = Topics.findByName(params.name)
                if (exist) {
                    flash.exist = "The Name of PDF is already Used. Try something else."
                    redirect(action: "addPdf")
                } else {
                    Topics newPdf = new Topics()
                    newPdf.name = params.name
                    newPdf.sName = Subjects.get(Integer.parseInt(params.sub))
                    newPdf.filedata = file.getBytes()
                    newPdf.save(flush: true)
                    flash.save = "New PDF is Added to the List"
                    redirect(action: "showPdf")
                }
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def showPdf() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                [pdf: Topics.list()]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def deletePdf(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def pdf = Topics.get(id)
                pdf.delete(flush: true)
                flash.delete = "PDF is successfully deleted"
                redirect(action: "showPdf")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def updatePdf(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def pdf = Topics.get(id)
                [pdf: [pdf, Subjects.list()]]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def saveUpdatePdf(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                Topics newBook = Topics.findById(id)
                newBook.name = params.name
                newBook.sName = Subjects.get(Integer.parseInt(params.sub))
                newBook.save(flush: true)
                flash.save = "New PDF is updated to the List"
                redirect(action: "showPdf")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def addTutorial() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                [sub: Subjects.list()]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def saveTutorial() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def exist = Tutorials.findByName(params.name)
                if (exist) {
                    flash.exist = "The Name of Tutorail is already Used. Try something else."
                    redirect(action: "addTutorial")
                } else {
                    Tutorials newTutorial = new Tutorials()
                    newTutorial.name = params.name
                    newTutorial.sName = Subjects.get(Integer.parseInt(params.sub))
                    newTutorial.save(flush: true)
                    flash.save = "New Tutorial is Added to the List"
                    redirect(action: "showTutorial")
                }
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def showTutorial() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                [tutorial: Tutorials.list()]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def deleteTutorial(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def tutorial = Tutorials.get(id)
                tutorial.delete(flush: true)
                flash.delete = "Tutorial is successfully deleted"
                redirect(action: "showTutorial")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def updateTutorial(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def tutorial = Tutorials.get(id)
                [tutorial: [tutorial, Subjects.list()]]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def saveUpdateTutorial(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                Tutorials newTutorial = Tutorials.findById(id)
                newTutorial.name = params.name
                newTutorial.sName = Subjects.get(Integer.parseInt(params.sub))
                newTutorial.save(flush: true)
                flash.Update = "New Tutorial is updated to the List"
                redirect(action: "showTutorial")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

}
