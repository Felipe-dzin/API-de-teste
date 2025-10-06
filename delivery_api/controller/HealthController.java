@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health(){
        return Map.of("status", "UP", 
            "timestamp", LocalDateTime.now().toString(),
            "service", "Delivery API",
            "Java Version", System.getProperty("java.version")
            );
    }
    
    @GetMapping("/info")
    public AppInfo info() {
        return new AppInfo(
            "Delivery tech API",    // application
            "1.0.0",                // version
            "Felipe Zheng",         // developer
            "JDK 21",               // javaVersion
            "Spring Boot 3.2.x"     // framework
        );
    }

    public record AppInfo(
        String application,
        String version,
        String developer,
        String javaVersion,
        String framework
    ){}
}

    
