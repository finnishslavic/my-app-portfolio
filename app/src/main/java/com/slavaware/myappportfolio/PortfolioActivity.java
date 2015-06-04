package com.slavaware.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PortfolioActivity extends ActionBarActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_portfolio);

    ButterKnife.inject(this);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_portfolio, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @OnClick({R.id.btn_spotify, R.id.btn_scores, R.id.btn_library,
      R.id.btn_bigger, R.id.btn_beacon, R.id.btn_own})
  public void onButtonClicked(Button button) {
    showAppToast(button.getText().toString());
  }

  private void showAppToast(String appName) {
    final String toastText = getString(R.string.toast_template_format, appName);
    Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
  }
}
