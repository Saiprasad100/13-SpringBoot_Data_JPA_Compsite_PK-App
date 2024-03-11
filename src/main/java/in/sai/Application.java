package in.sai;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sai.entity.Account;
import in.sai.entity.AccountPK;
import in.sai.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepo bean = context.getBean(AccountRepo.class);
		
		
		/*
		//SETTING COMPOSITE KEY VALUE
		AccountPK pk= new AccountPK();
		
		pk.setAccNum(123456987456l);
	    pk.setAccType("Savings");
	    
	    
	    Account acc = new Account();
	    acc.setHolderName("Saiprasad");
	    acc.setBranchName("Marathalli");
	    acc.setAccountpk(pk);
	    
	    
	    Account save = bean.save(acc);
	    
	    System.out.println("Recored Saved........");
	    
	    */
		AccountPK pk= new AccountPK(); 
		pk.setAccNum(123456987456l);
	    pk.setAccType("Savings");
	   
	    
	    Optional<Account> id = bean.findById(pk);
	    if(id.isPresent()) {
	    	System.out.println(id.get());
	    }
	    else {
	    	System.out.println("No record Availavle...........");
	    }
	}

}
