public class Game {
    private boolean isRunning;

    public Game(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start() {
        isRunning = true;
        System.out.println("Игра запущена!");
        int i=0;
        while (i<10) {
            i++;
            try {
                Thread.sleep(90);
                System.out.println("Игра запущена (каждую секунду)...");
            } catch (InterruptedException e) {
                System.out.println("Ошибка в стартовом методе: " + e.getMessage());
            }
        }
        stop();
    }

    public void stop() {
        isRunning = false;
        System.out.println("Игра остановлена!");
    }

    public static void main(String[] args) {
        Game game = new Game(false);
        game.start();
    }
}