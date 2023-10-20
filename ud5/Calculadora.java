
public class Calculadora {

public double resultado = 0;
    public Calculadora(){}

    public Calculadora(double x){
        this.resultado= x;

    }

    public void sumar(double x) {
        this.resultado = this.resultado + x;

    }

    public void restar(double x) {
         this.resultado = this.resultado - x;
        
    }
    

    public void dividir(double x) {
        this.resultado = this.resultado / x;
        
    }


    public void reset() {
        this.resultado=0;
        
    }


    public void imprimir() {
        System.out.println("Valor actual calculadora: " + this.resultado);
        
    }

    

}
