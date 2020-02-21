package all;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TenantServiceImpl {

	
	
	@Autowired 
	TenantRepository repo ;
	
	
	public Tenant getTenantById(String id){
		return repo.findById(id).get();
	}
	
	public Tenant addTenant(Tenant temp){
		return repo.saveAndFlush(temp);
	}
	
	public void deleteTenant(String id ){
		repo.deleteById(id);
	}
	
}
