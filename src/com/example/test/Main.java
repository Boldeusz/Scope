package com.example.test;

public class Main {

    public static void main(String[] args) {

        String varFour = "this is private to main()";

        Scope scopeInstance = new Scope();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);


        scopeInstance.timesTwo();
        System.out.println("***************************");
        Scope.InnerClass innerClass = scopeInstance.new InnerClass();

        innerClass.timesTwo();
    }
}
