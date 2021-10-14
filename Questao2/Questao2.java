public class Questao2 {
  public static void main(String [] args)throws Exception {

   Post post = new Post("Different eyes see different things", " https://www.friv.com/ ");

System.out.println("\nLegenda: "+post.getTexto());
System.out.println("Link: "+post.getLink());

post.curtir();
post.curtir();
post.curtir();

post.compartilhar();
post.compartilhar();

System.out.println("Numero de Curtidas: "+post.getNumeroCurtidas());
System.out.println("Numero de Compartilhamentos: "+post.getNumeroCompartilhamentos());
  }
}
