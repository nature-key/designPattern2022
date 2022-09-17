package ChainResponsibilityPattern.handler;

public class ParseGatewayHandler extends GatewayHandler {

    @Override
    public void handler() {
        System.out.println("handler --> "+ParseGatewayHandler.class);
        if (null != this.next) {
            next.handler();
        }
    }
}
