package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {
    private final Login view;
    private LoginHelper helper;
    private Usuario usuarioAutenticado;
    

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        this.usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
   
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose(); 
        }else {
            view.exibeMensagem("Usuário ou senha inválidos");
        }
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco");
        
        this.view.exibeMensagem("Executei ou fiz tarefa");
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
}