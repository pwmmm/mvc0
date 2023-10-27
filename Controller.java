package controller;

import model.Model;
import model.MyShape;
import view.MyFrame;
import view.MyPanel;

import java.awt.*;
import java.awt.geom.Point2D;

public class Controller {

    Model model;
    Point2D[] point;
    MyPanel panel;
    MyFrame frame;

    public Controller() {
        point = new Point2D[2];
        model = new Model();
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
    }

    public void mousePressed(Point p) {
        point[0] = (Point2D) p;
        model.createShape();
    }

    public void mouseDragged(Point p) {
        point[1] = (Point2D) p;
        model.getCurrentShape().straghShape(point);

    }

    public MyShape translate() {
        return model.getCurrentShape();
    }
}
