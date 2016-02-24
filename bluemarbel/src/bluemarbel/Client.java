package bluemarbel;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.json.simple.JSONObject;

public class Client {
	
	private String id;
	private String ip;
	private Socket socket;

	private JSONObject data= new JSONObject();
	
	private InputStream is;
	private DataInputStream dis;
	private OutputStream os;
	private DataOutputStream dos;

	
	Client(String id,String ip)
	{
		this.id=id;
		this.ip="165.194.33.133";
		try {
			socket = new Socket("165.194.33.133",7777);
			is=socket.getInputStream();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try {
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			send_message("client",id);
		} catch (Exception e) {
			}
	}
	public void send_message(String code, String body)
	{
		data.clear();
		data.put("code", code);
		data.put("body", body);
		try {
			dos.writeUTF(data.toJSONString());
		} catch (IOException e) {
		
		}
	}
}
