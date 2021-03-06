package MedicalOffice;

import java.util.Date;

public class Appointment{

    private int idPacient;
    private int idDoctor;

    private String motive;
    private int hour;
    private String date;
    private int id;

    public Appointment(){}

    public Appointment(int idPacient, int idDoctor, String motive, int hour, String date) {
        this.idPacient = idPacient;
        this.idDoctor = idDoctor;
        this.motive = motive;
        this.hour = hour;
        this.date = date;
    }

    public Appointment(int id,int idPacient, int idDoctor, String motive, int hour, String date) {
        this.id = id;
        this.idPacient = idPacient;
        this.idDoctor = idDoctor;
        this.motive = motive;
        this.hour = hour;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "Programare pentru pacientul cu id-ul " + idPacient + " la doctorul cu id-ul " + idDoctor +
                " in data de " + date + " ora " + hour + " cu motivul: " + motive;
    }
}
