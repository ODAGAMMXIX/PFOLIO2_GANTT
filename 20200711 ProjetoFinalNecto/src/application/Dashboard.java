package application;

public class Dashboard {

	public void refreshDashboard() {
		HoraProjeto refreshProjectsHours = new HoraProjeto();
		HoraUser refreshUserHours = new HoraUser();
		refreshProjectsHours.horaProjeto();
		refreshUserHours.horaUsuario();
		
	}

}
