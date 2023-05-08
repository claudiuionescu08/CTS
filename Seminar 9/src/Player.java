import java.util.HashMap;

// Flyweight interface
interface Player {
    void assignWeapon(String weapon);
    void mission();
}

// Concrete Flyweight class
class CounterTerrorist implements Player {
    // Intrinsic state
    private final String task;
    private String weapon;

    public CounterTerrorist() {
        task = "Defuse the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter-Terrorist with weapon " + weapon + " is " + task);
    }
}

// Concrete Flyweight class
class Terrorist implements Player {
    // Intrinsic state
    private final String task;
    private String weapon;

    public Terrorist() {
        task = "Plant the bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " is " + task);
    }
}

// Flyweight factory class
class PlayerFactory {
    private static final HashMap<String, Player> players = new HashMap<>();

    public static Player getPlayer(String type) {
        Player player = players.get(type);

        if (player == null) {
            switch (type) {
                case "CounterTerrorist":
                    System.out.println("Creating a new Counter-Terrorist");
                    player = new CounterTerrorist();
                    break;

                case "Terrorist":
                    System.out.println("Creating a new Terrorist");
                    player = new Terrorist();
                    break;
            }

            players.put(type, player);
        }

        return player;
    }
}
