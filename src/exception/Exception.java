/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author ASUS
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        String names="Truong,Nam,Khanh,Danh";
        String[] arrayName = names.split(",");
        for (int i=0;i< arrayName.length;i++){
            System.out.println(i +1 +"."+arrayName[i].trim());
        }
        System.out.println("Hello World");
        System.out.println("Them Moi");
        
    }

    
    
            
}
