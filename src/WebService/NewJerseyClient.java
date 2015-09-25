/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.IOException;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Jersey REST client generated for REST resource:EC2 Service []<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author cralducinr
 */
public class NewJerseyClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://ec2.amazonaws.com";

    public NewJerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>ImageType [OPTIONAL]
     * <LI>ImageId.1 [OPTIONAL]
     * <LI>ImageId.2 [OPTIONAL]
     * <LI>Owner.1 [OPTIONAL]
     * <LI>Owner.2 [OPTIONAL]
     * <LI>ExecutableBy.1 [OPTIONAL]
     * <LI>ExecutableBy.2 [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T describeImages(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{aWSAccessKeyId, "DescribeImages", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param instanceId_1 query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>InstanceId.2 [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T describeInstances(Class<T> responseType, String instanceId_1, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"InstanceId.1", "AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{instanceId_1, aWSAccessKeyId, "DescribeInstances", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param imageId query parameter[REQUIRED]
     * @param minCount query parameter[REQUIRED]
     * @param maxCount query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>KeyName [OPTIONAL]
     * <LI>SecurityGroup.1 [OPTIONAL]
     * <LI>SecurityGroup.2 [OPTIONAL]
     * <LI>UserData [OPTIONAL]
     * <LI>InstanceType [OPTIONAL]
     * <LI>Placement.AvailabilityZone [OPTIONAL]
     * <LI>KernelId [OPTIONAL]
     * <LI>RamdiskId [OPTIONAL]
     * <LI>BlockDeviceMapping.1.VirtualName [OPTIONAL]
     * <LI>BlockDeviceMapping.2.VirtualName [OPTIONAL]
     * <LI>BlockDeviceMapping.1.DeviceName [OPTIONAL]
     * <LI>BlockDeviceMapping.2.DeviceName [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T runInstances(Class<T> responseType, String imageId, String minCount, String maxCount, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"ImageId", "MinCount", "MaxCount", "AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{imageId, minCount, maxCount, aWSAccessKeyId, "RunInstances", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param instanceId_1 query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>InstanceId.2 [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T terminateInstances(Class<T> responseType, String instanceId_1, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"InstanceId.1", "AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{instanceId_1, aWSAccessKeyId, "TerminateInstances", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>KeyName.1 [OPTIONAL]
     * <LI>KeyName.2 [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T describeKeyPairs(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{aWSAccessKeyId, "DescribeKeyPairs", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param keyName query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T createKeyPair(Class<T> responseType, String keyName) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"KeyName", "AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{keyName, aWSAccessKeyId, "CreateKeyPair", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param keyName query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T deleteKeyPair(Class<T> responseType, String keyName) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"KeyName", "AWSAccessKeyId", "Action", "Expires", "Version", "SignatureVersion"};
        String[] queryParamValues = new String[]{keyName, aWSAccessKeyId, "DeleteKeyPair", expires, "2007-01-19", "1"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("Signature", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    private Form getQueryOrFormParams(String[] paramNames, String[] paramValues) {
        Form form = new javax.ws.rs.core.Form();
        for (int i = 0; i < paramNames.length; i++) {
            if (paramValues[i] != null) {
                form = form.param(paramNames[i], paramValues[i]);
            }
        }
        return form;
    }

    private MultivaluedMap getQParams(String... optionalParams) {
        MultivaluedMap<String, String> qParams = new javax.ws.rs.core.MultivaluedHashMap<String, String>();
        for (String qParam : optionalParams) {
            String[] qPar = qParam.split("=");
            if (qPar.length > 1) {
                qParams.add(qPar[0], qPar[1]);
            }
        }
        return qParams;
    }

    public void close() {
        client.close();
    }
    
}
