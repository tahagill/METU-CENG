import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
 * Represents a graphical component for painting a soccer pitch with left and right side elements.
 * The pitch includes elements such as the field background, center circle, halfway line,
 * goal area, and penalty area.
 */
public class SoccerPitch extends JComponent {

    /**
     * Paints the soccer pitch component including both left and right side elements.
     * 
     * @param g The Graphics object used for painting.
     */
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Field background
        g2.setColor(Color.GREEN);
        Rectangle box = new Rectangle(50, 50, 900, 450);
        g2.fill(box);

        // Center circle
        g2.setColor(Color.WHITE);
        Ellipse2D.Double circle = new Ellipse2D.Double(425, 200, 150, 150);
        g2.draw(circle);

        // Halfway line
        Line2D.Double halfwayLine = new Line2D.Double(500, 50, 500, 500);
        g2.draw(halfwayLine);

        // Left side elements (already drawn)
        g2.setColor(Color.WHITE);
        Line2D.Double goalarea_topline = new Line2D.Double(50, 200, 120, 200);
        g2.draw(goalarea_topline);
        Line2D.Double goalarea_rightline = new Line2D.Double(120, 200, 120, 350);
        g2.draw(goalarea_rightline);
        Line2D.Double goalarea_bottomline = new Line2D.Double(50, 350, 120, 350);
        g2.draw(goalarea_bottomline);

        Line2D.Double penaltyarea_top = new Line2D.Double(50, 150, 200, 150);
        g2.draw(penaltyarea_top);
        Line2D.Double penaltyarea_right = new Line2D.Double(200, 150, 200, 400);
        g2.draw(penaltyarea_right);
        Line2D.Double penaltyarea_bottom = new Line2D.Double(50, 400, 200, 400);
        g2.draw(penaltyarea_bottom);

        // Calculate mirrored coordinates for right side elements
        double centerX = box.getCenterX(); // Center X coordinate of the field

        // Mirror goal area lines
        double goalAreaLeftX = 120; // Left X coordinate of the goal area on the left side
        double goalAreaRightX = centerX + (centerX - goalAreaLeftX); // Calculate mirrored right X coordinate
        Line2D.Double rightGoalArea = new Line2D.Double(goalAreaRightX, 200, goalAreaRightX + 70, 200);
        g2.draw(rightGoalArea);
        g2.draw(new Line2D.Double(goalAreaRightX, 200, goalAreaRightX, 350));
        g2.draw(new Line2D.Double(goalAreaRightX, 350, goalAreaRightX + 70, 350));

        // Mirror penalty area lines
        double penaltyAreaLeftX = 200; // Left X coordinate of the penalty area on the left side
        double penaltyAreaRightX = centerX + (centerX - penaltyAreaLeftX); // Calculate mirrored right X coordinate
        Line2D.Double rightPenaltyAreaTop = new Line2D.Double(penaltyAreaRightX, 150, penaltyAreaRightX + 150, 150);
        g2.draw(rightPenaltyAreaTop);
        g2.draw(new Line2D.Double(penaltyAreaRightX, 150, penaltyAreaRightX, 400));
        g2.draw(new Line2D.Double(penaltyAreaRightX, 400, penaltyAreaRightX + 150, 400));
    }
}
