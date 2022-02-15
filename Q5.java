class Student{
    private String name;
    private int id;
    private double gpa;

    Student(String name,int id, double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return name;
    }
    public int getId(){
        return id;
    }  
    public double getGpa(){
        return gpa;
    }
    public String to_String(){
        return name+ " " + id +" " +gpa;
    }

}
class Undergrad extends Student{
    private int year;
    Undergrad(String name, int id, double gpa, int year){
        super(name,id,gpa);
        this.year=year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public String to_String(){
        String g=super.to_String();
        return g + " "+year;
    }

}
class Graduate extends Student{
    private String thesistitle;
    Graduate(String name, double gpa, String thesistitle){
        super(name,0,gpa);
        this.thesistitle=thesistitle;
    }
    public void setThesistitle(String thesistitle){
        this.thesistitle=thesistitle;
    }
    public String getThesistitle(){
        return thesistitle;
    }
    public String to_String(){
        String g=super.to_String();
        return g + " "+thesistitle;
    }

}
class Q5{
     public static void main(String[] args) {
         Student obj1=new Student("Shourya", 55, 8.8);
         obj1.to_String();
         Undergrad obj2=new Undergrad("Ravi", 88, 9.1, 2024);
         obj2.toString();
         Graduate obj3=new Graduate("Rahul",7.1,"MACHINE LEARNING IN PYTHON");
         obj3.to_String();
    }
}
