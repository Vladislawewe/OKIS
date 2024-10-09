package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShapeCheckerTest {

    private ShapeChecker shapeChecker = new ShapeChecker();

    @Test(groups = "circle")
    public void testPointInsideCircle() {
        Assert.assertTrue(shapeChecker.PointInsideCircle(0, 0, 5, 2, 3));
    }

    @Test(groups = "square")
    public void testPointInsideSquare() {
        Assert.assertTrue(shapeChecker.PointInsideSquare(0, 0, 5, 2, 2));
    }

    @Test(groups = "PositiveTest")
    public void testPointInsideTriangle() {
        Assert.assertTrue(shapeChecker.PointInsideTriangle(0, 0, 5, 5, 2, 2));
    }

    @Test(groups = "PositiveTest")
    public void testPointInsideRectangle() {
        Assert.assertTrue(shapeChecker.PointInsideRectangle(0, 0, 5, 3, 2, 2));
    }

    @Test(groups = "ellipse")
    public void testPointInsideEllipse() {
        Assert.assertTrue(shapeChecker.PointInsideEllipse(0, 0, 5, 3, 2, 1));
    }

}
