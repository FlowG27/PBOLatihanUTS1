/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.latihanuts1.model;

/**
 *
 * @author Flow
 */
public class ModelMahasiswa {

       public String nama;
       public String NIM;
       public ModelMahasiswa(String nama, String NIM){
           this.nama=nama;
           this.NIM=NIM;
        }
        public String getNama() {
            return nama;
        }

        public String getNIM() {
            return NIM;
        }
}
