/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Hoang
 */
public interface IService {
    public ArrayList<Student> select();
    public void insert(Student student);
    public void delete(int index);
    public void update(int index, Student student);
}
