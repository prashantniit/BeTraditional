package mobiletesting.betraditional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.io.File;
public class Camera extends AppCompatActivity {
    ImageButton image_button;
    ImageView image_view;
    static final int CAM_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState)    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        image_view =(ImageView)findViewById(R.id.imageView8);
        image_button = (ImageButton)findViewById(R.id.imageButton);
        image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {   Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File file = getFile();
                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                //Start the camera_intent activity which intializes the camera
                startActivityForResult(camera_intent, CAM_REQUEST);
            } });
    }
    public File getFile()    {
        //Create a new folder for captured images in the system’s SD card
        File folder = new File("sdcard/betraditional_app");
        if (!folder.exists())        {
            folder.mkdir();
        }
        File image= new File(folder,"Betraditional_img.jpg");
        return image;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        String path = "sdcard/betraditional_app/Betraditional_img.jpg";
        image_view.setImageDrawable(Drawable.createFromPath(path));
    }

    }












