public class Aviao {
  private int velocidade; 
  private int altitude; 

  public int getVelocidade(){
    return velocidade;
  }
  public void setVelocidade(int velocidade){
    this.velocidade = velocidade; 
  }
  public int getAltitude(){
    return altitude;
  }
  public void setAltitude(int altitude){
    this.altitude = altitude;
  }
public int reduzirVelocidade(){

  return this.velocidade - 100;
  
}
public int reduzirAltitude(){
 
  return this.altitude - 1;
   
}
}
