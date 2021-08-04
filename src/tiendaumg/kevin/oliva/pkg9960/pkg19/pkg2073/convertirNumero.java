
package tiendaumg.kevin.oliva.pkg9960.pkg19.pkg2073;


public class convertirNumero {
    
    
public static String numeroTexto(double numero){
        String tamano = String.valueOf(numero);
        String resultado="";
        for(int i=0; i<tamano.length(); i++){
            resultado+=(pasarLetras(tamano.substring(i,i+1)));
        }
        return resultado+" QUETZALES EXACTOS ";
    }
    
    public static String pasarLetras(String letras){
        String resul;
        switch(letras){
                case "1":{
                resul="UNO ";
                break;
                }
                case "2":{
                resul="DOS ";
                break;
                }
                case "3":{
                resul="TRES ";
                break;
                }
                case "4":{
                resul="CUATRO ";
                break;
                }
                case "5":{
                resul="CINCO ";
                break;
                }
                case "6":{
                resul="SEIS ";
                break;
                }
                case "7":{
                resul="SIETE ";
                break;
                }
                case "8":{
                resul="OCHO ";
                break;
                }
                case "9":{
                resul="NUEVE ";
                break;
                }
                case "0":{
                resul="CERO ";
                break;
                }
                case ".":{
                resul="CON ";
                break;
                }
                default:{
                resul = "Nada";
                }
    }
    return resul;
}
}
  

