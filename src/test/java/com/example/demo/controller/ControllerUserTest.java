package com.example.demo.controller;

import com.example.demo.model.Organization;
import com.example.demo.model.Ticket;
import com.example.demo.model.User;
import com.example.demo.model.UserShow;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ControllerUserTest {
    @InjectMocks
    private ControllerUser controllerUser;

    User user1 = new User(
            17,
            "http://initech.tokoin.io.com/api/v2/users/5.json",
            "29c18801-fb42-433d-8674-f37d63e637df",
            "Loraine Pittman",
            "Mr Ola",
            "2016-06-12T08:49:19 -10:00",
            true,
            false,
            false,
            "zh-CN",
            "Monaco",
            "2013-07-03T06:59:27 -10:00",
            "olapittman@flotonic.com",
            "9805-292-618",
            "Don't Worry Be Happy!",
            101,
            new String[]{
                    "Frizzleburg",
                    "Forestburg",
                    "Sandston",
                    "Delco"
            },
            false,
            "admin"
    );

    User user2 = new User(
            50,
            "http://initech.tokoin.io.com/api/v2/users/5.json",
            "29c18801-fb42-433d-8674-f37d63e637df",
            "Pittman Loraine",
            "Mr Ola",
            "2016-06-12T08:49:19 -10:00",
            true,
            false,
            false,
            "zh-CN",
            "Monaco",
            "2013-07-03T06:59:27 -10:00",
            "olapittman@flotonic.com",
            "9805-292-618",
            "Don't Worry Be Happy!",
            101,
            new String[]{
                    "Frizzleburg",
                    "Forestburg",
                    "Sandston",
                    "Delco"
            },
            false,
            "admin"
    );

    Ticket ticket1 = new Ticket(
            "b07a8c20-2ee5-493b-9ebf-f6321b95966e",
            "http://initech.tokoin.io.com/api/v2/tickets/b07a8c20-2ee5-493b-9ebf-f6321b95966e.json",
            "ca4452fc-b24d-4e06-a752-b15ee3fc42bb",
            "2016-03-21T11:18:13 -11:00",
            "question",
            "A Drama in Portugal",
            "Laborum exercitation officia nulla in. Consequat et commodo fugiat velit magna sunt mollit.",
            "low",
            "hold",
            50,
            17,
            101,
            new String[]{
                    "Ohio",
                    "Pennsylvania",
                    "American Samoa",
                    "Northern Mariana Islands"
            },
            true,
            "2016-08-04T12:30:08 -10:00",
            "web"
    );

    Organization organization1 = new Organization(
            101,
            "http://initech.tokoin.io.com/api/v2/organizations/101.json",
            "9270ed79-35eb-4a38-a46f-35725197ea8d",
            "Enthaze",
            new String[]{
                    "kage.com",
                    "ecratic.com",
                    "endipin.com",
                    "zentix.com"
            },
            "2016-05-21T11:10:28 -10:00",
            "MegaCorp",
            false,
            new String[]{
                    "Fulton",
                    "West",
                    "Rodriguez",
                    "Farley"
            });
    Organization organization2 = new Organization(
            102,
            "http://initech.tokoin.io.com/api/v2/organizations/102.json",
            "7cd6b8d4-2999-4ff2-8cfd-44d05b449226",
            "Nutralab",
            new String[]{
                    "trollery.com",
                    "datagen.com",
                    "bluegrain.com",
                    "dadabase.com"
            },
            "2016-04-07T08:21:44 -10:00",
            "Non profit",
            false,
            new String[]{
                    "Cherry",
                    "Collier",
                    "Fuentes",
                    "Trevino"
            });
    Organization organization3 = new Organization(
            103,
            "http://initech.tokoin.io.com/api/v2/organizations/103.json",
            "e73240f3-8ecf-411d-ad0d-80ca8a84053d",
            "Plasmos",
            new String[]{
                    "comvex.com",
                    "automon.com",
                    "verbus.com",
                    "gogol.com"
            },
            "2016-05-28T04:40:37 -10:00",
            "Non profit",
            false,
            new String[]{
                    "Parrish",
                    "Lindsay",
                    "Armstrong",
                    "Vaughn"
            });
    Organization organization4 = new Organization(
            104,
            "http://initech.tokoin.io.com/api/v2/organizations/104.json",
            "f6eb60ad-fe37-4a45-9689-b32031399f93",
            "Xylar",
            new String[]{
                    "anixang.com",
                    "exovent.com",
                    "photobin.com",
                    "marqet.com"
            },
            "2016-03-21T10:11:18 -11:00",
            "MegaCörp",
            false,
            new String[]{
                    "Hendricks",
                    "Mclaughlin",
                    "Stephens",
                    "Garner"
            });

    @Test
    public void handle_getUserByInteger_Success(){
        User[] users = new User[]{
                user1, user2
        };

        Ticket[] tickets = new Ticket[]{
                ticket1
        };

        Organization[] organizations = new Organization[]{
                organization1, organization2, organization3
        };


        List<User> userList = controllerUser.getUserInteger(users, tickets, organizations, "_id", 17);
        assertThat(userList).isNotEmpty();
    }

    @Test
    public void handle_getUserByInteger_FailedWithDataNotEnough(){
        User[] users = new User[]{
        };

        Ticket[] tickets = new Ticket[]{
                ticket1
        };

        Organization[] organizations = new Organization[]{
                organization1, organization2, organization3
        };

        UserShow userShow = new UserShow(
                user1,
                "Loraine Pittman",
                "Pittman Loraine",
                "Enthaze"
        );

        List<User> userList = controllerUser.getUserInteger(users, tickets, organizations, "_id", 17);
        assertThat(userList).isNotSameAs(userShow);
    }

    @Test
    public void handle_getUserByInteger_FailedWithDataNotFound(){
        User[] users = new User[]{
                user1, user2
        };

        Ticket[] tickets = new Ticket[]{
                ticket1
        };

        Organization[] organizations = new Organization[]{
                organization1, organization2, organization3
        };

        List<User> userList = controllerUser.getUserInteger(users, tickets, organizations, "_id", 1);
        assertThat(userList).isEmpty();
    }
}
