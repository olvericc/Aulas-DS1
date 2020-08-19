package operadores_logicos;

public class Logicos {
    public static void main(String[] args) {
        /*
            || == OR == 'ou'
            && == AND == 'e'
            !  == NOT == 'não'
        */
        /*
            TABELA &&
            idade = 8
            condicao1 && condicao2
            idade >= 5 && idade <= 10
                v      &&   v = v (se ambos forem verdadeiros)
                v      &&   f = f 
                f      &&   v = f 
                f      &&   f = f 
        */
        int idade = 3;
        if (idade >=5 && idade <= 10){    
            System.out.println("idade entre 5 a 10 anos");
        }
        /*
            TABELA ||
            idade = 8
            idade >= 5 || idade <= 10
                v      ||      v = v
                v      ||      f = v
                f      ||      v = v
                f      ||      f = f (se ambas forem falsas)
        */
        if (idade >= 5 || idade <= 10){
            System.out.println("resposta final verdadeira");
        }
        /*
            TABELA !
            ! v = f
            ! f = v
        */
        if (!(idade >= 5)) {
            System.out.println("idade é >= 5");
        }
    }
}
