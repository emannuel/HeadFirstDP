package br.com.emannuel.dd.push.manualmente;

public interface Subject {
	
	public void addListener(WhaterListener listener);
	public void removeListener(WhaterListener listener);
	public void notifyListeners();

}
