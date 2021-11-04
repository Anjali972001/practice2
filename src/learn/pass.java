package learn;

public class pass {
    public static void main(String[] args) {
        String name = "Anjali";//object
        greet(name);// copy of name is passed.
    }
    static void greet( String name1)
    {
        System.out.println(name1);
    }
}/* in java there is no pass by reference . there is only pass by the value.
     --> both the name and name1 is referring to the same object(Anjali) which is stored in the heap memory.
    */


