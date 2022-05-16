package com.springboot.image.Services;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.image.entities.Customer;

public interface customerService {
	
	public Customer store(MultipartFile file) throws IOException;
	public Customer getFile(String id);
	public Stream<Customer> getAllFiles();
}
