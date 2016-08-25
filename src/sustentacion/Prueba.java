/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

/**
 *
 * @author Usuario
 */
public class Prueba extends Deportista {
    int[] estilos=new int[4]; //poc[0]=libre. poc[1]=mariposa. poc[2]=pecho. poc[3]=espalda.
    int pr;
    boolean var=false;

    public int getEstilos(int a) {
        return estilos[(a-1)];
    }
    
    
    
    public void ingresar_prueba(){  
        do{
            System.out.println("\nIngrese la prueba en a que va a competir: "
                               +"\n1.Libre."
                               +"\n2.Mariposa."
                               +"\n3.Pecho."
                               +"\n4.Espalda.");
            pr=lector.nextInt();
            switch(pr){
                case 1:
                    estilos[0]=1;
                    var=true;
                    break;
                case 2:
                    estilos[1]=1;
                    var=true;
                    break;
                case 3:
                    estilos[2]=1;
                    var=true;
                    break;
                case 4:
                    estilos[3]=1;
                    var=true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.\n");
                    break;
            }
        }while(var==false);
    }
    
    public void eliminar_prueba(){  
        do{
            System.out.println("\nIngrese la prueba de la que lo va a eliminar\n"
                               +"1.Libre.\n"
                               +"2.Mariposa.\n"
                               +"3.Pecho.\n"
                               +"4.Espalda.\n");
            pr=lector.nextInt();
            switch(pr){
                case 1:
                    estilos[0]=0;
                    var=true;
                    break;
                case 2:
                    estilos[1]=0;
                    var=true;
                    break;
                case 3:
                    estilos[2]=0;
                    var=true;
                    break;
                case 4:
                    estilos[3]=0;
                    var=true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.\n");
                    break;
            }
        }while(var==false);
    }
}
