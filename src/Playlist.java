import java.util.Queue;

/**
 * Created by Vini on 11/4/16.
 */
public class Playlist {

    private Song song;
    private Queue<Song> queue;

    public Playlist(Song song, Queue<Song> queue){}

    public Song getNextSongQueue(){
        return queue.peek();
    }

    public void queueUpSong(Song s){
        queue.add(s);
    }

}
