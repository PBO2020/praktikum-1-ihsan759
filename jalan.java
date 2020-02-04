package array;

import java.util.Scanner;
import java.util.ArrayList;

public class jalan {

    Scanner s = new Scanner(System.in);
    ArrayList<Array> a = new ArrayList<>();

    void menu() {
        System.out.println("\nSilahkan pilih ^^");
        System.out.println("[1] Input data ");
        System.out.println("[2] Tampil data");
        System.out.println("[3] Keluar");
        System.out.print("\nSilahkan pilih :");
        String in = s.next();
        switch (in) {
            case "1":
                input();
                break;
            case "2":
                tampil();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda salah silahkan pilih kembali");
        }
    }

    void input() {
        Array ar = new Array();
        Array ay = new Array();
        if (a.isEmpty() == true) {
            System.out.print("\nNIK                   : ");
            String kosong = s.nextLine();
            String nik = s.nextLine();
            ar.setNIK(nik);
            System.out.print("Nama                  : ");
            String nama = s.nextLine();
            ar.setNama(nama);
            System.out.print("Tempat, tanggal lahir : ");
            String ttl = s.nextLine();
            ar.setTTL(ttl);
            System.out.print("Jenis kelamin         : ");
            String jk = s.nextLine();
            ar.setjenis_kelamin(jk);
            System.out.print("Golongan darah        : ");
            int gol = s.nextInt();
            ar.setgol_darah(gol);
            a.add(ar);
            pilih();
        } else {
            System.out.print("\nNIK                   : ");
            String kosong = s.nextLine();
            String nik = s.nextLine();
            ay.setNIK(nik);
            System.out.print("Nama                  : ");
            String nama = s.nextLine();
            ay.setNama(nama);
            System.out.print("Tempat, tanggal lahir : ");
            String ttl = s.nextLine();
            ay.setTTL(ttl);
            System.out.print("Jenis kelamin         : ");
            String jk = s.nextLine();
            ay.setjenis_kelamin(jk);
            System.out.print("Golongan darah        : ");
            int gol = s.nextInt();
            ay.setgol_darah(gol);
            a.add(ay);
            pilih();
        }
    }

    void tampil() {
        if (a.isEmpty() == true) {
            System.out.println("Data kosong silahkan input kembali ^^");
            menu();
        } else {
            
            for (int i = 0; i < a.size(); i++) {
                System.out.println("\nNIK                   : " + a.get(i).getNIK());
                System.out.println("Nama                  : " + a.get(i).getNama());
                System.out.println("Tempat, tanggal lahir : " + a.get(i).getTTL());
                System.out.println("Jenis kelamin         : " + a.get(i).getjenis_kelamin());
                if(a.get(i).getgol_darah() == 1){
                    System.out.println("Golongan darah        : A");
                }else if (a.get(i).getgol_darah() == 2){
                    System.out.println("Golongan darah        : B");
                }else if (a.get(i).getgol_darah() == 3){
                    System.out.println("Golongan darah        : AB");
                }else if (a.get(i).getgol_darah() == 4){
                    System.out.println("Golongan darah        : O");
                }
            }
            menu();
        }

    }

    void pilih() {
        System.out.println("\nApakah anda ingin menginput data baru atau tampilakan data ?(1/2) ");
        int inp = s.nextInt();
        if (inp == 1) {
            menu();
        } else if (inp == 2) {
            tampil();
        } else {
            System.out.println("Pilihan anda salah silahkan pilih kembali");
            pilih();
        }
    }

    public static void main(String args[]) {
        jalan j = new jalan();
        j.menu();
    }
}
