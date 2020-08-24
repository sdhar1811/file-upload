package com.fileupload.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fileupload.exception.MainExceptionHandler;
import com.fileupload.model.File;

@Service
public class FileUploadService {
	Map<String, File> fileMap = new HashMap<>();

	public Collection<File> getFileDetails() {
		return fileMap.values();
	}

	public synchronized void addFile(File file) {
		
		if (file == null || file.getFileName().isEmpty() || file.getDateModified() == null) {
			throw new MainExceptionHandler();
		} else {

			fileMap.put(file.getFileName(), file);
		}

	}
}
