package Rules;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule<T> implements ValidatorRule<String> {


    private Pattern pattern;

    public RegExpValidatorRule(Pattern compile) {
        this.pattern = compile;

    }


    @Override
    public boolean validate(String value) {
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();


    }

    @Override
    public String errorMessage() {
        return "Количество цифр несоответствует";
    }


}
