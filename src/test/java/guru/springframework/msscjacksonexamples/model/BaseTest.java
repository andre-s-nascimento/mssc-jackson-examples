package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseTest {

  @Autowired ObjectMapper objectMapper;

  BeerDto getDto() {
    return BeerDto.builder()
        .beerName("Beer Name")
        .beerStyle("ALE")
        .id(UUID.randomUUID())
        .createdDate(OffsetDateTime.now())
        .lastUpdatedDate(OffsetDateTime.now())
        .price(new BigDecimal("12.99"))
        .upc(123123123123L)
        .build();
  }
}
