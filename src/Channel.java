public class Channel {
    boolean disconnected;
    String message;

    int read(byte[] bytes, int offset, int length){
        //si le tunnel est déconnecté
        if( this.disconnected() )
            return 0;

        //lire dans le tunnel
        try{
            //lecture avec succès
            return 1;
        }
        catch(Exception e){
            //echec de lecture
            return 0;
        }
    };
    int write(byte[] bytes, int offset, int length){
        //si le tunnel est déconnecté
        if( this.disconnected() ){
            return 0;
        }
        // ecrire dans le tunnel
        //écrire dans le tunnel
        try{
            //écriture avec succès
            return 1;
        }
        catch(Exception e){
            //echec d'ecriture
            return 0;
        }
    };
    void disconnect(){
        this.disconnected = true;
    };
    boolean disconnected(){
        return this.disconnected;
    };

}
