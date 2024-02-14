public class DoubleInputExample{
public static void main(String[] args){
if(args.length > 0 ){
double doublevalue = Double.parseDouble(args[0]);
System.out.println("Double value entered :" + doublevalue);
}
else{
System.out.println(" No double value provided as an argument");
}
}
}
