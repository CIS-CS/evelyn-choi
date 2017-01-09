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

/**
 *
 * @author evelyc
 */
public class Word {
 
    private String word = null;
    private String checkWord = null;
    private boolean isDifficult = false;

    
    public Word() throws FileNotFoundException{

    }
     
    public boolean getDifficulty() throws FileNotFoundException{
        EasyWords easyWords = new EasyWords();
        word = word.toLowerCase();
       if(word.length()>4){
            checkWord = word.substring(0, word.length() - 3);
           
            if(!easyWords.getEasyWords().contains(checkWord)){
                isDifficult = true;
            }
        }
        
        
        return isDifficult;
    }
    
    public String getWord(){
        return word;
    }
    
    public void setWord(String newWord){
        word = newWord;
    }
    
}
