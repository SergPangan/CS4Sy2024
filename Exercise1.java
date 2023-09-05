public class Exercise1 {

    public static void main(String[] args){
        // name, no.albums, followers
        String a1Name = "Mind's Eye";
        int a1Album = 2;
        int a1Listen = 672372;

        String a2Name = "SOS";
        int a2Album = 1;
        int a2Listen = 109368;

        String a3Name = "Eyedress";
        int a3Album = 9;
        int a3Listen = 12805758;

        int aListen = a1Listen + a2Listen + a3Listen;
        boolean aAlbum = a1Album < a2Album;
        boolean a3MostListen = a3Listen > (a1Listen + a2Listen);

        System.out.println(  "Artist 1" );
        System.out.println( "Name: " + a1Name);
        System.out.println( "Albums: " + a1Album);
        System.out.println( "No. of Listeners: " + a1Listen);
        System.out.println( " ");
        System.out.println(  "Artist 2" );
        System.out.println( "Name: " + a2Name);
        System.out.println( "Albums: " + a2Album);
        System.out.println( "No. of Listeners: " + a2Listen);
        System.out.println( " ");
        System.out.println(  "Artist 3" );
        System.out.println( "Name: " + a3Name);
        System.out.println( "Albums: " + a3Album);
        System.out.println( "No. of Listeners: " + a3Listen);
        System.out.println( " ");
        

        System.out.println( "Total No. of Listeners: " + aListen); // (operation:sum)
        System.out.println( "SOS has more Albums than Mind's Eye: " + aAlbum); // (operation:comparison)
        System.out.println( "Eyedress has more listeners than SOS and Mind's Eye Combined: " + a3MostListen); // (operation:comparison)
    }

}