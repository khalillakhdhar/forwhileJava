package forwhileJava;

public class Intervale {
private int a,b;

public Intervale(int a, int b) {
	this.a = a;
	this.b = b;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}
public void paires()
{
for(int i=a;i<=b;i++)
{
if(i%2==0)
{
System.out.println(i);

}

}

}
}
