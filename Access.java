class A
{
        int i;
        protected int j;
        void setij(int x,int y)
        {
                i = x;
                j = y;
        }
}        
class B extends A
{
        int total;
        void sum()
        {
                  total = i + j;
        }
}
class C extends B
{
        int P;
        void show()
        {
                  System.out.println("p = " + p);  
                  System.out.println("Total = " + subOb.total);   
                  System.out.println("i and j = " + i + " and " + j);    
        }
}
class Access
{
         public static void main(String args[])
         {
                  B subOb = new B();
                  subOb.setij(10, 12);
                  subOb.sum();
                  System.out.println("Total is " + subOb.total);
                  
                  C c1 = new C();
                  c1.setij(5,6);
                  c1.sum();
                  c1.p = 20;
                  c1.show();
                  
         }     
}                                    
                      
