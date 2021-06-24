public class Music extends ServiceCommunicator {

    public static void main(String[] args) {
        System.out.println(new Music("Lianne-La-Havas").get());
    }
    public Music(String artistFeature) {
        super("https://itunes.apple.com/search?term=" + "Lianne-La-Havas");
    }
}
