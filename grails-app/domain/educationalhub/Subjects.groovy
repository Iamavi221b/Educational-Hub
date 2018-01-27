package educationalhub

class Subjects {
    String name
    String branch
    String about


    static constraints = {
        name blank: false
        branch blank: false
        about blank: false
    }
}
