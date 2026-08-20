import java.util.Scanner;
public class Exercicio4{
    static public void main(String abc []){
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite um número inteiro");
       //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
       int numero = leitor.nextInt();
    //    if(numero % 2 == 0){
    //     System.out.println("O número é par");
    //     System.out.println("Até mais");
    //    }
    //     else // dangling else
    //     System.out.println("O número é ímpar");
      System.out.println(numero % 2 == 0 ? "Par" : "Ímpar");
        leitor.close();  

       
    }
}