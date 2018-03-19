package com.PraticalSession.CashMan_3001.helper;


import com.praticalsession.CashMan_3001.controller.FundsController;
import org.junit.Assert;
import org.junit.Test;

public class CommandInterpreterTest {

    @Test
    public void whenInitialisedThenReadyToParseCommandTrue() {
        CommandInterpreter commandInterpreter = new CommandInterpreter(new FundsController());
        Assert.assertTrue(commandInterpreter.isReadyToParseCommand());
    }

    @Test
    public void whenQuitThenReadyToParseCommandFalse() throws Exception {
        CommandInterpreter commandInterpreter = new CommandInterpreter(new FundsController());
        commandInterpreter.parseCommand("quit");
        Assert.assertFalse(commandInterpreter.isReadyToParseCommand());
    }

}
