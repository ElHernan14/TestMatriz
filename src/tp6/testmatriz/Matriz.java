/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.testmatriz;

/**
 *
 * @author Hernan57
 */
public class Matriz {
    public Matriz(){}
    
    public int[][] armar(){
        int[][] arreglo = new int[4][];
        int x=0;
        int y=0;
        int llenado=0;
        arreglo[0] = new int[4];
        arreglo[1] = new int[3];
        arreglo[2] = new int[5];
        arreglo[3] = new int[2];
        int[] llenar = {3,6,9,12,15,18,21,24,27,30,33,36,39,42};
        for(x=0;arreglo.length>x;x++){
            for(y=0;arreglo[x].length>y;y++){
                arreglo[x][y]= llenar[llenado];
                llenado++;
            }
        }
        for(x=0;arreglo.length>x;x++){
            System.out.println("Fila 1: ");            
            for(y=0;arreglo[x].length>y;y++){
                if(arreglo[x][y]%2==0){
                    System.out.print(" | " + arreglo[x][y]+ " | ");
                }
            }
            System.out.println("\n----------------------------------------");

        }
        
        
           return arreglo;
        
    }
}
