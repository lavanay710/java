import java.io.*;
import java.util.*;
class information
{
  public static void main(String[] args)
  {
    try{
      File f = new File("data.txt");
      FileWriter fout = new FileWriter(f);
      BufferedWriter bout = new BufferedWriter(fout);
      Scanner sc = new Scanner(System.in);
      boolean flag=true;
      while(flag)
      {
        System.out.print("Enter S.No: ");
        bout.write(integer.toString(sc.nextInt()));
        bout.write(' ');
        System.out.print("Enter Name: ");
        bout.write(sc.next());
        bout.write(' ');
        System.out.print("Enter CGPA: ");
        bout.write(Float.toString(sc.nextFloat()));
        System.out.print("Enter Grade: (A / B / C / D):");
        bout.write(sc.next().charAt(0));

        bout.newLine();
        System.out.print("\nDo you want to continue entering data Y / N: ");
        char c = sc.next().charAt(0);
        if(c=='n' || c=='N')

{
  flag=false;
}
      }
    }
    bout.close();
  }
}