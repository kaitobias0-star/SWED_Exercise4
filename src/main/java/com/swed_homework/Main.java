package com.swed_homework;

public class Main {
    public static void main(String[] args) {
        Website web = new Website();
        Website web2 = new Website();
        web.setUrl("www.kai.com");
        web.setActive(true);
        web.setCountryName("Germany");
        web.setContent("<html><body>Test 123</body></html>");
        web2.setUrl("www.kai2.com");
        web2.setActive(true);
        web2.setCountryName("Germany");
        web2.setContent("<html><body>Test 12345</body></html>");

        User user = new User();
        user.setId(1);
        user.setName("Kai");
        user.setEmailAddress("kai@gmail.com");
        user.setBirthDate("01.12.2003");

        Subscription subscription = new Subscription();
        subscription.setId(1);
        subscription.setFrequency(24);
        subscription.setCommunicationChannel(Channel.whatsapp);
        subscription.setWebsite(web);

        user.addSubscription(subscription);

        Monitor monitor = new Monitor(subscription);
        monitor.setStatus(true);

        System.out.println("Users Name: " + user.getName());
        System.out.println("Subscribed Website: " + user.getSubscriptions().get(0).getWebsite().getUrl());
        System.out.println("Channel: " + user.getSubscriptions().get(0).getCommunicationChannel());
        

        ComparisonStrategy htmlStrategy = new HtmlStrategy();
        ComparisonStrategy textStrategy = new TextStrategy();
        ComparisonStrategy sizeStrategy = new SizeStrategy();

        System.out.println("\nTeest with current content: \n");
        System.out.println("HTML Strategy: " + htmlStrategy.compare(web, web2));
        System.out.println("Text Strategy: " + textStrategy.compare(web, web2));
        System.out.println("Size Strategy: " + sizeStrategy.compare(web, web2));

        System.out.println("\nTest with new content: \n");
        web.setContent("<html><body>Test 123</body></html>");
        web2.setContent("<html><body>Test 123</body></html>");
        System.out.println("HTML Strategy: " + htmlStrategy.compare(web, web2));
        System.out.println("Text Strategy: " + textStrategy.compare(web, web2));
        System.out.println("Size Strategy: " + sizeStrategy.compare(web, web2));

    }
}
