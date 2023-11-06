import java.util.*;

public class Lifeofvar {
public static void main(String[]args){

int x;

for(x=0; x<3 ; x++){
int y=-1; //y is initialized each time block is Entered

System.out.println("y is :" + y); // This always prints (-1)
y=100;

System.out.println("y is now :"+ y);

}
}
}