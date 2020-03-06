package collegelearning;

public class Main {
	public static void main(String[] args) throws Exception{
		Discoverer d=new Discoverer("192.168.100.255","PEER1",9999);
		Server server = new Server();
		server.start();
	
		System.out.println("[SERVER STARTED] : Press Enter To Stop");
		
		d.startDiscoverer();
		try {
			System.in.read();
			server.stop();	
			System.out.println("[SERVER STOPED]");
		}catch(Exception e) {
			//do nothing
		}
		
	}
}