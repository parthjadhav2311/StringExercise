// Remove all duplicate characters from a given string. (I/p : AABCB  O/P : ABC)
package com.prowings.StringExcerise;

public class RemoveAllDuplicate {
	public static String removeAllDuplicate(String input)
    {
        char[] chars = input.toCharArray();
        for(int i = 0; i < chars.length;i++)
        {
            for(int j = i+1; j < chars.length;j++)
            {
                if(chars[i]==chars[j])
                {
                    chars[j] =' ';
                }
            }
        }
        
        String result = new String(chars);
        result=result.replace(" ","");
        return result;
    }
    public static void main(String[] args)
    {
        String input=" AABCB ";
        String res= removeAllDuplicate(input);
        System.out.println(res);
    }
}


