// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Carcterísticas

    // 3.2 - Metodos e Funções
    public static void main(String[] args){
        System.out.println("Calculo de Areas");
        calcularAreaModoCompacto();
        calcularAreaModoExtenso();

    }
    public static void calcularAreaModoExtenso(){

        System.out.println("Calculo de Areas Extenso");

        //Calculo de área - Ex.: tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe valor 4
        comprimento = 3; // comprimento receber valor 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de "+largura+ "m e o comprimento de "
                +comprimento+"m a área é de " + resultado + "m².");

    }

    public static void calcularAreaModoCompacto(){

        System.out.println("Calculo de Areas Compacto");

        //Calculo de área reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de "+largura+ "m e o comprimento de "
                +comprimento+"m a área é de " + largura * comprimento + "m².");
    }

}
