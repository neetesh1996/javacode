import java.io.*;
import java.util.*;
import java.fx.*;
public class Solutionpqttern extends javafx.application
{
    
       
        public static int[][] prettyPrint(int A) {
int arrDimension = A*2-1;
int[][] arr = new int[arrDimension][arrDimension];
for (int i = 0; i < A; i++)
{
for (int x = i; x < arrDimension-i;x++)
{
for (int y = i; y < arrDimension-i;y++)
{
arr[x][y]=A-i;
}
}
}
return arr;
} 
    
}
