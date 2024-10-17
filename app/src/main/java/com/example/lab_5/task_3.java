package com.example.lab_5;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;

public class task_3 extends FragmentActivity implements
        LoaderManager.LoaderCallbacks<Cursor> {

    TextView resultView = null;
    CursorLoader cursorLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_3);
        resultView = findViewById(R.id.res);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onClickDisplayNames(View view) {
        getSupportLoaderManager().initLoader(1, null, this);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        cursorLoader = new CursorLoader(this,
                Uri.parse("content://com.example.lab_5.MyProvider/cte"),
                null, null, null, null);
        return cursorLoader;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            StringBuilder res = new StringBuilder();
            while (!cursor.isAfterLast()) {
                int idIndex = cursor.getColumnIndex("id");
                int nameIndex = cursor.getColumnIndex("name");

                res.append("\n").append(cursor.getString(idIndex))
                        .append(" - ").append(cursor.getString(nameIndex));
                cursor.moveToNext();
            }
            resultView.setText(res.toString());
        }
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        // Clear the data in resultView or handle reset if necessary
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
