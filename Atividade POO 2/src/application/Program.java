package application;

import entities.Transportadora;
import entities.TransporteNautico;
import entities.TransporteTerrestre;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Transportadora nautica = new TransporteNautico();
        Transportadora terrestre = new TransporteTerrestre();


        System.out.println("Escreva a autura e a largura:");
        System.out.print("->");
        int altura = sc.nextInt();
        System.out.print("->");
        int largura = sc.nextInt();


        double freteNautico = nautica.calculaFrete(altura, largura);
        double freteTerrestre = terrestre.calculaFrete(altura, largura);

        System.out.println("Frete Transporte Náutico: " + freteNautico);
        System.out.println("Frete Transporte Terrestre: " + freteTerrestre);
    }
}
