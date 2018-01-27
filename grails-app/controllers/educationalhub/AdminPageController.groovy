package educationalhub

class AdminPageController {

    def index() {
        if(session.mySession)
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

    def addSubject() {
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

    def saveSubject() {
        if (session.mySession) {

            def check = UserLogin.get(session.mySession)

            if (check.role == "ADMIN") {
                def sub = Subjects.findByName(params.subjectName)
                println sub
                if (sub) {
                    flash.exist = "The Subject already exist. Try something else."
                    redirect(action: "addSubject")

                } else {
                    Subjects subName = new Subjects()
                    subName.name = params.subjectName
                    subName.branch = params.branch
                    subName.about = params.about
                    subName.save(flush: true)
                    flash.saveSubject = "New Subject is been Added"
                    redirect(action: "showSubject")
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

    def showSubject() {
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

    def deleteSubject(int id)
    {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def sub = Subjects.get(id)

                def del1 = Books.findAllBySName(sub)
                del1.each {
                    it.sName = null
                }

                def del2 = Topics.findAllBySName(sub)
                del2.each {
                    it.sName = null
                }

                def del3 = Tutorials.findAllBySName(sub)
                del3.each {
                    it.sName = null
                }
                sub.delete(flush: true)
                flash.delete = "Subject is successfully deleted"
                redirect(action: "showSubject")
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

    def updateSubject(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
                   if (check.role == "ADMIN")
                    {
                        def sub = Subjects.get(id)
                        [sub: sub]
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

    def saveUpdate(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                println params
                Subjects sub = Subjects.findById(id)
                sub.name = params.subjectName
                sub.branch = params.branch
                sub.about = params.about
                sub.save(flush: true)
                flash.saveUpdate = "Subject is been successfully updated"
                redirect(action: "showSubject")
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
