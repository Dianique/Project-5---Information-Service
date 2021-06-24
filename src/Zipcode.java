public class Zipcode extends ServiceCommunicator {

    public static void main(String [] args) {
        System.out.println(new Zipcode("90250").get());
    }

    Zipcode(String zipCode) {
        super("http://api.zippopotam.us/us/" + zipCode);
    }
}
