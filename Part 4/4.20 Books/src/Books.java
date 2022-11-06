public class Books {

    private String title;
    private int numberPages;
    private int publication;

    public Books(String title, int numberPages, int publication) {
        this.title = title;
        this.numberPages = numberPages;
        this.publication = publication;
    }

    public String getName() {
        return title;
    }

    public String toString() {
        return title + ", " + numberPages + ", " + publication;
    }
}
