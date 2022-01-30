public class Shop {
    private String name;
    protected Bucket bucket;

    public Shop (String name) {
        this.name = name;
        Bucket bucket = new Bucket();
    }
}
