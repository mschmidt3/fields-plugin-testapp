package fields.plugin.testapp

class Book {

    String title
    String author
    Integer pages
    Date releasedate
    String description

    static constraints = {
        title  nullable:false
        author nullable:true
        pages nullable:true
        releasedate nullable:true
        description nullabe:true, widget:"textarea"
    }
}
