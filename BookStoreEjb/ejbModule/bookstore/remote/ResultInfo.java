package bookstore.remote;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class ResultInfo implements Serializable 
{

	private static final long serialVersionUID = 1L;
	
	private int errno;
	private String errmsg;
	
	public ResultInfo(int errno_, String errmsg_)
	{
		errno = errno_;
		errmsg = errmsg_;
	}
	
	public int getErrno() { return errno; }
	public void setErrno(int errno_) { errno = errno_; }
	public String getErrmsg() { return errmsg; }
	public void setErrmsg(String errmsg_) { errmsg = errmsg_; }
	
	public String toJsonString()
	{
		JSONObject json = new JSONObject();
		json.put("errno", errno);
		if(errno != 0)
		    json.put("errmsg", errmsg);
		return json.toJSONString();
	}
}
