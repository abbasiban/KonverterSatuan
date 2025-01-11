
import java.util.ArrayList;

public class History {

    private ArrayList<String> besaranList;
    private ArrayList<Double> nilaiInputList;
    private ArrayList<String> satuanAsalList;
    private ArrayList<String> satuanTujuanList;
    private ArrayList<Double> hasilKonversiList;

    public History() {
        besaranList = new ArrayList<>();
        nilaiInputList = new ArrayList<>();
        satuanAsalList = new ArrayList<>();
        satuanTujuanList = new ArrayList<>();
        hasilKonversiList = new ArrayList<>();
    }

    public void addData(String besaran, double nilaiInput, String satuanAsal, String satuanTujuan, double hasilKonversi) {
        besaranList.add(besaran);
        nilaiInputList.add(nilaiInput); 
        satuanAsalList.add(satuanAsal);
        satuanTujuanList.add(satuanTujuan);
        hasilKonversiList.add(hasilKonversi);
    }

    public void updateData(int index, String besaran, double nilaiInput, String satuanAsal, String satuanTujuan, double hasilKonversi) {
        if (index >= 0 && index < besaranList.size()) {
            besaranList.set(index, besaran);
            nilaiInputList.set(index, nilaiInput); 
            satuanAsalList.set(index, satuanAsal);
            satuanTujuanList.set(index, satuanTujuan);
            hasilKonversiList.set(index, hasilKonversi);
        }
    }

    public void deleteData(int index) {
        if (index >= 0 && index < besaranList.size()) {
            besaranList.remove(index);
            nilaiInputList.remove(index); 
            satuanAsalList.remove(index);
            satuanTujuanList.remove(index);
            hasilKonversiList.remove(index);
        }
    }

    public Object[][] getTableData() {
        int size = besaranList.size();
        Object[][] data = new Object[size][5]; 

        for (int i = 0; i < size; i++) {
            data[i][0] = besaranList.get(i);
            data[i][1] = nilaiInputList.get(i); 
            data[i][2] = satuanAsalList.get(i);
            data[i][3] = satuanTujuanList.get(i);
            data[i][4] = hasilKonversiList.get(i);
        }

        return data;
    }
}
