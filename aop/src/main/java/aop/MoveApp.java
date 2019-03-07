package aop;

public class MoveApp {
    public static void main(String[] args) {
        Move t1=new Tank() ;
        Move t2=new Car();
        Move move=new TankProxy(t1);
        move.move();
    }
}
