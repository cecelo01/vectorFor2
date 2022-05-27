/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorfor2;

/**
 *
 * @author Marce
 */
public class VectorFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mes[] = {"Jan", "Fev", "Mar", "Abri", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        String bi = "Nao e bixesto";
        for(int cc=0 ; cc < mes.length; cc++){
                System.out.println("O mes: "+mes[cc]+" tem "+tot[cc]+ " dias.");
                if (tot[cc] == 29){
                bi = "Ano bixesto";
                }
        }
        System.out.println(bi);
    }
    
}
