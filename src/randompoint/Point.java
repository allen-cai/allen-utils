package randompoint;

import java.util.List;

public class Point {

    private double row;

    private double col;

    private double r;

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getCol() {
        return col;
    }

    public void setCol(double col) {
        this.col = col;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Point{" +
                "row=" + row +
                ", col=" + col +
                ", r=" + r +
                '}';
    }
}
