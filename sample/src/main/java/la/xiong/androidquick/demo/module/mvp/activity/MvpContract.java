package la.xiong.androidquick.demo.module.mvp.activity;

import la.xiong.androidquick.demo.base.BaseModel;
import la.xiong.androidquick.demo.base.BasePresenter;
import la.xiong.androidquick.demo.base.BaseView;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface MvpContract {
    interface Model extends BaseModel {

    }

    interface View extends BaseView {
        void refreshView(String result);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void initData();
    }
}