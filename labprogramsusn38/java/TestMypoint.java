package labprogramsusn38.java;
class Mypoint{
	private int x;
	private int y;
	
	public Mypoint() {
		this.x=0;
		this.y=0;
	}
	public Mypoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
		public void setXY(int x,int y) {
			this.x=x;
			this.y=y;
		}
			public int[] getXY() {
				return new int[]{this.x,this.y};
			}
			@Override
			public String toString() {
				return "("+this.x+","+this.y+")";
			}
			public double distance(int x,int y) {
			int	dx=this.x=x;
			int dy=	this.y=y;
			return Math.sqrt(dx*dx+dy*dy);
			}
			public double distance(Mypoint another) {
				int	dx=this.x-another.x;
				int dy=	this.y-another.y;
				return Math.sqrt(dx*dx+dy*dy);
			}
			public double distance() {
				return Math.sqrt(this.x*this.x+this.y*this.y);
			}
		}
public class TestMypoint {

	public static void main(String[] args) {
		Mypoint p1= new Mypoint();
		System.out.println("p1:"+p1);
		
		Mypoint p2= new Mypoint(-5,6);
		System.out.println("p2:"+p2);
		
		p1.setXY(2, 0);
		int[] coords=p1.getXY();
		System.out.println("p1 new coordinates:" +"("+coords[0]+","+coords[1]+")");
		System.out.println("Distance from p1 to(7,8):"+p1.distance(7,8));
		System.out.println("Distance from p1 to p2:"+p1.distance(p2));
		System.out.println("Distance from p1 to origin :"+p1.distance());

	}

}
