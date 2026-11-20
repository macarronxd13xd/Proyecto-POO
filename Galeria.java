import java.util.ArrayList;

public class Galeria {
    private ArrayList<NFTob> NFTList;
    public Galeria(String name) {
        
        this.NFTList = new ArrayList<>();
    }



    public void nftsgaleria() {
        // Crear una instancia de NFTob
        NFTList.add(new NFTob("Bored Ape #1", 100.0, "https://example.com/boredape1.png", "Juan"));
        NFTList.add(new NFTob("CryptoPunk #2", 200.0, "https://example.com/cryptopunk2.png", "Maria"));
        NFTList.add(new NFTob("Art Blocks #3", 150.0, "https://example.com/artblocks3.png", "Carlos"));
        NFTList.add(new NFTob("Meebit #4", 300.0, "https://example.com/meebit4.png", "Ana")); 
        NFTList.add(new NFTob("Hashmask #5", 250.0, "https://example.com/hashmask5.png", "Luis"));


    }
    



public ArrayList<NFTob> getNFTList() {
        return NFTList;
    }









}