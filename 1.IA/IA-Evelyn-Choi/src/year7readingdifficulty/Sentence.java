/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year7readingdifficulty;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author evelyc
 */
public class Sentence {
    
    private String sentence = null;
    private List wordsAsStrings = new ArrayList<String>();
    private List words = new ArrayList<Word>();
    private int semicolonCount = 0;
    private int commaCount = 0;
    private List diffVocab = new ArrayList<Word>();
    
    public Sentence(){
      
    }
    
    public Sentence(String newSentence) throws FileNotFoundException{
        sentence = newSentence;
        splitSentenceIntoWords();
        countCommas();
        countSemicolons();
        listDiffVocab();
    }
    
    
    public void splitSentenceIntoWords() throws FileNotFoundException{
        // split sentence string into list of strings
        wordsAsStrings = new ArrayList<>(Arrays.asList(sentence.split("\\W+")));
        // loop through the list word strings to fill the list of Words and the word strings into the Word objects 
        for(int i = 0; i<wordsAsStrings.size(); i++){
            Word word = new Word();
            word.setWord((String) wordsAsStrings.get(i));
            words.add(word);        
        }
    }
    
    public void setSentence(String newSentence){
        sentence = newSentence;
    }
    
    public String getSentence(){
        return sentence;
    }
    
    public List getWords(){
        return words;
    }
    
    public List getWordsAsStrings(){
        return wordsAsStrings;
    }
    
    public void countSemicolons(){
        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);    
            if (c == ';'){
                semicolonCount++;
            }
        }
    }
    
    public int getSemicolonCount(){
        return semicolonCount;
    }
    
    public void countCommas(){
        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);    
            if (c == ','){
                commaCount++;  
            }
        }
    }
    
    public int getCommaCount(){
        return commaCount;
    }
    
    public void listDiffVocab() throws FileNotFoundException{
        // go through each word
        for(int i = 0; i<words.size(); i++){
            //
            Word currWord = (Word)words.get(i);
            
            if (currWord.getDifficulty() == true){
                diffVocab.add(currWord);  
            }
        }
    }
    
    public List getDiffVocab(){
        return diffVocab;
    }

    
    
    
    
}
