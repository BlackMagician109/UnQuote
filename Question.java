public class Question {
    //Instance Variable
    private int correctAns; //Correct answer to the question
    private int userAns;    //Answer that the user entered
    private int imageId;    //Stores the identifier of the image

    private String questionText;    //The question text
    private String ans0;    //Option zero for the question
    private String ans1;    //Option one for the question
    private String ans2;    //Option two for the quesion
    private String ans3;    //Option three for the quesion

    //Constructor
    public Question(int correctAns, int imageId, String questionText, String ans0, String ans1, String ans2, String ans3){
        this.correctAns = correctAns;
        this.imageId = imageId;
        this.questionText = questionText;
        this.ans0 = ans0;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.userAns = -1;
    }

    
}
