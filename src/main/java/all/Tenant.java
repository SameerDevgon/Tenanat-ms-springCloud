package all;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tenant {
	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	String id;
	

	@Column
	String tenantName;
	
	public Tenant(){};
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	
	
	
	
	
	
	
}
