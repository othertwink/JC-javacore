import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

// @Getter из Lombok
public class DateFormat {
    
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd##:HH:mm:ss:SSS", locale = "ru")
    private LocalDateTime dateTime;

    public DateFormat(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
