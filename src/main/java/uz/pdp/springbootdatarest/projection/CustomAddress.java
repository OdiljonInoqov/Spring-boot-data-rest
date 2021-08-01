package uz.pdp.springbootdatarest.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.springbootdatarest.entity.Address;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();

    String getCity();

    String getStreet();

}
