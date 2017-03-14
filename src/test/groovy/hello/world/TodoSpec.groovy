package hello.world


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Todo)
class TodoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:"A domain class is saved with invalid data"
            Todo todo = new Todo(title: "New Task", isComplete: false)
            todo.save()

        then:"There were errors and the data was not saved"
            !todo.hasErrors()
            Todo.count() == 1
    }
}
