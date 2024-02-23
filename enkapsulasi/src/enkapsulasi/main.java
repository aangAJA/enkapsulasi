package enkapsulasi;
public class main{
public static void main(String[] args){
    
    Pengguna user = new Pengguna(/*apaya:*/"aaa",/*opoyo*/"bbb");
    Pengguna user1 = new Pengguna ();

    user.setUsername(/*username:*/"al");
    user.setPassword(/*password:*/"halo");
    user.setId(/*id:*/0);
    user.setStatus(true);
    
    System.out.println("Username = "+user.getUsername());
    System.out.println("Password = "+user.getPassword());
}    
}
