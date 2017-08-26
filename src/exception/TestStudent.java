
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.ArrayList;

/**
 
 * @author ASUS
 */
public class TestStudent {
    public static void main(String[] args) {
        System.out.println("");
        Student student01 = new Student();
        student01.setName("Truong");
        student01.setEmail("truong@gmail.com");
        student01.setBirthday("22/12/1980");
        
        Student student02 = new Student();
        student02.setName("Dung");
        student02.setEmail("Dung@gmail.com");
        student02.setBirthday("20/12/1990");
        
       ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(student01);
        listStudent.add(student02);
    }
    
}
