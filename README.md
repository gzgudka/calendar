# calendar

EVENT
    id: Long
    taskName: String
    artifactName: String
    hostName: String
    startedAt: DateTime
    finishedAt: DateTime
    durationInMs: Long
    durationHuman: String

Example:
    id: 12345
    taskName: clearDataOlderThan30days
    artifactName: backoffice-core
    hostName: ps12345
    startedAt: 2016-11-02T00:00:00.00
    finishedAt: 2016-11-02T00:15:00.00
    durationInMs: 900 000
    durationHuman: 15min

TODO

API
    # Implement an aspect with pointcut on all @Scheduled annotated methods in spring ctx and measures the time of method's invoke
    # Implement a service which sends an event to a REST controller (async)
    # Prepare a EventConfig that can be applied easily in our projects

WEB-APP
    # Configure spring-boot app
    # Implement a REST method that receives events from API (@PUT /add)
    # Implement a repository method that saves events in Elasticsearch
    # Implement a repository method that fetches events from Elasticsearch
    # Implement a web controller for a calendar (@GET /events)
        # it should allow for 3 request parameters:
            # date - filtering by date,
            # host - filtering by host name,
            # artifact - filtering by artifact name
    # Implement a view for calendar (thymeleaf, fullcalendar.io)
        # day view
        # list view for a day

ELASTICSEARCH
    # setup collection on Elasticsearch
    # create mappings for event

EXTRA
    # use API in our artifacts to show a real data on the calendar
    # prepare some fake data, for example scan all classes in BO with @Scheduled annotation with cron setting and create for them events
    # add "Facets" for host, artifact
    # use different colors for different artifacts and/or hosts
    # support of week-view
