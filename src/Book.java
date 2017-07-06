public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double averageRating;
    private int ratingsCount;
    private String imageUrl;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getAverageRating(){
        return averageRating;
    }
    public void setAverageRating(double averageRating){
        this.averageRating = averageRating;
    }

    public int getRatingCount(){
        return ratingsCount;
    }
    public void setRatingCount(int ratingsCount){
        this.ratingsCount = ratingsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book Information: \n" +
                "\tTitle = " + title + "\n" +
                "\tAuthor = " + author + "\n" +
                "\tPublication Year = " + publicationYear + "\n" +
                "\tAverage Rating = " + averageRating + "\n" +
                "\tRatings Count = " + ratingsCount + "\n" +
                "\tImage Url = " + imageUrl;
    }
}
