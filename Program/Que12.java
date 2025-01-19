//. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of 
//its sides containing the right angle is 12 cm. Find the length of the other side.

public class Que12 {
    public static void main(String[] args) {
        int hy = 13, per = 12;
        double base = Math.sqrt((hy*hy)-(per*per));
        double area;
        area = 1/2*(base*per)/2;
        System.out.println("area of triangle"+ area + "base of a triangle : " + base);
    }
}
