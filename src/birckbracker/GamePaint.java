package birckbracker;

import java.awt.Color;
import java.awt.Graphics;

public class GamePaint {
  private Graphics graphics;

  public GamePaint(Graphics graphics) {
    this.graphics = graphics;
  }

  public aboveScoreHiding (int score) {
    graphics.setColor(Color.black);
    graphics.setFont(new Font("serif", Font.BOLD, 22));
    graphics.drawString("Score: " + score + "/200", 490, 30);
  }
}