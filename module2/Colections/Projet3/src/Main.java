import java.util.*;


class Main {
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant("Prisca",23,"Mathematique");
        Etudiant etudiant2 = new Etudiant("Merveille",19,"Informatique");
        etudiant1.enrollStudent();
        etudiant2.enrollStudent();
        etudiant2.assignGrade();
        //etudiant2.listStudentsInCourse();

    }
}

class Etudiant {
    private String nom;
    private  int  age;
    public String cours;
    public HashSet<String> etudiants;

    public Etudiant(String nom, int age,String cours){
        this.nom=nom;
        this.age=age;
        this.cours=cours;

    }
    public void enrollStudent(){
        HashSet<String> etudiants = new HashSet<>();
        etudiants.add(String.valueOf(new Etudiant(this.nom, this.age,this.cours)));

        for (String ed : etudiants) {
            System.out.println(ed);
        }

    }
    @Override
    public String toString() {
        return this.nom + "\nage: " + this.age + "ans\ncours:" + this.cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return age == etudiant.age && Objects.equals(nom, etudiant.nom) && Objects.equals(cours, etudiant.cours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age, cours);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void assignGrade(){
        List<Integer> note=new LinkedList<>();
        System.out.print("Entrez la note de l'etudiant :");
        Scanner sc = new Scanner(System.in);
        Etudiant etudiant;
        int n = sc.nextInt();
        for(int i=0; i< etudiants.size(); i++)
        {
            note.add(i,n);
        }

    }
    public void listStudentsInCourse(Etudiant etudiant) {
        List<Etudiant>etudiantslist = new ArrayList<>();
        for (int i=0; i < etudiants.size(); i++) {
            etudiantslist.add(etudiant);
            System.out.println(etudiantslist.get(i));

        }
    }
}