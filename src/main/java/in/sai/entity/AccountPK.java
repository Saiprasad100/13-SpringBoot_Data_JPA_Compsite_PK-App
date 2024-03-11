package in.sai.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable{
	private Long accNum;
	private String accType;
	

}
