package ssm.Service;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.InputStream;

/**
 * Created by fyyzyh on 2017/3/1.
 */
public interface MongoDBService {
    void insertContent(String dbName, String collectionName, Object key, String content);
    String getContent(String dbName, String collectionName, Object key);
    void insertFile(String dbName, String bucketName, String fileName, File file);
    InputStream getFileStream(String dbName, String bucketName, String fileName);
}
