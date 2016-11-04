/**
 * Created by Vini on 11/4/16.
 */
public class User {

    private String name;
    private long ID;
    public String getName(){
        return name;
    }

    public void setName(String name) { this.name=name; }
    public long getlD() { return ID; }
    public void setID(long ID) { this.ID = ID; }

    public User(String name, long iD) {
        this.name = name;
        ID = iD;
    }
    public User getUser() { return this; }
   
}
