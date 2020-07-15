import java.time.*;

class Gigasecond {

    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
        return birthDateTime.plusSeconds((long) Math.pow(10, 9));
    }

}