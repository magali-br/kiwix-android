package org.kiwix.kiwixmobile.intro;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class IntroPagerAdapter extends PagerAdapter {
  private View views[];

  IntroPagerAdapter(View views[]) {
    this.views = views;
  }

  @Override
  public int getCount() {
    return views.length;
  }

  @NonNull
  @Override
  public Object instantiateItem(@NonNull ViewGroup container, int position) {
    container.addView(views[position]);
    return views[position];
  }

  @Override
  public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((View) object);
  }

  @Override
  public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
    return view == object;
  }
}
