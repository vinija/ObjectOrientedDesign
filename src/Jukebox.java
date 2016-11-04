import java.util.Set;

/**
 * Created by Vini on 11/4/16.
 */
public class Jukebox {

    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;
    private SongSelector ts;

    public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector ts){
        this.cdPlayer = cdPlayer;
        this.user = user;
        this.cdCollection = cdCollection;
        this.ts = ts;
    }

    public Song getCurrentSong(){
        return ts.getSong();
    }

    public void setUser(User u){
        this. user = u;
    }


}
