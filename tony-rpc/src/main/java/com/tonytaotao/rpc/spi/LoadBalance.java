package com.tonytaotao.rpc.spi;


import com.tonytaotao.rpc.core.Request;
import com.tonytaotao.rpc.core.extension.SPI;
import com.tonytaotao.rpc.core.extension.Scope;
import com.tonytaotao.rpc.rpc.Reference;

import java.util.List;

@SPI(scope = Scope.PROTOTYPE)
public interface LoadBalance<T> {

    void setReferences(List<Reference<T>> references);

    Reference<T> select(Request request);
}
