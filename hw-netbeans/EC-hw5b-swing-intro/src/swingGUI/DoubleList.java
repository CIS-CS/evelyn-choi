// DoubleList.java

package swingGUI;

/**
 * Implements a doubly-linked list.
 * Head points to first node, tail points to last node, current points
 * to MRA node (most recently accessed).
 * @author MHayes
 * @version 2009-01-10
 */
public class DoubleList {

    // Instance variables
    private DoubleNode head = null;
    private DoubleNode tail = null;
    private DoubleNode current = null;  // points to last inserted node
    private int currentNo = 0;
    private int size = 0;
    
    public DoubleNode getCurrent(){
        return current;
    }
    
    public int getCurrentNo(){
        countCurrentNo();
        return currentNo;
    }
    
    public DoubleNode getHead(){
        current = head;
        return head;
    }
    
    public DoubleNode getTail(){
        current = tail;
        return tail;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setCurrent(DoubleNode newCurrent){
        current = newCurrent;
    }
    
    public int countCurrentNo(){   
        
        if(current == null && head == null && tail == null){
            currentNo = 0;
        }
        else if (getSize() == 1){
            currentNo = 1;
        }
        else {
          
                DoubleNode temp = new DoubleNode();
                temp = head;
                
                currentNo = 1;
                while (temp.getNext() != current.getNext()){
                    temp = temp.getNext();
                    currentNo++;
                }     
                /*
                *This was for testing purposes (trying to figure out where the links were wrong)
                if (current.getNext() != null){
                    System.out.println("next vid is" + current.getNext().getVid());
                }
                if (current.getPrev() != null){
                    System.out.println("prev vid is" + current.getPrev().getVid());
                }*/
        }    
        return currentNo;
    }
    
    public void moveBack(){
        current = current.getPrev(); 
    }
    
    public void moveForward(){
        current = current.getNext();
    }
    
    public boolean isPrevNull(){
        if (current.getPrev() == null){
            return true;
        }
        else return false;
    }
    
    public boolean isNextNull(){
        if (current.getNext() == null){
            return true;
        }
        else return false;
    }
    
    public int countSize(){
        if(current == null && head == null && tail == null){
            size = 0;
            
        }
        else{
            /*
            *More code for testing the next/prev links.
            System.out.println("The current video is " + current.getVid());
            if (current.getNext() != null){
                System.out.println("The next video is " + current.getNext().getVid());
            }
            if (current.getPrev() != null){
                System.out.println("The previous video is " + current.getPrev().getVid());
            }*/
            size = 1;
            DoubleNode oldCurrent = new DoubleNode();
            oldCurrent = current;   
            current = head;
            while (current.getNext() != null){
                current = current.getNext();
                size++;
            }
            current = oldCurrent;   
        }
        /* Code for testing
        System.out.println("size is" + size);*/
        return size;
        
    }
    
   
    
    public void delete(){
    
        if (countSize() == 1){
            head = null;
            tail = null;
            current = null;
            countSize();
            countCurrentNo();
        }
        
        //delete head
        else if(current.getPrev() == null){
            
                head = head.getNext();
                head.getPrev().setNext(null);
                head.getPrev().setVid(null);
                head.setPrev(null);
                current = head;
                countSize();
                countCurrentNo();
            
        }
        
        //delete tail
        else if(current.getNext() == null){
            System.out.println(tail.getNext());
                tail = tail.getPrev();
                
                tail.getNext().setPrev(null);
                tail.getNext().setVid(null);
                tail.setNext(null);
                current = tail;
                countSize();
                countCurrentNo();
                
        }
        //delete anything else
        else if (tail!= null && head != null && current.getPrev()!= null && current.getNext()!= null){
            current.getPrev().setNext(current.getNext());
            current = current.getNext();
            current.getPrev().setNext(null);
            current.getPrev().setVid(null);
            current.setPrev(current.getPrev().getPrev());
            countSize();
            countCurrentNo();
            
        }
    }
    
 
    public void insert(DoubleNode node)
    {
        //check if list is empty
        if (current == null && head == null && tail == null){
            // Add the node to the empty list.
            
            head = node;
            tail = node;
            current = head;
            countSize();
            countCurrentNo();
        }
        //tail
         else if(current.getNext() == null){
            
                tail.setNext(node);
                node.setPrev(tail);
                tail = node;
                current = node;
                countSize();
                countCurrentNo();
        }
         //head
        else if (current.getPrev() == null){
                    
                    if (head.getNext() != null){
                        node.setNext(head.getNext());
                    }
                    head.setNext(node);
                    node.setPrev(head);
                    current = node;
                    if (current.getNext() == null){
                        tail = current;
                    }
                    
                    countSize();
                    countCurrentNo();           
        }
        
       
        
      
        
        else {
     
            node.setPrev(current);
            node.setNext(current.getNext());
            node.getNext().setPrev(node);
            current.setNext(node);
            current = node;
            countSize();
            countCurrentNo();
           
        }
            
    }

    /**
     *  Extracts the names from the nodes and forms a string.
     *  @return String The names in the list, separated by "\n"
     */
    public String toString()
    {
        DoubleNode node = head;
        StringBuffer sb = new StringBuffer();

        // Traverse the list to display each node.
        sb.append("head\n----\n");
        while (node != null)
        {
            sb.append(node.getName());
            if (node == current)
            {
                sb.append("  <<<");     // Indicate the current node
            }
            sb.append("\n");
            node = node.getNext();
        }
        return sb.toString();
    }
    
    
    
    
    /*
    get the head
    ++1 t o node next
    node. next
    ++1 to node count
   etc. until next is null
    */
    
   
    
}
