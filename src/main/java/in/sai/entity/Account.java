package in.sai.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Account {
	
	private String holderName;
	private String branchName;
	
	@EmbeddedId
	private AccountPK accountpk;
	

}
