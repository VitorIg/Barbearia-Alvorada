package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailTeste {

    public static void main(String[] args) {
          
        Email email = new Email("Assunto da Barbearia",
                "Mensagem padrão do Sistema da Barbearia",
                "@gmail.com");
        
        email.enviar();
    }
    
}
