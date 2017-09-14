package com.skcc.springbootstudy.user;

import static org.assertj.core.api.Assertions.not;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.skcc.springbootstudy.user.User;

public class UserTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() {

        User user = new User(0, "Shim", 37);

        logger.debug("{}", user);

    }

    @Test
    public void equalsTest() {
        User user1 = new User(0, "Shim", 37);
        User user2 = new User(0, "Shim", 37);
        User user3 = new User(1, "Shim", 37);

        assertThat(user1, is(user2));

        assertThat(user2, is(not(user3)));

    }
}