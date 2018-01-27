package educationalhub

class Books {
    String name
    String fullPath
    int fileType = 0
    String author
    String date
    String publication
    Date uploadDate = new Date()
    Subjects sName

    static constraints = {
        name unique: true, blank: false
        author blank: false
        date blank: false
        publication blank: false
        fullPath blank: false, nullable: false
    }
}
