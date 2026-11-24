import java.util.ArrayList;

public class Galeria {
    private ArrayList<NFTob> NFTList;// transformo la variable NFTList en un ArrayList de objetos NFTob para poder almacenar multiples objetos NFTob en la galeria
    public Galeria(String name) {
        
        this.NFTList = new ArrayList<>();// inicializo la variable NFTList como un nuevo ArrayList de objetos NFTob
    }



    public void nftsgaleria() {// metodo que crea los objetos NFTob y los agrega a la lista NFTList de la galeria
        // Crear una instancia de NFTob
        NFTList.add(new NFTob("Bored Ape #1", 100.0, "https://example.com/boredape1.png", "Juan"));
        NFTList.add(new NFTob("CryptoPunk #2", 200.0, "https://example.com/cryptopunk2.png", "Maria"));
        NFTList.add(new NFTob("Art Blocks #3", 150.0, "https://example.com/artblocks3.png", "Carlos"));
        NFTList.add(new NFTob("Meebit #4", 300.0, "https://example.com/meebit4.png", "Ana")); 
        NFTList.add(new NFTob("Hashmask #5", 250.0, "https://example.com/hashmask5.png", "Luis"));


    }
    



public ArrayList<NFTob> getNFTList() {
        return NFTList;// metodo que devuelve la lista de objetos NFTob de la galeria
    }









}