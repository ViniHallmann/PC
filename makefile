all: 
	@echo "Executando o compilador Lugosi..."
	javacc Lugosi.jj
	javac *.java
	java Lugosi Testes/Trab2/fatorial.lug
	java Lugosi Testes/Trab2/ehprimo.lug
	java Lugosi Testes/Antigos/teste1.lug
	java Lugosi Testes/Antigos/teste2.lug
	java Lugosi Testes/Antigos/teste3.lug
	java Lugosi Testes/Antigos/teste4.lug
	@echo "Removendo arquivos compilados..."
	rm -f *.class ast/*.class LugosiTokenManager.java
	rm -f *.java
