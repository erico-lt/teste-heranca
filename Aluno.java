public class Aluno extends Pessoa{
    private String curso;
    private boolean matricula;

    public Aluno(String nome, String sexo, String curso, int idade){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setCurso(curso);
        this.setIdade(idade);
        this.setMatricula(true);
    }

    // metodos para cancelar e renovar matricula
    public void cancelarMatricula(){
        this.setMatricula(false);
    }
    public void renovarMatricular(){
        this.setMatricula(true);
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

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula){
        this.matricula = matricula;
    }

    public String toString(){
        return " Nome: " + this.getNome() + 
        "\n Sexo: " + this.getSexo() + 
        "\n Idade: " + this.getIdade() +
        "\n Curso: " + this.getCurso() + 
        "\n Matricula: " + this.getMatricula();
    }
}
