package com.example.mypackage;

// Challenge

// What is the visibility of :
// 1. the accessible interface  :       ANS: It is set to package private, it is accesihble to all com.example.package.
                                            // All inteface variables are public static final
// 2. the int variable SOME_CONSTANT:   ANS: its just a standard public
// 3. methodA?                          ANS: also public, all interface methods are public
// 4. methodB and methodC               ANS: also public because they cannot be private.  remember that interfaces MUST implement all methods.
interface Accessible{
    //What is the
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}