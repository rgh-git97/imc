/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author ruben
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona {
private String Nombre;
private String Apellido;
private String Fecha_de_nacimiento;
private double Estatura;
private  float peso;
private int edad;
private String Diagnostico;
private int Color;
private float imc;
public Persona() {

}
private void Calcular_edad()       
{
   DateTimeFormatter fmt =DateTimeFormatter.ofPattern("dd/MM/yyyy");
   LocalDate fechaNac = LocalDate.parse(this.Fecha_de_nacimiento,fmt);
   LocalDate ahora = LocalDate.now();
   Period periodo= Period.between(fechaNac, ahora);
    this.edad=periodo.getYears();
    System.out.println(this.edad);
    
}
private void Calcular_Imc(){//Funcion Terminada
 this.imc = (float) (this.peso/(this.Estatura*this.Estatura));
 if (imc<18.5){
    this.Diagnostico="Bajo Peso";
   
   this.Color=1;
 }
 if (imc>=18.5&&imc<=24.9){
    this.Diagnostico="Normal";
    
   this.Color=2;
 }
 if (imc>=25&&imc<=29.9){
   this.Diagnostico="Sobrepeso";
   
 this.Color=3;
 }
 if (imc>=30&&imc<=34.9){
   this.Diagnostico="Obesidad I";
  
 this.Color=4;
 }
if (imc>=35&&imc<=39.9){
    this.Diagnostico="Obesidad II";
   
  this.Color=4;
}
if (imc>=40&&imc<=49.9){
    this.Diagnostico="Obesidad III";
    
    this.Color=4;
}
if (imc>=50){
    this.Diagnostico="Obesidad Iv";
 
   this.Color=4;
}
}  

    public int getColor() {
        return Color;
    }

     
   
    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public void setFecha_de_nacimiento(String Fecha_de_nacimiento) {
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
       Calcular_edad();
    }

    public void setPeso(float peso) {
        this.peso = peso;
        Calcular_Imc();
    }

   
    public int getEdad() {
        return  edad;
    }
    
    public float getImc() {
        return imc;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }
      
   



}