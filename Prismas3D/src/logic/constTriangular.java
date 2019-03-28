package logic;

public class constTriangular {

	public static void main(String[] args) {
		double x1 = 4;
		double y1 = 4;
		double x3 = 6;
		double y3 = 13;
		float alt = 3;
		float base = 5;
		
		double x2 = x1+base;
		double y2 = y1;
		
		StdDraw3D.setScale(-10,10);
	    StdDraw3D.setOrbitCenter(((x1+x2)/2),((y1+y3)/2),alt/2);
	    StdDraw3D.setCameraPosition(((x1+x2)/2),((y1+y3)/2),alt*3);
	    StdDraw3D.setPenColor(StdDraw3D.randomColor());
	    StdDraw3D.setInfoDisplay(false);
	    
	    double xb1[] = new double[]{x1,x2,x3};
	    double yb1[] = new double[]{y1,y2,y3};
	    double zb1[] = new double[]{0,0,0};
	    StdDraw3D.polygon(xb1,yb1,zb1);
	    double xb2[] = new double[]{x1,x2,x3};
	    double yb2[] = new double[]{y1,y2,y3};
	    double zb2[] = new double[]{alt,alt,alt};
	    StdDraw3D.setPenColor(StdDraw3D.randomColor());
	    StdDraw3D.polygon(xb2,yb2,zb2);
	    double xl1[] = new double[]{x1,x2,x2,x1};
	    double yl1[] = new double[]{y1,y2,y2,y1};
	    double zl1[] = new double[]{0,0,alt,alt};
	    StdDraw3D.setPenColor(StdDraw3D.randomColor());
	    StdDraw3D.polygon(xl1,yl1,zl1);
	    double xl2[] = new double[]{x2,x3,x3,x2};
	    double yl2[] = new double[]{y2,y3,y3,y2};
	    double zl2[] = new double[]{0,0,alt,alt};
	    StdDraw3D.setPenColor(StdDraw3D.randomColor());
	    StdDraw3D.polygon(xl2,yl2,zl2);
	    double xl3[] = new double[]{x3,x1,x1,x3};
	    double yl3[] = new double[]{y3,y1,y1,y3};
	    double zl3[] = new double[]{0,0,alt,alt};
	    StdDraw3D.setPenColor(StdDraw3D.randomColor());
	    StdDraw3D.polygon(xl3,yl3,zl3);
	    StdDraw3D.finished();

	}

}
