package javaPackage;

public class Static2 {


int roll; //declare variable global

String name;//declare global var

String college ; //declare global variable



public static void main(String[] args) {

//Static1.method1(); //hi

Static2 s2 = new Static2(); //whenever you create amn object by default one constructor

//is called by jvm at the background

System.out.println(s2.name); //null

System.out.println(s2.roll); //zero

System.out.println(s2.college); //null default value
}
}
