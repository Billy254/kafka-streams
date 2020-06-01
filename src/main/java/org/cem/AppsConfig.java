package org.cem;

public class AppsConfig {
    public static String kafkaBrokers = "10.204.5.147:9092,10.204.5.146:9092,10.204.5.145:9092";
//    public static String kafkaBrokers = "localhost:9092";
    public static String voiceStreamTopic = "CEM3GVOICEIN";
    public static String locationTopic = "LOCATIONREF";
    public static String probesErrorTopic = "ERRORSREF";
    public static String devicesinfoTopic = "DEVICESINFO";
    public static String enrichedVoiceStream = "CEM3GVOICEOUT";
    public static String stateDir = "/tmp/kafkaStreams";
}
