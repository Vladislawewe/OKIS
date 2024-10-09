package org.example;

public class ShapeChecker {

    public boolean PointInsideCircle(double circleX, double circleY, double radius, double pointX, double pointY) {
        return Math.sqrt(Math.pow(pointX - circleX, 2) + Math.pow(pointY - circleY, 2)) < radius;
    }

    public boolean PointInsideSquare(double squareX, double squareY, double side, double pointX, double pointY) {
        return pointX > squareX && pointX <= squareX + side &&
                pointY >= squareY && pointY <= squareY + side;
    }

    public boolean PointInsideTriangle(double triangleX, double triangleY, double side1, double side2, double pointX, double pointY) {
        // Точки треугольника (в порядке против часовой стрелки)
        double x1 = triangleX;
        double y1 = triangleY;
        double x2 = triangleX + side1;
        double y2 = triangleY;
        double x3 = triangleX + 0.5 * side1; // Используем серединную точку для x3
        double y3 = triangleY + side2;

        // Барицентрические координаты точки
        double u = ((y2 - y3) * (pointX - x3) + (x3 - x2) * (pointY - y3)) /
                ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));

        double v = ((y3 - y1) * (pointX - x3) + (x1 - x3) * (pointY - y3)) /
                ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));

        double w = 1 - u - v;

        // Проверка, что точка находится внутри треугольника
        return u >= 0 && u <= 1 && v >= 0 && v <= 1 && w >= 0 && w <= 1;
    }

    public boolean PointInsideRectangle(double rectangleX, double rectangleY, double width, double height, double pointX, double pointY) {
        return pointX >= rectangleX && pointX <= rectangleX + width &&
                pointY >= rectangleY && pointY <= rectangleY + height;
    }

    public boolean PointInsideEllipse(double ellipseX, double ellipseY, double radiusX, double radiusY, double pointX, double pointY) {
        return Math.pow((pointX - ellipseX) / radiusX, 2) + Math.pow((pointY - ellipseY) / radiusY, 2) <= 1;
    }
}
