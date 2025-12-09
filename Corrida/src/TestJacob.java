import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class TestJacob {
    public static void main(String[] args) {
        try {
            ActiveXComponent excel = new ActiveXComponent("Excel.Application");
            excel.setProperty("Visible", true); // abre o Excel
            Dispatch workbooks = excel.getProperty("Workbooks").toDispatch();
            Dispatch workbook = Dispatch.call(workbooks, "Add").toDispatch();
            Dispatch sheet = Dispatch.get(workbook, "ActiveSheet").toDispatch();
            Dispatch cell = Dispatch.invoke(sheet, "Cells", Dispatch.Get,
                    new Object[] { 1, 1 }, new int[1]).toDispatch();
            Dispatch.put(cell, "Value", "Olá JACOB no VS Code!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


