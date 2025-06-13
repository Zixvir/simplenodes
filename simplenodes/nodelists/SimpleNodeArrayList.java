package simplenodes.nodelists;

import java.util.ArrayList;

import simplenodes.SimpleNode;

//An ArrayList<SimpleNode> that implements SimpleNodeList
public class SimpleNodeArrayList extends ArrayList<SimpleNode> implements SimpleNodeList{
   public SimpleNodeArrayList(){
      super();
   }
   
   public int getLength(){
      return size();
   }
   
   public SimpleNode getItem(int index){
      return get(index);
   }
   
   @Override public String toString(){
      String asString="";
      for(int i =0; i<size(); i++){
         asString+=i + " : " + get(i).getClass().getName() + "\n";
      }
      return asString;
   }
}