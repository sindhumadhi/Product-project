package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.Gst;
import com.gst.repo.GstRepositary;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Repository
public class GstDao {
	@Autowired
	GstRepositary gr;
	
	
	public String postAll(List<Gst> a)
	{
		 gr.saveAll(a);
		 return "Posted";
	}
	
	public int getPerByHsn(int b)
	{
		return gr.getPerByHsn(b);
	}

}
