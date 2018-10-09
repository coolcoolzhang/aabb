package com.zx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.entity.Person;
import com.zx.entity.tb_goods;
import com.zx.entity.tb_goods_type;
import com.zx.service.goService;

@Controller
@RequestMapping("goods")
public class goController {
    @Autowired
    private goService service;
    @ResponseBody
	   @RequestMapping("/sel")
		public List<tb_goods> findAll(tb_goods t) throws IOException{
			List<tb_goods> list=service.findAll();
			return list;
		}
		@ResponseBody
		@RequestMapping("/save")
		 public void save(tb_goods tb,HttpServletResponse response) throws IOException {
	    	response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			int a=service.save(tb);
			if(a>0){
				out.print("²Ù×÷³É¹¦");
			}
	    }
		 @ResponseBody
		   @RequestMapping("/sel2")
			public List<tb_goods_type> fintype(tb_goods_type tt) throws IOException{
				List<tb_goods_type> list=service.fintype();
				return list;
			}
}
