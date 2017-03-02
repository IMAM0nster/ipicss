import ssm.Service.MongoDBService;
import ssm.Service.MongoDBServiceImpl;


import java.io.File;

/**
 * Created by fyyzyh on 2017/3/2.
 */
public class Test {
    public static void main(String[] args) {
        MongoDBService mongoDB = new MongoDBServiceImpl();
        File file = new File("D:\\test.jpg");
        if(file != null){
            mongoDB.insertFile("gridfs", "fs", file.getName(), file);
        }
        return;
    }
}
