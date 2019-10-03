package com.evbox.everon.ocpp.simulator.station.actions.user;

import com.evbox.everon.ocpp.simulator.station.StationStateFlowManager;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents Unplug message.
 */
@Getter
@AllArgsConstructor
public class Unplug implements UserMessage {

    private final Integer evseId;
    private final Integer connectorId;

    /**
     * Perform unplug logic.
     *
     * @param stationStateFlowManager manges state of the evse for station
     */
    @Override
    public void perform(StationStateFlowManager stationStateFlowManager) {
        stationStateFlowManager.cableUnplugged(evseId, connectorId);
    }
}
