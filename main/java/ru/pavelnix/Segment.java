package ru.pavelnix;

/**
 * Class segment
 */
public class Segment {
    private int pointA;
    private int pointB;
    private boolean validate;

    /**
     * Constructor segment
     *
     * @param pointA - left point of segment
     * @param pointB - right point of segment
     */
    public Segment(int pointA, int pointB) {
        if (pointB >= pointA) {
            this.pointA = pointA;
            this.pointB = pointB;
            this.validate = true;
        } else {
            this.validate = false;
        }
    }

    /**
     * Getter
     *
     * @return left point of segment
     */
    public int getPointA() {
        return pointA;
    }

    /**
     * Getter
     *
     * @return right point of segment
     */
    public int getPointB() {
        return pointB;
    }

    /**
     * Getter
     *
     * @return true if segment is exist and false if is not exist
     */
    public boolean getValidate() {
        return validate;
    }
}