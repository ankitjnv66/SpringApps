package spring.assignment.Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bank")
public class BankController {

	@Autowired
	Bank bank;
	
	@RequestMapping("/getName")
	@ResponseBody
	public String getName() {
		return bank.getBankName(); 
	}
	
	@RequestMapping("/getBankAddress")
	@ResponseBody
	public String getAddress() {
		return bank.getBankAddress();
	}
}
