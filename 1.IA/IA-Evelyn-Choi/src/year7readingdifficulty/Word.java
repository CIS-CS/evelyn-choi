/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year7readingdifficulty;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author evelyc
 */
public class Word {
 
    private String word = null;
    private boolean isDifficult = false;
    private String allEasyWords = null;
    
    public Word() throws FileNotFoundException{
       URL url = getClass().getResource("easywords.txt");
       allEasyWords = new Scanner(new File(url.getPath())).useDelimiter("\\A").next();
    }
    
   
    
    public boolean getDifficulty(){
        isDifficult = !(allEasyWords.contains(word));
        return isDifficult;
    }
    
    public String getWord(){
        return word;
    }
    
    public void setWord(String newWord){
        word = newWord;
    }
    
}
