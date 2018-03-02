/*
Se tiene un arreglo de cinco numeros enteros y regresa el resultado de sumar solo los numeros
pares que hay dentro del arreglo, la suma de los impares y la suma total.
 */
package paresimparesmedia;
import javax.swing.*;
public class ParesImparesMedia {

    public static void main(String[] args) {
        int i,n=5,b;
        int v[]=new int[n],sumtot=0,sumimpar=0,sumpar=0;
        for (i=0;i<n;i++){
            v[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a sumar "));//Se llena el vector
            b=v[i]%2;//Es par o no?
            if(b==0)
                sumpar+=v[i];//Si lo es se acumula en esta variable
            else
                sumimpar+=v[i];//Si no en esta
            sumtot+=v[i];//Se acumulan todos los numeros tanto pares como impares
                
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros pares es "+sumpar);
        JOptionPane.showMessageDialog(null,"La suma de los numeros impares es"+sumimpar);
        JOptionPane.showMessageDialog(null,"La suma total es "+sumtot);
    }
    
}
