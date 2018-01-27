package educationalhub

class UserLoginController {

    def index() { }

    def login() {
        UserLogin check = UserLogin.findByEmailAndPassword(params.email , params.password)
        if(check)
        {
            if(check.role == "ADMIN")
            {
                session.mySession = check.id
                redirect(controller : "AdminPage", action: "index")
            }

            else {
                session.mySession = check.id
                redirect(controller: "UserPage", action: "index")
            }
        }

        else {
            flash.loginMessage = "Invalid email or password"
            redirect(action: "index")
        }
    }

    def signUp() {

    }

    def save() {
        def exist = UserLogin.findByEmail(params.email)

        if (exist)
        {
            flash.exist = "This email is already been used. Try something else."
            redirect(action: "signUp")
        }

        else {
            UserLogin user = new UserLogin()
            user.firstName = params.firstname
            user.lastName = params.lastname
            user.email = params.email
            user.password = params.password
            user.role = "USER"
            user.save(flush : true)
            flash.signup = "New account is successfully created"
            redirect(action: "index")
        }
    }

    def logout() {
        session.invalidate()
        flash.logout = "Logout successfully"
        redirect(action: "index")
    }

}
