package project.master.mapper;

import project.master.model.Sequence;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: VIAN QU VIAN_QU@YAHOO.COM | VIAN.QU@GMAIL.COM
 * Date: Nov 15, 2012
 * Time: 7:35:42 AM
 * To change this template use File | Settings | File Templates.
 */
public interface SequenceMapper {
    public void insertSequence(Sequence sequence) throws SQLException;
    public void updateSequence(Sequence sequence) throws SQLException;
    public void deleteSequence(Sequence sequence) throws SQLException;
    public int getCountSequence(Sequence sequence) throws SQLException;

    //retrieve
    public Collection<Sequence> getAllSequence() throws SQLException;
    public Sequence getSequenceByObject(Sequence sequence) throws SQLException;
    public Sequence getSequenceByNameSeq(String idSequence) throws SQLException;
}
