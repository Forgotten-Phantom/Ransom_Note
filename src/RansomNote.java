import java.util.ArrayList;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int sameCharacters = 0;
        ArrayList<String> magazineLetters = new ArrayList<>();
        String[] m = magazine.split("");

        for (int i = 0; i < magazine.length(); i++)
            magazineLetters.add(m[i]);

        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);

            for (int j = 0; j < magazineLetters.size(); j++) {
                if (character == magazineLetters.get(j).charAt(0)) {
                    sameCharacters++;
                    magazineLetters.remove(j);
                    break;
                }
            }
        }

        return sameCharacters == ransomNote.length();
    }
}
