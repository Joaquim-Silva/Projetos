
					
		System.out.print("Bem Vindo a MIIJ Games, A maior loja de Games da internet!\n");
			
		while(continua2) {
			
			System.out.printf("Digite seu nome: \n");
			comprador[0] = read.nextLine();
			System.out.printf("Digite seu CPF: \n");
			comprador[1] = read.nextLine();
			
			
		System.out.printf("Temos os seguintes produtos a sua disposição: \n");
		
		for(x=0;x<10;x++) {
			System.out.printf("\n %d - %s o valor do produto R$ %.2f em estoque %d",(x+1),mercadoria[x],preco[x],unidades[x]);
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!\n");
		
		
		
		boolean continua = true;
		while (continua) {
			System.out.print("Digite o Código do produto que deseja comprar\n");
			codigo = read.nextInt();
			if (codigo >= 1 && codigo <= 10) {
				codigo--;
				 for(x=0;x<10;x++) {
					 if (codigo == x && unidades[x] ==0) {
						 System.out.print("\nO produto não está disponível no estoque!\n");
					 }
					 else if (codigo == x ) {
						  
						 qntd = 0;
						 while(qntd >10 || qntd<1) {
							 System.out.print("\nDigite a Quantidade que deseja\n");
							 qntd = read.nextInt();
							 if (qntd >10 || qntd <1) {
								 System.out.print("\nDigite uma quantidade válida de estoque [1-10].\n");
							 }
							 
						 }
						 
					 
	
	

