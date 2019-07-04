package Terabyte;

public class Cliente {

    private String Nome_completo;
    private String Data_de_nascimento;
    private String CPF;
    private String RG;
    private int Telefone_residencial;
    private int Telefone_celular;
    private String Email;
    private String Confirme_email;
    private int Senha;
    private int Confirme_senha;
    private Endereco Adress;

    /**
     * @return the Nome_completo
     */
    public String getNome_completo() {
        return Nome_completo;
    }

    /**
     * @param Nome_completo the Nome_completo to set
     */
    public void setNome_completo(String Nome_completo) {
        this.Nome_completo = Nome_completo;
    }

    /**
     * @return the Data_de_nascimento
     */
    public String getData_de_nascimento() {
        return Data_de_nascimento;
    }

    /**
     * @param Data_de_nascimento the Data_de_nascimento to set
     */
    public void setData_de_nascimento(String Data_de_nascimento) {
        this.Data_de_nascimento = Data_de_nascimento;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the Telefone_residencial
     */
    public int getTelefone_residencial() {
        return Telefone_residencial;
    }

    /**
     * @param Telefone_residencial the Telefone_residencial to set
     */
    public void setTelefone_residencial(int Telefone_residencial) {
        this.Telefone_residencial = Telefone_residencial;
    }

    /**
     * @return the Telefone_celular
     */
    public int getTelefone_celular() {
        return Telefone_celular;
    }

    /**
     * @param Telefone_celular the Telefone_celular to set
     */
    public void setTelefone_celular(int Telefone_celular) {
        this.Telefone_celular = Telefone_celular;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Confirme_email
     */
    public String getConfirme_email() {
        return Confirme_email;
    }

    /**
     * @param Confirme_email the Confirme_email to set
     */
    public void setConfirme_email(String Confirme_email) {
        this.Confirme_email = Confirme_email;
    }

    /**
     * @return the Senha
     */
    public int getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Confirme_senha
     */
    public int getConfirme_senha() {
        return Confirme_senha;
    }

    /**
     * @param Confirme_senha the Confirme_senha to set
     */
    public void setConfirme_senha(int Confirme_senha) {
        this.Confirme_senha = Confirme_senha;
    }

    /**
     * @return the Adress
     */
    public Endereco getAdress() {
        return Adress;
    }

    /**
     * @param Adress the Adress to set
     */
    public void setAdress(Endereco Adress) {
        this.Adress = Adress;
    }
}
