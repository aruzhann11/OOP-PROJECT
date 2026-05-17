package models;

public class AttestationResult {

    private int firstAtt;
    private int secondAtt;

    public AttestationResult(int firstAtt, int secondAtt) {

        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
    }

    public int getFirstAtt() {
        return firstAtt;
    }

    public int getSecondAtt() {
        return secondAtt;
    }
}