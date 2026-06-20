class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String value = new String(chars);
            List<String> list = new ArrayList<>();
            map.putIfAbsent(value, list);
            map.get(value).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
