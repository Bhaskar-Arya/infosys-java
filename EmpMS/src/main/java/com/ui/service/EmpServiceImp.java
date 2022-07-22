package com.ui.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ui.dto.EmployeeDTO;
import com.ui.dto.OfficeDTO;
import com.ui.entity.Empolyee;
import com.ui.repository.EmpRepo;
import com.ui.utility.EmpException;



@Service
@RestController
@RequestMapping("/emp")
public class EmpServiceImp {
	@Autowired
	EmpRepo empRepo; 
	@Autowired
	RestTemplate resttemplate; 
  @Autowired	
  DiscoveryClient client; 
	
	
	@GetMapping("/record/{id}")
	public Empolyee getEmpolyee(@PathVariable int id) {
		Empolyee emp1 = empRepo.findById(id).get();
		return emp1; 
	}
	@PostMapping("/addemp")
	public Empolyee addEmpolyee(@RequestBody EmployeeDTO employeeDTO ) throws EmpException{
		Optional<Empolyee> fetchdemp = empRepo.findById(employeeDTO.getEmp_id());
		if( fetchdemp.isEmpty()) {
			Empolyee emp1 = new Empolyee();
		 emp1.setEmp_id(employeeDTO.getEmp_id());
		 emp1.setEmp_name(employeeDTO.getEmp_name());
		 emp1.setOffice_id(employeeDTO.getOffice_id());
		empRepo.save(emp1);
		return emp1; 
		}
		else 
			throw new  EmpException("emp alredy  exist in the record ");
	}
	@GetMapping("/fulldetails/{id}")
	public EmployeeDTO getEmployeeFullDeatils(@PathVariable int id) throws  EmpException{
		
		Optional<Empolyee> optional = empRepo.findById(id);
		Empolyee emp1 = optional.orElseThrow(()->new  EmpException("no such employee exist in the record "));
	    List<ServiceInstance> myClient = client.getInstances("Office");
	    String uri = myClient.get(0).getUri().toString();
	    try {
		            OfficeDTO officeDTO = resttemplate.getForObject("http://Office/office/addres/"+emp1.getOffice_id(),OfficeDTO.class);
		       		EmployeeDTO employeeDTO = new EmployeeDTO();
		    		employeeDTO.setEmp_id(emp1.getEmp_id());
		    		employeeDTO.setEmp_name(emp1.getEmp_name());
		            employeeDTO.setOffice_id(emp1.getOffice_id());
		            employeeDTO.setOfficeDTO(officeDTO);
		            return employeeDTO;
		}
		catch(Exception e)
		{
			throw new EmpException("no record of this office id is found");
		}

	}

}
