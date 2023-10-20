public class CalculadoraTest {
    
    public static void main(String[]arg){

        Calculadora calc = new Calculadora();
        calc.sumar(5);

        calc.restar(1);

        calc.dividir(2);

        calc.imprimir();


         Calculadora calc2 = new Calculadora(10000);
        calc2.sumar(5);

        calc2.restar(1);

        calc2.dividir(2);

        calc2.imprimir();

    }

}
