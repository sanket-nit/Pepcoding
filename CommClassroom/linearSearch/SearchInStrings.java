package linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Sanket";
        char target = 'a';
        System.out.println(stringSearch2(name,target));
    }

    // Using for loop
    static boolean stringSearch(String name, char target){
        if(name.length() == 0)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==target)
                return true;
        }
        return false;
    }

    // Using for-each loop
    static boolean stringSearch2(String name, char target){
        if(name.length() == 0)
            return false;
        for(char ch: name.toCharArray()) {
            if(ch==target)
                return true;
        }
        return false;
    }
}
