package Top.HARD.Coding_Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        // SOLUTION:  https://www.geeksforgeeks.org/word-ladder-length-of-shortest-chain-to-reach-a-target-word/
	
		// Time Complexity = O(M^2)*N 
		//where  M = number of entries in the word list and N = size of string
        if(beginWord == endWord) return 0;
        
        if(!wordList.contains(endWord)) return 0;
        
        int level = 0;
        int wordLength = beginWord.length();
        
        //Push the begin word into the queue
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        // While Queue is not empty
        while(!queue.isEmpty()){
            ++level;    // Increment chain length.
            int sizeQueue = queue.size();
            
            for(int i=0; i<sizeQueue; ++i){
                // Remove the first word from the queue
                char[] word = queue.peek().toCharArray();
                queue.remove();
                
                // For every character of the word
                for(int pos=0; pos < wordLength; ++pos){
                    //Retain the original character at the current position
                    char originalChar = word[pos];
                    
                    //Replace the current character with every possible lower case alphabet
                    for(char c='a'; c <='z'; ++c){
                        word[pos] = c;
                        
                        // If new word is equal to target word return Level+1.
                        if(String.valueOf(word).equals(endWord)){
                            return level + 1;
                        }
                        
                        // Remove the word from the Set if it is found in it.
                        if(!wordList.contains(String.valueOf(word))) continue;
                        wordList.remove(String.valueOf(word));
                        
                        //Push the newly generated word which will be part of the chain
                        queue.add(String.valueOf(word));
                    }
                    // Restore the original character at the current position
                    word[pos] = originalChar;
                 }
            }
        }
        
        return 0;
    }

}
