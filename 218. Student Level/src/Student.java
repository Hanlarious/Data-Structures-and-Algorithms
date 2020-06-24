public class Student {
    public String name;
    public int score;
    public Student(String name){
        this.name = name;

    }
    public char getLevel(){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if(score >= 60){
            return 'C';
        }
        else return 'D';

    }

}
