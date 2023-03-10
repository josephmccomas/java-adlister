import java.beans.JavaBean;
import java.util.ArrayList;

@JavaBean
public class BeanTest {

    public static void main(String[] args) {

        Albums whiteAlbum = new Albums();
        whiteAlbum.setId(1);
        whiteAlbum.setAlbum_name("The White Album");
        whiteAlbum.setArtist("The Beatles");
        whiteAlbum.setGenre("Rock");
        whiteAlbum.setRelease_date(1970);
        whiteAlbum.setSales(20000000.00);
        System.out.println(whiteAlbum);

        Author bob = new Author();
        bob.setAuthor("Doc");


        ArrayList<Quote> quotes = new ArrayList<>();



        Quote quote = new Quote();
        quote.setId(4);
        quote.setContent("Servlets suck");

        for (Quote quote1:quotes) {
            System.out.println(quote1);
        }
    }
}
