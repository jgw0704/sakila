package sakila.vo;

public class Staff {
	private int staff_id;
	private String first_name;
	private String last_name;
	private int addtess_id;
	private String picture;
	private String email;
	private int store_id;
	private int active;
	private String username;
	private String password;
	private String last_upate;
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAddtess_id() {
		return addtess_id;
	}
	public void setAddtess_id(int addtess_id) {
		this.addtess_id = addtess_id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_upate() {
		return last_upate;
	}
	public void setLast_upate(String last_upate) {
		this.last_upate = last_upate;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", addtess_id=" + addtess_id + ", picture=" + picture + ", email=" + email + ", store_id=" + store_id
				+ ", active=" + active + ", username=" + username + ", password=" + password + ", last_upate="
				+ last_upate + ", getStaff_id()=" + getStaff_id() + ", getFirst_name()=" + getFirst_name()
				+ ", getLast_name()=" + getLast_name() + ", getAddtess_id()=" + getAddtess_id() + ", getPicture()="
				+ getPicture() + ", getEmail()=" + getEmail() + ", getStore_id()=" + getStore_id() + ", getActive()="
				+ getActive() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getLast_upate()=" + getLast_upate() + "]";
	}
	// 11개의 필드(속성, 맴버변수)
	// toString 메서드 오버라이딩
}
