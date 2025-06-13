package simplenodes;

import simplenodes.nodelists.SimpleNodeList;

//this is an interface inspired by java's Node interface, with all the complicated bits removed
public interface SimpleNode{
//accessor methods
   SimpleNodeList getChildNodes();
   default boolean hasChildNodes(){
      SimpleNodeList childNodes = getChildNodes();
      return (childNodes!=null && childNodes.getLength()>0);
   }
//mutator methods
   void addChildNode(SimpleNode node);
}