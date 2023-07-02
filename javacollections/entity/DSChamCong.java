package entity;

import java.util.List;

public class DSChamCong {
    private CongNhan congNhan;
    private List<QLDSChamCong> details;

    public DSChamCong(CongNhan congNhan, List<QLDSChamCong> details) {
        this.congNhan = congNhan;
        this.details = details;
    }

    public void setCongNhan(CongNhan congNhan) {
        this.congNhan = congNhan;
    }

    public void setDetails(List<QLDSChamCong> details) {
        this.details = details;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public List<QLDSChamCong> getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "DSChamCong{" +
                "congNhan=" + congNhan +
                ", details=" + details +
                '}';
    }
}
