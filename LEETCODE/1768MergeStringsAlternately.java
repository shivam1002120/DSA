//StringBuilder Solution(More optimized)

class Solution1 {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder str = new StringBuilder();
        int i=0;
        for(i=0;i<word1.length()&&i<word2.length();i++){
            str.append(word1.charAt(i)+"");
            str.append(word2.charAt(i)+"");
        }

        if(i<word1.length()){
            str.append(word1.substring(i)+"");
        }
        if(i<word2.length()){
            str.append(word2.substring(i)+"");
        }

        return str.toString();
    }
}

//String(more Time and space complexity)
class Solution2 {
    public String mergeAlternately(String word1, String word2) {

        String str = "";
        int i=0;

        for(i=0;i<word1.length()&&i<word2.length();i++){
            str+=word1.charAt(i)+""+word2.charAt(i);
        }

        if(i<word1.length()){
            str+=word1.substring(i)+"";
        }
        if(i<word2.length()){
            str+=word2.substring(i)+"";
        }

        return str;
    }
}