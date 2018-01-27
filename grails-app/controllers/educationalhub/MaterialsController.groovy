package educationalhub


class MaterialsController {

    def index(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def sub = Subjects.get(id)
                def book = Books.findAllBySName(sub)
                [book: [book, sub]]
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

    def userBook(int id) {
        if (session.mySession) {
            def sub = Subjects.get(id)
            def book = Books.findAllBySName(sub)
            [book: [book, sub]]
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def downloadBook(int id){
        Books documentInstance = Books.get(id)
        if ( documentInstance == null) {
            flash.message = "Document not found."
            redirect (action:'list')
        } else {
            response.setContentType("APPLICATION/OCTET-STREAM")
            response.setHeader("Content-Disposition", "Attachment;Filename=\"${documentInstance.name}\"")
            def file = new File(documentInstance.fullPath)
            def fileInputStream = new FileInputStream(file)
            def outputStream = response.getOutputStream()
            byte[] buffer = new byte[4096];
            int len;
            while ((len = fileInputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
            outputStream.flush()
            outputStream.close()
            fileInputStream.close()
        }
    }


    def adminPdf(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def sub = Subjects.get(id)
                def pdf = Topics.findAllBySName(sub)
                [pdf: [pdf, sub]]
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

    def userPdf(int id) {
        if (session.mySession) {
            def sub = Subjects.get(id)
            def pdf = Topics.findAllBySName(sub)
            [pdf: [pdf, sub]]
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def downloadPdf(int id){
        Topics documentInstance = Topics.get(id)
        println documentInstance.filedata
        if ( documentInstance == null) {
            flash.message = "Document not found."

        } else {
            response.setContentType("APPLICATION/OCTET-STREAM")
            response.setHeader("Content-Disposition", "Attachment;Filename=\"${documentInstance.name}\"")
            def file = new File()
            def fileInputStream = new FileInputStream(file)
            def outputStream = response.getOutputStream()
            byte[] buffer = new byte[4096]
            int len
            while ((len = fileInputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len)
            }
            outputStream.flush()
            outputStream.close()
            fileInputStream.close()
        }
    }

    def adminTut(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def sub = Subjects.get(id)
                def tut = Tutorials.findAllBySName(sub)
                [tut: [tut, sub]]
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

    def userTut(int id) {
        if (session.mySession) {
            def sub = Subjects.get(id)
            def tut = Tutorials.findAllBySName(sub)
            [tut: [tut, sub]]
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def deleteBook(int id) {
        if (session.mySession) {
            def book = Books.get(id)
            book.delete(flush: true)
            redirect(controller: "AdminPage", action: "showSubject")
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
                flash.save = "Book is Updated to the List"
                redirect(controller: "AdminPage", action: "showSubject")
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
                redirect(controller: "AdminPage", action: "showSubject")
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
                redirect(controller: "AdminPage", action: "showSubject")
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

    def deleteTut(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def tutorial = Tutorials.get(id)
                tutorial.delete(flush: true)
                redirect(controller: "AdminPage", action: "showSubject")
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

    def updateTut(int id) {
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
                flash.save = "New Tutorial is updated to the List"
                redirect(controller: "AdminPage", action: "showSubject")
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
