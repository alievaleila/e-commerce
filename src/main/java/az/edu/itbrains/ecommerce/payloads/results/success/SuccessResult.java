package az.edu.itbrains.ecommerce.payloads.results.success;

import az.edu.itbrains.ecommerce.payloads.results.Result;

public class SuccessResult extends Result {

    public SuccessResult() {
        super(true);
    }

    public SuccessResult(String message) {
        super(true, message);
    }


}
