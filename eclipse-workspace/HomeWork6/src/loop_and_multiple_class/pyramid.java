package loop_and_multiple_class;

import java.util.*;

public class pyramid {
 
public static void main(String[] args){
int height;
 
Scanner keyboard = new Scanner(System.in);
System.out.print("Please enter the height of your pyramid: ");
height = keyboard.nextInt(); 
 
for(int i=0; i<height;i++){
               
       
         for (int j=0;j<height-i-1;j++)
                System.out.print("   ");
                
         for (int leftside=1;leftside<i+2;leftside++)
                System.out.printf("% 3d", leftside);
                
         for(int rightside=i; rightside>0; rightside--) 
                System.out.printf("% 3d", rightside);
                
                               
                System.out.println();
 
        }

    }

}