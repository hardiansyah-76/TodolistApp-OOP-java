package Test;

import applicationView.ApplicationView;
import repository.TodoRepository;
import repository.TodoRepositoryImpl;
import service.TodoService;
import service.TodoServiceImpl;

public class ApplicationViewTest {

    public static void main(String[] args) {
        appShowRemoveTodo();
    }

    public static void appShowAllTodo() {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);
        ApplicationView applicationView = new ApplicationView(todoService);

       todoService.addTodolist("JAVA");
       todoService.addTodolist("KOTLIN");
       todoService.addTodolist("SWIFT");

       applicationView.showTodoList();
    }

    public static void appShowAddTodo () {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);
        ApplicationView applicationView = new ApplicationView(todoService);

        applicationView.addTodoList();
        applicationView.showTodoList();

    }

    public static void appShowRemoveTodo () {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);
        ApplicationView applicationView = new ApplicationView(todoService);


        applicationView.removetodoList();

    }

}
