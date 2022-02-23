package main.swole_squad.models;

public class Event {

    private String eventName;
    private String eventDiscription;

    public Event(String eventName, String eventDiscription) {
        this.eventName = eventName;
        this.eventDiscription = eventDiscription;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDiscription() {
        return eventDiscription;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDiscription(String eventDiscription) {
        this.eventDiscription = eventDiscription;
    }

    //    "kind": "calendar#event",
//            "etag": "\"3204707205500000\"",
//            "id": "_6tlnaqrle5p6cpb4dhmj4phpegqmur9ndlj6soplehpj4drl6lo74r33d9ijep3geko64ob9dlimqqrgepj74c3jctijcr9oe1om4q1mdpkj0",
//            "status": "confirmed",
//            "htmlLink": "https://www.google.com/calendar/event?eid=XzZ0bG5hcXJsZTVwNmNwYjRkaG1qNHBocGVncW11cjluZGxqNnNvcGxlaHBqNGRybDZsbzc0cjMzZDlpamVwM2dla282NG9iOWRsaW1xcXJnZXBqNzRjM2pjdGlqY3I5b2Uxb200cTFtZHBrajAgZGV2aW5tYnV0dHNAbQ",
//            "created": "2020-10-10T18:13:22.000Z",
//            "updated": "2020-10-10T18:13:22.750Z",
//            "summary": "Reservation at Friesian Gastro Pub",
//            "description": "To see detailed information for automatically created events like this one, use the official Google Calendar app. https://g.co/calendar\n\nThis event was created from an email you received in Gmail. https://mail.google.com/mail?extsrc=cal&plid=ACUX6DPp_gv2hL2No2FuJCoPY8oBM-qjYXljxsY\n",
//            "location": "Friesian Gastro Pub, 720 Michigan St NE, Grand Rapids, MI, United States, 49503",
//            "creator": {
//        "email": "devinmbutts@gmail.com",
//                "self": true
//    },
//            "organizer": {
//        "email": "unknownorganizer@calendar.google.com",
//                "displayName": "Unknown Organizer"
//    },
//            "start": {
//        "dateTime": "2020-10-10T18:00:00-04:00",
//                "timeZone": "UTC"
//    },
//            "end": {
//        "dateTime": "2020-10-10T19:00:00-04:00",
//                "timeZone": "UTC"
//    },
//            "endTimeUnspecified": true,
//            "transparency": "transparent",
//            "visibility": "private",
//            "iCalUID": "7kukuqrfedlm2f9t5om7mfnc5ts27u5prlcje7dpu0baimemkpvfr0sge6m8pqbh6ni0",
//            "sequence": 0,
//            "attendees": [
//    {
//        "email": "devinmbutts@gmail.com",
//            "self": true,
//            "responseStatus": "accepted"
//    }
//            ],
//                    "guestsCanInviteOthers": false,
//                    "privateCopy": true,
//                    "reminders": {
//        "useDefault": true
//    },
//            "source": {
//        "url": "https://mail.google.com/mail?extsrc=cal&plid=ACUX6DPp_gv2hL2No2FuJCoPY8oBM-qjYXljxsY",
//                "title": ""
//    },
//            "eventType": "default"
//},
}
