package drawline;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
 
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class drawingline extends JFrame{


	Scanner in=new Scanner(System.in);
    
	
	 
	/**
	 * This program demonstrates how to draw lines using Graphics2D object.
	 * @author www.codejava.net
	 *
	 */
	 
	 
	    public drawingline() {
	        super("Lines Drawing Demo");
	      //  System.out.println("enter the length and breadth of frame");
	       // int x=in.nextInt();
	       // int y=in.nextInt();
	        setSize(500, 500);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	    }
	 
	    void drawLines(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g;
	        System.out.println("enter the line 1: x1 and y1 and x2 and y2 ");
	        int x1=100;
	        int y1=100;
	        int x2=400;
	        int y2=400;//in.nextInt();
	        g2d.drawLine(100, 100, 400, 400);
	        g2d.drawString("line1", 100, 100);
	        int a1=y1-y2;
	        int b1=x2-x1;
	        int c1=(((x1-x2)*(y1)) + (y2-y1)*(x1));
	        
	        System.out.println("a , b ,c:" +a1 +" " +b1 +" " +c1);
	        
	    	
	        System.out.println("enter the line 2: x3 and y3 and x4 and y4 ");
	        int x3=100;//in.nextInt();
	        int y3=400;//in.nextInt();
	        int x4=400;//in.nextInt();
	        int y4=100;//in.nextInt();
	       
	        g2d.drawLine(100, 400, 400, 100);
	        g2d.drawString("line2", 100, 400);
	        int a2=y3-y4;
	        int b2=x4-x3;
	        int c2=(((x3-x4)*(y3)) + (y4-y3)*(x3));
	        
	        System.out.println("a2 , b2 ,c2:" +a2 +" " +b2 +" " +c2);
	  /* for(;;)
	   {
		   int ch;
		   System.out.println("enter ur choice 1.insert 2 display");
		    ch=in.nextInt();
		   switch(ch)
		   {
			   case 1:*/ System.out.println("enter the x and y of file");
			   			int x=350;//in.nextInt();
			   			int y=250;//in.nextInt();
			   			g2d.drawString("file", x, y );
			   			int ret1=(a1*x)+(b1*y)+c1;
			   			int ret2=(a2*x)+(b2*y)+c2;
			   			System.out.println("ret1:"+ret1);
			   			System.out.println("ret2:"+ret2);
			   			if ((ret1>0 && b1>0) ||(ret1<0 && b1<0))
			   				
			   				System.out.println("file above line 1");
			   			else System.out.println("file below line 1");
			   			
			   			if((ret2>0 && b2>0) || (ret2<0 && b2<0))
			   				System.out.println("file above line 2");
			   				else
			   					System.out.println("file below line 2");
			   			
			   			/*break;
			   case 2: break;
			   default: System.exit(0); 
		   }
	   }*/
	 //       g2d.drawString("file1", 350, 180 );
	  
	    }
	 
	    public void paint(Graphics g) {
	        super.paint(g);
	        drawLines(g);
	    }
	 
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new drawingline().setVisible(true);
	            }
	        });
	    }
	}
