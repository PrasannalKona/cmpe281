package smartstreet.service;

import java.util.List;

import smartstreet.model.Sensor;

public interface ISensorService {
	
	/**
	 * Add sensor
	 * @param sensor
	 * @throws Exception 
	 */
	public boolean addSensor(Sensor sensor) throws Exception;
	
	/**
	 * Get List of sensors
	 * @return List of sensors
	 */
	public List<Sensor> getAllSensors() ;
	
	/**
	 * Get Sensor by Id
	 * @param sensorId
	 * @return
	 */
	public Sensor getSensorById(int sensorId);
	
	/**
	 * Update sensor
	 * @param sensor
	 */
	public void updateSensor(Sensor sensor) ;
	
	/**
	 * Delete sensor
	 * @param sensor
	 */
	public void deleteSensor(int sensorId);
	

}
