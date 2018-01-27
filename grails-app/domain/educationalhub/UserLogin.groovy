package educationalhub

class UserLogin {
    String firstName
    String lastName
    String email
    String role
    String password

    static constraints = {
        firstName blank: false
        lastName blank: false
        email email: true, unique: true, blank: false
        password blank: false
        role blank: false
    }
}
