public class Good {
    protected String name;
    protected String company;
    protected double price;
    protected int rating;
    protected int id;

    public Good (String name, String company, double price, int rating, int id) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.rating = rating;
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCompany () {
        return company;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getRating () {
        return rating;
    }

    public void setRating (int rating) {
        this.rating = rating;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String goodToString () {
        return  String.format("%1$-15s %2$-20s %3$-6.1f %4$-5d %5$-6d" , name, company, price, rating, id);
    }
}
