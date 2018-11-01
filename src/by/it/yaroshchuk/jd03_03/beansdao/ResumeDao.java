package by.it.yaroshchuk.jd03_03.beansdao;

import by.it.yaroshchuk.jd03_03.beans.Resume;
import by.it.yaroshchuk.jd03_03.simpledao.ConnectionCreator;
import by.it.yaroshchuk.jd03_03.simpledao.InterfaceDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResumeDao extends AbstractDao implements InterfaceDao<Resume> {
    @Override
    public Resume read(long id) throws SQLException {
        List<Resume> resumes = getAll("WHERE id=" + id + " LIMIT 0,1");
        if (resumes.size() > 0) {
            return  resumes.get(0);
        } else
            return null;
    }

    @Override
    public boolean create(Resume resume) throws SQLException {
        String sql = String.format("INSERT INTO `resumes` (`full_name`, `dob`, `country`, `city`, `education`," +
                        " `degree`, `graduate_year`, `experience`, `post`, `worktime`, `users_id`)" +
                        " VALUES ('%s', '%s', '%s', '%s', '%s', '%s', %d, '%s', '%s', %d, %d);",
                resume.getFullName(),
                resume.getDob(),
                resume.getCountry(),
                resume.getCity(),
                resume.getEducation(),
                resume.getDegree(),
                resume.getGraduateYear(),
                resume.getExperience(),
                resume.getPost(),
                resume.getWorktime(),
                resume.getUsersId());
        long id = executeUpdate(sql);
        if (id > 0) resume.setId(id);
        return id > 0;
    }

    @Override
    public boolean update(Resume resume) throws SQLException {
        String sql = String.format("UPDATE `resumes` SET " +
                        "`full_name` = '%s', " +
                        "`dob` = '%s', " +
                        "`country` = '%s', " +
                        "`city` = '%s', " +
                        "`education` = '%s', " +
                        "`degree` = '%s', " +
                        "`graduate_year` = %d, " +
                        "`experience` = '%s', " +
                        "`post` = '%s', " +
                        "`worktime`  = %d," +
                        "`users_id` = %d"+
                        " WHERE `id` = %d",
                resume.getFullName(),
                resume.getDob(),
                resume.getCountry(),
                resume.getCity(),
                resume.getEducation(),
                resume.getDegree(),
                resume.getGraduateYear(),
                resume.getExperience(),
                resume.getPost(),
                resume.getWorktime(),
                resume.getUsersId(),
                resume.getId());
        return (0 < executeUpdate(sql));
    }

    @Override
    public boolean delete(Resume resume) throws SQLException {
        String sql = String.format("DELETE FROM `resumes` WHERE `resumes`.`id` = %d", resume.getId());
        return (0 < executeUpdate(sql));
    }

    @Override
    public List getAll() throws SQLException {
        return getAll("");
    }

    @Override
    public List getAll(String WHERE) throws SQLException {
        List<Resume> resumes = new ArrayList<>();
        String sql = "SELECT * FROM resumes " + WHERE + " ;";

        try(Connection connection = ConnectionCreator.getConnection();
            Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Resume resume = new Resume();
                resume.setId(resultSet.getLong("id"));
                resume.setFullName(resultSet.getString("full_name"));
                resume.setDob(resultSet.getString("dob"));
                resume.setCountry(resultSet.getString("country"));
                resume.setCity(resultSet.getString("city"));
                resume.setEducation(resultSet.getString("education"));
                resume.setDegree(resultSet.getString("degree"));
                resume.setGraduateYear(resultSet.getInt("graduate_year"));
                resume.setExperience(resultSet.getString("experience"));
                resume.setPost(resultSet.getString("post"));
                resume.setWorktime(resultSet.getInt("worktime"));
                resume.setUsersId(resultSet.getLong("users_id"));
                resumes.add((resume));
            }
        }
        return resumes;
    }
}
