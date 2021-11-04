
/*                   function  scope :-

if define any variable in a function or the method then we can access it only inside that method
  not outside it.

if there is any change in that variable then its scope will only valid to that function.


                  Block Scope:-

-- int a = 10 ; if 'a' is initialized once then we cannot initialize again and again .
But we can change the value by a= 20; . so, we cannot initialize the same reference variable again and again.


 if we are in same method or the function and the value is initialized once then we cannot initialize it again.


 **** if we initialize the value inside the block then it can be used inside that block only.means
  that values initialized in this block will be remained in that block.


                 loop scope :-

   *** for(int i = 0; i<6 ; i++)
   {
   }
   system.out.println(i)---

  ---> if once 'i' is initialized in the for loop then it cannot be initialized again.
  ---> anything that is initialized outside cannot be initialized inside , but we can use it inside the block
      (updating the variable 'a')but if anything that is initialized inside can be initialized again outside the
      block but cannot be used outside the block.


 */


