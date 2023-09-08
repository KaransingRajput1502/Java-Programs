import java.io.DataInputStream;
import java.io.IOException;
class AreaAndSurface
{

	public static void main(String args[])
		{
	    int b,h;
	    float area;
	    	{
			try
				{
					System.out.println("\n\nArea of Triangle");
					DataInputStream d= new DataInputStream((System.in));
					System.out.println("\n\nEnter value for Base");
					String st=d.readLine();
				    System.out.println("\n\nEnter value for Height");
					String sh=d.readLine();
					b=Integer.parseInt(st);
					h=Integer.parseInt(sh);
					System.out.println("b="+b);
					System.out.println("h="+h);
					area=(b*h)/2;
					System.out.println("Area of triangle="+area);
			    }
			catch(IOException ioe){}
		    }
		    System.out.println("Wrong Input");


		    		int r;
						    double area1;
						    	{
								try
									{
										System.out.println("\n\nPerimeter of circle");
										DataInputStream d= new DataInputStream((System.in));
										System.out.println("\n\nEnter the radius");
										String st=d.readLine();
									    //System.out.println("\n\nEnter the same number radius");
										//String sh=d.readLine();
										r=Integer.parseInt(st);
										//r1=Integer.parseInt(sh);
										System.out.println("r="+r);
										//System.out.println("r1="+r1);
										area1=(3.14)*r*r;
										System.out.println("Area of circle="+area1);
								    }
								catch(IOException ioe){}
							    }


		    System.out.println("Wrong Input");

					int s;
											    double area2;
											    	{
													try
														{
															System.out.println("\n\nArea of square");
															DataInputStream d= new DataInputStream((System.in));
															System.out.println("\n\nEnter the side");
															String st=d.readLine();
														    //System.out.println("\n\nEnter the same number side");
															//String sh=d.readLine();
															s=Integer.parseInt(st);
															//s1=Integer.parseInt(sh);
															System.out.println("s="+s);
															//System.out.println("s1="+s1);
															area2=s*s;
															System.out.println("Area of square="+area2);
													    }
													catch(IOException ioe){}
												    }


		    System.out.println("Wrong Input");

		     int s1;
			 											    double area3;
			 											    	{
			 													try
			 														{
																		System.out.println("\n\nVolume of Square");
			 															DataInputStream d= new DataInputStream((System.in));
			 															System.out.println("\n\nEnter the side");
			 															String st=d.readLine();
			 														    //System.out.println("\n\nEnter the same number side");
			 															//String sh=d.readLine();
			 															s1=Integer.parseInt(st);
			 															//s1=Integer.parseInt(sh);
			 															System.out.println("s1="+s1);
			 															//System.out.println("s1="+s1);
			 															area3=s1+s1+s1+s1;
			 															System.out.println("volume of square="+area3);
			 													    }
			 													catch(IOException ioe){}
			 												    }


		    System.out.println("Wrong Input");


		    	 int l,w,h1;
							 double area4;
							 			{
							 			try
							 				{
											System.out.println("\n\nArea of Rectangle");
							 				DataInputStream d= new DataInputStream((System.in));
							 				System.out.println("\n\nEnter the lenth");
							 				String st=d.readLine();
							 				System.out.println("\n\nEnter the width");
							 				String sh=d.readLine();
							 				System.out.println("\n\nEnter the height1");
							 				String sp=d.readLine();
							 				l=Integer.parseInt(st);
							 				w=Integer.parseInt(sh);
							 				h1=Integer.parseInt(sp);
							 				System.out.println("l="+l);
							 				System.out.println("w="+w);
							 				System.out.println("h1="+h1);
							 				area4=l*w;
							 				System.out.println("volume of square="+area4);
							 				}
							 				catch(IOException ioe){}
							 			}


		    System.out.println("Wrong Input");

		    	int rr;
					    double area5;
					    	{
							try
								{
									System.out.println("\n\nArea of semicircle");
									DataInputStream d= new DataInputStream((System.in));
									System.out.println("\n\nEnter value for Base");
									String st=d.readLine();
								    //System.out.println("\n\nEnter value for Height");
									//String sh=d.readLine();
									rr=Integer.parseInt(st);
									//h=Integer.parseInt(sh);
									System.out.println("rr="+rr);
									//System.out.println("h="+h);
									area5=3.14*rr*rr/2;
									System.out.println("Area of semicircle="+area5);
							    }
							catch(IOException ioe){}
						    }
		    System.out.println("Wrong Input");


		}

}

