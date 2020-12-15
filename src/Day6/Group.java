package Day6;

import java.util.ArrayList;

public class Group {

    private int members;
    private ArrayList<String> answers;

    public Group() {
        this.members = 0;
        this.answers = new ArrayList<String>();
    }
    public Group(int members, ArrayList<String> answers) {
        this.members = members;
        this.answers = answers;
    }
    public int questionsEveryoneYes() {
        int output = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            boolean everyoneYes = true;
            for(String a : answers) {
                if(!a.contains(String.valueOf(c))) everyoneYes = false;
            }
            if(everyoneYes) output++;
        }
        return output;
    }
    public Group addMember(String answer) {
        members++;
        answers.add(answer);
        return this;
    }
    public ArrayList<String> getAnswers() {
        return answers;
    }
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }

}
