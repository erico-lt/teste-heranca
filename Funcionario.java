public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, String sexo, String setor, int idade){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setSetor(setor);
        this.setIdade(idade);
        this.setTrabalhando(true);
    }
    public void pararTrabalho(){
        this.trabalhando = false;
    }

    public void voltarTrabalhar(){
        this.trabalhando = true;
    }   
    
    public String getSetor() {
        return this.setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String toString(){
        return " Nome: " + this.getNome() + 
        "\n Sexo: " + this.getSexo() + 
        "\n Idade: " + this.getIdade() +
        "\n Curso: " + this.getSetor() + 
        "\n Matricula: " + this.getTrabalhando();
    }

}
