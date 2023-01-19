class Line implements Comparable<Line> {
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
    public int compareTo(Line other) {
        int startComparison = this.start.compareTo(other.start);
        if (startComparison != 0) {
            return startComparison;
        }
        return this.end.compareTo(other.end);
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int compareTo(Point other) {
        int xComparison = Integer.compare(this.x, other.x);
        if (xComparison != 0) {
            return xComparison;
        }
        return Integer.compare(this.y, other.y);
    }
}
