/**
 * Created by Vini on 11/4/16.
 */
public class CDPlayer {

    private Playlist playlist;
    private CD cd;

    public CDPlayer(CD c, Playlist p){
        playlist  = p;
        cd = c;
    }

    public void playSong(Song s){}

    public Playlist getPlaylist(){
        return  playlist;
    }

    public void setPlaylist(Playlist p){
        playlist = p;
    }

    public CD getCD(){
        return cd;
    }

    public void setCD(CD c){
        cd =c;
    }

}
