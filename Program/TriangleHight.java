//The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.

public class TriangleHight  {
    public static void main(String[] args) {
        double b, h, area = 320, x;
        x = Math.sqrt((area*2)/40);
        h = 8*x;
        b = 5*x;
        System.out.println("height is: "+h);
        System.out.println("Base is :" + b);
    }
}
