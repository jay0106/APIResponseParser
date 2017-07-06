
public class APIResponseParser {
    private static final String END_RULE = "<";

    private APIResponseParser(){}

    //returns the book instance containing the parsed data
    public static Book parse(String response) {
        Book book = new Book();
        String startRule = "<title>";
        String title = parse(response, startRule, END_RULE);
        book.setTitle(title);

        startRule = "<name>";
        String name = parse(response, startRule, END_RULE);
        book.setAuthor(name);

        startRule = "<original_publication_year type=\"integer\">";
        int publicationYear = Integer.parseInt(parse(response, startRule, END_RULE));
        book.setPublicationYear(publicationYear);

        startRule =  "<average_rating>";
        double averageRating = Double.parseDouble(parse(response, startRule, END_RULE));
        book.setAverageRating(averageRating);

        startRule = "<ratings_count type=\"integer\">";
        int ratingCount = Integer.parseInt(parse(response, startRule, END_RULE));
        book.setRatingCount(ratingCount);

        startRule = "<image_url>";
        String imageUrl = parse(response, startRule, END_RULE);
        book.setImageUrl(imageUrl);
        return book;
    }

    // overloaded
    private static String parse(String response, String startRule, String endRule){
        int startPosition = response.indexOf(startRule) + startRule.length();
        int endPosition = response.indexOf(endRule, startPosition);
        String result = response.substring(startPosition, endPosition);

        if(result.contains(",")){
            result = result.replace(",", "");
        }
        return result;
    }
}