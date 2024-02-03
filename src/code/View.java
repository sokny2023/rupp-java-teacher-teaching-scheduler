package code;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class View {

    public void logo(){
        System.out.println("★".repeat(40));
        System.out.println("★".repeat(8)+" ".repeat(3)+"Royal University of Phnom Penh"+" ".repeat(3)+"★".repeat(7));
        System.out.println("★".repeat(9)+" ".repeat(3)+"Teacher Teaching Scheduler"+" ".repeat(4)+"★".repeat(8));
        System.out.println("★".repeat(40));
    }

    public void line(){
        System.out.println("⭒✮⭒".repeat(20));
    }

    public void mainMenu(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0,20,25);
        table.addCell("  >> Main Menu << ");
        table.addCell("–".repeat(20));
        table.addCell("  1.Add Teacher");
        table.addCell("  2.View Schedule");
        table.addCell("  3.Search Teacher");
        table.addCell("  4.Update Teacher");
        table.addCell("  5.Remove Teacher");
        table.addCell("  6.Show Time");
        table.addCell("  7.Show Schedule");
        table.addCell("  8.Exit Program");
        System.out.println(table.render());
    }

    public void showTime(){
        System.out.println(" ".repeat(15)+"⏰ Show Time ⏰");
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,20,25);
        table.setColumnWidth(0,20,25);
        table.addCell(" ".repeat(5)+" Shift ");
        table.addCell(" ".repeat(5)+" Time ");
        table.addCell(" 1. Morning ");
        table.addCell(" 7:30 -> 10:45 AM ");
        table.addCell(" 2. Afternoon ");
        table.addCell(" 2:15 -> 5:15 PM ");
        table.addCell(" 3. Evening ");
        table.addCell(" 5:30 -> 8:45 PM ");
        System.out.println(table.render());
    }
}
