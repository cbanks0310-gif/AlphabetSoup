//Name: Christian Banks
//Date: 09/29/26

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

  
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    
    public char randomLetter(){
        int randomIndex= (int) (Math.random()*letters.length());
        char randomLetter= (letters.charAt(randomIndex));
        return randomLetter;
    }


    public String companyCentered(){
        int lettersLengthIndex= (int)(letters.length()/2);
        String firstHalf= letters.substring (0, lettersLengthIndex-1);
        String secondHalf= letters.substring(lettersLengthIndex-1);
        return (firstHalf+company+secondHalf);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precondition: the user has already inputted a word that has been appended to the string letters so that it isnn't empty
    //postcondition: The program returns the string letters, with the first vowel removed if there is a vowel
    public void removeFirstVowel(){
        letters=  letters.replaceFirst("[aeiouAEIOU]", "");
        return letters; 

        
    }
    //precondition: the user inputs a number proceeded by the word num. The user has inputed a word, proceed by the word add that has been added to the string letters so that it isn't empty. 
    //postcondition: the program returns a new string, which removes num letters from a random spot in the string letters.
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
       
    //pick a random index such that you're smaller than "num" from the end of letters for example if letters has 10 characters and we want to remove 5 the largest index we want to pick would be 5
    int maxIndex=letters.length()-num;
    int randomIndex= (int)(Math.random()*(maxIndex));
    String newFirst= letters.substring(0, randomIndex);
    String newLast= letters.substring(randomIndex, letters.length-1);
    //use substring to create two parts to add the before part and the after part and the middle gets "cut out"
    return newFirst+newLast;
    }
    public void removeWord(String word){
        letters = letters.replaceFirst(word, "");
    }
}

