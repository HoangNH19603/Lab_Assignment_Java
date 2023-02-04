package lab3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lab3.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nguyen Hoang
 */
public class QLSV implements IService {
    private ArrayList<Student> listStudents = new ArrayList<>();
   
    @Override
    public ArrayList<Student> select() {
        return listStudents;
    }
    
    public Student select(int index) {
        return listStudents.get(index);
    }
    
    @Override
    public void insert(Student student) {
        listStudents.add(student);
    }
    
    @Override
    public void delete(int index) {
        listStudents.remove(index);
    }
    
    @Override
    public void update(int index, Student student) {
        listStudents.set(index, student);
    }

    public void sortByName() {
        Collections.sort(listStudents, (Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
    }
    
    public void sortByMarks() {
        Collections.sort(listStudents, (Student o1, Student o2) -> o1.getMarks() >= o2.getMarks() ? -1 : 1);
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getMarks() >= o2.getMarks() ? -1 : 1;
//            }
    }
    
}
