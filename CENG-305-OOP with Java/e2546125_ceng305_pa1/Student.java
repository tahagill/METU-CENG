/**
 * Represents a student with a name and quiz scores.
 * The Student class provides methods to add quiz scores, get the total score,
 * and calculate the average score.z    
 */
public class Student {
    private String name;
    private int totalQuizScore;
    private int numQuizzes;

    /**
     * Constructs a Student object with the given name.
     *
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        this.totalQuizScore = 0;
        this.numQuizzes = 0;
    }

    /**
     * Adds a quiz score to the total quiz score and updates the number of quizzes taken.
     *
     * @param score The score of the quiz to be added.
     */
    public void addQuiz(int score) {
        this.totalQuizScore += score;
        this.numQuizzes++;
    }

    /**
     * Gets the total score of all quizzes taken.
     *
     * @return The total quiz score.
     */
    public int getTotalScore() {
        return totalQuizScore;
    }

    /**
     * Calculates and returns the average score of all quizzes taken.
     * If no quizzes are taken, returns 0.
     *
     * @return The average quiz score.
     */
    public double getAverageScore() {
        if (numQuizzes == 0) {
            return 0;
        } else {
            return (double) totalQuizScore / numQuizzes;
        }
    }
}
