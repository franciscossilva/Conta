package Controller;

import Model.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    @GetMapping
    public List<ContaBancaria> listarContas() {
        return contaBancariaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContaBancaria> obterConta(@PathVariable Long id) {
        // Implementar lógica para obter uma conta específica
    }

    @PostMapping
    public ResponseEntity<ContaBancaria> cadastrarConta(@RequestBody ContaBancaria conta) {
        // Implementar lógica para cadastrar uma nova conta
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarConta(@PathVariable Long id) {
        // Implementar lógica para deletar uma conta
    }

    @PutMapping("/deposito/{id}")
    public ResponseEntity<ContaBancaria> realizarDeposito(@PathVariable Long id, @RequestBody double valorOperacao) {
        // Implementar lógica para realizar um depósito
    }

    @PutMapping("/saque/{id}")
    public ResponseEntity<ContaBancaria> realizarSaque(@PathVariable Long id, @RequestBody double valorOperacao) {
        // Implementar lógica para realizar um saque

    }
