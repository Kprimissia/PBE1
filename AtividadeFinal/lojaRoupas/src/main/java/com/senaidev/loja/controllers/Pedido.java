import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senaidev.loja.entities.Pedido;
@Controller
@RequestMapping("/pedidos")
public class Pedido {

    @Autowired
    private Pedido pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarTodos();
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @GetMapping("/{id}")
    public Pedido obterPedido(@PathVariable int id) {
        return Pedido.obterPorId(id);
    }

    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable int id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        return Pedido.atualizar(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable int id) {
        Pedido.dele(id);
    }
}
