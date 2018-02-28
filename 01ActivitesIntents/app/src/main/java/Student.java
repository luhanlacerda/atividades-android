import java.util.ArrayList;
import java.util.List;

/**
 * Created by luhanlacerda on 22/02/18.
 */

public class Student {

    private String nome;
    private String contato;
    private String site;
    private List<Student> studentsList = new ArrayList<>();

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
