package com.ui.dto;


public class EmployeeDTO {

	private int emp_id;
	private String emp_name;
	private int office_id;
	private OfficeDTO officeDTO;
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(int emp_id, String emp_name, int office_id, OfficeDTO officeDTO) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.office_id = office_id;
		this.officeDTO = officeDTO;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getOffice_id() {
		return office_id;
	}
	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}
	public OfficeDTO getOfficeDTO() {
		return officeDTO;
	}
	public void setOfficeDTO(OfficeDTO officeDTO) {
		this.officeDTO = officeDTO;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [emp_id=" + emp_id + ", emp_name=" + emp_name + ", office_id=" + office_id + ", officeDTO="
				+ officeDTO + "]";
	}


}
