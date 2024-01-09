package spring.desserts.model;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EventsModel {

	@Inject
	@Named("sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	public List<Map<String, Object>> findAll() throws Exception {
		List<Map<String, Object>> results = sqlSession.selectList("List.findEventsAll");
		return results;
	}
}
