package Inheritance;

public class Ref_of_Super{
    public static void main(String[] args) {
        BoxWeight weightbox= new BoxWeight(4, 6, 8, 10.0);
        Box plainBox=new Box();
        double vol;

        vol=weightbox.Volume();
        System.out.println("Volue of weightbox is:"+ vol);
        System.out.println("Weight of weightbox is:"+weightbox.weight);
        System.out.println();

        //assigh Boxweight refrence to Box refrence
        plainBox=weightbox;

        vol=plainBox.Volume(); //OK, Volume is defined in Box
        System.out.println("Volume of plainbox is:"+vol);

        /* The following statement is invail because plainBox does not define a weight member */
    
     // System.out.println("Weight of plainbox is:"+plainBox.weight);

}
}


