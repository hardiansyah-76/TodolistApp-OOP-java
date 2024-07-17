package Test;

import entity.Todolist;
import repository.TodoRepositoryImpl;
import service.TodoServiceImpl;

public class ServiceTest {

    public static void main(String[] args) {
        serviceRemove();
    }

    public static void serviceShow () {
        TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();
        todoRepository.data[0] = new Todolist("Java");
        todoRepository.data[1] = new Todolist("Kotlin");
        todoRepository.data[2] = new Todolist("Swift");

        TodoServiceImpl todoService = new TodoServiceImpl(todoRepository);
        todoService.showTodolist();
    }

    public static void serviceAddTodoList () {
       TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();
       TodoServiceImpl todoService = new TodoServiceImpl(todoRepository);

        for (int i = 1; i < 10; i++) {
            todoService.addTodolist("My activity List " + i);
        }

        todoService.showTodolist();
    }

    public static void serviceRemove () {
        TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();
        TodoServiceImpl todoService = new TodoServiceImpl(todoRepository);

        todoService.addTodolist("JAVA");
        todoService.addTodolist("KOTLIN");
        todoService.addTodolist("SWIFT");

        todoService.showTodolist();

        todoService.removeTodolist(4);
        todoService.showTodolist();
    }
}
