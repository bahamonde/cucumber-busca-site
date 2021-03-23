#language: pt

Funcionalidade: Buscar no site torneseumprogramador
    Estamos criando um teste para automatizar o processo de busca dos termos "bdd" e "tdd" 
    no site www.torneseumprogramador.com.br

    Cenario: Buscando termo bdd
        Quando eu acesso o site torneseumprogramador
        E digito no campo de pesquisa "bdd"
        E clico no botao da lupa
        Entao devo ver a mensagem de sucesso "Busca pelo termo "bdd""

    