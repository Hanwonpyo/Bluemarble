package bluemarbel;

import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser
{
	
	private JSONObject json_data=new JSONObject();
	private JSONParser parser = new JSONParser();
	private static JsonParser Json_parser= new JsonParser();
		
	public static JsonParser getInstance()
	{
		return Json_parser;
	}
	public void parsing(String json_string) throws ParseException
	{
		json_data=new JSONObject();
		
		try {
			json_data=(JSONObject)parser.parse(json_string);
			System.out.println(json_data.get("code"));
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Selector.getInstance().select(json_data);
	}
}
	//json_Data=(JSONObject) parser.parse(json_string);

	// 3. Buy버튼 눌렀을 떄, 시티정보랑 유저정보 받아와서 업데이트
