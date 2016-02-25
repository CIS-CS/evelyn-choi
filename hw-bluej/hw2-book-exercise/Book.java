/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNo;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNo = "";
        courseText = bookCourseText;
    }

    // Add the methods here ...
    
    public boolean setRefNumber(String ref){
        if(ref.length() >= 3){
            refNo = ref;
            return true;
        }
        else{
            return false;
        }
    }
    
    public void borrow(){
        borrowed += 1;
    }
    
    public String getRefNumber(){
        return refNo;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public boolean isCourseText(){
        return courseText;
    }
  
    public void printAuthor(){
        System.out.println(author);
    }
    
    public void printTitle(){
        System.out.println(title);
    }
    
    public void printDetails(){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Pages:" + pages);
        System.out.println("Borrowed" + borrowed + "times.");
    }
}
