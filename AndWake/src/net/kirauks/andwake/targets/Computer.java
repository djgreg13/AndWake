package net.kirauks.andwake.targets;

public class Computer{
	private long id;
	private String name;
	private String mac;
	private String address;
	private int port;
	
	public Computer(){
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPort() {
		return this.port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", mac=" + mac
				+ ", address=" + address + ", port=" + port + "]";
	}
}
