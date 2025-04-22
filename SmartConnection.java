package OnlineShop;

import java.sql.*;

public class SmartConnection extends ConnectionWrapper {
    public SmartConnection(Connection con) {
        super(con);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return super.con.prepareStatement(
                sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
        );
    }
}

