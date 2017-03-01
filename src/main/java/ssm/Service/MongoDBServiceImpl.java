package ssm.Service;

import ssm.dao.MongoDBDao;

import javax.annotation.Resource;
import java.io.File;
import java.io.InputStream;

/**
 * Created by fyyzyh on 2017/3/1.
 */
public class MongoDBServiceImpl implements MongoDBService {
    @Resource
    private MongoDBDao mongoDBDao;


    public void insertContent(String dbName, String collectionName, Object key, String content) {
        mongoDBDao.insertContent(dbName, collectionName, key, content);
        return;
    }

    public String getContent(String dbName, String collectionName, Object key) {
        return mongoDBDao.getContent(dbName, collectionName, key);
    }

    public void insertFile(String dbName, String bucketName, String fileName, File file) {
        mongoDBDao.insertFile(dbName, bucketName, fileName, file);
    }

    public InputStream getFileStream(String dbName, String bucketName, String fileKey) {
        return mongoDBDao.getFileStream(dbName, bucketName, fileKey);
    }
}
