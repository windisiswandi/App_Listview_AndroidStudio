package com.example.uts_pemrogramanmobile.model;

import com.example.uts_pemrogramanmobile.R;

import java.util.ArrayList;

public class DataFood {

    static ArrayList<Foods> foods = new ArrayList<>();

    public static ArrayList<Foods> getDataFoodByJenis (String jenis_food)
    {
        foods.clear();
        switch (jenis_food.toLowerCase()) {
            case "padang food":
                dataPadangFood(); break;
            case "lombok food":
                dataLombokFood(); break;
            case "palembang food":
                dataPalembangFood(); break;
            case "aceh food":
                dataAcehFood(); break;
        }

        return foods;
    }

   static void dataPadangFood()
   {
        foods.add(
            new Foods("Sate Padang", "Rp 35.000",
                    "Nama makanan khas Padang ini berasal dari tempat asalnya. Sate padang adalah sate khas dari Padang. Terbuat dari daging sapi yang dibakar disiram dengan kuah yang mirip dengan kuah kare.",
                    "Medium", R.drawable.sate_padang)
        );
       foods.add(
           new Foods("Dendeng Balado", "Rp 160.000",
                   "Dendeng terbuat dari daging sapi yang dikeringkan. Makanan yang ditemukan oleh masyarakat Minangkabau ini menjadi hidangan yang populer di nusantara. Dendeng balado dan dendeng batokok sejatinya sama.",
                   "Large", R.drawable.dendeng_balado_padang)
       );
       foods.add(
           new Foods("Soto Padang", "Rp 40.000",
                   "Soto merupakan sajian kuliner berkuah yang hampir ada di setiap penjuru nusantara. Salah satu varian soto yang cukup favorit di kalangan masyarakat adalah soto padang.",
                   "Medium", R.drawable.soto_padang)
       );
       foods.add(
           new Foods("Ikan Balado", "Rp 52.000",
                   "Ikan balado merupakan ikan yang dimasak dengan bumbu balado berisi cabe, tomat, jeruk nipis, bawang merah, garam, gula, dan air. Rasanya pedas manis, sangat cocok dengan kebanyakan lidah orang Indonesia.",
                   "Small", R.drawable.ikan_balado)
       );
    }

    static void dataLombokFood() {
        foods.add(
            new Foods("Pelecing Lombok", "Rp 10.000",
                    "Makanan khas Lombok Barat yang satu ini sudah cukup terkenal. Terbuat dari sayuran jenis kangkung lombok yang ukuran dan teksturnya lebih besar dari kangkung luar.",
                    "Small", R.drawable.pelecing_lombok)
        );
        foods.add(
            new Foods("Ayam Taliwang", "Rp 25.000",
                    "Kuliner ini sangatlah terkenal bahkan sampai ke luar Lombok. Satu porsi ayam utuh berlumurkan bumbu khas Lombok untuk ayam taliwang kemudian dimasak dengan cara dibakar ataupun digoreng, cocok disajikan dengan sepiring nasi hangat dan sambal khas Lombok.",
                    "Large", R.drawable.ayam_taliwang_lombok)
        );
        foods.add(
            new Foods("Sate Bulayak", "Rp 20.000",
                    "Sate bulayak merupakan sajian kuliner khas Lombok yang berisi sate dan bulayak. Bulayak merupakan sejenis ketupat namun bentuknya bulat panjang dan bungkusnya berasal dari daun aren.",
                    "Medium", R.drawable.sate_bulayak_lombok)
        );
        foods.add(
            new Foods("Nasi Campur", "Rp 10.000",
                    "Nasi campur merupakan makanan khas Lombok di Gili Trawangan yang dapat kamu coba apabila kamu menginap di sekitaran gili. Sepengelaman penulis, nasi campur merupakan makanan termurah yang dijual di gili khususnya Gili Trawangan.",
                    "Medium", R.drawable.nasi_campur_lombok)
        );
    }

    static void dataPalembangFood() {
        foods.add(
            new Foods("Pempek Palembang", "Rp 26.000",
                    "Pempek adalah makanan tradisional yang terbuat dari ikan dan sagu. Jenis ikan yang digunakan adalah ikan tenggiri. Ikan yang dicampur dengan sagu dicetak kemudian direbus.",
                    "Small", R.drawable.pempek_palembang)
        );
        foods.add(
            new Foods("Tekwan", "Rp 18.000",
                    "Satu porsi tekwan berisi bakso ikan, mie putih, dan kuah bening dengan citarasa yang khas. Kuah tersebut terbuat dari kaldu kepala udang dan daun bawang sehingga sangat gurih dan lezat.",
                    "Small", R.drawable.tekwan_palembang)
        ); foods.add(
            new Foods("Burgo Palembang", "Rp 8.000",
                    "Makanan yang satu ini terbuat dari adonan tepung sagu dan tepung beras kemudian dimasak seperti dadar tipis. Dadar tersebut kemudian digulung dan di iris agak besar sehingga tampilannya menyerupai kwetiau.",
                    "Medium", R.drawable.burgo_palembang)
        );
        foods.add(
            new Foods("Mie Celor", "Rp 15.000",
                    "Mie celor merupakan hidangan sumber karbohidrat yang dapat menggantikan nasi atau umbi-umbian. Kandungan karbohidratnya berasal dari penggunaan mie telur, santan, dan tepung kanji. Kandungan protein dalam mie celor berasal dari udang, suwiran ayam, dan telur rebus.",
                    "Medium", R.drawable.mie_celor_palembang)
        );

    }

    static void dataAcehFood() {
        foods.add(
            new Foods("Mie Aceh", "Rp 18.000",
                    "Mie Aceh merupakan salah satu makanan khas asli Aceh yang terbuat dari bahan utama tepung terigu dan dimasak menggunakan bumbu pedas berwarna merah khas Aceh.",
                    "Medium", R.drawable.mie_aceh)
        );
        foods.add(
                new Foods("Nasi Gurih", "Rp 15.000",
                        "Nasi Gurih khas Aceh memiliki resep yang menyerupai nasi uduk. Penyajiannya kerap bersama lauk-lauk seperti ikan lado, telur dadar, maupun ikan goreng.",
                        "Medium", R.drawable.nasih_gurih_aceh)
        );
        foods.add(
                new Foods("Ayam Tangkap", "Rp 60.000",
                        "Bahan untuk membuat Ayam Tangkap adalahi potongan ayam goreng yang dioseng bersama daun teumura dan cabai hijau, serta ditaburi bawang goreng. Berbagai rumah makan di Aceh yang menjual menu ini ",
                        "Large", R.drawable.ayam_tangkap_aceh)
        );
        foods.add(
                new Foods("Sambal Asam Udeung", "Rp 10.000",
                        "Kuliner ini punya warna kecoklatan dengan sedikit memperlihatkan aksen hijau. Bahan-bahan untuk membuat Sambal Asam Udeung meliputi belimbing wuluh, serta campuran rempah-rempah dan udang kali.",
                        "Small", R.drawable.sambal_asam_aceh)
        );

    }
}
