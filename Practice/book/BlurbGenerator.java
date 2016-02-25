public class BlurbGenerator
{
    private String genre;
    private int characterNum;
    private String blurb;

    public BlurbGenerator()
    {
        // initialise instance variables
        genre = "";
        characterNum = 0;
        blurb = "In a world full of ";
    }

    public void addGenreToBlurb(){
        //each genre has different possible lines.
        switch (genre){
            case "adventure": 
                if (Math.random() >0.5){
                    blurb += "danger and tyranny";
                }
                else {
                    blurb += "wild creatures";
                }
                break;
            case "fantasy":
                if (Math.random() >0.5){
                    blurb += "magic and mystery";
                }
                else {
                    blurb += "powerful wizards";  
                }
                break;
            case "scifi":
                if (Math.random() >0.5){
                    blurb += "innovation and treachery";
                }
                else {
                    blurb += "science and wonder";
                }
                break;
            case "horror":
                if (Math.random() >0.5){
                    blurb += "blood and fear";
                }
                else {
                    blurb += "the dead";
                }    
                break;
            case "comedy":
                if (Math.random() >0.5){
                    blurb += "laughter and fun";
                }
                else {
                    blurb += "comedians galore";
                }
                break;
            default:
                System.out.println("Not a valid genre, " + genre); //terminate the runner?
                break;
        }
    }

    public String getBlurb(){
        return blurb;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String newGenre)
    {
        if(newGenre.equals("adventure") || 
                newGenre.equals("fantasy") || 
                newGenre.equals("scifi") || 
                newGenre.equals("comedy") ||
                newGenre.equals("horror")) {
            genre = newGenre;
        }
    }
    
    public void setCharacterNum(int charNo)
    {
       characterNum = charNo;
       if (charNo>1){
           blurb += ", " + charNo + " brave heroes";
       }
       else{
           blurb += ", a brave hero";
       }    
       // check for negatives??
    }
    
    public void setGoal()
    {
        blurb += " save the world from ";
        switch (genre){
            case "adventure": 
                if (Math.random() >0.5){
                    blurb += "a tsunami.";
                }
                else {
                    blurb += "bandits.";
                }
                break;
            case "fantasy":
                if (Math.random() >0.5){
                    blurb += "evil powers.";
                }
                else {
                    blurb += "a dragon.";  
                }
                break;
            case "scifi":
                if (Math.random() >0.5){
                    blurb += "robots.";
                }
                else {
                    blurb += "an intergalactical army.";
                }
                break;
            case "horror":
                if (Math.random() >0.5){
                    blurb += "zombies.";
                }
                else {
                    blurb += "an unknown plague.";
                }    
                break;
            case "comedy":
                if (Math.random() >0.5){
                    blurb += "sellouts.";
                }
                else {
                    blurb += "bad jokes";
                }
                break;
            default:
                System.out.println("something terrible.");
                break;
        }
    }
    
    public void blurbClear()
    {
        blurb = "In a world full of ";
    }
}