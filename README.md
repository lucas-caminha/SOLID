# SOLID
Project used to learn the concept of SOLID.
# Anotações
Príncipios da Orientação a Objetos.

* Coesão - Uma classe deve ser Coesa e executar bem a sua única tarefa de forma concisa.
(Evitar detalhar tudo em uma classe só para que ela não faça muitas coisas e fuja do Principio da Responsabilidade Única)

* Encapsulamento - É uma forma de manter os objetos das nossas classes protegidos, fornecendo apenas o que é estritamente necessário para o mundo exterior.
"Classes não encapsuladas permitem violação de regras de negócio, além de aumentarem o acoplamento". 
Getters e setters por si só não fornecem nenhum tipo de encapsulamento.
Encapsulamento ajuda no uso correto dos objetos.

* Acoplamento - É a dependência entre classes e nem sempre é ruim acoplar, é meio impossível criar um sistema sem nenhum acomplamento. Porém, devemos ter o controle do nível de acoplamento da nossa aplicação.
"Classes acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção"

S.O.L.I.D: Os 5 princípios da POO
<br/>
S — Single Responsibility Principle (Princípio da responsabilidade única) <br/>
O — Open-Closed Principle (Princípio Aberto-Fechado) <br/>
L — Liskov Substitution Principle (Princípio da substituição de Liskov) <br/>
I — Interface Segregation Principle (Princípio da Segregação da Interface) <br/>
D — Dependency Inversion Principle (Princípio da inversão da dependência) <br/>

* Single Responsibility Principle: <br/>
"Uma classe deveteria ter apenas um único motivo para mudar"
-- Robert (Uncle Bob) Martin
Por exemplo, uma classe Funcionário só deveria mudar se ocorresse alguma alteração na representação de um Funcionário. Por exemplo, se eu faço uma mudança na classe de envio de e-mail ou uma classe de geração de relatório, isso não deveria afetar a classe de Funcionário.
Este principio tem o foco em Coesão.

* Open Closed Principle: <br/>
Entidades de software devem estar abertas para extensão, porém fechadas para modificação.
-- Bertrand Meyer
Por exemplo, temos que fazer o design do projeto para que ele seja extensivel, sempre adicionando novos comportamentos mas evitando modificar os comportamentos já existentes.

* Liskov Substitution Principle: <br/>
"Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y de tipo S, onde S é um subtipo de T."
-- Barbara Liskov
Embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;

* Interface Segregation Principle: <br/>
Uma classe não deve ser obrigada a implementar um método de determinada interface, se ele não será útil. Para isso, uma interface deverá ser extraída apenas com os métodos necessários.

* Dependency Inversion Principle: <br/>
"Abstrações não devem depender de implementações. Implementações devem depender de abstrações."
-- Robert (Uncle Bob) Martin
Se um método muda a forma como realiza sua tarefa, desde que a interface se mantenha, não vamos precisar nos preocupar nem em editar o nosso código.
