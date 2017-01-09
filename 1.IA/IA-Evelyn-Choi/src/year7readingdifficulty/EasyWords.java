/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year7readingdifficulty;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;


/**
 *
 * @author evelyc
 */
public class EasyWords {
    
    private String easyWords = null;
     
    public EasyWords() throws FileNotFoundException{

        URL url = getClass().getResource("easywords.txt");
        easyWords = new Scanner(new File(url.getPath())).useDelimiter("\\A").next();
    }
    
    public String getEasyWords(){
        return easyWords;
    }
    
    
    
    
}
