package romannumberconverter;

public class RomanNumberConverter {

  public int convert(String romanNumber) {
    int number=0;

    for ( char c : romanNumber.toCharArray() ) {


      if(c == 'I'){
        number+=1;
      }
      if(c == 'V'){
        number+=5;
      }
      if(c == 'X'){
        number+=10;
      }
      if(c == 'L'){
        number+=50;
      }
      if(c == 'C'){
        number+=100;
      }
      if(c == 'D'){
        number+=500;
      }
      if(c == 'M'){
        number+=1000;
      }

    }

    return number;
  }

  public String convert(int number){
    String mot="";
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
