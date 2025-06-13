package simplenodes;

import simplenodes.nodelists.SimpleNodeList;
import simplenodes.nodelists.SimpleNodeArrayList;

// A SimpleNode that uses a SimpleNodeArrayList as its SimpleNodeList
public class ArrayListNode implements SimpleNode{
//instance variables
   private SimpleNodeArrayList children;
//constructors
   public ArrayListNode(){
      children = new SimpleNodeArrayList();
   }
//accessor methods
//node accessor methods
   @Override public SimpleNodeList getChildNodes(){
      return children;
   }
   
   public SimpleNodeArrayList getChildNodesArrayList(){
      return children;
   }
   
   public SimpleNode getChildNode(int index){
      return children.get(index);
   }
//other accessor methods
   public int getChildAmount(){
      return children.size();
   }
   
   @Override public String toString(){
      return getChildNodesArrayList().toString();
   }
//mutator methods
   @Override public void addChildNode(SimpleNode nodeAdded){
      children.add(nodeAdded);
   }
}