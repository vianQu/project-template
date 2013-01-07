package project.master.mapper;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import project.master.mapper.SequenceMapper;
import project.master.model.Sequence;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 8:34:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceMapperImplement extends SqlMapClientDaoSupport implements SequenceMapper {

    @Override
    public void insertSequence(Sequence sequence) throws SQLException {
        getSqlMapClientTemplate().insert("insertSequence",sequence);
    }

    @Override
    public void updateSequence(Sequence sequence) throws SQLException {
        getSqlMapClientTemplate().update("updateSequence",sequence);
    }

    @Override
    public void deleteSequence(Sequence sequence) throws SQLException {
        getSqlMapClientTemplate().update("deleteSequence", sequence);
    }

    @Override
    public int getCountSequence(Sequence sequence) throws SQLException {
        return (Integer) getSqlMapClientTemplate().queryForObject("getCountSequence",sequence);
    }

    @Override
    public Collection<Sequence> getAllSequence() throws SQLException {
        return getSqlMapClientTemplate().queryForList("getAllSequence");
    }

    @Override
    public Sequence getSequenceByObject(Sequence sequence) throws SQLException {
        return (Sequence) getSqlMapClientTemplate().queryForObject("getSequenceByObject", sequence);
    }

    @Override
    public Sequence getSequenceByNameSeq(String idSequence) throws SQLException {
        return (Sequence) getSqlMapClientTemplate().queryForObject("getSequenceByNameSeq",idSequence);
    }
}
