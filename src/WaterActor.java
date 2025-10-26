import processing.core.PImage;

import java.util.List;

public abstract class WaterActor extends Actor{
    public WaterActor (Point position, List<PImage> images, double updatePeriod) {
        super(position, images, updatePeriod);
    }

    private int water;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
