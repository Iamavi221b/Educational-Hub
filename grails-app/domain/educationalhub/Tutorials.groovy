package educationalhub

class Tutorials {
    String name
    Subjects sName

    static constraints = {
        name unique: true, blank: false
    }
}
