import java.util.ArrayList;

public class itemTest {

    // Test class for the mediaItem and nonMediaItem types.

    public static void main(String[] args) {
        ArrayList<mediaItem> listOfMedia = new ArrayList<>();

        listOfMedia.add(new mediaItem(575200221, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
                "Alidia Maffione", 7, mediaType.DVD));
        listOfMedia.add(new mediaItem(41190319, 6.27, 8, "Jurassic Park",
                "nisi venenatis", "Melvin Rozenzweig", "Errol Monteath", "Eirena Daudray", 5, mediaType.DVD));
        listOfMedia.add(new mediaItem(57627136, 3.90, 9, "Top Gun ", "sit amet", "Cleavland Deny",
                "Ignazio Floyed", "Amory Finan", 6, mediaType.DVD));
        listOfMedia.add(new mediaItem(62362184, 4.75, 6, "Stuff and Dough", "vehicula",
                "Corrianne Hawton", "Jeniffer Cork", "Brinn Jedrzaszkiewicz", 2, mediaType.DVD));

        System.out.println("Title\t\t\t\tUPC\t\tPrice\tType\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(listOfMedia.get(i));
        }

    }
}