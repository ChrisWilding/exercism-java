import java.util.Map;

class Scrabble {
    private int score = 0;
    private static Map<Character, Integer> scores = Map.ofEntries(
        Map.entry('A', 1),
        Map.entry('E', 1),
        Map.entry('I', 1),
        Map.entry('O', 1),
        Map.entry('U', 1),
        Map.entry('L', 1),
        Map.entry('N', 1),
        Map.entry('R', 1),
        Map.entry('S', 1),
        Map.entry('T', 1),
        Map.entry('D', 2),
        Map.entry('G', 2),
        Map.entry('B', 3),
        Map.entry('C', 3),
        Map.entry('M', 3),
        Map.entry('P', 3),
        Map.entry('F', 4),
        Map.entry('H', 4),
        Map.entry('V', 4),
        Map.entry('W', 4),
        Map.entry('Y', 4),
        Map.entry('K', 5),
        Map.entry('J', 8),
        Map.entry('X', 8),
        Map.entry('Q', 10),
        Map.entry('Z', 10)
    );

    Scrabble(String word) {
        for (var c : word.toCharArray()) {
            var upperCase = Character.toUpperCase(c);
            score += scores.get(upperCase);
        }
    }

    int getScore() {
        return score;
    }
}
