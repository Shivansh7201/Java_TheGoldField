//import java.beans.IntrospectionException;

class Test extends Thread{
    public void run(){ // we can't write or use "throws InterruptedException" because we overridded the run method 

            try{
                for(int i=1;i<=5;i++)
            System.out.println("Child THread");
            Thread.sleep(3000); // this method stops or pause the  Excecution of child and continue after the main thread 
        }
        catch(Exception e){

        }
    }
    }
class PriorityPauseSleep2Method{
    public static void main(String[] args)throws InterruptedException {
        Test t2=new Test();
        t2.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
         //   Thread.sleep(2000);
        }
        

    }
}