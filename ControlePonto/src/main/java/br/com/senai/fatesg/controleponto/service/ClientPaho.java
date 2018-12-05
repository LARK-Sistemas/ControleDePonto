package br.com.senai.fatesg.controleponto.service;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class ClientPaho implements MqttCallback{
	
	public ClientPaho() {}
	

	final static String BROKER = "tcp://192.168.43.56:1883";
	final static String TOPIC = "ponto";
	public static void main(String[] args) {

		new ClientPaho().subscrever();
    }
	
	void subscrever() {
		try {
	        MqttClient client = new MqttClient(BROKER, "Sending");
	        client.connect();
	        client.setCallback(this);
	        client.subscribe(TOPIC);
	    } catch (MqttException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void connectionLost(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Messagem do tópico: " + topic);
		System.out.println(message);
	}
}
