package 责任链模式.handler;

public class ApiLimitGatewayHandler extends GatewayHandler {

    @Override
    public void handler() {
        System.out.println("handler --> "+ApiLimitGatewayHandler.class);
        if (null != this.next) {
            next.handler();
        }
    }
}
