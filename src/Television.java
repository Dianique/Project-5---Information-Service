public class Television extends ServiceCommunicator {

    public static void main(String[] args) {
        System.out.println(new Television("Moesha").get());
    }

    Television(String tvTitle) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvTitle);
    }
}


