package com.andersen.interview;

import java.io.IOException;
import java.net.URISyntaxException;

import com.andersen.interview.parser.JsonParser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JsonParserTest {

    private JsonParser jsonParser = new JsonParser();

    @Test
     void getCustomers_fromJSON_expectingSuccess () throws IOException, URISyntaxException {
       Assertions.assertEquals(3,jsonParser.getCustomers().size());
     }

}
