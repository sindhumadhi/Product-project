package com.gst.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.Gst;



public interface GstRepositary extends JpaRepository<Gst, Integer>
{

	@Query(value = "select per from gst where hsn_code=?",nativeQuery = true)
	public int getPerByHsn(int b);
}
