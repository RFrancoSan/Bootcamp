package dominio;

public class Curso extends Conteudo{

  private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP(){
        return XP_PADRAO * 20d;
    }

    @Override
    public String toString() {
      return "Curso [titulo = " + getTitulo() + ", descrição = " + getDescricao() + ", cargaHoraria = " + getCargaHoraria()
          + "]";
    }

    
    
  
}
