// If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs.
// per m², find the breadth of the park and its perimeter. Also, find the area of the field.
public class park {
    public static void main(String[] args) {
        int a, b, l = 20, p, cost = 1600, r = 25;
        a = cost/r;
        b = a/l;
        p = 2*(l+b);
        System.out.println("breath is : " + b +   " prameter is : " + p);
    }
}
