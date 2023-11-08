//Sleep() means ---> kuch time ke liye thread aaram kare taki dussra thread excecute ho paye 
// Sleep() method defination is under the THREAD CLASS
// Sleep()---> two types their signatures are as follows:-
// 1) Public static native void sleep(long ms);
// (NATIVE) means --->first type of above Sleep method is implemented in other lanuage.
// 2) Public static void Sleep(long ms,int ns);
// here we using long and int simultaneously because when int range will cross then int convert to long

// Always when we use or Working with checked exception in our program we should do two things 
// 1)Interrupted exception should be handle using catch.
//2) intruppted exceptions should be declared.

/**
 * PriorityPauseSleepMethod
 */
public class PriorityPauseSleepMethod {

    public static void main(String[] args) throws InterruptedException{
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
    
}