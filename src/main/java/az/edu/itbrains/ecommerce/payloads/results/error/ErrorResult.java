package az.edu.itbrains.ecommerce.payloads.results.error;

import az.edu.itbrains.ecommerce.payloads.results.Result;

public class ErrorResult extends Result {

    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(false, message);
    }
}
