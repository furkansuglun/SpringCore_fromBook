package _11.Configuration.Bean.Annotation;

public class HelloImpl implements Hello  {

	@Override
	public void sendMessage(String mesaj) {
		System.out.println(mesaj + " /n Furkan.SÜðlün");
	}

}
