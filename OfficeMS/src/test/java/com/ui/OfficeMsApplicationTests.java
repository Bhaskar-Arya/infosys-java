package com.ui;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;

import com.ui.dto.OfficeDTO;
import com.ui.repository.OfficeRepository;
import com.ui.service.OfficeServiceImpl;

@SpringBootTest
class OfficeMsApplicationTests {
	
	@Mock
	OfficeRepository repo; 
	@InjectMocks
	OfficeServiceImpl service;

	@Test
	void contextLoads() {
		OfficeDTO odto = new OfficeDTO();
		Assertions.assertEquals("hello", "hello");
		Mockito.when(repo.findById(2)).thenReturn(Optional.empty());
		Exception exception = Assertions.assertThrows(Exception.class, ()->service.addoiOffice(odto));
		Assertions.assertEquals("Not Found", exception.getMessage());
	}

}
