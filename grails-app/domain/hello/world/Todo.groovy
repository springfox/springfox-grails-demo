package hello.world


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Todo {
    Long id
    String title
    boolean isComplete
}