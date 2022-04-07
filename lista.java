package desafio_mv;

import java.util.Objects;

public class lista {
    private node head;


    public boolean isEmpty(){
         return Objects.isNull(head);
    }

    public void addFirst(String cpf) {
        if (isEmpty()) {
            head = new node(cpf, null);
            return;
        }
        head = new node(cpf, head);
    }
    public void addCafe(String cafe){
        head.setCafe(cafe);
    }

    public boolean repeatCpf(String cpf){
        node aux = head;
        while(Objects.nonNull(aux)){
            if(Objects.equals(cpf, aux.getCpf())){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    public Boolean repeatCafe(String cafe){
        node aux = head;
        while(Objects.nonNull(aux)){
            if(Objects.equals(cafe,aux.getCafe())){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
}
