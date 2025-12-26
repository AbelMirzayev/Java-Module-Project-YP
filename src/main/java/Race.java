class Race {
    String leader = "";
    int maxDistance = 0;

    private final int RACE_HOURS = 24;

    public void Leader(Car newCar) {
        int newCarDistance = newCar.getSpeed() * RACE_HOURS;

        if (newCarDistance > this.maxDistance) {
            this.maxDistance = newCarDistance;
            this.leader = newCar.getName();
        }
    }

    public String getLeader() {
        return leader;
    }
}