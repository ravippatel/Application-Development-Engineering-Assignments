

package Community;


public class City {

    String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city) {
        this.cityName = city;
    }
    
    @Override
    public String toString(){
        return "\n City is : " + "\u001B[1m" + this.cityName;
    }
    
}
