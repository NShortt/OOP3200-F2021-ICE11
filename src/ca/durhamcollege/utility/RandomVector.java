/**
 * @author Nicholas Shortt
 * @studentID 100630003
 * @date November 25, 2021
 */
package ca.durhamcollege.utility;

import java.util.Random;

/* Singleton */
public class RandomVector
{
    private Random m_rand;

    // 1. Private static instance
    private static RandomVector m_instance = null;

    // 2. Make default constructor private
    private RandomVector()
    {
        m_rand = new Random(); // instance of random class
    }

    // 3. Make public instance method that acts as "portal" to the class
    public static RandomVector Instance()
    {
        if (m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    public final Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        // Generate random X value from min to max
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (m_rand.nextFloat() * (maxX - minX)) + minX;

        // Generate random Y value from min to max
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        float randomY = (m_rand.nextFloat() * (maxY - minY)) + minY;

        return new Vector2D(randomX, randomY);
    }
}
