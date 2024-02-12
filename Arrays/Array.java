
public class Array{
public static void main(String args[]){
int[] numbers = {1,2,3,4,5};
int[] scores = new int[5];
scores[0] = 95;
scores[1] = 45;
scores[2] = 89;
scores[3] = 78;
scores[4] = 91;
System.out.println(numbers);

/*for(int i = 0 ; i < numbers.length ; i++){
System.out.println(numbers[i]);*/

int arr[] = {1,2,3};
int newarray[] = new int[arr.length+1];
for( int i = 0 ; i < arr.length ; i++){
newarray[i] = arr[i];
}
newarray[newarray.length-1] = 5;
for(int i = 0 ; i < newarray.length; i++){
System.out.println(newarray[i]);
}
}
}


