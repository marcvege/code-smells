package es.rachelcarmena.bloaters.smell1;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WithdrawShould {

    @Test
    public void keep_the_amount_object() throws Exception {
        Amount amount = new Amount(560d);
        Withdraw withdraw = new Withdraw(amount);
        assertThat(withdraw.getAmount(), is(amount));
    }
}
