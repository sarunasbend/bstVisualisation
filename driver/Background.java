public class Background {
    private String primaryColour;
    private String secondaryColour;

    public Background(GameArena arena, String primary, String secondary)
    {
        Rectangle border = new Rectangle(0, 0, 800, 1000, "#FFFFFF");
        arena.addRectangle(border);
        Rectangle box = new Rectangle(13, 13, 775, 975, primary);
        arena.addRectangle(box);
        Line arrow = new Line(0.0, 0.0, 400.0, 500.0, 50, secondary);
        arena.addLine(arrow);
        Line arrow2 = new Line(800, 1000, 400, 500, 50, secondary);
        arena.addLine(arrow2);
        Line arrow3 = new Line(800, 0, 400, 500, 50, secondary);
        arena.addLine(arrow3);
        Line arrow4 = new Line(0, 1000, 400, 500, 50, secondary);
        arena.addLine(arrow4);
        
    }   
}
