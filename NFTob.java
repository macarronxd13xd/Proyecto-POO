public class NFTob {
    private String name;
    private double price;
    private String imageUrl;
    private String owner;
    

    // Constructor
    public NFTob(String name, double price, String imageUrl, String owner) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.owner = owner;
    }

    // SETTERS: Permiten guardar los datos desde otro archivo
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // GETTERS: Permiten leer los datos desde otro archivo
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getOwner() {
        return owner;
    }
}

