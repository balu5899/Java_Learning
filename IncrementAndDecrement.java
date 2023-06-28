package Java;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		
		//++ and --
		
		//Post increment
		
		int a = 1;
		int b = a++;
		
		
		 System.out.println(a); //2
		 System.out.println(b);//1
		 
		 
		int l = 3;
		int m = l++;
		System.out.println(l);//4
		System.out.println(m);//3
				
		int p=-98;
		int q= p++;
		System.out.println(p); //-97
		System.out.println(q);  //-98
		
		
		
		//Pre increment
		
		int u=1;
		int y= ++u;
		System.out.println(u);//2
		System.out.println(y);//2
		
		int x=5;
		int z= ++x;
		System.out.println(x);//6
		System.out.println(z);//6
		
		int v= -99;
		int vv= ++v;
		System.out.println(v);//-98
		System.out.println(vv);//-98
		
		int pop =2;
		System.out.println(pop++);//2
		System.out.println(pop);//3
		
		int amount =10;
		int finalAmount= amount+4;
		System.out.println(finalAmount);//14
		
		
		//Post decrement.
		
		int tt=2;
		int pp=tt--;
		System.out.println(tt);//1
		System.out.println(pp);//2
		
		
		int rest= -99;
		int api = rest--;
		System.out.println(rest);//-100
		System.out.println(api);//-99
		
		
		//Pre Decrement
		
		
		int aa=2;
		int bb=--aa;
		System.out.println(aa);//1
		System.out.println(bb);//1
		
		int s1=-1000;
		int s2=--s1;
		System.out.println(s1);//-1001
		System.out.println(s2);//-1001  
		
		int s3= 40;
		System.out.println(s3--);//40
		System.out.println(s3);//39
		
		int p3=50;
		System.out.println(--p3);//49
		System.out.println(p3);//49

		int na= 1;
		int test =na ++ + na++ + na++ + na++;
		System.out.println(na);//5
		System.out.println(test);//10
		 
		
		int ba= 4;
		int info = ba+++ba+++ba+++ba+++ba;//4+5+6+7+8=30
		System.out.println(info);//30
		System.out.println(ba);//8
		
		int ca= 40;
		int ven= ca---ca---ca---ca;//40-39-38-37
		System.out.println(ven);//-74
		System.out.println(ca);//37
		
		int ea= -12;
		int reb= --ea+--ea+--ea+--ea;//-13+(-14)+-(15)+(-16)=-58
		System.out.println(reb);//-58
		System.out.println(ea);//-16
		
		int g= -34;
		int bala=--g+--g;//-35+(-36)=-
		System.out.println(bala);
				
		
		
		
		
		
	}

}
