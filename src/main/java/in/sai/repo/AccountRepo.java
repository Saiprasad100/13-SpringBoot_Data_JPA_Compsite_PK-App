package in.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sai.entity.Account;
import in.sai.entity.AccountPK;

public interface AccountRepo extends  JpaRepository<Account, AccountPK> {

}
