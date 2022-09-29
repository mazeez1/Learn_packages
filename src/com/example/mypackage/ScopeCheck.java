package com.example.mypackage;

public class ScopeCheck {
    public int publicVar =0;
    private int var1 = 1;

    public ScopeCheck()
    {
        System.out.println(" ScopeCheck created, public var = " + publicVar + " Private var is " + var1);

    }

    public void timesTwo()
    {
        //LOCAL VARIABLE
        //int privateVar = 2;
        for (int i =0;i<10;i++)
        {
            System.out.println(i + " times two is " + i * var1);
        }
        System.out.println("the value at the attribute private var is " + this.var1);

        //this is an error because I only exists in the scope of that loop block
        //System.out.println("Value of i is now " + i);
    }

    public class InnerClass{
        public int privateVar = 3;

        public InnerClass(){
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }
        public void timesTwo()
        {
            ScopeCheck.this.timesTwo();
            for (int i =0;i<10;i++)
            {
                System.out.println(i + " times two is " + i * privateVar );
            }
        }

    }






















    public int getPublicVar() {
        return publicVar;
    }

    public void setPublicVar(int publicVar) {
        publicVar = publicVar;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }
}
