import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMahasiswaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Input Mahasiswa");

        // === Elemen Form ===
        Label lblNama = new Label("Nama:");
        TextField txtNama = new TextField();

        Label lblNim = new Label("NIM:");
        TextField txtNim = new TextField();

        Label lblJurusan = new Label("Jurusan:");
        TextField txtJurusan = new TextField();

        Label lblUmur = new Label("Umur:");
        TextField txtUmur = new TextField();

        Label lblTgl = new Label("Tanggal Lahir (dd-MM-yyyy):");
        TextField txtTgl = new TextField();

        Label lblSkills = new Label("Skills (pisahkan dengan koma):");
        TextField txtSkills = new TextField();

        Button btnSimpan = new Button("Simpan");

        TextArea txtOutput = new TextArea();
        txtOutput.setEditable(false);
        txtOutput.setPrefHeight(150);

        // === Layout ===
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(lblNama, 0, 0); grid.add(txtNama, 1, 0);
        grid.add(lblNim, 0, 1); grid.add(txtNim, 1, 1);
        grid.add(lblJurusan, 0, 2); grid.add(txtJurusan, 1, 2);
        grid.add(lblUmur, 0, 3); grid.add(txtUmur, 1, 3);
        grid.add(lblTgl, 0, 4); grid.add(txtTgl, 1, 4);
        grid.add(lblSkills, 0, 5); grid.add(txtSkills, 1, 5);
        grid.add(btnSimpan, 1, 6);
        grid.add(txtOutput, 0, 7, 2, 1);

        // === Aksi Tombol Simpan ===
        btnSimpan.setOnAction(e -> {
            try {
                String nama = txtNama.getText().trim();
                String nim = txtNim.getText().trim();
                String jurusan = txtJurusan.getText().trim();
                String umurText = txtUmur.getText().trim();
                String tglText = txtTgl.getText().trim();
                String skillsText = txtSkills.getText().trim();

                // Cek input kosong
                if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty()
                        || umurText.isEmpty() || tglText.isEmpty() || skillsText.isEmpty()) {
                    showAlert("Lengkapi data anda !");
                    return;
                }

                // Validasi nama hanya huruf dan spasi
                if (!nama.matches("[a-zA-Z ]+")) {
                    showAlert("Nama hanya boleh mengandung huruf dan spasi!");
                    return;
                }

                // Validasi umur numerik
                int umur;
                try {
                    umur = Integer.parseInt(umurText);
                } catch (NumberFormatException ex) {
                    showAlert("Umur harus berupa angka!");
                    return;
                }

                // Parsing tanggal lahir
                Date tglLahir;
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    sdf.setLenient(false);
                    tglLahir = sdf.parse(tglText);
                } catch (ParseException ex) {
                    showAlert("Format tanggal salah! Gunakan format dd-MM-yyyy");
                    return;
                }

                // Pisahkan skills
                String[] skills = skillsText.split(",");

                // Buat objek Mahasiswa (menggunakan class dari Worksheet 6)
                Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, umur, tglLahir, skills);

                // Tampilkan hasil
                txtOutput.setText("=== Data Mahasiswa ===\n"
                        + "Nama: " + mhs.getNama() + "\n"
                        + "NIM: " + mhs.getNim() + "\n"
                        + "Jurusan: " + mhs.getJurusan() + "\n"
                        + "Umur: " + mhs.getUmur() + "\n"
                        + "Tanggal Lahir: " + mhs.getTglLahir() + "\n"
                        + "Skills: " + String.join(", ", mhs.getSkills()));

            } catch (Exception ex) {
                showAlert("Terjadi kesalahan: " + ex.getMessage());
            }
        });

        // === Scene Setup ===
        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // === Method Alert ===
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Validasi Gagal");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
