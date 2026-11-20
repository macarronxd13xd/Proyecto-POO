
//Creamos el objeto pero aun no se puede instanciar
public class NFTob {
    private String name;
    private double price;
    private String imageUrl;
    private String owner;
//Este es el objeto/molde

    // Constructor: Con este constructor se podra instanciar el objeto NFTob y se le podran asignar valores a sus atributos 
    public NFTob(String name, double price, String imageUrl, String owner) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.owner = owner;
    }
//Este es el que nos va a yudar a crear los objetos de la clase NFTob y asignarles valores a sus atributos.


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

