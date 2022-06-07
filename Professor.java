public class Professor {
    private String especialidade;
    private float salario;

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
