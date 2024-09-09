package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst.Gst;
import com.gst.service.GstService;


@RestController
@RequestMapping("/Gst")
public class GstController 
{
	@Autowired
	GstService gs;
	
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<Gst> a)
	{
		return gs.postAll(a);
	}
   
	@GetMapping(value = "/getPer/{b}")
	public int getPerByHsn(@PathVariable  int b)
	{
		return gs.getPerByHsn(b);
	}
}
