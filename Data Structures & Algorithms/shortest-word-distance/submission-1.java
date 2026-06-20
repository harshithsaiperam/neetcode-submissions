class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        int w1 = -1;
        int w2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {

            if (wordsDict[i].equals(word1)) {
                w1 = i;
            }

            if (wordsDict[i].equals(word2)) {
                w2 = i;
            }

            if (w1 != -1 && w2 != -1) {
                minDistance = Math.min(
                    minDistance,
                    Math.abs(w1 - w2)
                );
            }
        }

        return minDistance;
    }
}