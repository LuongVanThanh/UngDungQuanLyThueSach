/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Quang Minh
 */
public class DH_Sach {
    private Sach sach = new Sach();
    private int SLM;
    private int GiaMuon;
            
    
    private boolean KTSach(String MaS) throws ClassNotFoundException{
        if(MaS != ""){
            try {
                Integer.parseInt(MaS);
                sach = sach.TimSach(MaS);
                if(sach != null)
                    return true;
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }
    private boolean KTSLM(String SLM){
        if(SLM != ""){
            try {
                int t =Integer.parseInt(SLM);
                if(t > 0 && t <= sach.getSLS()){
                    return true;
                }
            } catch (NumberFormatException e) {
                 return false;
            }
        }
        return false;
    }  
    public boolean ThemSach(String MaS, String SLM) throws ClassNotFoundException{
        if(KTSach(MaS) && KTSLM(SLM)){
            this.sach = this.sach.TimSach(MaS);
            this.SLM = Integer.parseInt(SLM);
            this.GiaMuon = this.sach.getGia() * this.SLM;
            return true;
        }
        return false;
    }
    //Lay thong tin de luu vao csdl
    public int getMaS(){
        return this.sach.getMaS();
    }
    public int getSLM(){
        return this.SLM;
    }
    public int getGiaMuon(){
        return this.GiaMuon;
    }
}
