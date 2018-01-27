package educationalhub

class NameListController {

    def index() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.findAllByRole("USER")
                [name: name]
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def delete(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.get(id)
                name.delete(flush: true)
                flash.delete = "A Account is successfully deleted"
                redirect(action: "index")
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def update(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.get(id)
                [name: name]
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def saveUpdate(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                UserLogin name = UserLogin.findById(id)
                name.firstName = params.fname
                name.lastName = params.lname
                name.password = params.pass
                name.role = params.role
                name.save(flush: true)
                flash.update = "Account is being updated"
                redirect(action: "index")
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def adminList() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.findAllByRole("ADMIN")
                [name: name]
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def updateAdmin(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.get(id)
                [name: name]
            } else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def saveAdmin(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                UserLogin name = UserLogin.findById(id)
                name.firstName = params.fname
                name.lastName = params.lname
                name.password = params.pass
                name.role = params.role
                name.save(flush: true)
                flash.update = "Account is being updated"
                redirect(action: "adminList")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller: "UserLogin", action: "index")
            }
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def userAccount() {
        if (session.mySession) {
            def name = UserLogin.get(session.mySession)
            [name: name]
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def userName(int id) {
        if (session.mySession) {
            def name = UserLogin.get(id)
            [name: name]
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def saveUserName(int id) {
        if (session.mySession) {
            UserLogin name = UserLogin.get(session.mySession)
            name.firstName = params.fname
            name.lastName = params.lname
            name.save(flush: true)
            flash.name = "Name is Updated"
            redirect(action: "userAccount")
        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def userPassword(int id) {
        if (session.mySession) {
            def acc = UserLogin.get(id)
            [acc: acc]

        } else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def saveUserPassword(int id) {
        if (session.mySession) {
            UserLogin check = UserLogin.get(session.mySession)
            if (check.password == params.pass) {
                check.password = params.passw
                check.save(flush: true)
                flash.password = "Password is been changed"
                redirect(action: "userAccount")
            } else {
                flash.pass = "Password do not match"
                redirect(action: "userPassword", id: "${check.id}")
            }
        }
        else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def account() {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.get(session.mySession)
                [name: name]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
            else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def changeName(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def name = UserLogin.get(id)
                [name: name]
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
            else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def saveName(int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                UserLogin name = UserLogin.get(session.mySession)
                name.firstName = params.fname
                name.lastName = params.lname
                name.save(flush: true)
                flash.name = "Name is Updated"
                redirect(action: "account")
            }
            else {
                flash.check = "Don't try to be smart"
                redirect(controller : "UserLogin", action : "index")
            }
        }
            else {
            flash.login = "You must login first"
            redirect(controller: "UserLogin", action: "index")
        }
    }

    def changePassword (int id) {
        if (session.mySession) {
            def check = UserLogin.get(session.mySession)
            if (check.role == "ADMIN") {
                def acc = UserLogin.get(id)
                [acc: acc]
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

    def savePassword(int id)
    {
        if (session.mySession)
        {
            def check1 = UserLogin.get(session.mySession)
            if (check1.role == "ADMIN")
            {
            UserLogin check = UserLogin.get(session.mySession)
            if (check.password == params.pass)
            {
                check.password = params.passw
                check.save(flush : true)
                flash.password = "Password is been changed"
                redirect(action: "account")
            }
            else {
                flash.pass = "Password do not match"
                redirect(action: "changePassword", id:"${check.id}" )
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

}