package ir.ac.kntu.engine;

import ir.ac.kntu.service.AccountService;
import ir.ac.kntu.service.MarketService;
import ir.ac.kntu.service.OrderService;

public class Engine {
    private final AccountService accountService;
    private final OrderService orderService;
    private final MarketService marketService;

    public Engine() {
        accountService = new AccountService();
        orderService = new OrderService();
        marketService = new MarketService();
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public MarketService getMarketService() {
        return marketService;
    }
}
