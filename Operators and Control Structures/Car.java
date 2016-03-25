class Vehicle{

}

public class Car extends Vehicle{
public static void main(String args[]){

String s1="Hello";
boolean result=s1 instanceof String;
System.out.println(result);
Vehicle a =new Car();
result = a instanceof Car;
System.out.println(result);
}
}