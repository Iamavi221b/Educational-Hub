package educationalhub

class BootStrap {

    def init = { servletContext ->
        UserLogin login = new UserLogin(firstName: "Avinash", lastName: "Kumar", email: "avi221b@gmail.com", role: "ADMIN", password: "avi221b"  )
        login.save()

        Subjects sub1 = new Subjects(name: "C - Programming", branch: "Computer Science and Engineering", about: "general-purpose, imperative computer programming language, supporting structured programming")
        sub1.save()

        Subjects sub2 = new Subjects(name: "Data Based Management System", branch: "Computer Science and Engineering", about: "technology of storing and retrieving users’ data with utmost efficiency along with appropriate security measures")
        sub2.save()

        Subjects sub3 = new Subjects(name: "Data Structure", branch: "Computer Science and Engineering", about: "data structure is a particular way of organizing data in a computer so that it can be used efficiently")
        sub3.save()

        Subjects sub4 = new Subjects(name: "ADA", branch: "Computer Science and Engineering", about: "structured, statically typed, imperative, wide-spectrum, and object-oriented high-level computer programming language")
        sub4.save()

        Subjects sub5 = new Subjects(name: "Digital", branch: "Computer Science and Engineering", about: "Digital electronics or digital (electronic) circuits are electronics that handle digital signals")
        sub5.save()

        Subjects sub6 = new Subjects(name: "Theory of Computation", branch: "Computer Science and Engineering", about: "deals with how efficiently problems can be solved on a model of computation, using an algorithm")
        sub6.save()

        Subjects sub7 = new Subjects(name: "Compiler Design", branch: "Computer Science and Engineering", about: "Compiler design principles provide an in-depth view of translation and optimization process")
        sub7.save()

        Subjects sub8 = new Subjects(name: "Computer Networks", branch: "Computer Science and Engineering", about: "A computer network or data network is a digital telecommunications network which allows nodes to share resources")
        sub8.save()
    }
    def destroy = {
    }
}
