package services;

import java.util.List;

import dao.IVideoDao;
import dao.impl.VideoDao;
import entity.Video;

public interface IVideoService {

	Video findByTitle(String title);

	void update(Video video);

	void delete(String vidid) throws Exception;

	Video findById(String vidid);

	List<Video> findAll();

	List<Video> searchByTitle(String title);

	List<Video> findAll(int page, int pagesize);

	int count();

	void insert(Video video);

	IVideoDao viddao = new VideoDao();

}