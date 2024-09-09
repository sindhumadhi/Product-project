package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gst.Gst;
import com.gst.dao.GstDao;


@Service
public class GstService {

	@Autowired
	GstDao gd;
	
	
	public String postAll(List<Gst> a)
	{
		return gd.postAll(a);
	}
	public int getPerByHsn(int b)
	{
		return gd.getPerByHsn(b);
	}
}
