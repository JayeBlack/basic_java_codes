public class umat_students {
    //below are the datafields:
    private String name;
    private int age;
    private int yob;
    private String hometown;
    private String dept;
    private String programme;
    private int y_study;
    private String hostel;
    private double cwa;
    private String gender;
    private String index_no;
    private double loan;

    //constructor with all data-fields parameters
    umat_students(String name, int age, int yob, String hometown, String dept, String programme, int y_study, String hostel, double cwa, String gender, String index_no, double loan) {
        this.name = name;
        this.age = age;
        this.yob = yob;
        this.hometown = hometown;
        this.dept = dept;
        this.programme = programme;
        this.y_study = y_study;
        this.hostel = hostel;
        this.cwa = cwa;
        this.gender = gender;
        this.index_no = index_no;
        this.loan = loan;
        System.out.println("hello "+getName()+ " welcome to "+ getDept()+" dept🎃");
    }
    //methods to get values of the datafield parameters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYob() {
        return yob;
    }

    public String getHometown() {
        return hometown;
    }

    public String getDept() {
        return dept;
    }

    public String getProgramme() {
        return programme;
    }

    public int getY_study() {
        return y_study;
    }

    public String getHostel() {
        return hostel;
    }

    public double getCwa() {
        return cwa;
    }

    public String getGender() {
        return gender;
    }

    public String getIndex_no() {
        return index_no;
    }

    public double getLoan() {
        return loan;
    }

    //methods to be able to change student cwa,dept and programme
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setCwa(double cwa) {
        this.cwa = cwa;
    }
    /*void welcome(){
        System.out.println("hello "+getName());
    }*/


}
