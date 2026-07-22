package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

public class CountryService {

    public Country getCountry(String code) throws CountryNotFoundException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                context.getBean("countryList", List.class);

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {

                ((ClassPathXmlApplicationContext) context).close();

                return country;
            }
        }

        ((ClassPathXmlApplicationContext) context).close();

        throw new CountryNotFoundException();
    }
}