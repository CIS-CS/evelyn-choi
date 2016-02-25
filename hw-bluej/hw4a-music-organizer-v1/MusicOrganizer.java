import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> songs;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        songs = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        songs.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return songs.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public boolean listFile(int index)
    {
        if(
            //index >= 0 && index < songs.size()
            validIndex(index) == true
        ) {
            String filename = songs.get(index);
            System.out.println(filename);
            return true;
        }
        return false;
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public boolean removeFile(int index)
    {
        if(
            //index >= 0 && index < songs.size()
            validIndex(index) == true
        ) {
            songs.remove(index);
            return true;
        }
        return false;
    }
    
    public void checkIndex(int valid){
        int range = songs.size()-1;
        if(valid < 0 || valid > range){    
            System.out.println("Not valid, valid range is 0 to " + range);
        }
    }
    
    public boolean validIndex(int check){
        boolean valid = false;
        int range = songs.size()-1;
        if (check >= 0 && check <= range){ 
            valid = true;
        }
        return valid;
    }
}