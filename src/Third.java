class Third{

    private static final Third INSTANCE = new Third();

    private Third(){}

    public static Third getInstance() {
        return INSTANCE;
    }
}