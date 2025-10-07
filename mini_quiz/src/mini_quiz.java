import java.util.Scanner;
public class mini_quiz{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int guess,score=0;
        String []questions={
                "Why is using the '+' operator for repeated string concatenation inside a loop considered inefficient in Java?",
                "Which set of characteristics is required to successfully **overload** a method in a Java class?",
                "What is the main restriction when defining a method with a variable arguments parameter (varargs) in Java?",
                "When is the code inside a **static initialization block** executed by the Java Virtual Machine (JVM)?",
                "What is the primary role of the DriverManager class in a JDBC (Java Database Connectivity) application?"};
        String[][]options={{
                "A new, entire String object is created in memory during every concatenation operation.",
                "B.The concatenation operation itself is significantly slower than methods like String.join()." ,
                "C.It requires the JVM to perform garbage collection immediately after each concatenation." ,
                "D.The '+' operator only works with the String class and not with primitives, limiting its flexibility."},
                {
                        "A.A different return type and a different exception list." ,
                        "B.A different number or different data types of parameters." ,
                        "C.The same method name, the same parameter list, but in a different order." ,
                        "D.A different method name but the same parameter list."},
                {
                        "A.The varargs parameter must be declared **last** in the method's parameter list." ,
                        "B.The method can only be declared as 'private'." ,
                        "C.The method cannot have any other parameters besides the varargs parameter." ,
                        "D.The varargs parameter must be declared as a generic type."},
                {
                        "A.Exactly once, when the class is first loaded into memory by the ClassLoader." ,
                        "B.Whenever any static method of the class is called." ,
                        "C.Every time a new instance (object) of the class is created." ,
                        "D.Immediately before the 'main()' method executes its first statement."},
                {
                        "A. To execute SQL SELECT statements and return a ResultSet." ,
                        "B. To manage and load JDBC drivers and establish the initial database connection." ,
                        "C. To handle exceptions that occur during transactions." ,
                        "D. To provide a buffer for asynchronous data transfer."
                }}  ;
        int []answer={1,2,1,1,2};
        System.out.println("Welcome to quiz game:");
        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for (String option: options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess:");
            guess=s.nextInt();
            if (guess==answer[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Incorrect");
            }
        }
        System.out.println("Your score is "+score+" out of "+questions.length);
        s.close();
    }
}