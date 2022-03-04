/*
 * Objeto Aluno.
 */
package projeto;

    public class Aluno {
        Integer id;
        String name;
        double note;
    
    public Aluno(Integer id, String name, double note){
        super();
        this.id=id;
        this.name=name;
        this.note=note;
        }
    
    public Aluno(){
        super();
    }  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    @Override
    public String toString(){
        return "Aluno{" + "id=" + id +", name="+ name +", note="+note +'}';
    }
}
