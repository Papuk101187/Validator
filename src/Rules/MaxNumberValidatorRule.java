package Rules;


public class MaxNumberValidatorRule implements ValidatorRule <Number>{

    Number maxValue;


    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }


    @Override
    public boolean validate(Number value) {
        if(value.intValue()>maxValue.intValue()){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String errorMessage() {
        return "Указанное число больше необходимого";    }




}
