package com.codenotfound.kafka.model;

public class Request {
    public String getResponseGivenBackTo() {
        return responseGivenBackTo;
    }

    public void setResponseGivenBackTo(String responseGivenBackTo) {
        this.responseGivenBackTo = responseGivenBackTo;
    }

    public String getRequestSentBy() {
        return requestSentBy;
    }

    public void setRequestSentBy(String requestSentBy) {
        this.requestSentBy = requestSentBy;
    }

    public String getRequestValue() {
        return requestValue;
    }

    public void setRequestValue(String requestValue) {
        this.requestValue = requestValue;
    }

    public String getrequestSentTo() {
        return requestSentTo;
    }

    public void setrequestSentTo(String requestSentTo) {
        this.requestSentTo = requestSentTo;
    }

    public String responseGivenBackTo;
    public String requestSentBy;
    public String requestValue;
    public String requestSentTo;

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String requestNumber;

    public Request(){
        super();
    }

    public Request(String responseGivenBackTo, String requestSentBy, String requestValue, String requestSentTo, String requestNumber){
        super();
        this.responseGivenBackTo = responseGivenBackTo;
        this.requestSentTo = requestSentTo;
        this.requestValue = requestValue;
        this.requestSentBy = requestSentBy;
        this.requestNumber = requestNumber;
    }

    @Override
    public String toString() {
        return "Request:  [responseGivenBackTo=" + responseGivenBackTo + ", requestSentTo;" + requestSentTo + ", requestValue" + requestValue + ",requestSentBy " + requestSentBy;
    }
}
