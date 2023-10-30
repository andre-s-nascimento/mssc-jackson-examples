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
        "{\"id\":\"439e3c75-96eb-46ec-afe6-5bd0b688b7e7\",\"beerName\":\"Beer Name\",\"beerStyle\":\"ALE\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2023-10-30T11:44:45.579481-03:00\",\"lastUpdatedDate\":\"2023-10-30T11:44:45.579567-03:00\"}";

    BeerDto dto = objectMapper.readValue(json, BeerDto.class);

    System.out.println(dto);
  }
}
