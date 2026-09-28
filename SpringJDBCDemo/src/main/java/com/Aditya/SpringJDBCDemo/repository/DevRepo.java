package com.Aditya.SpringJDBCDemo.repository;

import com.Aditya.SpringJDBCDemo.Devs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DevRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Devs dev) {

        String sql = "INSERT INTO Dev (id, name, tech) VALUES (?, ?, ?)";

        int rows = template.update(
                sql,
                dev.getId(),
                dev.getName(),
                dev.getTech()
        );

        System.out.println(rows + " no of rows affected ..!");
    }

    public List<Devs> findall() {

        String sql = "SELECT * FROM Dev";

        RowMapper<Devs> mapper = new RowMapper<Devs>() {

            @Override
            public Devs mapRow(ResultSet rs, int rowNum) throws SQLException {

                Devs d = new Devs();

                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setTech(rs.getString("tech"));

                return d;
            }
        };

        return template.query(sql, mapper);
    }
}