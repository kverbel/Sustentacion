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
public class Deportista {
    
    Scanner lector=new Scanner(System.in);
    int year,doc,aux;
    Calendar fecha = Calendar.getInstance();
    int año = fecha.get(Calendar.YEAR);
    private String nombre,rama,categoria;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void ingresar_datos(){
                System.out.println("\n\n\nIngrese el nombre del deportista.");
                nombre=lector.nextLine();
                System.out.println("\n\n\nIngrese el documento.");
                doc=lector.nextInt();
                System.out.println("\n\n\nIngrese el año de nacimiento.");
                year=lector.nextInt();
                System.out.println("\nIngrese la rama. (Maculino/Femenino.)");
                rama=lector.next();
                aux=año-year;
                if (aux<=10 && aux>=6){
                    categoria="A";
                }
                else if (aux<=17 && aux>=11){
                    categoria="B";
                }
                else if (aux<=25 && aux>=18){
                    categoria="Juvenil";
                }
                else if (aux>25){
                    categoria="Senior";
                }
    }
    
    public void show(){
        System.out.println("Nombre: "+nombre+"\n"
                           +"Documento: "+doc+"\n"
                           +"Año de nacimiento: "+year+"\n"
                           +"Rama: "+rama+"\n"
                           +"Categoría: "+categoria+"\n");
    }
}
