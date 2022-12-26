import java.util.*; 
  
class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the length : ");
    int len = scan.nextInt();
    int linear[] = new int[len];
    for (int i=0;i<linear.length;i++){
        System.out.println("Enter a number to add : ");
        linear[i] = scan.nextInt();
    }
    int temp;
    for(int i=0;i<linear.length;i++){
      for (int j=i+1;j<=linear.length-1;j++){
        if(linear[i] > linear[j]){
          temp = linear[i];
          linear[i] = linear[j];
          linear[j] = temp;
        }
      }
    }
    System.out.println("Sorted List : " + Arrays.toString(linear));
  }
}