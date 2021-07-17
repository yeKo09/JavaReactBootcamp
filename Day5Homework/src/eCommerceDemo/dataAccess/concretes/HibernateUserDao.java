package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " hibernate ile veri tabanýna eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " hibernate ile veri tabanýndan silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " hibernate ile güncellendi.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
