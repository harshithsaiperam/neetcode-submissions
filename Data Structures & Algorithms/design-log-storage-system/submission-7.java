class LogSystem {
    private Map<Integer, String> log;

    public LogSystem() {
        log = new HashMap<>();
    }

    public void put(int id, String timestamp) {
        log.put(id, timestamp);
    }
    
    public List<Integer> retrieve(String start, String end, String granularity) {
        List<Integer> result = new ArrayList<>();

        int parts = getParts(granularity);

        for (Map.Entry<Integer, String> entry : log.entrySet()) {
            int id = entry.getKey();
            String timestamp = entry.getValue();

            if (compare(timestamp, start, parts) >= 0 &&
                compare(timestamp, end, parts) <= 0) {
                result.add(id);
            }
        }

        return result;
    }

    private int compare(String a, String b, int parts) {
        String[] arrA = a.split(":");
        String[] arrB = b.split(":");

        for (int i = 0; i < parts; i++) {
            int numA = Integer.parseInt(arrA[i]);
            int numB = Integer.parseInt(arrB[i]);

            if (numA < numB) {
                return -1;
            } else if (numA > numB) {
                return 1;
            }
        }

        return 0;
    }

    private int getParts(String granularity) {
        switch (granularity) {
            case "Year":
                return 1;
            case "Month":
                return 2;
            case "Day":
                return 3;
            case "Hour":
                return 4;
            case "Minute":
                return 5;
            case "Second":
                return 6;
            default:
                return 6;
        }
    }
}