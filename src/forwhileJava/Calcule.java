package forwhileJava;

public class Calcule {
private int a;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
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

}
