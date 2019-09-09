package com.hitex.travel.service.impl;

import com.hitex.travel.domain.Bank;
import com.hitex.travel.repository.readonly.RBankRepository;
import com.hitex.travel.repository.writeonly.WBankRepository;
import com.hitex.travel.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author MaiPH
 */
@Service
public class BankServiceImpl implements BankService {

    @Autowired
    RBankRepository rBankRepository;
    
    @Override
    public List<Bank> getListBank() {
        return  rBankRepository.getListBank();
    }
    
}
