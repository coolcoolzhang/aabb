package com.zx.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zx.entity.tb_goods;
@Controller
public class upController {
	@RequestMapping("/upload")
	public void upload(@RequestParam("files") MultipartFile[] files,tb_goods tb, HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println(tb);
		if(files!=null && files.length>0){
			for (MultipartFile file : files) {
				String path=request.getServletContext().getRealPath("/resource/upload/");
				String fileName=file.getOriginalFilename();
				File targetFile=new File(path,fileName);
				if(!targetFile.exists()){
					targetFile.mkdirs();
				}
				try {
					file.transferTo(targetFile);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//�������
				String url=request.getContextPath()+"/resource/upload/"+fileName;
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out=response.getWriter();
				out.println(url);
		}
	}
}
}
