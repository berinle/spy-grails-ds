import spy.Person

class BootStrap {

    def init = { servletContext ->
        //test data
        new Person(firstName: "Tom", lastName: "Jones").save()
        new Person(firstName: "Julia", lastName: "Mason").save()
        new Person(firstName: "Ruddy", lastName: "Hanks").save()

        log.debug "Done seeding database"
    }
    def destroy = {
    }
}
