public class EmployeeMain {
    public static void main(String[] args) {
        Employee ob= new Employee();
        ob.id=2001;
        ob.sname="Sai";
        ob.srole="HR";
        ob.print();

        Employee obj=new Employee();
        obj.id=2002;
        obj.sname="Bharath";
        obj.srole="Manager";
        obj.print();
    }
    
}
