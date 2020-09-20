import java.util.*;
import java.io.*;

public class LoginManager{
  Map<String, String> hm = new HashMap<String, String>();


  boolean addUser(String username, String password)
  {
    if (this.hm.containsKey(username) == false)
    {
      this.hm.put(username, password);
      return true;
    }
    return false;
  }

  boolean checkLogin (String username, String password)
  {
    if (this.hm.containsKey(username))
    {
      if (this.hm.get(username) == password)
        return true;
      return false;
    }
    return false;
  }

  Set<String> ListKeys()
  {
    return this.hm.keySet();
  }

}
