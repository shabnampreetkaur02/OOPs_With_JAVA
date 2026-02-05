class Student {
    int theory;
    int  lab;
    int attendance;
}
interface ModerationRule{
    int apply(int marks);
}
class AttendanceModeration implements ModerationRule{
    public int apply(int marks){
        return marks+5;
    }
}    

abstract class EvaluationEngine{
    ModerationRule rule;

    public EvaluationEngine(ModerationRule rule){
        this.rule=rule;
    }

   public void evaluate(Student s) {
        int total = calculateMarks(s);   
        total = rule.apply(total);       
        generateGrade(total);            
    }

    abstract int calculateMarks(Student s);
    abstract void generateGrade(int total);
}
class BTechEvaluation extends EvaluationEngine {

    public BTechEvaluation(ModerationRule rule) {
        super(rule);
    }

    int calculateMarks(Student s) {
        return s.theory + s.lab;
    }

    void generateGrade(int total) {
        System.out.println("B.Tech Final Marks: " + total);
    }
}

public class main {
    public static void main(String[] args) {

        Student s = new Student();
        s.theory = 40;
        s.lab = 30;

        ModerationRule rule = new AttendanceModeration();
        EvaluationEngine engine = new BTechEvaluation(rule);

        engine.evaluate(s);
    }
}