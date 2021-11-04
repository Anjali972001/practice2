package learn;

public class shadowing {
    static int d =10 ;
    public static void main(String[] args) {
        System.out.println(d);
        anjali();

    }
    static void anjali()
    {
        System.out.println(d);
    }
}
     /* output - 10
                 10

     *** variable Shadowing - If instance variable and local variable have the same name, or we
                              can say that shadowing is the practice of using two variable with same name
                              within the scope that overlap.
                              */
