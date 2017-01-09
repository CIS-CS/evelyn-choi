/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year7readingdifficulty;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author evelyc
 */
public class DifficultyCalculator {
    private Text text = null;
    private String difficulty = null;
    private double difficultyRatio = 0;

    //
    private final int sevenVocabCount = 1;
    private final int sevenSentenceLength = 15;
    private final double sevenSemicolonCount = 0.1;
    private final double sevenCommaCount = 1;
    
    
    public DifficultyCalculator(Text newText){
        text = newText;
        
       
    }
    
    
    public String findDifficulty(){
        text.listTotalDiffVocab();
        double commaDifficulty = text.getAvgCommasPerSentence()/sevenCommaCount;
        double semicolonDifficulty = text.getAvgSemicolonsPerSentence()/sevenSemicolonCount;
        double lengthDifficulty = text.getAvgSentenceLength()/sevenSentenceLength;
        double vocabDifficulty = text.getAvgDiffVocabPerSentence()/sevenVocabCount;
        
        difficultyRatio = (commaDifficulty*0.5 + semicolonDifficulty + lengthDifficulty + vocabDifficulty*2)/4;
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
    
    
    
   
    
    
}
