package ngay15_baitap;

public class IllegalTriangleException extends Exception{
    private String message;

    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
