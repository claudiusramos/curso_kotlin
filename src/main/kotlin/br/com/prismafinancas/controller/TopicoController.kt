package br.com.prismafinancas.controller

import br.com.prismafinancas.model.Curso
import br.com.prismafinancas.model.Topico
import br.com.prismafinancas.model.Usuario
import br.com.prismafinancas.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping("/topicos")
class TopicoController(private val topicoService: TopicoService) {

    @GetMapping
    fun Lista(): List<Topico> {
        return topicoService.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return topicoService.buscarPorId(id)
    }


   @PostMapping
    fun cadastrar(@RequestBody topico: Topico) {
        topicoService.cadastrar(topico)
    }
}