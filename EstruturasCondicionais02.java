public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 Categoría Infantil
        // idade >= 15 && idade < 18 Categoria Juvenil
        // idade >= 18 Categoria Adulto

        int idade = 16;
        if (idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
/* Condições if em categorias de idade
if (idade < 15){
    categoria = "Categoria Infantil";
} else if (idade >= 15 && idade < 18){
    categoria = "Categoria Juvenil";
} else {
    categoria = "Categoria Adulto";
}
System.out.println(categoria);
 
 */
