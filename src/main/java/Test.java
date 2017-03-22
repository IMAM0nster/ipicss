import ssm.Service.MongoDBService;
import ssm.Service.MongoDBServiceImpl;


import java.io.File;

/**
 * Created by fyyzyh on 2017/3/2.
 */
public class Test {
    public static void main(String[] args) {
        MongoDBService mongoDB = new MongoDBServiceImpl();
        File file = new File("D:\\medPic");
        if(file.exists()){
            File[] files = file.listFiles();
            for(File pic:files){
                mongoDB.insertFile("ipicss", "medPic", pic.getName(), pic);
            }
        }
        return;
    }
}
