package crossing;

/**
 *
 * @author kuznetsova_a
 */

import java.util.*;

class userdat {
String UserName, mail, password;

userdat(String UserName_c, String mail_c, String password_c)
{
UserName = UserName_c;
mail = mail_c;
password = password_c;
}
//переопределение метода
/*public boolean equals(userdat second)
    {     if (this.UserName == second.UserName && this.mail == second.mail && this.password== second.password)
          return true else return false; 
              }
*/


@Override
public boolean equals(Object o) {
    if (this == o) return true;
 
    if (o == null || getClass() != o.getClass()) return false;
 
    userdat user = (userdat) o;
 
    if (UserName != null ? !UserName.equals(user.UserName) : user.UserName != null)
        return false;
 
    if (mail != null ? !mail.equals(user.mail) : user.mail != null)
        return false;
    
    if (password != null ? !password.equals(user.password) : user.password != null)
        return false;
 
    return true;
}
}





public class Crossing {
  
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<userdat> stringList = new ArrayList<>();//создание нового списка  
    
    stringList.add(new userdat ( "Вася","vasyamail.ru","123"));
    stringList.add(new userdat ( "Антонио","antonio@yandex.ru","666"));
    stringList.add(new userdat ( "Енот","coon@mail.ru","12345"));
    stringList.add(new userdat ( "Катя","kat@mail.ru","abc123"));
    stringList.add(new userdat ( "Жора","jora@mail.ru","qwerty8"));
    
    System.out.println("Первый список пользователей");
    System.out.println(" ");
    stringList.stream().forEach(s-> System.out.println(s.UserName+ " " + s.mail + " " + s.password));
    System.out.println(" "); 
    
    List<userdat> stringList2 = new ArrayList<>();//создание нового списка  
    
    stringList2.add(new userdat ( "Иван","vanomail.ru","1234"));
    stringList2.add(new userdat ( "Антонио","antonio@yandex.ru","666"));
    stringList2.add(new userdat ( "Енот","coon@mail.ru","12345"));
    stringList2.add(new userdat ( "Варвара","varvar@mail.ru","vrvr"));
    stringList2.add(new userdat ( "Жора","jora@mail.ru","qwerty8"));
     
    System.out.println("Второй список пользователей");
    System.out.println(" ");
    stringList.stream().forEach(s-> System.out.println(s.UserName+ " " + s.mail + " " + s.password));
    System.out.println(" ");
    
    
    
    System.out.println("Пересечение списков пользователей");
    System.out.println(" ");
 
 
    List<userdat> result = new ArrayList<>();
      
    
       
    
       /*   for(userdat temp : stringList){
            for(userdat tmp : stringList2){
                if(temp.equals(tmp)){
                    result.add(temp);
                    
                }
            }
        }*/
          
     result.stream().forEach(s-> System.out.println(s.UserName+ " " + s.mail + " " + s.password));

      
    }
    
}
