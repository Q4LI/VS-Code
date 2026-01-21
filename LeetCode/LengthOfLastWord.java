class lengthOfLastWord {
    public static int m_lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while (i >= 0) {
            if((s.charAt(i) == ' ') && (count == 0)) {
                i--;
            }
            else if ((s.charAt(i) == ' ') && (count > 0)) {
                break;
            }
            else if (s.charAt(i) != ' '){
                count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testString = "a";
        int length = m_lengthOfLastWord(testString);
        System.out.println("Length of last word: " + length);
    }
}