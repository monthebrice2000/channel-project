public class Task extends Thread {
    //une instance du broker
    Broker broker;
    Channel channel;

    public Task(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        //
    }

    //une méthode connect()
    public void connect(String host, int port){
        this.channel = this.broker.connect( host, port );
    }

    //une methode disconnect()
    public void disconnect(){
        this.channel.disconnect();
    }

    //une methode receive()
    public void read(){
        byte[] data = new byte[20];
        this.channel.read( data, 0, data.length);
        System.out.println( "Received Message : " + new String( data ));
        this.channel.disconnect();
    }
    //une methode send()
    public void write(String message){
        this.channel.write( message.getBytes(), 0, message.length() );
    }
}
