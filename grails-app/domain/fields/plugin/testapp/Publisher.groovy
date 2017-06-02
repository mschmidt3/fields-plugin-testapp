package fields.plugin.testapp

class Publisher {
    String name
    String address

    static constraints = {
        name      nullable:false
        address   nullable:true, widget:'textarea'
        
    }
}
