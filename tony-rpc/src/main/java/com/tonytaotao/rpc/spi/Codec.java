package com.tonytaotao.rpc.spi;


import com.tonytaotao.rpc.common.URL;
import com.tonytaotao.rpc.core.extension.SPI;
import com.tonytaotao.rpc.util.Constants;

import java.io.IOException;

@SPI(Constants.FRAMEWORK_NAME)
public interface Codec {

    byte[] encode(URL url, Object message) throws IOException;

    Object decode(URL url, byte messageType, byte[] data) throws IOException;
}
