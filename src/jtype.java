/* José Antonio Medina Juárez*/
/* Fecha 21 abr 2022
/* Importaciones */
import java.util.*;
import java.io.*;
import javax.swing.*;
/* Clase Main */
public class jtype {

    /* Comienza el programa main */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String ruta;
        System.out.println("Introduce la ruta del fichero");
        
        ruta=teclado.nextLine();
        /*ponemos un comentario para ver si se realiza un commit*/
        try(FileReader lector=new FileReader(ruta);
                BufferedReader leer= new BufferedReader(lector)){
            String linea=leer.readLine();
            
            while(linea!=null){
                System.out.println(linea);
                linea=leer.readLine();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error"+e);
        }
        catch(IOException e){
            System.out.println("Error "+e);
        }
    }

}
/*nuevo cambio para que aparezca en gitkraken*/
