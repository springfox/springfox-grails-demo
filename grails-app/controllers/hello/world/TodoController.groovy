package hello.world


import grails.rest.*
import grails.converters.*

class TodoController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TodoController() {
        super(Todo)
    }
}
