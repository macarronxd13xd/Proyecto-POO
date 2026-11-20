    // 1- Usuario se registrara con su nombre, apellido, correo y contraseña.
    // 2- Usuario podra ver la galeria de NFT y sus precios.
    // 3- Usuario podra comprar un NFT
    // 5- Se felicitara al usuario por su compra y se le mostrara el NFT que compro.

import java.util.Scanner;

public class proyectoPOO {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- PUNTO 1: REGISTRO DEL USUARIO ---
        System.out.println("=== REGISTRO DE USUARIO ===");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa tu correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasena = scanner.nextLine();

        // Creas el objeto Usuario con los datos ingresados
        Usuario usuarioActual = new Usuario(nombre, apellido, correo, contrasena);
        System.out.println("\n¡Bienvenido, " + usuarioActual.getNombre() + " " + usuarioActual.getApellido() + "!\n");

        // --- PUNTO 2: MOSTRAR GALERÍA ---
        Galeria miGaleria = new Galeria("Tienda");
        miGaleria.nftsgaleria();

        System.out.println("=== GALERÍA DE NFTs ===");
        for (int i = 0; i < miGaleria.getNFTList().size(); i++) {
            NFTob nft = miGaleria.getNFTList().get(i);
            System.out.println((i + 1) + ". " + nft.getName() + " - Precio: $" + nft.getPrice());
        }

        // --- PUNTO 3: COMPRAR UN NFT ---
        System.out.print("\nEscribe el número del NFT que deseas comprar (1 al " + miGaleria.getNFTList().size() + "): ");
        int opcion = scanner.nextInt();

        // Como la lista empieza en 0, restamos 1 al número que eligió el usuario
        NFTob nftElegido = miGaleria.getNFTList().get(opcion - 1);

        // Agregamos el objeto NFT a la lista 'misNfts' del usuario
        usuarioActual.agregarNft(nftElegido);

        // --- PUNTO 5: FELICITACIÓN Y MOSTRAR COMPRA ---
        System.out.println("\n¡Felicitaciones " + usuarioActual.getNombre() + " por tu compra!");
        System.out.println("Has adquirido el NFT: " + nftElegido.getName() + " por un valor de $" + nftElegido.getPrice());

        scanner.close();
    }
}