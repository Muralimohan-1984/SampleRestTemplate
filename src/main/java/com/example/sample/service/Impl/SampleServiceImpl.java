package com.example.sample.service.Impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
	/**
	 * return List object
	 */
	public List<SampleRespDTO> getGetSupportDetaile(int page) {
		// TODO Auto-generated method stub
		final RestTemplate restTempalte = new RestTemplate();
		List<SampleRespDTO> sampleService = new ArrayList<SampleRespDTO>();
		SampleRespDTO sampleRespDTO = new SampleRespDTO();
		String url = "https://reqres.in/api/users?page="+page;
		System.out.println(url);
		sampleRespDTO = restTempalte.getForObject(url, SampleRespDTO.class);
		sampleService.add(sampleRespDTO);
		return sampleService;
	}

}
