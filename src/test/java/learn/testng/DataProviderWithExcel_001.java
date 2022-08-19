package learn.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.Constant;
import utility.ExcelUtils;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/18 14:48
 **/
public class DataProviderWithExcel_001 {

    private String sTestCaseName;
    private int iTestCaseRow;

    @DataProvider
    public Object[][] Authentication() throws Exception {
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
        sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
        Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_TestData + Constant.File_TestData, "Sheet1", iTestCaseRow);
        return testObjArray;
    }

    @Test(dataProvider = "Authentication")
    public void testData(String username, String password) {
        System.out.println(username + password);

    }
}
