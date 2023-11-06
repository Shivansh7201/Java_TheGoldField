// import java.util.*;

public class AbleToVote{
    public static void main(String[] args) {
        int p=20; //p---> No, of Peoples
        int m=2; //m--->Voting Machines
        while(p>0){
                   if(p<=10 && m<=2){
                   System.out.println("Voting cannot Performming NOW!!!");
                   }else if(p>10 && m>2){
                    System.out.println("VOting Continue!!!");
                  }else{
                     System.out.println("Voting going on in manually MODE !!!");
                    }
                    p--;
               }
    }
}