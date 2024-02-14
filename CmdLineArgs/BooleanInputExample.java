public class BooleanInputExample{
public static void main(String[] args){
if(args.length > 0 ){
Boolean booleanvalue = Boolean.parseBoolean(args[0]);
System.out.println("Boolean value entered :" + booleanvalue);
}
else{
System.out.println(" No boolean value provided as an argument");
}
}
}
