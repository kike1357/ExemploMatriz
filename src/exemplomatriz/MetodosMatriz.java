
package exemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class MetodosMatriz {
    int[][]notas = new int [3][4];
    int[] notasMedias = new int [3];
    int[] mediaModulos = new int[4];
   //podese cargar asi: int[][]notaM = {{7,9,5,4},{5,5,5,5},{6,7,8,9}} 
public void cargarMatriz(){  
    for(int f=0;f<notas.length;f++){
        for(int c=0;c<notas[f].length;c++){
            notas[f][c]=pedirNota();
}           
}
}
    
public void amosarMatriz(){  
    for(int f=0;f<notas.length;f++){
        for(int c=0;c<notas[f].length;c++){
            System.out.print(notas[f][c]+ "  ");
}        
        System.out.println("\n");
}
}
public int pedirNota(){
    return Integer.parseInt(JOptionPane.showInputDialog("Introducir nota :"));
}
public void calcularMediaNotas(){
    int acumulador;
    for(int f=0;f<notas.length;f++){
            acumulador=0;
        for(int c=0;c<notas[f].length;c++){
          //  notasMedias[f]=
            acumulador=acumulador+notas[f][c];
            
}
        notasMedias[f]= acumulador/notas[f].length;
}
}
public void amosarMediaNotas(){
    calcularMediaNotas();
    for(int f=0;f<notas.length;f++){
        for(int c=0;c<notas[f].length;c++){
            System.out.print(notas[f][c]+ " ");
}
        System.out.println(notasMedias[f]+"\n");
}   
}
public void calcularMediaModulos(){
    int acumulador;
    for(int c=0;c<notas.length;c++){
            acumulador=0;
        for(int f=0;f<notas[f].length;f++){
            
            acumulador=acumulador+notas[c][f];
            System.out.println("*** "+ acumulador);
}
        notasMedias[c]= acumulador/notas[c].length;
        System.out.println("***"+ notasMedias[c]);
}
}
}