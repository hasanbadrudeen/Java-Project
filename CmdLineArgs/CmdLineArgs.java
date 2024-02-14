public class CmdLineArgs{
public static void main(String[] args){
String str = args[0];
int age = Integer.parseInt(args[1])  ;
System.out.println(str + "is" + (age >= 18 ? "Eligible" : "Not eligible"));
}
}