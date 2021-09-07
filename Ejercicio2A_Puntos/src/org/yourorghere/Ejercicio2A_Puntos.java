package org.yourorghere;
import com.sun.opengl.util.Animator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame; 

public class Ejercicio2A_Puntos implements GLEventListener {
    static GL gl;
    static GLU glu;
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Ejercicio2A_Puntos());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        glu = new GLU();
        gl = drawable.getGL();
        gl.glClearColor(0, 0, 0, 1);
        gl.glMatrixMode(gl.GL_PROJECTION);
        glu.gluOrtho2D(-700, 700, -340, 350);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height){}

    public void display(GLAutoDrawable drawable) {
        gl.glPointSize(3);
        gl.glColor3d(17, 33, 232);
        gl.glPushMatrix();
            gl.glTranslated(-700,-341,0);
            gl.glBegin(GL.GL_POINTS);
                
                for(int i=0; i<frame.getWidth(); i++){
                    for(int j=0; j<frame.getHeight()/30;j++){
                        gl.glVertex2d(i,j*30);
                    }
                }
                
                for(int i=0; i<frame.getWidth()/30; i++){
                    for(int j=0; j<frame.getHeight();j++){
                        gl.glVertex2d(i*30,j);
                    }
                }
        gl.glEnd();
        gl.glPopMatrix();
        gl.glFlush();
    }
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged){}
}

