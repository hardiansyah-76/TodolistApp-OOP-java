package repository;

import entity.Todolist;

public class TodoRepositoryImpl implements TodoRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAllData() {
        return data;
    }

    //logic cek dulu apakah sudah full arraynya
    public boolean isFull () {
        var isfull = true;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isfull = false;
                break;
            }
        }

        return isfull;
    }

    //logic jika array sudah full maka kita resize arraynya

    public void ifArrayIsFull () {
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }


    }

    @Override
    public void add(Todolist todolist) {
        ifArrayIsFull();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }

    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
        }

        return true;
    }
}
