package com.example.mypackage;

public class Main {
    public static int multipler = 7;
    public static void main(String[] args) {


        int answer = multiply(6);
        System.out.println("the answer is " + answer);
        System.out.println("Multipler is " + multipler);

    //    StaticTest firstInstance = new StaticTest("1st Instance");
     //   System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
///
      //  StaticTest secondinstances = new StaticTest("2nd instance");
     //   System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

     //   StaticTest Thirdinstances = new StaticTest("3rd instance");
    //    System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());




        //    Account TimsAccount = new Account("Tim");
     //   TimsAccount.deposit(1000);
     //   TimsAccount.withdraw(500);
     //   TimsAccount.withdraw(-200);
     //   TimsAccount.deposit(-20);
      //  TimsAccount.calculateBalance();
//        TimsAccount.balance = 5000;

     //   System.out.println("Balance on account is "+ TimsAccount.getBalance());
   //     TimsAccount.transactions.add(4500);
    //    TimsAccount.calculateBalance();

        //  X x = new X(new Scanner(System.in));
        //x.x();









        //       System.out.println("Hello world!");
//
 //       String privateVar = "this is private to main() ";
 //       ScopeCheck scopeInstance = new ScopeCheck();
//
   //     System.out.println("Scope instance private var is " + scopeInstance.getVar1());
    //    System.out.println(privateVar);
  //      scopeInstance.timesTwo();
    //    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
   //     innerClass.timesTwo();




    }

    public static int multiply(int number){
        return number * multipler;
    }
}