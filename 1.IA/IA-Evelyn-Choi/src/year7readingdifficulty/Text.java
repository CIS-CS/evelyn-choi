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
import java.text.DecimalFormat;

/**
 *
 * @author evelyc
 */
public class Text {
    private String text = null;
    private List sentences = new ArrayList<Sentence>();
    private List sentencesAsStrings = new ArrayList<String>();
    private List totalDiffVocab = new ArrayList<String>();
    private double avgDiffVocabPerSentence = 0;
    private double avgSentenceLength = 0;
    private double avgSemicolonsPerSentence = 0;
    private double avgCommasPerSentence = 0;

    

    
    public Text(){
        
    }
    
    
    public String sentencesToSingleString(){
        return null;
    }
    
    public void textToSentences() throws FileNotFoundException{
       sentencesAsStrings = new ArrayList<>(Arrays.asList(text.split("(?<=[a-z])\\.\\s+")));   
       //http://stackoverflow.com/questions/2687012/split-string-into-sentences
       for (int i = 0; i<sentencesAsStrings.size(); i++){
           Sentence sentence = new Sentence(sentencesAsStrings.get(i).toString());
           
           sentences.add(sentence);
       }  
    }
    
    public List getSentencesAsStrings(){
        return sentencesAsStrings;
    }        
    
    public List getSentences(){
        return sentences;
    }
 
            
  
    
    
    public String getText(){
        return text;
    }
    
    public void setText(String newText){
        text = newText;
    }
    

    public void setSentences(List newSentences){
        sentences = newSentences;
    }
    
    
    public double getAvgSentenceLength(){
   
        int totalLength = 0;
        // go through each sentence
        for(int i = 0; i<sentences.size(); i++){
           Sentence currSentence;
           currSentence = (Sentence)(Object)sentences.get(i);
         //  currSentence.setSentence((String)sentences.get(i));
          
           totalLength += currSentence.getWords().size();
           
            
        }
        //get avg
        avgSentenceLength = (double)totalLength / sentences.size();
        return avgSentenceLength;
    }
    
    public double getAvgSemicolonsPerSentence(){
        int semicolons = 0;
        for(int i = 0; i<sentences.size(); i++){
            Sentence currSentence = (Sentence)sentences.get(i);
            semicolons += currSentence.getSemicolonCount();
        } 
        avgSemicolonsPerSentence = (double)semicolons/sentences.size();
        return avgSemicolonsPerSentence;
    }
    
    public double getAvgCommasPerSentence(){
        int commas = 0;
        for(int i = 0; i<sentences.size(); i++){
            Sentence currSentence = (Sentence)sentences.get(i);
            commas += currSentence.getCommaCount();
        } 

     
        avgCommasPerSentence = (double)commas/sentences.size();

        return avgCommasPerSentence;
    }
    
    
    public List listTotalDiffVocab(){
        //loop through each sentence
        System.out.println("HI I'M LISTING VOCAB NOW");
        for(int i = 0; i<sentences.size(); i++){
            Sentence currSentence = (Sentence)sentences.get(i);
            
            List currDiffVocabList = currSentence.getDiffVocab();
           // System.out.println(currDiffVocabList);
            //loop through the difficult word list in the sentence
            for (int a = 0; a<currDiffVocabList.size(); a++){
                Word currDiffWord = (Word)currDiffVocabList.get(a);
                String currDiffWordString = currDiffWord.getWord();
                boolean wordAlreadyInList = false;
                //check if difficult word is already in the difficult word list of the text
                for(int loop = 0; loop<totalDiffVocab.size(); loop++){
                    String existingDiffWord = (String)totalDiffVocab.get(loop); 
                    if (currDiffWordString.equals(existingDiffWord)){
                        wordAlreadyInList = true;
                    }
                }
                //if the difficult word is not in the list, add it
                if (wordAlreadyInList == false){
                    totalDiffVocab.add(currDiffWordString);
                }
            }
        }
    
        return totalDiffVocab;
    } 
    
    
    public double getAvgDiffVocabPerSentence(){
        avgDiffVocabPerSentence = (double)totalDiffVocab.size()/sentences.size();
        return avgDiffVocabPerSentence;
        
    }
    
    public List getDiffVocab(){
        
        return totalDiffVocab;
    }
      
    
}
