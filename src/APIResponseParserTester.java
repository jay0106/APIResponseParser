public class APIResponseParserTester {
    public static void main(String[] args) {
        Book b = APIResponseParser.parse(ReadResponse.getResponse("response.xml"));
        System.out.println(b.toString());
    }
}

