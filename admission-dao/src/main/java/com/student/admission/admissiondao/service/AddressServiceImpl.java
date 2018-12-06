package com.student.admission.admissiondao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.admission.admissiondao.entity.Address;
import com.student.admission.admissiondao.mapper.AdminDAOMapper;
import com.student.admission.admissiondao.repository.AddressRepository;
import com.student.admission.admissiondao.vo.AddressVO;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	AdminDAOMapper adminDAOMapper;

	@Override
	public List<AddressVO> saveAddress(List<AddressVO> addressVO) {
		List<Address> addressEntity = adminDAOMapper.addressVoToEntity(addressVO);
		List<Address> dbAddressEntity = addressRepository.saveAll(addressEntity);
		List<AddressVO> addressEntityToVo = adminDAOMapper.addressEntityToVo(dbAddressEntity);
		return addressEntityToVo;
	}

}
