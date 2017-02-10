package online.zhaopei.myproject.mapper.primary;

import java.util.List;

import online.zhaopei.myproject.domain.City;
import online.zhaopei.myproject.sqlprovide.CitySqlProvide;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

public interface CityMapper {

	@SelectProvider(type = CitySqlProvide.class, method = "findByState")
	List<City> findByState(@Param("state") String state);
}
