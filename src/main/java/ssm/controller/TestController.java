package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.Service.MongoDBService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by fyyzyh on 2017/3/2.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private MongoDBService mongoDBService;

    @RequestMapping("getPic")
    public void testMongoDBGetPic(HttpServletResponse response){
        InputStream inputStream = mongoDBService.getFileStream("gridfs", "fs", "test.jpg");
        response.setContentType("img/jpg");
        try {
            OutputStream outputStream = response.getOutputStream();
            int len = 0;
            byte[] buf = new byte[1024];
            while((len = inputStream.read(buf, 0, 1024))!=-1){
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


