package Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> charsOfS=new Stack<>();
        Stack<Character> charsOfT=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!charsOfS.empty()){
                    charsOfS.pop();
                }
            }else{
                charsOfS.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!charsOfT.empty()){
                    charsOfT.pop();
                }
            }else{
                charsOfT.push(t.charAt(i));
            }
        }
        while(!charsOfT.empty() && !charsOfS.empty()){
            if(charsOfT.pop()==charsOfS.pop()){
                continue;
            }
            else{
                return  false;
            }
        }
        return charsOfT.empty() && charsOfS.empty();
    }
}
