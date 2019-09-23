package imc;
 /**
  * @author Felipe Guerra
 * @version 1.0.0
 */
public class CalculoIMC extends Persona{
             
    //EVALUAR EL RESULTADO DEL IMC
    if (Persona.resIMC >=1 && <= 18.5){
        System.out.println("Su IMC (" + Persona.resIMC + ") se traduce en : Peso bajo" +Persona.getPeso());
    }else if(resIMC >= 18.6 && <=24.9) {
        System.out.println("El IMC Para " + Persona.resIMC + ") se traduce en : Peso Normal");
    }else if (resIMC >= 25 && <=29.9) {
        System.out.println("Su IMC (" + Persona.resIMC + ") se traduce en : Peso Sobrepeso");
    }else if (resIMC >= 30 && <=34.9) {
         System.out.println("Su IMC (" + Persona.resIMC + ") se traduce en : Obesidad Grado 1");
    }else if (resIMC >= 35 && <=39.9) {
        System.out.println("Su IMC (" + Persona.resIMC + ") se traduce en : Obesidad Grado 2");
    }else if (resIMC >= 40) {
        System.out.println("Su IMC (" + Persona.resImc + ") se traduce en : Obesidad Grado 3");
    } 
}
