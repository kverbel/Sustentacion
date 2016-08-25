/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        ArrayList<Prueba> deportistas = new ArrayList<Prueba>();
        boolean val=false,var=false,val2=false;
        int opp,op,aux;
        do{
            System.out.println("\nIngrese la opción deseada: "
                               +"\n1.Gestion de deportistas."
                               +"\n2.Gestion de competencias."
                               +"\n3.Salir.");
            opp=lector.nextInt();
            switch(opp){
                case 1:
                    do{
                    System.out.println("\n...  Actualmente hay "+deportistas.size()+" deportistas guardados  ..."
                                       +"\n1. Agregar un nuevo deportista."
                                       +"\n2. Actualizar deportista."
                                       +"\n3. Eliminar deportista."
                                       +"\n4. Mostrar deportista."
                                       +"\n5. Salir."
                                       +"\n\nSeleccione la opcion deseada: ");
                    op=lector.nextInt();  

                    switch(op){
                        case 1:
                            Prueba persona=new Prueba();
                            persona.ingresar_datos();
                            deportistas.add(persona);
                            break;
                        case 2:
                            System.out.println("\n\n\nIngrese el documento del deportista que desea actualizar.");
                            aux=lector.nextInt();
                            for (int i=0;i<deportistas.size();i++){
                                if (deportistas.get(i).getDoc()==aux){
                                    deportistas.get(i).ingresar_datos();
                                    i=deportistas.size();
                                }
                                else if(i==(deportistas.size()-1)){
                                    System.out.println("El documento no se encuentra registrado\n");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("\n\n\nIngrese el documento del deportista que desea eliminar.");
                            aux=lector.nextInt();
                            for (int i=0;i<deportistas.size();i++){
                                if (deportistas.get(i).getDoc()==aux){
                                    deportistas.remove(i);
                                    i=deportistas.size();
                                }
                                else if(i==(deportistas.size()-1)){
                                    System.out.println("El documento no se encuentra registrado\n");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("\n\n\nIngrese el documento del deportista que desea ver.");
                            aux=lector.nextInt();
                            for (int i=0;i<deportistas.size();i++){
                                if (deportistas.get(i).getDoc()==aux){
                                    deportistas.get(i).show();
                                    i=deportistas.size();
                                }
                                else if(i==(deportistas.size()-1)){
                                    System.out.println("\nEl documento no se encuentra registrado\n");
                                }
                            }
                            break;
                        case 5:
                            val=true;
                            break;
                        default:
                            System.out.println("\n\n\nIngrese una opcion correcta.");
                            break;
                    }

                    }while(val==false);
                    val=false;
                    break;
                case 2:
                    do{
                        System.out.println("\nIngrese la opción deseada: "
                                           +"\n1.Inscribir en competencia."
                                           +"\n2.Eliminar nadador de una prueba."
                                           +"\n3. Mostrar prueba."
                                           +"\n4.Salir.");
                        op=lector.nextInt();
                        switch(op){
                            case 1:
                                System.out.println("\n\n\nIngrese el documento del deportista al que desea inscribir.");
                                aux=lector.nextInt();
                                for (int i=0;i<deportistas.size();i++){
                                    if (deportistas.get(i).getDoc()==aux){
                                        deportistas.get(i).ingresar_prueba();
                                        i=deportistas.size();
                                    }
                                    else if(i==(deportistas.size()-1)){
                                        System.out.println("El documento no se encuentra registrado\n");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("\n\n\nIngrese el documento del deportista al que desea eliminar de una prueba.");
                                aux=lector.nextInt();
                                for (int i=0;i<deportistas.size();i++){
                                    if (deportistas.get(i).getDoc()==aux){
                                        deportistas.get(i).eliminar_prueba();
                                        i=deportistas.size();
                                    }
                                    else if(i==(deportistas.size()-1)){
                                        System.out.println("El documento no se encuentra registrado\n");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\n\n\nIngrese la prueba que desea ver: "
                                                   +"\n1.Libre."
                                                   +"\n2.Mariposa."
                                                   +"\n3.Pecho."
                                                   +"\n4.Espalda.");
                                aux=lector.nextInt();
                                
                                System.out.println("\nCategoria A: ");
                                for (int i=0;i<deportistas.size();i++){
                                    if (deportistas.get(i).getEstilos(aux)==1){
                                        if (deportistas.get(i).getCategoria()=="A"){    
                                        System.out.println(deportistas.get(i).getNombre());
                                        } 
                                    }       
                                }
                                
                                System.out.println("Categoria B: ");
                                for (int i=0;i<deportistas.size();i++){
                                    if (deportistas.get(i).getEstilos(aux)==1){
                                        if (deportistas.get(i).getCategoria()=="B"){    
                                        System.out.println(deportistas.get(i).getNombre());
                                        } 
                                    }       
                                }
                                
                                System.out.println("Categoria Juvenil: ");
                                for (int i=0;i<deportistas.size();i++){ 
                                    if (deportistas.get(i).getEstilos(aux)==1){
                                        if (deportistas.get(i).getCategoria()=="Juvenil"){    
                                        System.out.println(deportistas.get(i).getNombre());
                                        } 
                                    }       
                                }
                                
                                System.out.println("Categoria Senior: ");
                                for (int i=0;i<deportistas.size();i++){
                                    if (deportistas.get(i).getEstilos(aux)==1){
                                        if (deportistas.get(i).getCategoria()=="Senior"){    
                                        System.out.println(deportistas.get(i).getNombre());
                                        } 
                                    }       
                                }
                                break;
                            case 4:
                                val2=true;
                                break;
                        }
                    }while(val2==false);
                    val2=false;
                    break;
                case 3:
                    var=true;
                    break;
            }
        }while(var==false);
        
    }
    
}
