public class User_exception extends Exception {
    String error;

    public User_exception(String error) {
        this.error = error;
    }

    public User_exception(String message, String error) {
        super(message);
        this.error = error;
    }

    public User_exception(String message, Throwable cause, String error) {
        super(message, cause);
        this.error = error;
    }

    public User_exception(Throwable cause, String error) {
        super(cause);
        this.error = error;
    }

    public User_exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = getError();
    }
}
