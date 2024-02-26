package oops;

class Studentt{
    int rollno;
    String name;
    void insertInfo(String n, int r){
        rollno = r;
        name = n;
    }
    void dislayInfo(){
        System.out.println(name+" "+rollno);
    }
}


   class MethodInitialize {
    public static void main(String[] args) {
        Studentt s1 = new Studentt(); //  s1 and s2 are reference variable
        Studentt s2 = new Studentt();
        s1.insertInfo("Bhumi", 12);
        s2.insertInfo("Deepa", 19);
        s1.dislayInfo();
        s2.dislayInfo();
    }
}
