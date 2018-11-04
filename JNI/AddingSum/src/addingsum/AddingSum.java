/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingsum;


import java.util.Scanner;

/**
 *
 * @author sriir
 */
public class AddingSum {

    /**
     * @param args the command line arguments
     */
    public native int sum(int a,int b);
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        AddingSum adds=new AddingSum();
        System.out.println("Enter the numbers to be added\n");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int result=adds.sum(a,b);
        System.out.println("Result"+result);
    }
    
}
