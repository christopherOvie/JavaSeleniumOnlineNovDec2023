package javaPackage;

public class Static5 {

static int z =5;//define at class level

int y =7;

//static method

public static void a() {

z=10;//modify z bc its static

System.out.println("this is "+z); //10

}

public void b() {

z=15;

System.out.println("another "+z); //15

a();

}

public static void main(String[] args) {

System.out.println(z);//5 direct to variable

a();

Static5 s5 = new Static5();

s5.b();

}

//10

//15

//10


}
