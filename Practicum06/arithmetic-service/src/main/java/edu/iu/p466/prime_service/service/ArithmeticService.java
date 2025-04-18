package edu.iu.p466.prime_service.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService implements IArithmeticService {

    @Override
    public long add(long n, long m){
        return n + m;
    }

}
