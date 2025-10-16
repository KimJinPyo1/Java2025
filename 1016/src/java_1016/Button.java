package java_1016;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch()
	{
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}

}
