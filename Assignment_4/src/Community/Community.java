

package Community;


public class Community extends City{

    String commName;

    public String getCommunityName() {
        return commName;
    }

    public void setCommunityName(String communityName) {
        this.commName = communityName;
    }
    
    @Override
    public String toString(){
        return "\nCommunity is : " + "\u001B[1m" + this.commName + super.toString();
    }
    
}
