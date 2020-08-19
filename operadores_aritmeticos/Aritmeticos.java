package operadores_aritmeticos;

public class Aritmeticos {
    public static void main(String[] args) {
        int valor1 = 3; //atribui valor à variável
        int valor2 = 10; //atribui valor à variável
        int calculo = 0; //
        
        calculo = valor1 + valor2; // "+" soma
        calculo = valor1 - valor2; // "-" subtração
        calculo = valor1 / valor2; // "/" divisão 
        calculo = valor1 % valor2; // "%" pega o resto da divisão       
        //calculo = valor1 * valor2; // "*" multiplicação
        
        System.out.println("calculo: " + calculo);
        
        if(valor2 % valor1 ==0)
        {//INICIO
            System.out.println("PAR");
        }//FIM
        else
        {//INICIO
            System.out.println("IMPAR");
        }//FIM
        
        //incremento
        valor1++;
        //valor1 = valor1 + 1;
        System.out.println("valor1 " + valor1);
        
        //decremento
        //valor1--;
        //valor1 = valor1 -1;
        System.err.println("valor1 " + valor1);
    }
}
