/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
		String newStr = "";
		int count=0;
        for(int i=0; i<s.length(); i++){
		    for(int j=0; j<s.length(); j++){
				if((s.charAt(i)==s.charAt(j))&&(i<j)){
					count++;
				}	
			}
			if (count==0){
				newStr = newStr + s.charAt(i);
			}
			count=0;	
		}
        return newStr;
    }
}
