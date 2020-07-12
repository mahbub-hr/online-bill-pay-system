package Customer;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty consumer;
    private final SimpleStringProperty service;
    private final SimpleStringProperty serviceName;
    private final SimpleStringProperty startRead;
    private final SimpleStringProperty endRead;

    User(String consumer, String service, String serviceName,String startRead,String endRead) {
        this.consumer = new SimpleStringProperty(consumer);
        this.service = new SimpleStringProperty(service);
        this.serviceName = new SimpleStringProperty(serviceName);
        this.startRead = new SimpleStringProperty(startRead);
        this.endRead= new SimpleStringProperty(endRead);

    }
    

    public String getUserName() {
        return consumer.get();
    }
    public void setUserName(String uName) {
        consumer.set(uName);
    }
    public String getservice(){
        return service.get();
    }
    public String getSerivename(){
        return serviceName.get();
    }
    public String getStart(){
        return startRead.get();
    }
    public String getend(){
        return endRead.get();
    }

}

