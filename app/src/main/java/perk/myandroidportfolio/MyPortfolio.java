package perk.myandroidportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    public void onClickSpotifyStreamer(View v){
        Toast.makeText(this, "This button will launch my Spotify Streamer app", Toast.LENGTH_SHORT).show();
    }

    /***
     * onClick for btnScoresApp
     * @param v
     */
    public void onClickScoresApp(View v){
        Toast.makeText(this,"This button will launch my Scores app", Toast.LENGTH_SHORT).show();
    }

    /***
     * onClick for btnLibraryApp
     * @param v
     */
    public void onClickLibraryApp(View v){
        Toast.makeText(this,"This button will launch my Library app", Toast.LENGTH_SHORT).show();
    }

    /***
     * onClick for btnBuildItBigger
     * @param v
     */
    public void onClickBuildItBigger(View v){
        Toast.makeText(this,"This button will launch my Build It Bigger app", Toast.LENGTH_SHORT).show();
    }

    /***
     * onClick for btnXYZReader
     * @param v
     */
    public void onClickXYZReader(View v){
        Toast.makeText(this, "This button will launch my XYZ Reader app", Toast.LENGTH_SHORT).show();
    }

    /***
     * onClick for btnCapstone
     * @param v
     */
    public void onClickCapstone(View v){
        Toast.makeText(this,"This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
    }
}
