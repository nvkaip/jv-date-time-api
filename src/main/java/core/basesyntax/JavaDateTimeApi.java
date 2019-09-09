package core.basesyntax;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Optional;

public class JavaDateTimeApi {

    /**
     * Верните текущую дату в виде строки в зависимости от запроса.
     *
     * @param datePart Запрос на часть даты или всю дата целиком:
     *                 - FULL - текущая дата целиком год, месяц, день (число месяца)
     *                 в формате YYYY-MM-DD, возвращаемое значение по умолчанию;
     *                 - YEAR - текущий год;
     *                 - MONTH - название текущего месяца;
     *                 - DAY - текущий день (число месяца);
     **/
    public String todayDate(DateTimePart datePart) {
        return "Today";
    }

    /**
     * Верните Optional даты соответствующей дате в массиве.
     *
     * @param dateParams Дан массив данных состоящий из 3-х элементов, где:
     *                   - 1-й элемент массива - год;
     *                   - 2-й элемент массива - месяц;
     *                   - 3-й элемент массива - день (число);
     **/

    public Optional<LocalDate> getDate(Integer[] dateParams) {
        return Optional.empty();
    }

    /**
     * Известно на сколько часов нужно изменить текущее время.
     * Верните измененное текущее время на указаную величину, округленную до секунд.
     **/
    public LocalTime addHours(Integer hoursToAdd) {
        return LocalTime.now();
    }

    /**
     * Известно на сколько минут нужно изменить текущее время.
     * Верните измененное текущее время на указаную величину, округленную до секунд.
     **/
    public LocalTime addMinutes(Integer minutesToAdd) {
        return LocalTime.now();
    }

    /**
     * Известно на сколько секунд нужно изменить текущее время.
     * Верните измененное текущее время на указаную величину, округленную до секунд.
     **/
    public LocalTime addSeconds(Integer secondsToAdd) {
        return LocalTime.now();
    }

    /**
     * @param numberOfWeeks количество недель
     * @return Добавте к текущей дате полученое количество недель и верните получившуюся дату
     */
    public LocalDate addWeeks(Integer numberOfWeeks) {
        return LocalDate.now();
    }

    /**
     * Дана произвольная дата getDate.
     * Определите соотношение сегодня к getDate и верните строку:
     * - "getDate is after текущая дата" - если getDate в будующем
     * - "getDate is before текущая дата" - если getDate в прошлом
     * - "getDate is today" - если getDate - сегодня
     */
    public String beforeOrAfter(LocalDate someDate) {
        return someDate + "is today";
    }

    /**
     * Даны две временные зоны.
     * Верните Optional часовой разницы между двумя временными зонами.
     * @return Optional positive Integer
     */
    public Optional<Integer> diffBetweenZones(String firstZone, String secondZone) {
        return Optional.empty();
    }

    /**
     * Данны дата и время. Надо вернуть дату и время с местным временным смещением,
     * пусть это будет для Украины "+02:00".
     * Приведем пример: при вызове метода передается переменная типа LocalDateTime,
     * в формате "2019-09-06T13:17", нам надо вернуть переменную типа OffsetDateTime,
     * в формате "2019-09-06T13:17+02:00", где "+02:00" и будет смещение для нашей
     * временной зоны.
     * OffsetDateTime советуют использовать при записи даты в базу данных.
     **/
    public OffsetDateTime offsetDateTime(LocalDateTime localTime) {
        return OffsetDateTime.now();
    }

    /**
     * Дана строка в виде "yyyymmdd".
     * Необходимо вернуть Optional даты в LocalDate формате
     */
    public Optional<LocalDate> parseDate(String date) {
        return Optional.empty();
    }

    /**
     * Дана строка в виде "d MMM yyyy" (MMM - Sep, Oct, etc).
     * Необходимо вернуть Optional даты в LocalDate формате
     */
    public Optional<LocalDate> customParseDate(String date) {
        return Optional.empty();
    }

    /**
     * Даны произвольные время и дата.
     * Верните строку с датой и временем в формате
     * "день(2 цифры) месяц(полное название на английском) год(4 цифры) час(24 часа):минуты"
     * или сообщение "dateTime can't be formatted!"
     */
    public String formatDate(LocalDateTime dateTime) {
        return "Date can't be formatted!";
    }
}
