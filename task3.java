import java.util.*;
import java.util.ArrayList;
public class Delimiters
{
 private String openDel;
 private String closeDel;
 public Delimiters(String open, String close)
 {
 openDel = open;
 closeDel = close;
 }

 public ArrayList<String> getDelimitersList(String[] tokens)
 {
   ArrayList <String> arr = new ArrayList<String>();
   for(String x : tokens){
     if(openDel.equals(x)) arr.add(openDel);
     else if (closeDel.equals(x)) arr.add(closeDel);
   }
   return arr;
 }

 public boolean isBalanced(ArrayList<String> delimiters)
 {
   int a = 0;
   int o =0;
   int c = 0;
   for(int i = 0; i<delimiters.size();i++){
     if(openDel.equals(delimiters.get(i))) {o++;a++;}
     else if(closeDel.equals(delimiters.get(i))) {o--;c++;}
     if(o < 0) return false;
   }
   if (a!=c) return false;
   return true;
 }
  /*
  public static void main(String[] args){
    Delimiters a = new Delimiters("<sup>","/<sup>");
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("<sup>");
    arr.add("<sup>");
    arr.add("/<sup>");
    arr.add("/<sup>");
    arr.add("<sup>");
    arr.add("/<sup>");
    System.out.print(a.isBalanced(arr));
  }
  */
} 
