package AULAS.EstruturaDeRepetição;

public class TryCatch {
    public static void main(String[] args) {
        try{ 
            //tenta executar o seu comando
             //caso aconteça algum problema o try manda esse problema para o catch
            int a = 10;
            int calculo;
            calculo = a / 0;                                
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }finally{
            System.out.println("Teimoso, hmmmm");
        }
    }
}
