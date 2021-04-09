package com.lambda.school.countries.repositories;

import com.lambda.school.countries.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long>
{
}
