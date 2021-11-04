package learn;

public class shadowing2 {
   static int x = 90;
   // this will be shadowed at line no- 9
    // because the lower level is overriding the upper level.

    public static void main(String[] args) {
        System.out.println(x);//90
         int x = 40; // class variable at line no - 4 is shadowed by this.
        // scope will actually begin when variable is actually initialized.
         System.out.println(x);
         //40  ---> here the variable with higher level scope will be hidden (instance variable)
        fun();
        // there is scope is overlapping
    }
    static void fun()
    {
        System.out.println(x);//90 as int x= 40; will be available to that method only but int x=90; is available.
    }

    }

