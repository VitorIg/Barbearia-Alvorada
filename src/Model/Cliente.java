package Model;

import java.util.Date;

public class Cliente extends Pessoa {
    
    private String enderenco;
    private String cep;

    public Cliente(Integer id, String nome, String enderenco, String cep) {
        super(id, nome);
        this.enderenco = enderenco;
        this.cep = cep;
    }
    public Cliente(Integer id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String enderenco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.enderenco = enderenco;
        this.cep = cep;
    }
    public String getEnderenco() {
        return enderenco;
    }
    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    @Override
    public String toString(){
        return getNome();
    }
}
    
