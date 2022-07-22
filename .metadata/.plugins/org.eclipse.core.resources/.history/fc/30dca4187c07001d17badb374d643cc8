package com.ui.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ui.dto.OfficeDTO;
import com.ui.entity.Office;
import com.ui.repository.OfficeRepository;

import ch.qos.logback.classic.Logger;

@Service
@RestController
@RequestMapping("/office")
public class OfficeServiceImpl {
	
	private static final Log Logger = LogFactory.getLog(OfficeServiceImpl.class);
	
	@Autowired
	OfficeRepository offRepo; 
	
	@PostMapping("/addoffice")
	public Office addoiOffice(@RequestBody OfficeDTO odto) {
		Office office = new Office(); 
		office.setCity(odto.getCity());
		office.setOffice_id(odto.getOffice_id());
		office.setStreet(odto.getStreet());
		 offRepo.save(office);
		 Logger.info("String", new Throwable());
		
		 return office;
	}
	@GetMapping("/addres/{officeId}")
	public Office offAddress(@PathVariable("officeId") int id) {
		return offRepo.findById(id).get();
	}
	@GetMapping("/all")
	public List<Office> allOfficeDetails(Integer OfficeCode){ 
		Pageable page = PageRequest.of(0, 5);
		Page<Office> officePage = offRepo.findAll(page);
		List<Office> iterable_officeIterable = officePage.getContent();
		//Iterable<Office> list1 = offRepo.findAll(OfficeCode);
		List<OfficeDTO> list2 = new ArrayList<OfficeDTO>();
		//list1.forEach(list2::add);
		for(Office temp: iterable_officeIterable)
		{
			OfficeDTO officeDTO = new OfficeDTO();
			officeDTO.setCity(temp.getCity());
			officeDTO.setOffice_id(temp.getOffice_id());
			officeDTO.setStreet(temp.getStreet());
			list2.add(officeDTO);
			
		}
		return iterable_officeIterable; 
	}

}
