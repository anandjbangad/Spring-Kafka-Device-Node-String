package com.codenotfound.kafka.deviceNode;

import com.codenotfound.kafka.model.Request;
import com.codenotfound.kafka.model.Response;

public class ProcessRequest {
    public Response requestProcess (Request request){
        Response response = new Response();
        response.setResult(request.getRequestValue() + " DeviceNode2SpecialKey{D002}");
        response.setProcessedBy("DeviceNode2");
        response.setSendingTo(request.getResponseGivenBackTo());
        response.setRequestNumber(request.getRequestNumber());
        return response;
    }
}
