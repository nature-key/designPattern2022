package ChainResponsibilityPattern.dto;

import ChainResponsibilityPattern.entity.GatewayEntity;
import ChainResponsibilityPattern.enums.GateEnum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class GatewayEntityImp implements GatewayEntityDTO {

    public static Map<Integer, GatewayEntity> gatewayEntityMap = new HashMap<>();

    static {
        gatewayEntityMap = Arrays.asList(GateEnum.values()).stream()
                .collect(Collectors.toMap(k -> k.getGatewayEntity().getId(),
                        v -> v.getGatewayEntity()));

    }

    @Override
    public GatewayEntity getGateWayEntity(Integer id) {
        return gatewayEntityMap.get(id);
    }

    @Override
    public GatewayEntity getFirstGateWayEntity() {
        return Arrays.stream(GateEnum.values())
                .filter(it -> it.getGatewayEntity().getPre() < 0).
                        findFirst().map(GateEnum::getGatewayEntity).get();
    }
}
