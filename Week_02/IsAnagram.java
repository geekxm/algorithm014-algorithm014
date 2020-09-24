public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[26];
        for (char c : s.toCharArray())
            table[c - 'a']++;
        for (char c : t.toCharArray()) {
            table[c - 'a']--;
            if (table[c - 'a'] < 0) return false;
        }
        return true;
    }

}
