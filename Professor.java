public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome, String sexo, String especialidade, int idade){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setEspecialidade(especialidade);
        this.setIdade(idade);
        this.setSalario(1500f);
    }
    /*
     * Metodo para aumentar o salario, deve ser passado uma valor para "aumento"
     */
    public void receberAumento(int aumento){
        this.salario += aumento;
    }    
    
    //Metodos gets e sets
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
