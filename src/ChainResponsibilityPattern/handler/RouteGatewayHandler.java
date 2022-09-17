package ChainResponsibilityPattern.handler;

public class RouteGatewayHandler extends  GatewayHandler {

    @Override
    public void handler() {
        System.out.println("handler --> "+RouteGatewayHandler.class);
        if (null != this.next) {
            next.handler();
        }
    }
}
