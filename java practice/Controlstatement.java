public class Controlstatement{
public static void main(String args[]){
 int age = 18 ;
if( age > 18){
System.out.println("you are a adult");
}
else{
System.out.println("you are a not an adult " );
}


int day = 4 ;
switch(day){
case 1 : 
System.out.println("Mon");
break;
case 2 : 
System.out.println("tue");
break;
case 3 : 
System.out.println("Wed");
break;
default:
System.out.println("Invalid days");
}


for(int i = 0 ; i <= 10 ; i+=2){
System.out.println("Hasan");
}


int count = 0 ;
while(count < 5 ){
System.out.println(count);
count++;
}


for(int i = 1 ; i <= 10 ; i++){
if(i==5){
break;
}
System.out.println(i);
}


for(int i = 1 ; i <= 10 ; i++){
if(i==5){
continue;
}
System.out.println(i);
}










}
}