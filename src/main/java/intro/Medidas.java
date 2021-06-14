// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

import java.sql.SQLOutput;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Carcterísticas

    // 3.2 - Metodos e Funções
    public static void main(String[] args){

        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe SCANNER do Java para ler a escollha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U    D E    O P Ç Õ E S");
        System.out.println("C - Calcular Area Compacta");
        System.out.println("D - Contar Até Dez Crescente");
        System.out.println("E - Calcular Area Extensa");
        System.out.println("F - Contar Até Dez Decrescente");
        System.out.println("I - If Simples");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //switch - selecionar o comportamento do programa coforme a escolha da pessoa ou software

        //String opcao = "extenso";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método  crescente contarAteDez");
                contarAteDez();
                break;
            case "f":
            case "F":
                System.out.println("Você escolheu executar o método decrescente contarAteDez");
                contarAteDezRegressiva();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            default:
                System.out.println("Você escolheu executar um método inexistente!");
                break;
        }
}

    public static void ifSimples(){

        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        //else = senão

        String modo = "compacto";
        if (modo == "compacto"){
            calcularAreaModoCompacto();
        }
        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Calculo de Areas");
        System.out.println("Calculo de Areas Extenso");

        //Calculo de área - Ex.: tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe valor 4
        comprimento = 5; // comprimento receber valor 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de "+largura+ "m e o comprimento de "
                +comprimento+"m a área é de " + resultado + "m².");

    }

    public static void calcularAreaModoCompacto(){

        System.out.println("Calculo de Areas");
        System.out.println("Calculo de Areas Compacto");

        //Calculo de área reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+largura+ "m e o comprimento de "
                +comprimento+"m a área é de " + largura * comprimento + "m².");
    }
    public static void contarAteDez(){

        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem crescrente");

        for (int numero = 1; numero <= 10; numero++){
            System.out.println("Numero: " + numero);
        }
    }

    public static void contarAteDezRegressiva(){

        System.out.println("Contegem Regressiva");

        for (int numero = 10; numero > -1; numero--)
            System.out.println("Numero: " + numero);
    }
}
