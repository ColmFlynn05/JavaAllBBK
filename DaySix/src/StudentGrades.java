public class StudentGrades {
    private int id;
    private String grade = "";
    private int score;

    public void setScore(int score) {
        this.score = score;
        setGrade(score);
    }
    private void setGrade(int score){
        if(score < 59){
            this.grade = "fail";
        }
        else if(score < 70){

        }
    }

}
