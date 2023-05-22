package PHYSICS;

public class Energy extends Physics {
    public float calculatePotentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }
    public float calculateKineticEnergy(float mass, float velocity) {
        return (1/2) * mass * velocity* velocity;
    }

    public float calculateForce(float mass,float distance) {
        return mass * distance;
    }

    public float calculatePower(float work, float time) {
        return (work/time);
    }
    public float calculateWorkDone (float force, float distance1) {
        return force * distance1;
    }    
}
