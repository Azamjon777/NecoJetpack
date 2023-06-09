// Generated by data binding compiler. Do not edit!
package lottostar.play.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import java.lang.Deprecated;
import java.lang.Object;
import lottostar.play.R;

public abstract class ActivityFirstBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView firstContainerWeb;

  protected ActivityFirstBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FragmentContainerView firstContainerWeb) {
    super(_bindingComponent, _root, _localFieldCount);
    this.firstContainerWeb = firstContainerWeb;
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_first, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFirstBinding>inflateInternal(inflater, R.layout.activity_first, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_first, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFirstBinding>inflateInternal(inflater, R.layout.activity_first, null, false, component);
  }

  public static ActivityFirstBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityFirstBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFirstBinding)bind(component, view, R.layout.activity_first);
  }
}
