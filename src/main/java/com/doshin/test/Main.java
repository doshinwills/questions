package com.doshin.test;
//file name: Main.java
class Base {
 private void foo() {}
}

class Derived extends Base {
 public void foo() {
	 System.out.println("as");
 } // works fine
}

public class Main {
 public static void main(String args[]) {
     Derived d = new Derived();
     d.foo();
 }
}