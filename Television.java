
public class Television {
	/** 
	*The purpose of this class is to model a television
	*Erik Umoh 2/20/2020
	*/
	private final String MANUFACTURER; //Name of brand
	private final int SCREEN_SIZE; //Size of television screen
	private boolean powerOn; //true if TV power is on, false if off
	private int channel; //Channel number the TV is on
	private int volume; //number representing volume

	public Television(String MANUFACTURER, int SCREEN_SIZE) {
		this.MANUFACTURER = MANUFACTURER; //This object's brand
		this.SCREEN_SIZE = SCREEN_SIZE; //This object's screen size
		powerOn = false; //Is this object's power on?
		volume = 20; //This object's volume level
		channel = 2; //This object's channel number
	}
	
	public int getVolume() { //Gets the object's current volume
		return volume;
	}
	public int getChannel() { //Gets the object's current channel
		return channel;
	}
	public String getManufacturer() { //Gets the object's Manufacturer
		return MANUFACTURER;
	}
	public int getScreenSize() { //Gets the object's screen size
		return SCREEN_SIZE;
	}
	
	public void setChannel(int channel) { //Sets the object's channel
		this.channel = channel;
	}
	public void power() {//Sets the object's power
		this.powerOn = !powerOn;
	}
	public void increaseVolume() {//Increases the object's volume
		this.volume++;
	}
	public void decreaseVolume() {//Decreases the object's volume
		this.volume--;
	}
}
