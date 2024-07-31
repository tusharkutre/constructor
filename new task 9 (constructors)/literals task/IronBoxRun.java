class IronBoxRun{
	
	public static void main(String[] args){
		

		IronBox ref = new IronBox();
				//inistialization of instance variable
		String refBrand = ref.brand;
		double refPrice = ref.price;
		System.out.println("The brand is : "+refBrand);
		System.out.println("The rate is:" +refPrice);
		
		refBrand = "new brand";
		refPrice = 500;
		
		System.out.println("The brand is : "+refBrand);
		System.out.println("The rate is:" +refPrice);
		
		//re-inistialization of instance variable by allocating it to new memory location
		IronBox ref1 = new IronBox();
		
		//ref1 is currently holding updated values
		ref1.brand = "philips";
		ref1.price = 3000;
		
		//the ref1 is now pointing to the old reference of its memory location/address
		//ref1=ref; //ref1--->ref
		
			System.out.println("The brand is : "+	ref1.brand);
		System.out.println("The rate is:" +ref1.price);
		
}
}