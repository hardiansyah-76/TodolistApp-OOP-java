package repository;

import entity.Todolist;

public interface TodoRepository {
    Todolist[] getAllData();

    void add(Todolist todolist);

    boolean remove(Integer number);
}
