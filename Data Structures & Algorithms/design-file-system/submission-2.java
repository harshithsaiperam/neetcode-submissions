class FileSystem {

    private Map<String, Integer> map;

    public FileSystem() {
        map = new HashMap<>();
    }
    
    public boolean createPath(String path, int value) {
        // path already exists
        if (map.containsKey(path)) {
            return false;
        }

        // invalid paths
        if (path.length() == 0 || path.equals("/")) {
            return false;
        }

        // find last slash
        int lastSlashIndex = path.lastIndexOf('/');

        // parent path
        String parent = path.substring(0, lastSlashIndex);

        // If parent is empty, this is a root-level path like "/a"
        // Root-level paths are allowed.
        if (parent.length() > 0 && !map.containsKey(parent)) {
            return false;
        }

        map.put(path, value);
        return true;
    }
    
    public int get(String path) {
        if (!map.containsKey(path)) {
            return -1;
        }

        return map.get(path);
    }
}