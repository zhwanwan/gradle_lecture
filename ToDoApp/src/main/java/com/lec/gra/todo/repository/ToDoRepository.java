package com.lec.gra.todo.repository;

import com.lec.gra.todo.modle.ToDoItem;

import java.util.List;

/**
 * @author zhwanwan
 * @create 2019-07-26 2:49 PM
 */
public interface ToDoRepository {

    List<ToDoItem> findAll();

    ToDoItem findById(Long id);

    Long insert(ToDoItem toDoItem);

    void update(ToDoItem toDoItem);

    void delete(ToDoItem toDoItem);
}
