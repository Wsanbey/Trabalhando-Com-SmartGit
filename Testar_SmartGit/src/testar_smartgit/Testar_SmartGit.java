/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testar_smartgit;

import java.util.Scanner;

/**
 *
 * @author Well
 */
public class Testar_SmartGit {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Entre com um numero inteiro  \n");
        int valorA = sc.nextInt();
        System.out.println("Entre com outro numero inteiro  \n");
        int valorB = sc.nextInt();
        int total = valorA + valorB;
        System.out.printf(""+ valorA + " + "+valorB + " = "+ total + "\n");
    }
    
}
