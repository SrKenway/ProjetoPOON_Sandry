package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){

        Paciente paciente = new Paciente();
        paciente.nome = "Sandry";
        paciente.endereco = "Marambaia";
        paciente.numeroCartao = 232312;

        Medico medico = new Medico();
        medico.nome = "Carlos";
        medico.endereco = "Umarizal";
        medico.crm = 654654;
        medico.especialidade = "Cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.dataConsulta = "04/04/2017";
        atendimento.paciente = paciente;
        atendimento.medico = medico;

    }
}
