public class IntegerInputExample{
public static void main(String[] args){
if(args.length > 0 ){
int intvalue = Integer.parseInt(args[0]);
System.out.println("Integer value entered :" + intvalue);
}
else{
System.out.println(" No integer value provided as an argument");
}
}
}
