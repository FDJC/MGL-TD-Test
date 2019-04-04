package romannumberconverter;
import java.util.*;
public class RomanNumberConverter {

  public int convert(String romanNumber) {
     Dictionary<String, Integer> dic= new Hashtable<String, Integer>();
     dic.put("I",1);
     dic.put("V",5);
     dic.put("X",10);
     dic.put("L",50);
     dic.put("C",100);
     dic.put("D",500);
     dic.put("M",1000);

     int number=0;
     char[] mot = romanNumber.toCharArray();
     if(romanNumber.contains("IIII")||romanNumber.contains("VVVV")||romanNumber.contains("XXXX")||romanNumber.contains("LLLL")||romanNumber.contains("CCCC")||romanNumber.contains("DDDD")){
       throw new IllegalArgumentException("argument incorrect");
     }

     for (int i = 0; i < mot.length; i++) {
       if((i+1)!=mot.length){
         if (dic.get(String.valueOf(mot[i])) < dic.get(String.valueOf(mot[i+1]))){ //si on a une lettre plus faible avant une autre
           number-=dic.get(String.valueOf(mot[i]));
         }
         else{ //si la lettre est placé "normalement", on ajoute sa valeur
           number+=dic.get(String.valueOf(mot[i]));
         }
       }
       else{
         number+=dic.get(String.valueOf(mot[i]));
       }

     }

     if(number<=0){
       throw new IllegalArgumentException("argument incorrect");

     }

     return number;
   }

   public String convert(int number){
     String mot="";

     if(number<=0){
       throw new IllegalArgumentException("argument incorrect");
     }
     if(number==1){
       mot="I";
     }
     if(number == 5){
       mot="V";
     }
     if(number==10){
       mot="X";
     }
     if(number == 50){
       mot="L";
     }
     if(number == 100){
       mot="C";
     }
     if(number == 500){
       mot="D";
     }
     if(number == 1000){
       mot="M";
     }


     return mot;
   }



}
