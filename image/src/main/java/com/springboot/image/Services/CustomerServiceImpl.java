package com.springboot.image.Services;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.image.dao.customerDao;
import com.springboot.image.entities.Customer;
@Service
public class CustomerServiceImpl implements customerService  {
	@Autowired
	private customerDao CustomerDao;
	@Override
	public Customer store(MultipartFile file) throws IOException {
		 String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		  Customer customerFile = new Customer(fileName, file.getContentType(), file.getBytes());
		    return CustomerDao.save(customerFile);
	}

	@Override
	public Customer getFile(String id) {
		return CustomerDao.findById(id).get();
	}

	@Override
	public Stream<Customer> getAllFiles() {
		return CustomerDao.findAll().stream();
	}

}
