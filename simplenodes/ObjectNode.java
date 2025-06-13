package simplenodes;

//An ArrayListNode that also stores an E (which is most likely an Object)
public class ObjectNode<E> extends ArrayListNode{
   private E object;
   
   public ObjectNode(E e){
      super();
      object=e;
   }
   
   public E getObject(){return object;}
}