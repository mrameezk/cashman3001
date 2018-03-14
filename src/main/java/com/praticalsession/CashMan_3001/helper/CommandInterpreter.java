package com.praticalsession.CashMan_3001.helper;

import com.praticalsession.CashMan_3001.controller.FundsController;
import com.praticalsession.CashMan_3001.exceptions.CurrencyCombinationException;
import com.praticalsession.CashMan_3001.exceptions.InsufficientFundsException;

import java.math.BigDecimal;

public class CommandInterpreter {

    private FundsController fundsController;
    private boolean isReadyToParseCommand;
    private final String USAGE = "Usage: \n\twithdraw [amount]\n\treport\n\tquit\n";

    public CommandInterpreter(FundsController fundsController) {
        this.isReadyToParseCommand = true;
        this.fundsController = fundsController;
    }

    public void parseCommand(String command) throws InsufficientFundsException, CurrencyCombinationException,
            NumberFormatException {
        if (command.startsWith("withdraw ")) {
            command = command.replace("withdraw ", "");
            BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(command));
            fundsController.withdraw(amount);
        } else {
            switch (command) {
                case "report":
                    fundsController.reportAll();
                    break;
                case "quit":
                    isReadyToParseCommand = false;
                    break;
                case "help":
                    printUsage();
                    break;
            }
        }
    }

    public boolean isReadyToParseCommand() {
        return isReadyToParseCommand;
    }

    public void printUsage() {
        System.out.println(USAGE);
    }

}
