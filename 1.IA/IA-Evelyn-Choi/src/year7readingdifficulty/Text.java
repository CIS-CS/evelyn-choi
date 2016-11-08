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
    private String difficulty = null;
    private double difficultyRatio = 0;
    
    private final int sevenVocabCount = 1;
    private final int sevenSentenceLength = 20;
    private final double sevenSemicolonCount = 0.1;
    private final double sevenCommaCount = 1.5;
    
    
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
    
            
    public int avgCommas(){
        return 0;
    }
            
  
    
    
    public String getText(){
        return text;
    }
    
    public void setText(String newText){
        text = newText;
    }
    
    
    
    public String findDifficulty(){
        double commaDifficulty = avgCommasPerSentence/sevenCommaCount;
        double semicolonDifficulty = avgSemicolonsPerSentence/sevenSemicolonCount;
        double lengthDifficulty = avgSentenceLength/sevenSentenceLength;
        double vocabDifficulty = avgDiffVocabPerSentence/sevenVocabCount;
        difficultyRatio = (commaDifficulty + semicolonDifficulty + lengthDifficulty + vocabDifficulty)/4;
        if (difficultyRatio <=0.75){
            difficulty = "Easy";
        }
        else if(difficultyRatio <= 1.5){
            difficulty = "Suitable";
        }
        else if(difficultyRatio <= 2.5){
            difficulty = "Challenging";
        }
        else {
            difficulty = "Very Challenging";
        }
            
        return difficulty; 
    }
    
    public String getDifficulty(){
        return difficulty;
    }
    
    /*public void setDifficulty(String diff){
        difficulty = diff;
    }*/
    
    public double getDifficultyRatio(){
        return difficultyRatio;
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
        avgSentenceLength = totalLength / sentences.size();
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
        System.out.println(commas);
     
        avgCommasPerSentence = (double)commas/sentences.size();
        System.out.println(avgCommasPerSentence);
        return avgCommasPerSentence;
    }
    
    
    public List listTotalDiffVocab(){
        //loop through each sentence
        for(int i = 0; i<sentences.size(); i++){
            Sentence currSentence = (Sentence)sentences.get(i);
            List currDiffVocabList = currSentence.getDiffVocab();
            //loop through the difficult word list in the sentence
            for (int a = 0; currDiffVocabList.get(a)!= null; a++){
                Word currDiffWord = (Word)currDiffVocabList.get(a);
                String currDiffWordString = currDiffWord.getWord();
                boolean wordAlreadyInList = false;
                //check if difficult word is already in the difficult word list of the text
                for(int loop = 0; totalDiffVocab.get(loop) != null; loop++){
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
        avgDiffVocabPerSentence = totalDiffVocab.size()/sentences.size();
        return avgDiffVocabPerSentence;
    }
    
    public List getDiffVocab(){
        
        return totalDiffVocab;
    }

    
      
    
}
