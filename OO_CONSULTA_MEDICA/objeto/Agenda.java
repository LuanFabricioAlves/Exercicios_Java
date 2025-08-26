package objeto;

import java.util.ArrayList;

public class Agenda {
    private String data;
    private ArrayList<paciente> pacientes;
    private String cpf;
    private String medico;

//constructor
public Agenda(){
    pacientes = new ArrayList<paciente>();
    data = "";
    this.medico = medico;
}
//método
public void adicionar(paciente pacientes){
    pacientes.add(pacientes);
}

public void remover(String cpf){
    for(int i = 0; i < pacientes.size(); i++){
        if(pacientes.get(i).getCpf().equals(cpf)){
            System.out.println(pacientes.get(i).getNome() + " foi removido com sucesso.");
            pacientes.remove(i);

            i = pacientes.size();
        }

    }
}

public void pesquisar(String cpf){
    for(int i = 0; i<pacientes.size(); i++){
        if(pacientes.get(i).getCpf().equals(cpf)){
            System.out.println(pacientes.get(i).getNome());
            System.out.println(pacientes.get(i).getTelefone());
            System.out.println(pacientes.get(i).getIdade());

            i = pacientes.size();
        }

    }

}

public String getData(){
    return data;
}

public void setData(String data){
    this.data = data;
}

public String getCpf(){
    return cpf;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getMedico(){
    return medico;
}

public void setMedico(String medico){
    this.medico = medico;
}

}
