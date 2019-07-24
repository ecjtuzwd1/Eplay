package dao;

import bean.MessageBean;

import java.util.Date;
import java.util.List;

/**
 * @author Larimar
 * @time 2019/7/24 星期三 16:20
 */
public interface MessageDao {
    public boolean addMessage(String username, MessageBean message);
    public boolean delMessage(String username, MessageBean message);
    public boolean updateMessage(String username, MessageBean message);
    public List<MessageBean> selectAllMessages(String username);//查询某个用户的消息
    public List<MessageBean> selectMessagesByStatus(String username,String status);//根据状态（默认0未读，1是已读）查某个用户的消息
    public List<MessageBean> selectMessagesByType(String username,String type);//根据类型（默认0系统消息，1用户消息）查某个用户的信息
    public List<MessageBean> selectMessagesByDate(String username, Date date);//根据日期查询消息
}
