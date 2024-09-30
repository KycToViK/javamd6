class Transport {
    double speed;
    double maxSpeed;
    double acceleration;
    double brakingSpeed;
    int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}