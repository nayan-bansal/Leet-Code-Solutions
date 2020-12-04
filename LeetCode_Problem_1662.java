class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String first = "", second = "";
        
        for(String word : word1){
            first = first.concat(word);
        }
        
        for(String word : word2){
            second = second.concat(word);
        }
        
        if(first.equals(second))
            return true;
        else
            return false;
        
    }
}