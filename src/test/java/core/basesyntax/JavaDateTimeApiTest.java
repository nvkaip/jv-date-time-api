package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class JavaDateTimeApiTest {

    private JavaDateTimeApi javaDateTimeApi = new JavaDateTimeApi();
    private Integer[] dateParams = {2018, 12, 1};

    @Test
    public void todayDateFull() {
        String expected = String.valueOf(LocalDate.now());
        String result = javaDateTimeApi.todayDate(DateTimePart.FULL);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void someDate() {
        Optional<LocalDate> expected =
                Optional.of(LocalDate.of(dateParams[0], dateParams[1], dateParams[2]));
        Optional<LocalDate> result = javaDateTimeApi.someDate(dateParams);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addTimeHours() {
        LocalTime expected = LocalTime.now().plusHours(2);
        LocalTime result = javaDateTimeApi.addTime(DateTimePart.HOURS, 2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addWeeks() {
        LocalDate expected = LocalDate.now().plusWeeks(2);
        LocalDate result = javaDateTimeApi.addWeeks(2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void beforeDate() {
        String expected = "2019-09-03 is before 2019-09-06";
        String result = javaDateTimeApi.beforeOrAfter(LocalDate.of(2019, 9, 3));
        Assert.assertEquals(expected, result);
    }

    @Test
    public void diffBetweenZones() {
        Integer expected = 6;
        Integer result = javaDateTimeApi.diffBetweenZones("America/Puerto_Rico", "Europe/Paris");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void daysToNewYear() {//TODO don't know how is better to get days for check
        Integer expected;
        Integer result;

        System.out.println("Days till Ney Year - " + javaDateTimeApi.daysToNewYear());
    }

    @Test
    public void offsetUkraine() {
        LocalDateTime localDateTime =
                LocalDateTime.of(2019, Month.SEPTEMBER, 06, 13, 17);
        OffsetDateTime expected = OffsetDateTime.of(localDateTime, ZoneOffset.of("+02:00"));
        OffsetDateTime result = javaDateTimeApi.offsetDateTime(localDateTime);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void parseDate() {
        LocalDate expected = LocalDate.of(2019, 9, 21);
        LocalDate result = javaDateTimeApi.parseDate("20190921");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void customParseDate() {
        Optional<LocalDate> expected = Optional.of(LocalDate.of(2019, 9, 6));
        Optional<LocalDate> result = javaDateTimeApi.customParseDate("06 Sep 2019");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void formatDate() {
        String expected = "06 September 2019 16:15";
        LocalDateTime localDateTime = LocalDateTime.of(2019, 9, 6, 16, 15, 26);
        String result = javaDateTimeApi.formatDate(localDateTime);
        Assert.assertEquals(expected, result);
    }
}