
public class UserPrototype{

    //PROPERTIES WITH APPROPRIATE DATA TYPES
    int id;
    String name;
    String photoURL;


    //Menu -> Code -> Generate -> Constructor -> Select None
    //EMPTY CONSTRUCTOR
    public UserPrototype() {
    }


    //PARAMETERIZED CONSTRUCTOR
    public UserPrototype(int id, String name, String photoURL) {
        this.id = id;
        this.name = name;
        this.photoURL = photoURL;
    }



    //GETTER AND SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}