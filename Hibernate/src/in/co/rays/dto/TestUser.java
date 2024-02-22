package in.co.rays.dto;

public class TestUser {
	public static void main(String[] args) throws Exception {

		//testAdd();
		// testUpdate();
		// testDelete();
		testAuthenticate();

	}

	private static void testAuthenticate() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticateByCriteria("lavish@gmail.com", "lavish@1");

		if (dto != null) {
			System.out.println(dto.getId());

			System.out.println(dto.getName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());

			System.out.println(dto.getAddress());
		} else {
			System.out.println("Authentication failed..!!");
		}

	}

	private static void testDelete() throws Exception {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		UserModel model = new UserModel();
		model.delete(dto);
	}

	private static void testUpdate() throws Exception {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setName("lokesh");
		dto.setLoginId("lavish@gmail.com");
		dto.setPassword("lavish@1");
		dto.setAddress("bhopal");
		UserModel model = new UserModel();
		model.update(dto);

	}

	private static void testAdd() throws Exception {

		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setName("lavish");
		dto.setLoginId("lavish@gmail.com");
		dto.setPassword("lavish@1");
		dto.setAddress("bhopal");
		UserModel model = new UserModel();
		model.add(dto);

	}
}
