public class Questao1 {
  
public static void main(String [] args){
    

    
Paciente paciente1 = new Paciente("00000", "Maria Luíza ","20/12/2004", "Feminino", "Planserv", "Nenhuma", "A+" );



System.out.println(" \n Dados da Paciente: \n ");

System.out.println("Código: "+paciente1.getCodigo());

System.out.println("Nome: "+paciente1.getNome());

System.out.println("Data de Nascimento: "+paciente1.getDataNascimento());
System.out.println("Sexo: "+paciente1.getSexo());

System.out.println("Plano de Saúde: "+paciente1.getPlanoSaude());

System.out.println("Alergia: "+paciente1.getAlergia());

System.out.println("Tipo Tipo Sanguineo: "+paciente1.getTipoSanguineo());

    


paciente1.setCodigo("00001");
    
paciente1.setNome("Luceilma Costa");
    
paciente1.setDataNascimento("17/11/1970");
    
paciente1.setSexo("Feminino");
    
paciente1.setPlanoSaude("Planserve");
    
paciente1.setAlergia("Lactose");
    
paciente1.setTipoSanguineo("A+");

    

System.out.println(" \n Dados da mãe: \n ");

System.out.println("Código: "+paciente1.getCodigo());

System.out.println("Nome: "+paciente1.getNome());

System.out.println("Data de Nascimento: "+paciente1.getDataNascimento());

System.out.println("Sexo: "+paciente1.getSexo());

System.out.println("Plano de Saúde: "+paciente1.getPlanoSaude());

System.out.println("Alergia: "+paciente1.getAlergia());

System.out.println("Tipo Tipo Sanguineo: "+paciente1.getTipoSanguineo());

  

}

}
