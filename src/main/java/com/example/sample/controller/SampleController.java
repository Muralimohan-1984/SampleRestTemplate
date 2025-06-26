package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.SampleRespDTO;
import com.example.sample.service.SampleService;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	 
	/**
	 * @param page
	 * @return List Object
	 */
	@GetMapping("/getSampleDetails")
	public ResponseEntity<List<SampleRespDTO>> getSupportDetaile(@RequestParam int page ){
		
		List<SampleRespDTO> sampleRespDTO=sampleService.getGetSupportDetaile(page);
	
		return new ResponseEntity<>(sampleRespDTO, HttpStatus.OK);
	}
	

}
