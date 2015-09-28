package grails.plugin.formfields.mock

import grails.persistence.Entity

@Entity
class Widget {
    int width

    static constraints = {
        width range: 1..100
    }
}


