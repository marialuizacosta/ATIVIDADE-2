public class Post{

private String texto;
private String link;
private int numeroCurtidas;
private int numeroCompartilhamentos;

public Post(String texto, String link){
  this.texto = texto;
  this.link = link;
  this.numeroCurtidas = 0;
  this.numeroCompartilhamentos = 0;

}

public String getTexto(){
  return texto; 
}
public void setTexto(String texto){
  this.texto = texto; 
}
public String getLink(){
  return link;
}
public void setLink(String link){
  this.link = link;
}
public int getNumeroCurtidas(){
  return numeroCurtidas;
}
public void setNumeroCurtidas(int numeroCurtidas){
  this.numeroCurtidas = numeroCurtidas;
}
public int getNumeroCompartilhamentos(){
  return numeroCompartilhamentos;
}
public void setNumeroCompartilhamentos(int numeroCompartilhamentos){
  this.numeroCompartilhamentos = numeroCompartilhamentos;
}
public void curtir(){
 this.numeroCurtidas =this.numeroCurtidas+ 1;
}

public void compartilhar(){
  this.numeroCompartilhamentos =this.numeroCompartilhamentos+ 1;
}
}



