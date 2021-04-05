package forwhileJava;

public class Calcule {
private int a;
private int b;

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

public double factoriel()
{
int f=1;

for (int i=2;i<=a;i++)
{
f=f*i;	
}
return f;

}
int pgcd()
{
	int x=this.a;
	int y=this.b;
	while(x!=y)
	{
		if(x>y)
			x=x-y;
		else
			y=y-x;
	}
	
	
	return x;
}




}
