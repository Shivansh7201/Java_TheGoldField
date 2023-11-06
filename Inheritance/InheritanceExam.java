package Inheritance;

// This program uses INHERITANCE to extend Box


//import java.util.*;

class Box{
   double width;
   double height;
   double depth; 
//Constructor clone of an Object 
Box(Box ob){
    width= ob.width;
    height= ob.height;
    depth= ob.depth;
}
// Constructor used when all dimensions Specified
Box(double w,double h, double d){
    width=w;
    height=h;
    depth=d;

}
//Constructor used when no Dimensions Specified
Box(){
    width=-1;
    height=-1;
    depth=-1;

}
//Constructor used when cube is created 
Box(double len){
    width=height=depth=len;
}

// Compute and Return Volume
double Volume(){
    return width*height*depth;
}
}
//Here ,Box is Excecuted to include weight.
class BoxWeight extends Box{
    double weight; //weight of box

    // constructor for BoxWeight
    BoxWeight(double w,double h,double d,double m){
  width= w;
  height=h;
  depth=d;
  weight=m;

    }
}
public class InheritanceExam{

public static void main(String[]args){

    BoxWeight mybox1=new BoxWeight(10,20,15,36.8);
    BoxWeight mybox2=new BoxWeight(2,3,4,0.775);
    double vol;

    vol =mybox1.Volume();
    System.out.println("Volume of mybox1 is: "+vol);
    System.out.println("Weight of mybox1 is: "+mybox1.weight);
    System.out.println();

    vol=mybox2.Volume();
    System.out.println("Volume of mybox2 is: "+ vol);
    System.out.println("Weight of mybox2 is: "+ mybox2.weight);



}

}



