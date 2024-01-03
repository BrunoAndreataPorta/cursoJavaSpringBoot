/*
    Foi criado no postgreSQL a tabela "student" com as colunas "sid", "sname" & "marks"
    Foi inserido na tabele manualmente os seguintes dados:
        insert into student values (1, 'Bruno', 90);
        insert into student values (2, 'Kiran', 50);
        insert into student values (3, 'Pedro', 30);
        insert into student values (4, 'Gabriel', 40);
 */

import java.sql.*;

public class cursoJDBC {
    public static void main(String[] args) throws Exception {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */

        int sid = 102;
        String sname = "Paulo";
        int marks = 76;

        String url = "jdbc:postgresql://localhost:5432/cursoJDBC";
        String uname = "postgres";
        String pass = "1001";
        /*
        Create = insert into student values (5, 'John', 48)
        Read = select * from student
        Update = update student set sname='Max' where sid=5
        Delete = delete from student where sid=5
         */
        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();


        con.close();
        System.out.println("Connection Closed");




        //ResultSet rs = st.executeQuery(sql);

        //Código para pegar a informação sname do primeiro elemento
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of a student is " + name);

        //Código para pegar todas as informações do database
//rs.next vai passar para o proximo elemento da tabela e vai informar se existe algo (true) ou não (false).
//        while(rs.next()){
//            System.out.print(rs.getInt("sid") + " | ");
//            System.out.print(rs.getString("sname") + " | ");
//            System.out.println(rs.getInt("marks"));
//        }
    }
}