package com.lec.gra.todo.repository;

import com.lec.gra.todo.modle.ToDoItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zhwanwan
 * @create 2019-07-26 2:51 PM
 */
public class InMemoryToDoRepository implements ToDoRepository {

    private AtomicLong currentId = new AtomicLong();
    private Map<Long, ToDoItem> toDos = new ConcurrentHashMap<>();

    @Override
    public List<ToDoItem> findAll() {
        List<ToDoItem> toDoItems = new ArrayList<>(toDos.values());
        Collections.sort(toDoItems);
        return toDoItems;
    }

    @Override
    public ToDoItem findById(Long id) {
        return toDos.get(id);
    }

    @Override
    public Long insert(ToDoItem toDoItem) {
        Long id = currentId.incrementAndGet();
        toDoItem.setId(id);
        toDos.putIfAbsent(id, toDoItem);
        return id;
    }

    @Override
    public void update(ToDoItem toDoItem) {
        toDos.replace(toDoItem.getId(), toDoItem);
    }

    @Override
    public void delete(ToDoItem toDoItem) {
        toDos.remove(toDoItem.getId());
    }
}
