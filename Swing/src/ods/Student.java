package ods;

/**
 * @author Mhayes
 */
public class Student implements Comparable {

    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public int compareTo(Object obj) {

        Student s = (Student)obj;

        if (firstName.compareTo(s.getFirstName()) == 0) {
            return 0;
        }
        else if (firstName.compareTo(s.getFirstName()) < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
