package simplenodes.nodelists;

import simplenodes.SimpleNode;

//this is an interface inspired by java's NodeList interface, but with SimpleNodes instead of Nodes
public interface SimpleNodeList{
   int getLength();
   SimpleNode getItem(int index);
}