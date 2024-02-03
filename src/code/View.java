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
        Table table1 = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0,25,25);
        table1.addCell("  >> Main Menu << ");
        table1.addCell("–".repeat(20));
        table1.addCell("  1.Schedule");
        table1.addCell("  2.Add Teacher");
        table1.addCell("  3.Search Teacher");
        table1.addCell("  4.Update Teacher");
        table1.addCell("  5.Remove Teacher");
        table1.addCell("  6.Setting");
        table1.addCell("  7.Exit Program");
        System.out.println(table.render());
    }
}
