package com.livewebsite.LiveDemo.Repository;

import com.livewebsite.LiveDemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Customer, Long>{

}
