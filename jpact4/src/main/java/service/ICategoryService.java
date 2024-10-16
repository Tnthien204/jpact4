package service;

import java.util.List;
import entity.Category;

public interface ICategoryService {

	void insert(Category category);
	int count();
	List<Category> findAll(int page, int pagesize);
	List<Category> searchByName(String keyword);
	List<Category> findAll();
	Category findById(int id);
	void delete(int cateid);
	void update(Category category);
	Category findByCategoryname(String name);
}