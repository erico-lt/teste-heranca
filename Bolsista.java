public class Bolsista extends Aluno {   
    private int bolsa;

    public void renovarBolsa(){
        if(this.nota >= 7){
           this.bolsa = 25;
        }eles{
         this.bolsa = 10;
        }
        
    }

    @Override
    public void pagarMensalidade(){
        this.setMatricula((this.getBolsa() * this.getValorMensalidade()) / 100);
    }
    
    public int getBolsa() {
        return bolsa;
    }
    
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public String toString(){
        return " Nome: " + this.getNome() + 
        "\n Sexo: " + this.getSexo() + 
        "\n Idade: " + this.getIdade() +
        "\n Curso: " + this.getCurso() + 
        "\n Matricula: " + this.getMatricula();
    }     

}
