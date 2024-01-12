package javaPackage;

public  class Encapsulation1 {
String name;
 int b;   //global variable
final int c = 2;  //final variable    used to restrict user use final keyword

public  void a() {
//c=7;	final  var
//}

//final method
//final void d() {
//	System.out.println("final method");
}
public  void setName(String s) {
this.name=s;
this.b=6;
System.out.println(b);
System.out.println(c);
	}
public String getName() {
	return name;

}
}
