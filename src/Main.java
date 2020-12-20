import Rules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {


        /// работа с номером телефона ;
        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator = new RulesBasedObjectValidator<>(rules);

        try {
            validator.validate("+380");
        } catch (ValidationException e) {
            System.err.println("System error -  \"" + e.getMessege() + "\" ");
        }


        ////////////////////////////////////////////////////

        /// работа с числом ;
        List<ValidatorRule> rules1 = new ArrayList<>();
        rules1.add(new MinNumberValidatorRule(10));
        rules1.add(new MaxNumberValidatorRule(50));
        ObjectValidator<Number> validator2 = new RulesBasedObjectValidator<>(rules1);

        try {
            validator2.validate(67);
        } catch (ValidationException e) {
            System.err.println("System error -  \"" + e.getMessege() + "\" ");
        }


    }


}
