public class Calculadora {

    //Instancear de alguna manera
    //Dependencia
    //Servicio que no controlo
    //Para eso existen los mocks, nos ayudan a generar una instacia alternativa con comportamiento predecible
    //para realizar nuestras pruebas unitarias
    CalculadoraAWS calculadoraAWS;

    public double sumar(double a, double b){
        return  a + b;
    }

    public double restar(double a, double b){

        return  a - b;
    }

    public double multiplicar(double a, double b){

        return  a * b;
    }

    public double dividir(double a, double b){

        return  a / b;
    }

    public double sumarEnAWS(double a, double b){
        //Metodo dependiente de otra clase
        return calculadoraAWS.sumar(a, b);
    }


}
