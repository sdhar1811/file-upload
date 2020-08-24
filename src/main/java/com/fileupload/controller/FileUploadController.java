package com.fileupload.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fileupload.model.File;
import com.fileupload.service.FileUploadService;

@RestController
@RequestMapping("fileupload")
public class FileUploadController {
	
	@Autowired
	FileUploadService fileUploadService;

	@RequestMapping(value="/details",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<File> getFileData() {
		return fileUploadService.getFileDetails();		
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public void addFile(@RequestBody File file) {
		fileUploadService.addFile(file);
	}
}
