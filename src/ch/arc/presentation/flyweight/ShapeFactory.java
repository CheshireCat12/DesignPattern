package ch.arc.presentation.flyweight;

import java.util.HashMap;

public class ShapeFactory
{
    private static final HashMap<String, Shape> cirlceMap = new HashMap<>();

    public static Shape getCircle(String color)
    {
        Circle circle = (Circle) cirlceMap.get(color);

        if (circle == null)
        {
            circle = new Circle(color);

            cirlceMap.put(color, circle);

            System.out.println("Creating a circle of color " + color);
        }
        return circle;

    }
}
