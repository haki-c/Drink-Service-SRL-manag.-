package DS;

public class User{
    
    private String username;
    private String domicileAddress;
    private int id;

    User(String username, String domicileAddress, int id){
        
        this.username = username;
        this.domicileAddress = domicileAddress;
        this.id = id;
    }

    User(){
        
        username = "";
        domicileAddress = "";
        id = 0;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public void setId(int id) {
        this.id = id;
    }
}


