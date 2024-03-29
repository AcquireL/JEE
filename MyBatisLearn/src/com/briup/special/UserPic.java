package com.briup.special;

public class UserPic {
	private int id; 
	private String name; 
	private byte[] pic; 
	private String bio;
	
	public UserPic() {}
	
	public UserPic(int id, String name, byte[] pic, String bio) {
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.bio = bio;
	}
	public UserPic(String name, byte[] pic, String bio) {
		this.name = name;
		this.pic = pic;
		this.bio = bio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	} 
	
}
