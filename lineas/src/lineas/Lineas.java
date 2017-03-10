/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineas;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import static com.sun.javafx.fxml.expression.Expression.add;
import java.applet.Applet;
import java.awt.GraphicsConfiguration;
import java.awt.Label;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.LineArray;
import javax.media.j3d.LineStripArray;
import javax.media.j3d.Node;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleArray;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

/**
 *
 * @author Miguel
 */
public class Lineas extends Applet {
    public Lineas(){
    GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas = new Canvas3D(config);
       canvas.setSize(800, 600);
         SimpleUniverse universe = new SimpleUniverse(canvas); 
          BranchGroup group = new BranchGroup();
         add("North",new Label("Canvas hasta arriba"));
        add("Center", canvas);
        add("South",new Label("This is the bottom"));
        Point3d coords[] = new Point3d[4];
        coords[0] = new Point3d(-0.5d, -0.2d, 0.1d);
     coords[1] = new Point3d(-0.2d, 0.1d, 0.0d);
     coords[2] = new Point3d(0.2d, -0.3d, 0.1d);
     coords[3] = new Point3d(0.3d, 0.5d, 0.10d);

     int vertexCounts[] = {4};

     LineStripArray lines = new LineStripArray(4,
     GeometryArray.COORDINATES, vertexCounts);

     lines.setCoordinates(0, coords);

    Shape3D shape=new Shape3D(lines);
          
          LineArray línea = new LineArray(6, TriangleArray.COORDINATES|

                                      TriangleArray.COLOR_3);

  línea.setCoordinate(0, new Point3f(-0.8f, 0.5f, 0.0f));

  línea.setCoordinate(1, new Point3f(-0.8f,-0.5f, 0.0f));

  línea.setCoordinate(2, new Point3f( -0.3f,-0.5f, 0.0f));

  línea.setCoordinate(3, new Point3f( 0.3f, 0.5f, 0.0f));

  línea.setCoordinate(4, new Point3f( 0.8f, 0.5f, 0.0f));

  línea.setCoordinate(5, new Point3f( 0.8f,-0.5f, 0.0f));

 

  línea.setColor(0, new Color3f(1.0f, 0.0f, 0.0f)); // Rojo

  línea.setColor(1, new Color3f(1.0f, 1.0f, 0.0f)); // Amarillo

  línea.setColor(2, new Color3f(0.0f, 1.0f, 0.0f)); // Verde

  línea.setColor(3, new Color3f(0.0f, 1.0f, 1.0f)); // Cián

  línea.setColor(4, new Color3f(0.0f, 0.0f, 1.0f)); // Azul

  línea.setColor(5, new Color3f(1.0f, 0.0f, 1.0f)); // Violeta

 

  Shape3D forma = new Shape3D(línea);
  Sphere spheres = new Sphere(0.08f);
  Sphere sphere = new Sphere(0.08f);
  TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Vector3f vector = new Vector3f( -.3f, -.5f, .0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(spheres);
//////////////////////
        TransformGroup tgs = new TransformGroup();
        Transform3D transforms = new Transform3D();
        Vector3f vectors = new Vector3f( .3f, .5f, .0f);
        transforms.setTranslation(vectors);
        tgs.setTransform(transforms);
        tgs.addChild(sphere);
        group.addChild(forma);
        group.addChild(tg);
        group.addChild(tgs);
       // group.addChild(new ColorCube(0.3));
       group.addChild(new ColorCube(0.01));
       /*////////////////////////////*//////////////////////////////Colores
       Color3f light1Color = new Color3f(1.0f, 1.8f, 1.8f);
    BoundingSphere bounds = 
       new BoundingSphere(new Point3d(5.0,1.0,0.0), 100.0);
    Vector3f light1Direction  = new Vector3f(4.0f, -7.0f, -12.0f);
    DirectionalLight light1
      = new DirectionalLight(light1Color, light1Direction);
    light1.setInfluencingBounds(bounds);
    group.addChild(light1);/////////
  universe.getViewingPlatform().setNominalViewingTransform();
  universe.addBranchGraph(group);
  
    }
    private Node CrearLíneas() {

  LineArray línea = new LineArray(6, TriangleArray.COORDINATES|

                                      TriangleArray.COLOR_3);

  línea.setCoordinate(0, new Point3f(-0.8f, 0.5f, 0.0f));

  línea.setCoordinate(1, new Point3f(-0.8f,-0.5f, 0.0f));

  línea.setCoordinate(2, new Point3f( 0.0f,-0.5f, 0.0f));

  línea.setCoordinate(3, new Point3f( 0.0f, 0.5f, 0.0f));

  línea.setCoordinate(4, new Point3f( 0.8f, 0.5f, 0.0f));

  línea.setCoordinate(5, new Point3f( 0.8f,-0.5f, 0.0f));

 

  línea.setColor(0, new Color3f(1.0f, 0.0f, 0.0f)); // Rojo

  línea.setColor(1, new Color3f(1.0f, 1.0f, 0.0f)); // Amarillo

  línea.setColor(2, new Color3f(0.0f, 1.0f, 0.0f)); // Verde

  línea.setColor(3, new Color3f(0.0f, 1.0f, 1.0f)); // Cián

  línea.setColor(4, new Color3f(0.0f, 0.0f, 1.0f)); // Azul

  línea.setColor(5, new Color3f(1.0f, 0.0f, 1.0f)); // Violeta

 

  Shape3D forma = new Shape3D(línea);

  return forma;

}
    public static void main(String[] args) {
       Lineas c= new Lineas();
       c.CrearLíneas();
       new MainFrame(c,800,800);
    }
    
}
