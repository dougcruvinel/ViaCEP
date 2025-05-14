import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite o numero de CEP para consult:");
        var cep = leitura.nextLine();

//Endereco novoEndereco = consultaCep.buscaEndereco("37820000");
  //      System.out.println(novoEndereco);

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco("1");
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando  aplicação");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}