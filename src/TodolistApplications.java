import applicationView.ApplicationView;
import repository.TodoRepository;
import repository.TodoRepositoryImpl;
import service.TodoService;
import service.TodoServiceImpl;

public class TodolistApplications {

    public static void main(String[] args) {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);

        ApplicationView applicationView = new ApplicationView(todoService);
        applicationView.showTodoList();
    }
}
