package Rules;

public interface ValidatorRule <T>{


    boolean validate(T value);

    String errorMessage();




}
