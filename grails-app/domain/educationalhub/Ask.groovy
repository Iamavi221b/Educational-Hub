package educationalhub

class Ask {
    String firstName
    String lastName
    String email
    Subjects sName
    String ask
    String ans

    static constraints = {
        firstName blank: false
        lastName blank: false
        email email: true, blank: false
        ask blank: false

    }
}
