class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        StringBuilder res = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            res.append(str.length()).append(",");
            result.append(str);
        }

        return res.append("#").append(result.toString()).toString();
    }

    

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}