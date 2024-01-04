import java.util.Scanner;

/*******************************************************************************
 * 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
 *   O módulo de um número x é:
 *   x se x é maior ou igual a zero
 *   x * (-1) se x é menor que zero
 *******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninteiro,Modulo;
       System.out.println("Digite um numero inteiro");
        ninteiro = sc.nextInt();
       if( ninteiro >= 0){
          Modulo = ninteiro * (-1);
          System.out.println(Modulo);
          }
       }

    }

