package 责任链模式.handler;


public abstract class GatewayHandler {

    public GatewayHandler next;

    public void setNext(GatewayHandler next) {
        this.next = next;
    }

    public abstract void handler();
}
