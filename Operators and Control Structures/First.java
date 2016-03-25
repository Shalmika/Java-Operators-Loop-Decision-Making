public class First{
	public static void main(String args[]){
		int x=3;
		String name="Dirk";		
		x=x*3;//operator
System.out.println("x is : " +x);
while(x>3)	//while loop
{
	x=x-1; //operator
System.out.print(x);
}
for(int i=0;i<10;i++){
//for loop
	System.out.println(i);
}

if(x==10) // if else (equals operator) (boolean test)
{
	System.out.println("x is 10");
}
else {
	System.out.println("x is not 10");
}
if ((x < 4) & (name.equals("Dirk"))) // if statement
{
	System.out.println("Gently");
}
System.out.println("this line runs no matter what");
x=1; // assignment operator
System.out.println("Begin");
while(x<4){
System.out.println("In");
System.out.println("x:"+x);
x++;//operator
}
System.out.println("End");
x=1;
//while(x) // incompatible types
{
System.out.println("x is int");
}
while(x<3){
	System.out.print("Doo");
System.out.print("Bee");
x++;
}
if(x==3){
	System.out.print("Do");
}
String[] one={"sdf","dfasfd","dfsfd","dfefe"};
String[] two={"dsf","dfee","yjyuh","uyyyiyu","weqwesc"};
String[] three={"dsfcawe","dfaew","dfaweher"};

int ol=one.length;
int tl=two.length;
int tll=three.length;

int rand1=(int)(Math.random()*ol);

int rand2=(int)(Math.random()*tl);

int rand3=(int)(Math.random()*tll);
String phrase=ol +" " + tl + " " + tll; // concatenation operator
System.out.println(phrase);

String phrase1=one[rand1]+" " +two[rand2]+" " +three[rand3];
System.out.println(phrase1);


int y=(int)24.6;
System.out.println(y);
	}
}