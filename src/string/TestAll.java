package string;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.PartSource;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

public class TestAll {

//		static File file = new File("D:/循环队列.png");
//		static File fi = new File("D:/aa.txt");
//		static File fo = new File("D:/test.png");
		
		private static final Logger log = LoggerFactory.getLogger(TestAll.class);
		static {
			
		}
		
		public static void main(String[] args) {
			try {
				
				HttpClient httpClient = new HttpClient();
				String token="14_6XFH0LpH9_jqRK7e8_G6mGl91Rja_K7WUDT7O2W9Zyb8Ne0Q9P4N0qxvZtQp2Dj-0_84dCPE3dgsBIxapDGLOh0pOshXfGYDcTKj1EK3H8bBOgMx2mxpR65ZWPcGCTdADATPG";
				String url = "https://api.weixin.qq.com/wxa/img_sec_check?access_token="+token;
				PostMethod method = new PostMethod(url);
				String spec="https://developers.weixin.qq.com/miniprogram/dev/api/open-api/sec-check/msgSecCheck.html";
				URL wxurl = new URL(spec);
				int len = 0;
				InputStream is = wxurl.openStream() ;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] b = new byte[1024];
				while((len=is.read(b))!=-1) {
					baos.write(b, 0, len);
				}
				
				byte[] content = baos.toByteArray();
				PartSource partSource = new ByteArrayPartSource("aa", content);
				Part[] parts = {new FilePart("aa", partSource )};
				RequestEntity requestEntity = new MultipartRequestEntity(parts , method.getParams());
				method.setRequestEntity(requestEntity );
				int returnCode = httpClient.executeMethod(method);
				String resbody = method.getResponseBodyAsString();
				JSONObject json = JSONObject.parseObject(resbody);
				System.out.println(returnCode);
				System.out.println(json.toString());
				
				
				
				
				
				
				
				
				
				
				
				
				
//				String str = null;
//				FileInputStream fis = new FileInputStream(file);
//				BufferedReader buff = new BufferedReader(new FileReader(fi));
//				StringBuilder b = new StringBuilder();
//				while((str=buff.readLine())!=null) {
////					System.out.println(buff.readLine());
//					System.out.println(str);
//					b.append(str);
//					
//				}
//				
//				
//				FileOutputStream fos = new FileOutputStream(fo);
//				byte[] all = new byte[(int) file.length()];
//				//from this input stream into an array of bytes
//				fis.read(all);
//				//from the specified byte array to this file output stream
//				fos.write(all);
//				fos.close();
//				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		    
			
			
}
}
	