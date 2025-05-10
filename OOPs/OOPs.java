package OOPs;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.printColor();

        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ball";
        pen2.printColor();
        
  
}
}