package com.thoughtworks.capability.gtb;

import org.junit.Assert;
import org.junit.Test;

public class MeetingSystemV3Test {

    @Test
    public void shouldShowChicagoLocaltimeWhenTimeNotPass(){
        String londonTime= "2020-07-01 14:30:00";
        String res = MeetingSystemV3.timeTranslator(londonTime);
        Assert.assertEquals("The meeting hasn' start yet, the meeting time is: 2020-07-01 08:30:00",res);
    }

    @Test
    public void shouldResetAndShowChicagoLocaltimeWhenTimePass(){

        String londonTime = "2020-04-01 14:30:00";
        String res = MeetingSystemV3.timeTranslator(londonTime);
        Assert.assertEquals("The original time has  passed, new meeting time is set at: 2020-06-11 08:30:00",res);

    }
}
