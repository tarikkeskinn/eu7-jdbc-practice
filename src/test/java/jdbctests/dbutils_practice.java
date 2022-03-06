package jdbctests;

import org.testng.annotations.Test;
import utilities.DBUtils;

import java.util.List;
import java.util.Map;

public class dbutils_practice {

    @Test
    public void test1() {
        //create connection
        DBUtils.createConnection();

        //using method to get result as a list of maps
        List<Map<String, Object>> queryResult = DBUtils.getQueryResultMap("select * from regions");

        //printing the result
        for (Map<String, Object> stringObjectMap : queryResult) {
            System.out.println(stringObjectMap.toString());
        }


        //close connection
        DBUtils.destroy();
    }


    @Test
    public void test2() {
        //create connection
        DBUtils.createConnection();

        Map<String, Object> rowMap = DBUtils.getRowMap("select first_name,last_name,salary,job_id from employees\n" +
                "where employee_id = 100");

        System.out.println(rowMap.toString());


        //close connection
        DBUtils.destroy();

    }
}