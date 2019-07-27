package com.lec.gra.todo.modle;

/**
 * @author zhwanwan
 * @create 2019-07-26 2:46 PM
 */
public class ToDoItem implements Comparable<ToDoItem> {

    private Long id;
    private String name;
    private boolean completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public int compareTo(ToDoItem o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;

        ToDoItem toDoItem = (ToDoItem) o;

        if (isCompleted() != toDoItem.isCompleted()) return false;
        if (!getId().equals(toDoItem.getId())) return false;
        return getName().equals(toDoItem.getName());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (isCompleted() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }
}
