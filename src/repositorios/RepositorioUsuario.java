package repositorios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import entidades.Usuario;

public class RepositorioUsuario {
	public boolean cadastro(String email, String senha, String nome) {
		try {
			FileReader fr = new FileReader("cadastros.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				if(line.equals(email)) {
					br.close();
					return false;
				}
			}
			br.close();
		} catch (Exception e) {
			return true;
		}
		try {
			FileWriter fw = new FileWriter("cadastros.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(email);
			bw.newLine();
			bw.write(senha);
			bw.newLine();
			bw.write(nome);
			bw.newLine();
			bw.write("0");
			bw.newLine();
			bw.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean login(String email, String senha) {
		try {
			FileReader fr = new FileReader("cadastros.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				if(line.equals(email)) {
					line = br.readLine();
					if(line.equals(senha)) {
						br.close();
						return true;
					}
					else {
						br.close();
						return false;
					}
				}
			}
			br.close();
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Usuario buscar(String email) {
		try {
			FileReader fr = new FileReader("cadastros.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				if(line.equals(email)) {
					String senha = br.readLine();
					String nome = br.readLine();
					line = br.readLine();
					int pontos = Integer.parseInt(line);
					Usuario user = new Usuario(email, senha, nome, pontos);
					br.close();
					return user;
				}
			}
			br.close();
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean pontuacao(String email) {
		try {
			ArrayList<String> elementos = new ArrayList<>();
			FileReader fr = new FileReader("cadastros.txt");
			BufferedReader br = new BufferedReader(fr);		
			String line;
			while((line = br.readLine()) != null) {
					elementos.add(line);
			}
			try {
			FileWriter fw = new FileWriter("cadastros.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String pontuacao;
				
			int valor = 1;
			for(int i = 0; i < elementos.size(); i+=4) {
				if(elementos.get(i).equals(email)) {
					pontuacao = elementos.get(i+3);
					int pontos = Integer.parseInt(pontuacao);
					pontos = pontos + valor;
					if(pontos < 30) {
						pontuacao = Integer.toString(pontos);
						elementos.set(i+3, pontuacao);
						break;
					}
					else {
						pontos = pontos - 30;
						pontuacao = Integer.toString(pontos);
						elementos.set(i+3, pontuacao);
					}
				}
			}		        
				String qqqq = elementos.toString();		  
		        bw.write(qqqq.replace(",", "\n").replace(" ", "").replace("[", "").replace("]", ""));
		        bw.newLine();
	        	bw.close();
				br.close();
				
			}
			catch(IOException e) {
				System.out.println("ERRO");
			}			
			return true;
		}
		catch(IOException e) {
			System.out.println("ERRO");
			return false;
		}
	}
}
