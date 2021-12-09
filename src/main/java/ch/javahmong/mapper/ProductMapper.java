package ch.javahmong.mapper;

import ch.javahmong.model.Product;
import ch.javahmong.model.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductDTO productDTO);
    ProductDTO toDTO(Product product);
    List<ProductDTO> toDTOs(List<Product> products);
}
