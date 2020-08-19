package operadores_relacionais;

public class Relacionais {
    public static void main(String [] args){
        int valor1 = 10;
        int valor2 = 20;
        
        /*
            == igualdade
            != diferente
            >= maior igual
            <= menor igual
            > maior que
            < menor que
        */
        if (valor1 == valor2){
           System.out.println("valores iguais");          
        }else if (valor1 >= valor2){
           System.out.println("valor1 maior ou igual");
        }else if (valor1 != valor2){
            System.out.println("valor1 é diferente do valor2");
        }
    }
}
