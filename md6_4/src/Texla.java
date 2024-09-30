class Texla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Texla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed)
            speed += autoPilotAcceleration;
        else {speed = autoPilotMaxSpeed;}
        // исправьте метод для ускорения при автопилоте
    }

    // переопределите метод для ускорения

    @Override
    public void accelerate() {
        if(speed < maxSpeed)
            super.accelerate();
        else speed = maxSpeed;
    }


    // переопределите метод для торможения

    @Override
    public void brake() {
        if (speed-brakingSpeed < 0)
            speed = 0;
        else if (speed > 0)
            super.brake();
    }
}