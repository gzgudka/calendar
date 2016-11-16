package com.tyro.codeblitz.calendar.webapp;


import com.tyro.codeblitz.calendar.api.Event;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EventRepository {

    void save(Event event);

    List<Event> find(LocalDate date, Optional<String> host, Optional<String> artefact);

}
