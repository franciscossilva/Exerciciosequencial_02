import java.util.Scanner;
public class MediaAritmética {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a primeira nota: ");
    double nota1 = input.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = input.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3 = input.nextDouble();
    System.out.print("Digite a quarta nota: ");
    double nota4 = input.nextDouble();
    double media = (nota1+nota2+nota3+nota4)/4;
    System.out.println("A média aritmética é: "+media);

}}
