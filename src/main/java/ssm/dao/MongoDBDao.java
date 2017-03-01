package ssm.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.File;
import java.io.InputStream;

/**
 * Created by fyyzyh on 2017/3/1.
 */
public interface MongoDBDao {
    MongoDatabase getDatabase(String name);
    MongoCollection<Document> getCollection(String dbName, String collectionName);

    void insertContent(String dbName, String collectionName, Object key, String content);
    String getContent(String dbName, String collectionName, Object key);
    void insertFile(String dbName, String bucketName, String fileName, File file);
    InputStream getFileStream(String dbName, String bucketName, String fileKey);
}
