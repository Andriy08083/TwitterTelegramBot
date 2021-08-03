package ua.andrey08;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ua.andrey08.api.Requests;
import ua.andrey08.bot.Bot;
import ua.andrey08.data.BotConfig;
import ua.andrey08.data.Reference;
import ua.andrey08.entities.Tweet;
import ua.andrey08.parser.LinkParser;

import java.io.File;

public class Main {

    public static void main(String[] args) throws TelegramApiException {
        BotConfig.initConfig(new File("config.json"));

        TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
        botApi.registerBot(new Bot(Reference.botConfig.botToken, Reference.botConfig.botUsername));

    }
}
