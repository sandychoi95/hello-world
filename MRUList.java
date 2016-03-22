//Author: Sandy Choi
//HW5: MRULists
import java.util.*;

class MRUList<T> extends DoublyLinkedList<T> {

  public boolean add(T x) {
    super.add(0,x);
    return false;
  }
  
  public void add(int index, T x) {
    super.add(0,x);
  }
  
  public boolean contains(Object obj) {
    Iterator<T> itr = super.iterator();
    boolean found = false;
    T data;
    while(itr.hasNext()) {
      T nodeData = itr.next();
      if(obj.equals(nodeData)) {
        add(nodeData);
        itr.remove();
        found = true;
      }
      data = nodeData;
    }
    return found;
  }
  
  public int indexOf(Object obj) {
    Iterator<T> itr = super.iterator();
    int index = 0;
    int answer = -1;
    T data;
    while(itr.hasNext()) {
      T currentObj = itr.next();
      if(obj.equals(currentObj)) {
        answer = index;
        add(currentObj);
        itr.remove();
      }
      data = currentObj;
      index++;
    }
    return answer;
  }
  
  

  
}
