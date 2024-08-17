
public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23765064"); 
        System.out.println(cepFormatado); 
        }catch(CepInvalidoExeception e){
            System.out.println(" O Cep informado é invalido. ");
        e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeception{
        if(cep.length()!=8)
            throw new CepInvalidoExeception();
            //Simular um Cep formatado.
            return " 23.765-064";

        }
        
    }
    

