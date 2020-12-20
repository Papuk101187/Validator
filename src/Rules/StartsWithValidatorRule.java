package Rules;

public class StartsWithValidatorRule implements ValidatorRule<String> {


    String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }


    @Override
    public boolean validate(String value) {

        return value.startsWith(start);
    }

    @Override
    public String errorMessage() {
        return "Начало номера несоответсвует";
    }


}
