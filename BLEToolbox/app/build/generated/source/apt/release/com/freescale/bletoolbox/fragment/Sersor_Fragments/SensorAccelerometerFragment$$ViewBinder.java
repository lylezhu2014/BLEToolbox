// Generated code from Butter Knife. Do not modify!
package com.freescale.bletoolbox.fragment.Sersor_Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SensorAccelerometerFragment$$ViewBinder<T extends com.freescale.bletoolbox.fragment.Sersor_Fragments.SensorAccelerometerFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493109, "field 'lineChart'");
    target.lineChart = finder.castView(view, 2131493109, "field 'lineChart'");
    view = finder.findRequiredView(source, 2131493108, "field 'tvAcclerometterStart'");
    target.tvAcclerometterStart = finder.castView(view, 2131493108, "field 'tvAcclerometterStart'");
    view = finder.findRequiredView(source, 2131493136, "field 'xAxis'");
    target.xAxis = finder.castView(view, 2131493136, "field 'xAxis'");
    view = finder.findRequiredView(source, 2131493135, "field 'xAxisColor'");
    target.xAxisColor = finder.castView(view, 2131493135, "field 'xAxisColor'");
    view = finder.findRequiredView(source, 2131493138, "field 'yAxis'");
    target.yAxis = finder.castView(view, 2131493138, "field 'yAxis'");
    view = finder.findRequiredView(source, 2131493137, "field 'yAxisColor'");
    target.yAxisColor = finder.castView(view, 2131493137, "field 'yAxisColor'");
    view = finder.findRequiredView(source, 2131493140, "field 'zAxis'");
    target.zAxis = finder.castView(view, 2131493140, "field 'zAxis'");
    view = finder.findRequiredView(source, 2131493139, "field 'zAxisColor'");
    target.zAxisColor = finder.castView(view, 2131493139, "field 'zAxisColor'");
  }

  @Override public void unbind(T target) {
    target.lineChart = null;
    target.tvAcclerometterStart = null;
    target.xAxis = null;
    target.xAxisColor = null;
    target.yAxis = null;
    target.yAxisColor = null;
    target.zAxis = null;
    target.zAxisColor = null;
  }
}
