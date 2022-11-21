public class itemTest{

// Test class for the mediaItem and nonMediaItem types.

    public static void main (String[] args){
        ArrayList<mediaItem> listOfMedia = new ArrayList<>();

        listOfMedia.add(new mediaItem(57520-0221,0.93,2,"David and Lisa","habitasse","Web Jeske","Gay Montford","Alidia Maffione",7, mediaType.DVD));
        listOfMedia.add(new mediaItem(41190-319,6.27,8,"Pirates Who Don't Do Anything: A VeggieTales Movie, The","nisi venenatis","Melvin Rozenzweig","Errol Monteath","Eirena Daudray",5, mediaType.DVD));
        listOfMedia.add(new mediaItem(57627-136,3.90,9,"Life Before Her Eyes, The","sit amet","Cleavland Deny","Ignazio Floyed","Amory Finan",6, mediaType.DVD));
        listOfMedia.add(new mediaItem(62362-184,4.75,6,"Stuff and Dough (Marfa si banii)","vehicula","Corrianne Hawton","Jeniffer Cork","Brinn Jedrzaszkiewicz",2, mediaType.DVD));

         for (int i = 0; i < 5 ; i++) {
            System.out.println(listOfMedia.get(i));
    }


}