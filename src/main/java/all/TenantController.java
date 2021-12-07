package all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TenantController {
	
	@Autowired
	TenantServiceImpl service ;
	
	@Autowired
	RestTemplate template;
	
	@RequestMapping(value="/getTenant/{id}",method=RequestMethod.GET)
	public Tenant getTenant(@PathVariable(name="id") String id){
		
		return service.getTenantById(id);
	}
	
	@RequestMapping(value="/deleteTenant/{id}",method=RequestMethod.DELETE)
	public void deleteTenant(@PathVariable(name="id") String id){
		template.delete("http://Vserver-service/tenant/{id}/deleteVserver/", id);
		
		service.deleteTenant(id);;
		
	}
	
	
	@RequestMapping(value="/addTenant",method=RequestMethod.POST,produces = "application/json", consumes = "application/json")
	public Tenant addTenant(@RequestBody Tenant t){
		
		return service.addTenant(t);
	}

}
