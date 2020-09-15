package com.aoyu;

import com.aoyu.domain.Matter;
import com.aoyu.service.MatterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ByteOO
 * Date: 2020/9/15 18:30
 * @Version:
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PlanTest {
	@Autowired
	private MatterService matterService;

	@Test
	public void matterTest(){
		Matter matter = matterService.getById(1);
		System.out.println(matter.toString());
	}
}
