/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Nguyen Hoang
 */
public class Student {
    private double marks;
    private String name;
    private String major;
    
//    constructor
    public Student(double marks, String name, String major) {
        this.marks = marks < 0 ? 0 : (marks > 10 ? 10 : marks);
        this.name = name;
        this.major = major;
    }
    
//    setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setMarks(double marks) {
        this.marks = marks < 0 ? 0 : (marks > 10 ? 10 : marks);
    }
    
//    getters
    public String getName() {
        return name;
    }
    
    public String getMajor() {
        return major;
    }
    
    public double getMarks() {
        return marks;
    }
    
    public String getGrade() {
        if (marks < 3) {
            return "Kém";
        }
        else if(marks >= 3 && marks <= 5) {
            return "Yếu";
        }
        else if(marks > 5 && marks <= 6.5) {
            return "Trung Bình";
        }
        else if(marks > 6.5 && marks <= 7.5) {
            return "Khá";
        }
        else if(marks > 7.5 && marks < 9) {
            return "Giỏi";
        }
        else {
            return "Xuất sắc";
        }
        
    }
    
    public boolean isBonus() {
        return marks >= 7.5;
    }

}
