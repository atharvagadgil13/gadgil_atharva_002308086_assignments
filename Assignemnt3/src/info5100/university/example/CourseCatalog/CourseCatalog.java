/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    private Department department;
    private String lastupdated;
    private ArrayList<Course> courselist; 
    public CourseCatalog(Department d){
        this.courselist = new ArrayList();
        this.department = d;
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public Course newCourse(String name, String courseNumber, int credits){
        Course c = new Course(name,courseNumber,credits);
        courselist.add(c);
        return c;
    }
    
    public Course getCourseByNumber(String courseNumber){

        for( Course c: courselist){
            
            if(c.getCOurseNumber().equals(courseNumber)) return c;
        }
        return null;
    }
    
    public ArrayList<Course> browseCourses(){
        return new ArrayList<>(courselist);
    }

}