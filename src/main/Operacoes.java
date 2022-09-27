//Atualizado no PC em 27/09/2022
package main;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operacoes {
    private double n1, n2;
    private double res;
    private int escolha;
    Scanner sc = new Scanner(System.in);
    
    private void somar(){
        try{
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextDouble();
            System.out.println("Digite o segundo número:");
            n2 = sc.nextDouble();
                res = n1 + n2;
            System.out.println("O resultado da soma é "+ res);
        }catch(Exception e){
            System.out.println("O ocorreu um erro de leitura. Digite apenas números.");
        }//fim de try-catch    
    }//fim do método 
    
    private void subtrair(){
        try{
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            n2 = sc.nextInt();
                res = n1 - n2;
            System.out.println("O resultado da subtração é "+ res);
        }catch(Exception e){
            System.out.println("O ocorreu um erro de leitura. Digite apenas números.");
        }//fim de try-catch    
    }//fim do método 
    
    private void multiplicar(){
        try{
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            n2 = sc.nextInt();
                res = n1 * n2;
            System.out.println("O resultado da multiplicação é "+ res);
        }catch(Exception e){
            System.out.println("O ocorreu um erro de leitura. Digite apenas números.");
        }    
    }//fim do método 
    
    private void dividir(){
        try{
            System.out.println("Digite o primeiro número:");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            n2 = sc.nextInt();    
                res = n1 / n2;
            System.out.println("O resultado da divisão é "+ res);
        }catch(Exception e){
            System.out.println("O ocorreu um erro de leitura. Digite apenas números.");
        }//fim de try-catch    
    }//fim do método 
    //Abaixo, menu para que o usuário possa escolha uma das opções
    public void escolher(){
        System.out.println("Bem vindo ao CalculaSimples v1.0\n");
        try{
            System.out.println("Digite uma das opções abaixo:\n1-Adição;\n2-Subtração;\n3-Multiplicação;\n4-Divisão.");        
                switch(escolha = sc.nextInt()){
                    case 1:
                        somar();
                        break;
                    case 2:
                        subtrair();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        dividir();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Número inválido.\nDigite 1 para 'novo cálculo' ou 0 para 'sair do programa'");
                            escolha = sc.nextInt();
                                if(escolha == 1){
                                    escolher();
                                }else{
                                    System.exit(0);
                                }                        
                }//fim de switch
        }catch(Exception e){
            System.out.println("O ocorreu um erro de leitura. Digite apenas números.");                 
        }//fim de try-catch
    }//fim do método
    
}//fim da classe
