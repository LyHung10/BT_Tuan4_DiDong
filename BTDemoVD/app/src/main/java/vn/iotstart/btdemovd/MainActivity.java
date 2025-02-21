package vn.iotstart.btdemovd;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Danh sách các hình nền
        int[] backgroundImages = {
                R.drawable.bg1,
                R.drawable.bg2,
                R.drawable.bg3
        };

        // Lấy Layout chính
        RelativeLayout mainLayout = findViewById(R.id.main_layout);

        // Chọn hình nền ngẫu nhiên
        Random random = new Random();
        int randomIndex = random.nextInt(backgroundImages.length);
        mainLayout.setBackgroundResource(backgroundImages[randomIndex]);
    }
}