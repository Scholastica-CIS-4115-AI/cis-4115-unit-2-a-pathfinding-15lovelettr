package aStar;

import java.util.ArrayList;

/**
 * The Path class defines an ordered list of nodes making up a path.
 *
 * This does not need to be modified by students
 *
 * @author Original author: Tom Gibbons.
 * @version Spring 2018 version
 */
public class Path {
    // The waypoints in the path (list of coordinates making up the path)

    private ArrayList<Node> waypoints = new ArrayList<Node>();

    /**
     * default constructor
     */
    public Path() {
    }

    /**
     * getLength returns the number of nodes on the path.
     *
     * @return number of nodes on the path as an integer.
     */
    public int getLength() {
        return waypoints.size();
    }
    /**
     * getWayPoint returns the i'th of nodes on the path defined by the index
     *
     * @return the nodes on the path
     */
    public Node getWayPoint(int index) {
        return waypoints.get(index);
    }

    /**
     * Get the x-coordinate for the waypoint at the given index.
     *
     * @param index The index of the waypoint to get the x-coordinate of.
     * @return The x coordinate at the waypoint.
     */
    public double getX(int index) {
        return getWayPoint(index).x;
    }

    /**
     * Get the y-coordinate for the waypoint at the given index.
     *
     * @param index The index of the waypoint to get the y-coordinate of.
     * @return The y coordinate at the waypoint.
     */
    public double getY(int index) {
        return getWayPoint(index).y;
    }

    /**
     * Append a waypoint to the path.
     *
     * @param x The x coordinate of the waypoint.
     * @param y The y coordinate of the waypoint.
     */
    public void appendWayPoint(Node n) {
        waypoints.add(n);
    }

    /**
     * Add a waypoint to the beginning of the path.
     *
     * @param x The x coordinate of the waypoint.
     * @param y The y coordinate of the waypoint.
     */
    public void prependWayPoint(Node n) {
        waypoints.add(0, n);
    }

    /**
     * contains() checks if this path contains the WayPoint
     *
     * @param x The x coordinate of the waypoint.
     * @param y The y coordinate of the waypoint.
     * @return True if the path contains the waypoint.
     */
    public boolean contains(int x, int y) {
        for (Node node : waypoints) {
            if (node.x == x && node.y == y) {
                return true;
            }
        }
        return false;
    }
    /**
     * printPath() prints the nodes on the path
     */
    public void printPath() {
        Node n, prev_n;
        int i = 0;

        System.out.println("Nodes on path:");
        n = waypoints.get(i);
        System.out.println("Path " + n.nodeNum + " (" + n.x + " , " + n.y + ")");
        for (i = 1; i < waypoints.size(); i++) {
            prev_n = n;
            n = waypoints.get(i);
            System.out.println("Path " + n.nodeNum + " (" + n.x + " , " + n.y + ")");
            //mc.drawLine(prev_n.getX(), prev_n.getY(), n.getX(), n.getY());
        }

    }

}
