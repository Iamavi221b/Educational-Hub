package educationalhub

class Topics {
    String name
    Subjects sName

    static constraints = {
        name unique: true, blank: false
    }
}
