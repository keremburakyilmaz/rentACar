package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
