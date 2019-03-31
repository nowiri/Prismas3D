package logic;

public class constRomboidal {
	public static void main(String[] args) {
	double x1 = 4;
	double y1 = 4;
	float alt = 4;
	float D = 3;
	float d = 3;
	
	double x2 = x1 - (d/2);
	double y2 = y1 - (D/2);
	double x3 = x1;
	double y3 = y1 - D;
	double x4 = x1 + (d/2);
	double y4 = y2;
	
	/* double x2 = x1 - (dis/Math.sqrt(2));
	double y2 = y1 - (dis/Math.sqrt(2));
	double x3 = x1;
	double y3 = y2 - (dis/Math.sqrt(2));
	double x4 = x1 + (dis/Math.sqrt(2));
	double y4 = y2; */
	
	StdDraw3D.setScale(-10,10);
    //   StdDraw3D.setCameraDirection(x, y, z);
    StdDraw3D.setCameraPosition(((x1+x3)/2),((y1+y3)/2),alt/2);
    StdDraw3D.setOrbitCenter(((x1+x3)/2),((y1+y3)/2),alt/2);
    StdDraw3D.setCameraPosition(((x1+x3)/2),((y1+y3)/2),alt*3);
    StdDraw3D.setPenColor(StdDraw3D.randomColor());
    StdDraw3D.setInfoDisplay(false);
    
    double xb1[] = new double[]{x1,x2,x3,x4};
    double yb1[] = new double[]{y1,y2,y3,y4};
    double zb1[] = new double[]{0,0,0,0};
    StdDraw3D.polygon(xb1,yb1,zb1);
    double xb2[] = new double[]{x1,x2,x3,x4};
    double yb2[] = new double[]{y1,y2,y3,y4};
    double zb2[] = new double[]{alt,alt,alt,alt};
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
    double xl3[] = new double[]{x3,x4,x4,x3};
    double yl3[] = new double[]{y3,y4,y4,y3};
    double zl3[] = new double[]{0,0,alt,alt};
    StdDraw3D.setPenColor(StdDraw3D.randomColor());
    StdDraw3D.polygon(xl3,yl3,zl3);
    double xl4[] = new double[]{x4,x1,x1,x4};
    double yl4[] = new double[]{y4,y1,y1,y4};
    double zl4[] = new double[]{0,0,alt,alt};
    StdDraw3D.setPenColor(StdDraw3D.randomColor());
    StdDraw3D.polygon(xl4,yl4,zl4);
    StdDraw3D.finished();


	}

}