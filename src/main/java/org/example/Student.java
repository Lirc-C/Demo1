package org.example;

public class Student {
    private String name;
    private Address add;

    public void show(){
        System.out.println("A man named -" + name + "- lives in -" + add.getCity() + "-.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}
