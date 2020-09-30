package AULAS.EstruturaDeRepetição;

public class DoWhile {
    public static void main(String[] args) {
        int cont2 = 0; //do while significa "faça enquanto"
        do{
            System.out.println("do while: "+cont2);
            cont2 = cont2 + 1;
        }while(cont2 <= 10);
    }
}
