import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class EnvioKafka {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());


        /*Com O Try recurso do java 1.8*/

        try(KafkaProducer<String, String>  producer = new KafkaProducer<String, String>(properties);){

            ProducerRecord<String, String> record = new ProducerRecord<String, String>("TesteJava", "Ola Mundo");

            producer.send(record);
        }

        /*Sem O Try recurso do java 1.8*/
        /*
        KafkaProducer<String, String>  producer = new KafkaProducer<String, String>(properties);

        ProducerRecord<String, String> record = new ProducerRecord<String, String>("TesteJava", "Ola Mundo");

        producer.send(record);

        producer.close();
        */

    }
}
