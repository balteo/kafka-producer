package tests.kafka.producer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {

    private final KafkaTemplate<String, String> template;

    public KafkaProducerApplication(KafkaTemplate<String, String> template) {
        this.template = template;
    }
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        template.send("myTopic", "foo1");
        template.send("myTopic", "foo2");
        template.send("myTopic", "foo3");
    }

}
