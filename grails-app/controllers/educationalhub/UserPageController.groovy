package educationalhub

class UserPageController {

    def index() {
        if(session.mySession)
        {
            [sub: Subjects.list()]
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def submit(){
        if(session.mySession)
        {
            def var = UserLogin.get(session.mySession)
            Ask ques = new Ask()
            ques.firstName = var.firstName
            ques.lastName = var .lastName
            ques.email = var.email
            def sub = Integer.parseInt(params.sub)
            println params.sub
            ques.sName = Subjects.get(sub)
            ques.ask = params.ask
            ques.ans = "We will reply you soon. Wait for your answer!"
            ques.save(flush : true)
            println ques.ask
            redirect(action: "query")
        }
        else {
            flash.login = "You must login first"
            redirect(controller : "UserLogin", action : "index")
        }
    }

    def query()
    {
        if (session.mySession)
        {
            def var = Ask.get(session.mySession)
            def ask = Ask.findAllByEmail(var.email)
            [var : ask]
        }
    }

}
