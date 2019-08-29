package com.tonytaotao.rpc.spi;

import com.tonytaotao.rpc.common.URL;
import com.tonytaotao.rpc.core.extension.SPI;
import com.tonytaotao.rpc.rpc.Exporter;
import com.tonytaotao.rpc.rpc.Provider;
import com.tonytaotao.rpc.rpc.Reference;
import com.tonytaotao.rpc.util.Constants;

@SPI(value = Constants.FRAMEWORK_NAME)
public interface Protocol {

    <T> Reference<T> refer(Class<T> clz, URL url, URL serviceUrl);

    <T> Exporter<T> export(Provider<T> provider, URL url);

    void destroy();
}
