package com.aoyu;

import com.aoyu.service.MatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ByteOO
 * Date: 2020/9/15 18:56
 * @Version:
 * @Description:
 */

@RestController
public class MatterController {

	@Autowired
	private MatterService matterService;


	@PostMapping()
	ResponseEntity saveMatter(){

	}

	// @GetMapping()
	// ResponseEntity getMatter(){
	//
	// }
	//
	// @GetMapping()
	// ResponseEntity listMatters(){
	//
	// }
	//
	// @GetMapping()
	// ResponseEntity countMatter(){
	//
	// }
	//
	// @DeleteMapping()
	// ResponseEntity removeMatter(){
	//
	// }
	//
	// @PostMapping()
	// ResponseEntity updateMatter(){
	//
	// }

}
