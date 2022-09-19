public class Broker {

    private String name;
    private static Channel channel;

    public Broker( String name ) {
        this.name = name;
    }

    Channel accept( int port ){
        // creation d'un port par défaut pour le serveur de service
        this.channel = new Channel();
        return channel;
    };

    Channel connect( String name, int port){
        this.name = name;
        this.channel = new Channel();
        return channel;
    };
}
