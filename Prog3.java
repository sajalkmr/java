package javalab;

import java.util.ArrayList;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Prog3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Cathy", 103));

        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
