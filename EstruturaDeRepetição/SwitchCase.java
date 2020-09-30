package AULAS.EstruturaDeRepetição;

public class SwitchCase { //case significa "caso"
    public static void main (String[] args){
        int codigo = 5;
        switch (codigo){
            case 1:
                System.out.println("entrei no case 1");
                break;
            case 2:
                System.out.println("entrei no case 2");
                break;
            case 3:
                System.out.println("entrei no case 3");
                break;
            default:
                System.out.println("entrei no default");
                break;
        }         
    }
}
