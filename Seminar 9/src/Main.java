public class Main {
    public static void main(String[] args) {
//        //Creeaza un abinament de baza
//        Subscription subscription = new BasicSubscription();
//
//        //Adauga optiune de vizionare offline
//        subscription=new OfflineViewingDecorator(subscription);
//
//        //Adauga optiune de vizionare in calitate HD
//        subscription=new HDStreamingDecorator(subscription);
//
//        //Afiseaza descrierea si pretul final al abonamentuluid
//        System.out.println("Descriere: " + subscription.getDescription());
//        System.out.println("Pret: " + subscription.getPrice());

    String[] weapons = {"AK-47", "M4A1", "Glock", "Desert Eagle"};

    for (int i = 0; i < 10; i++) {
        Player player = PlayerFactory.getPlayer(getRandomPlayerType());
        player.assignWeapon(getRandomWeapon(weapons));
        player.mission();
    }
}

    private static String getRandomPlayerType() {
        String[] playerTypes = {"CounterTerrorist", "Terrorist"};
        return playerTypes[(int) (Math.random() * playerTypes.length)];
    }

    private static String getRandomWeapon(String[] weapons) {
        return weapons[(int) (Math.random() * weapons.length)];
    }
}