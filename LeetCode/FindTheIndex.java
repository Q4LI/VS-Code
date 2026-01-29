public class FindTheIndex {
    public int strStr(String haystack, String needle){
        int i = 0;
        while (i < haystack.length()){
            if(haystack.startsWith(needle, i)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindTheIndex fti = new FindTheIndex();
        String haystack = "hello";
        String needle = "la";
        int index = fti.strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }
}
