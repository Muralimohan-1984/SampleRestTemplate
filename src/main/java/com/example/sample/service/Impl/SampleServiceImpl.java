package com.example.sample.service.Impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.sample.model.SampleRespDTO;
import com.example.sample.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService{
	private Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class.getName());
	/**
	 * return List object
	 */
	public List<SampleRespDTO> getGetSupportDetaile(int page) {
		// TODO Auto-generated method stub
		
		logger.info("SampleServiceImpl ::getGetSupportDetaile");
		final RestTemplate restTempalte = new RestTemplate();
		List<SampleRespDTO> sampleService = new ArrayList<SampleRespDTO>();
		SampleRespDTO sampleRespDTO = new SampleRespDTO();
		String url = "https://reqres.in/api/users?page="+page;
		logger.info(url);
		sampleRespDTO = restTempalte.getForObject(url, SampleRespDTO.class);
		sampleService.add(sampleRespDTO);
		return sampleService;
	}

}
