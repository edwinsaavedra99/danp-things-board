package com.idnp.mqttpubsub.Controller;

import com.idnp.mqttpubsub.Modelo.MqttMessageWrapper;

public interface MqttHelperListener {
    void displayMessage(String data);
    void saveMessage(MqttMessageWrapper[] data, int size);
}
