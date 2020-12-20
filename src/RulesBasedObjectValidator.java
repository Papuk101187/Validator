import Rules.ValidatorRule;

import java.util.List;

public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {


    List<ValidatorRule> rule;

    public RulesBasedObjectValidator(List<ValidatorRule> rules) {
        rule=rules;

    }


    @Override
    public void validate(T object) throws ValidationException {

        for (ValidatorRule validatorRule : rule) {
            if(validatorRule.validate(object)){

            }else {
                //System.out.println("validatorRule.errorMessage(); "+validatorRule.errorMessage());
                throw new ValidationException(validatorRule.errorMessage());
            }
        }

    }


}
