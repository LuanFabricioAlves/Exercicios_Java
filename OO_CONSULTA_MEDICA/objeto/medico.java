package objeto;

public class medico{
    private String nome;
    private String especialidade;
    private int crm;

//construtor
public medico(String nome, String especialidade, int crm){
    this.nome = nome;
    this.especialidade = especialidade;
    this.crm = crm;
}
//métodos GETs e SETs
public String getNome() {
    return nome;
}

public void setNome (String nome){
    this.nome = nome;
}

public String getEspecialidade(){
    return especialidade;
}

public void setEspecialidade(String especialidade){
    this.especialidade = especialidade;
}

public int getCrm(){
    return crm;
}

public void setCrm (int crm){
    this.crm = crm;
}



}
