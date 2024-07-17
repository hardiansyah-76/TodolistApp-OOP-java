package service;

import entity.Todolist;
import repository.TodoRepository;

public class TodoServiceImpl implements TodoService{

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void showTodolist() {
        Todolist[] data = todoRepository.getAllData();
        System.out.println("Todolist App");

        for (var i = 0; i < data.length; i++) {
            var todo = data[i];
            var number = i + 1;

            if (data[i] != null) {
                System.out.println(number + ". " + todo.getTodolist());
            }

        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todoRepository.add(todolist);
    }

    @Override
    public void removeTodolist(Integer number) {

        boolean success = todoRepository.remove(number);

        if (success) {
            System.out.println("sukses menghapus todo");
        } else {
            System.out.println("gagal menghapus todo");
        }
    }
}
