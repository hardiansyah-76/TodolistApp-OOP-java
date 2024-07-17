package applicationView;

import service.TodoService;
import util.UserInput;

public class ApplicationView {
    private TodoService todoService;

    public ApplicationView(TodoService todoService) {
        this.todoService = todoService;
    }

    public void showTodoList() {
            while (true) {
                todoService.showTodolist();

                System.out.println("MENU : ");
                System.out.println("1. Add Todolist");
                System.out.println("2. remove Todolist");
                System.out.println("x. tekan (x) untuk keluar");

                var input = UserInput.input("Masukkan pilihan anda: ");
                if (input.equals("1")) {
                    addTodoList();
                } else if (input.equals("2")) {
                    removetodoList();
                } else if (input.equals("x")) {
                    break;
                } else {
                    System.out.println("wrong input");
                }
            }
    }

    public void addTodoList() {
        System.out.println("add todo to list");
        var input = UserInput.input("(x) untuk batal");

        if (input.equals("x")) {
            //stop
        } else {
            todoService.addTodolist(input);
        }

    }

    public void removetodoList () {
        var input = UserInput.input("Number to delete: (x) untuk batal");

        if (input.equals("x")) {
            //stop
        } else {
            todoService.removeTodolist(Integer.valueOf(input));
        }
    }
}
