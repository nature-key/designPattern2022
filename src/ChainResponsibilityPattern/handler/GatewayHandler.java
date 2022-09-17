package ChainResponsibilityPattern.handler;


public abstract class GatewayHandler {

    public GatewayHandler next;

    public void setNext(GatewayHandler next) {
        this.next = next;
    }

    public abstract void handler();
}
