package Rules;


public class MinNumberValidatorRule implements ValidatorRule <Number>{

    Number maxValue;


    public MinNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }


    @Override
    public boolean validate(Number value) {
        if(value.intValue()<maxValue.intValue()){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String errorMessage() {
        return "Указанное число меньше необходимого";    }





}
