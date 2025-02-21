package vn.iotstart.btdemovd2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Lấy ID của layout và switch
        ConstraintLayout mainLayout = findViewById(R.id.main_layout);
        Switch switchBackground = findViewById(R.id.switch_background);

        // Xử lý sự kiện khi người dùng bật/tắt Switch
        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Nếu bật switch -> Đổi sang hình nền 1
                mainLayout.setBackgroundResource(R.drawable.bg2);
            } else {
                // Nếu tắt switch -> Đổi sang hình nền 2
                mainLayout.setBackgroundResource(R.drawable.bg1);
            }
        });
    }
}