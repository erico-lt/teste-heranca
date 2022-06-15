public class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    private int valorMensalidade = 200;    

    // metodos para cancelar e renovar matricula
    public void pagarMensalidade(){
        this.setMatricula(this.getValorMensalidade());
    }    
    
    /*/ metodos "get e set" para modificar e 
        retornar o status da matricula e curso
     */
    public String getCurso() {
        return curso;
    }
   
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){        
        this.matricula = matricula;
    }
    
    public int getValorMensalidade() {
        return valorMensalidade;
    }
    
    public void setValorMensalidade(int valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }    

    public String toString(){
        return " Nome: " + this.getNome() + 
        "\n Sexo: " + this.getSexo() + 
        "\n Idade: " + this.getIdade() +
        "\n Curso: " + this.getCurso() + 
        "\n Matricula: " + this.getMatricula();
    }     

}
