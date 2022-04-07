package desafio_mv;

public class node {
    private String cpf;
    private String nome;
    private String cafe;
    private node next;
    public node (String cpf ,node next) {
       this.cpf  = cpf;
       this.next = next;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    public node getNext(){
        return next;
    }

    public void setNext(node next){
        this.next = next;
    }
    public String toString() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nCafe: " + this.getCafe();
    }
}
