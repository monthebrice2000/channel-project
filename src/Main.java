public class Main {

    public static void main(String[] args) {
	    // write your code here
        Broker broker = new Broker("broker");

        Task taskOne = new Task(broker);
        taskOne.connect("broker", 8080);

        Task taskTwo = new Task( broker );
        taskTwo.connect("broker", 8080);

        taskOne.write( "Hello World" );
        taskTwo.read();
    }
}
