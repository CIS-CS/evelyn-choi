package swingGUI;
/**
 * DoubleNode.java
 * From: http://www.ib-computing.com/java/datastructures/lists.html
 * @author Mr J (andrew jones?)
 * @version 20050208
 */
class DoubleNode
{
    // data member
    private String name;

    // The fields that links nodes together.
    private DoubleNode next = null;
    private DoubleNode prev = null;
    
    private VideoTape video;

    public DoubleNode()
    {
        // default constructor, sets fields to null
        name = "no name";
    }
        
    public DoubleNode(String name)
    {
        // Second Constructor for a student record, assigns fields
        setName(name);
    }
        
    public DoubleNode(VideoTape vid){
        video = vid;
    }
    
    // accessor methods
    public String     getName(){ return name;}
    public VideoTape  getVid() { return video;}
    public DoubleNode getNext(){ return next;}
    public DoubleNode getPrev(){ return prev;}
    
    // modifier methods
    public void setName( String name )   {this.name = name;}
    public void setVid (VideoTape tape) {this.video = tape;}
    public void setNext( DoubleNode name){this.next = name;}
    public void setPrev( DoubleNode prev){this.prev = prev;}
}





