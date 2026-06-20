class TimeMap {

    private Map<String, Map<Integer, String>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyStore.putIfAbsent(key, new HashMap<>());
        keyStore.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if (!keyStore.containsKey(key)) {
            return "";
        }

        int closestTimestamp = -1;

        for (int time : keyStore.get(key).keySet()) {
            if (time <= timestamp) {
                closestTimestamp = Math.max(closestTimestamp, time);
            }
        }

        if (closestTimestamp == -1) {
            return "";
        }

        return keyStore.get(key).get(closestTimestamp);
    }
}