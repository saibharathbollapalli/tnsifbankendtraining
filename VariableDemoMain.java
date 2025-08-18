public class VariableDemoMain {
    public static void main(String[] args) {
       
        VariablesDemo obj = new VariablesDemo();
        System.out.println(obj.name="Sai");

        //static calling
        System.out.println(VariablesDemo.college); 
        obj.display();
    }
}