package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class AgeSerializer extends StdSerializer<Integer> {
    protected AgeSerializer(){
        super(Integer.class);
    }

    @Override
    public void serialize(Integer integer, JsonGenerator gen,
                          SerializerProvider provider) throws IOException {
        gen.writeNumber(0);
    }
}
