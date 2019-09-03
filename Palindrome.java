class Palindrome {
    public boolean isPalindrome(int x) {
        
        //convert the number into a string
        String numericString = Integer.toString(x);
        
        //create a new array of chars based on that string
        char[] numericStringArray = numericString.toCharArray();
        
        //size of string
        int size = numericString.length() - 1;
        
        //cycle through the string and replace each char
        for(int i = 0; i < numericString.length(); i++){
            numericStringArray[i] = numericString.charAt(size);
            size--;
        }
        System.out.println(numericStringArray);
        if(numericString.equals(new String(numericStringArray))){
            return true;
        }
        else{
            return false;
        }
    }
}
