package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

  @Test
  void testSerializeDto() throws JsonProcessingException {
    BeerDto beerDto = getDto();

    String jsonString = objectMapper.writeValueAsString(beerDto);

    System.out.println(jsonString);
  }

  @Test
  void testDeserializeDto() throws IOException {
    BeerDto beerDto = getDto();

    String json =
        "{\"beerName\":\"Beer Name\",\"beerStyle\":\"ALE\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2023-10-30T12:53:53:26.990608-03:00\",\"lastUpdatedDate\":\"2023-10-30T12:53:26.990627-03:00\",\"myLocalDate\":\"20231030\",\"beerId\":\"33e07ac2-27eb-4fe4-8453-f72a9af85759\"}";

    BeerDto dto = objectMapper.readValue(json, BeerDto.class);

    System.out.println(dto);
  }
}
