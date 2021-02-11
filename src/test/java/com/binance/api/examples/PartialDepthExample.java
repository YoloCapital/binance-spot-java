package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.domain.general.DepthStreamInterval;

import java.io.Closeable;

public class PartialDepthExample {

    public static void main(String[] args) throws Exception {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiWebSocketClient wsClient = factory.newWebSocketClient();
        BinanceApiRestClient restClient = factory.newRestClient();

        String symbol = "BTCUSDT,ETHBTC,ETHUSDT,ADAUSDT,XRPUSDT,FILUSDT,EGLDUSDT";

        System.out.println("hello");
        Thread.sleep(10);
        System.out.println("Start to make websocket connection");
        Closeable closeable = wsClient.onPartialDepthEvent(symbol, 10, DepthStreamInterval.MILLIS_1000, System.out::println);

        Thread.sleep(1000 * 5);
        System.out.println("Finished");
        closeable.close();
    }
}
