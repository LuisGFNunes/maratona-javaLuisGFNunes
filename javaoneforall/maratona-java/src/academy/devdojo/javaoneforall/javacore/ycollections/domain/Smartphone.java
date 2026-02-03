package academy.devdojo.javaoneforall.javacore.ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }
    
    // reflexive: x.equals(x) : true for all that's difference from null
    // symmetric: for x and y difference from null, if x.equals(y) == true, so y.equals(x) == true
    // transitive: for x,y,z difference from null, if x.equals(y) == true && y.equals(z) == true, so x.equals(z) == true
    // consistent: x.equals(x) always return true if x difference from null
    // for x difference from null, x.equals(null) == false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone obj1 = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(obj1.serialNumber);
    }

    // if x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() not necessary y.equals(x) == true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() X.equals(y) may be false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
