package com.student.admission.admissiondao.service;

import java.util.List;

import com.student.admission.admissiondao.vo.AddressVO;

public interface AddressService {

	List<AddressVO> saveAddress(List<AddressVO> addressVO);
}
