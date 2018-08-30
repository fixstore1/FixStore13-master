package nti.com.fixstore11.presenter.presenter;

import nti.com.fixstore11.model.entities.HandyMan;

public interface SignUpHandymanPresenter {

    boolean insert(HandyMan handyMan);

    boolean validate(HandyMan handyMan);

}
