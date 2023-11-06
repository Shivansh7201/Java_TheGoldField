//package basicsofjava;

import java.util.Scanner;

public class TheForLoop {
    public static void main(String[] args) {
       /*
        int x;

        for(x=0;x<10;x++)
        System.out.println("THis,this,the ritmo ritmo of the night :"+x);
        */
        Scanner S1=new Scanner(System.in);
        System.out.println("enter the name:");
        String s= S1.next();

        for(int x=0;x<s.length();x++){
            System.out.println(s+" ");
        }






    }
}
