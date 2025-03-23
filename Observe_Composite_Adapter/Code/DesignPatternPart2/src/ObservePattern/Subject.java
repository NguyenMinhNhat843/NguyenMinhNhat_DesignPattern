package ObservePattern;

interface Subject {
	void attach(Observe observe);
	void detach(Observe observe);
	void notify(String titleNotify);
}
