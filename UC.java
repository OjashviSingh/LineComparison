class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double length() {
        double xDiff = end.getX() - start.getX();
        double yDiff = end.getY() - start.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Line)) {
            return false;
        }
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
}
