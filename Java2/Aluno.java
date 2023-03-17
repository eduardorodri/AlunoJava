public Aluno(String nome, int idade, String cursoFaculdade){
    this.nome = nome;
    this.idade = idade;
    this.curso = curso;
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public int getIdade(){
    return idade;
}

public void setIdade(int idade){
    this.idade = idade;
}

public String getCurso(){
    return curso;
}

public void setCurso(String curso){
    this.curso = curso;
}

public static void main(String[] args){
    Aluno aluno = new Aluno("Eduardo", 24, "Analise e Desenvolvimento de Sistemas");
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Idade: " + aluno.getIdade());
    System.out.println("Curso: " + aluno.getCurso());
}
