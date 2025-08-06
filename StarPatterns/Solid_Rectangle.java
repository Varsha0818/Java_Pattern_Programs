// Solid Rectangle

import java.util.*;

public class Solid_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();     //number of rows
        int n = sc.nextInt();     //number of columns

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
