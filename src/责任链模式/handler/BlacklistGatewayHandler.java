package 责任链模式.handler;

public class BlacklistGatewayHandler extends GatewayHandler {

    @Override
    public void handler() {
        System.out.println("handler --> "+BlacklistGatewayHandler.class);
        if (null != this.next) {
            next.handler();
        }
    }
}
