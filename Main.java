
import DAO.ProdutosDAO;
import entities.Produtos;
import entities.Usuario;
import DAO.UsuarioDAO;
import java.util.ArrayList;



public class Main {

    
    public static void main(String[] args) {
        Usuario usuario = new Usuario(0, "FabioLeal","321");
        Produtos produto = new Produtos(0,"Feijao", 12, 5.50);
        
        UsuarioDAO usuarioDAO= new UsuarioDAO();
        ProdutosDAO produtosDAO = new ProdutosDAO();
        
        ArrayList<Usuario> listaUsuarios = usuarioDAO.getAll(Usuario.class);
        ArrayList<Produtos> listaProdutos = produtosDAO.getAll(Produtos.class);
        
        }

}
