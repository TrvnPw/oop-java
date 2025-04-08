package Pembantu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public class Helper {

    public static String formatRupiah(int amount) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(new Locale("id", "ID"));
        simbol.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp #,###", simbol);
        return formatter.format(amount);
    }

    public static String formatRupiah(double amount) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(new Locale("id", "ID"));
        simbol.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp #,###", simbol);
        return formatter.format(amount);
    }

    public static String formatRupiah(long amount) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols(new Locale("id", "ID"));
        simbol.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp #,###", simbol);
        return formatter.format(amount);
    }

    public static String formatTanggal(Date tanggal) {
        SimpleDateFormat formatter = new SimpleDateFormat(" dd MMMM yyyy", new Locale("id", "ID"));
        return formatter.format(tanggal);
    }

    public static String formatTanggalLengkap(Date tanggal) {
        try {
            String apiUrl = "http://ip-api.com/json/";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            String alamat = jsonResponse.getString("regionName");
            SimpleDateFormat formatter = new SimpleDateFormat(" dd MMMM yyyy", new Locale("id", "ID"));
            String alamatDanTanggal = alamat+formatter.format(tanggal);
            return alamatDanTanggal;
        } catch (Exception e){
            return e.getMessage();
        }        
    }    
}