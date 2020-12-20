public class ValidationException extends Exception {

    String messege;

    public ValidationException(String s) {
        this.messege = s;
        getMessege();
    }

    public String getMessege() {
        return messege;
    }
}
