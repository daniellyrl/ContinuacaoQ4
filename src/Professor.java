public class Professor extends Pessoa {
    private int matricula;
    private double salario;
    private int horasTrabalhadas;
    private int valorHoraAula;

    public void calculasalario() {
        salario = horasTrabalhadas * valorHoraAula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(int valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}