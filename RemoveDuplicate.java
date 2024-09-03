public class RemoveDuplicate {
    public static void removeDuplicate(String str , int idx, StringBuilder newstr, boolean map[] ){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char curchar = str.charAt(idx);
        if(map[curchar-'a'] == true){
            removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[curchar-'a']=true;
            removeDuplicate(str,idx+1,newstr.append(curchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacllege";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
    
}
