package models;

public class Mark {

    private int firstAttestation;
    private int secondAttestation;
    private int finalExam;

    public Mark(int firstAttestation,
                int secondAttestation,
                int finalExam) {

        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }

    public double calculateFinalScore() {

        return firstAttestation * 0.3
                + secondAttestation * 0.3
                + finalExam * 0.4;
    }

    @Override
    public String toString() {

        return "Final score = "
                + calculateFinalScore();
    }
}