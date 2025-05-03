import java.util.*;

public class LightBoard
{
 private boolean[][] lights;
 public LightBoard(int numRows, int numCols)
 { 
   lights = new boolean[numRows][numCols];
   for(int i = 0; i<numRows;i++){
     for(int j = 0; j< numCols;j++){
       if(Math.random()<=.4) lights[i][j] = true;
       else lights[i][j]= false;
     }
   }
 }
 /*public void get(){
  for(int i = 0; i<lights.length;i++){
     for(int j = 0; j< lights[0].length;j++){
       System.out.print(lights[i][j]);
       System.out.print("   ");
  }
  System.out.println();
}*/
 }
 public boolean evaluateLight(int row, int col)
 { 
  int numOnRow = 0;
  for (int i =0;i<lights[row].length;i++){
     if(lights[row][i]) numOnRow++;
  }
  int numOnCol =0;
  for (int j =0;j<lights.length;j++){
   if(lights[j][col]) numOnCol++;
  }
   if(numOnCol%2 == 0 && lights[row][col] == true) return false;
   else if(numOnRow%3 ==0 && lights[row][col]== false) return true;
   else return lights[row][col];
} 
  /*public static void main(String[] args){
    LightBoard sim = new LightBoard(7, 5);
    sim.get();
    System.out.println(sim.evaluateLight(0, 3)); 
    System.out.println(sim.evaluateLight(6, 0)); 
    System.out.println(sim.evaluateLight(4, 1)); 
    System.out.println(sim.evaluateLight(5, 4)); 
  }*/
}
