public abstract class Pessoa{    
    private String nome;
    private String sexo;
    private int idade;

    public void fazerAniversario(){
        this.setIdade(1);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade += idade;
    }           
}