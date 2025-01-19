
//The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.

public class Que13 {
    public static void main(String[] args) {
        int area = 184, b = 16, h;
        h = (area * 2)/b;
        System.out.println("Length of other side of triangle: " +h);
    }
}
