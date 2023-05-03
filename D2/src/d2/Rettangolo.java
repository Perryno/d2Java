package d2;

public class Rettangolo {
double altezza;
double larghezza;

public Rettangolo(double altezza, double larghezza) {
	this.altezza = altezza;
	this.larghezza = larghezza;
	
	
}
void area() {
System.out.println(altezza * larghezza);
}
void perimetro() {
	System.out.println((altezza * 2)+(larghezza * 2));
}

}