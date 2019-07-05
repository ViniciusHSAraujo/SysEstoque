# SysEstoque

Projeto de Sistema WEB da matéria de Java EE. 

## Tecnologias Utilizadas
WildFly, JSF, PostgreSQL, Omnifaces e BootsFaces

## Escopo

Dificuldade 2 - Produto JSF com JPA Simples

Desenvolver um sistema para cadastrar produtos.

O  sistema  deverá  ter  funcionalidade  para  cadastramento  de produtos  e cadastramento  de marcas.

Faça  o  mapeamento  da  entidade  para  que  o  banco  de  dados  seja  criado  adequadamente utilizando JPA.

● O cadastro de produto deverá conter com campos nome, preço e marca.

● Não deve ser possível cadastrar dois produtos com o mesmo nome.O sistema só deve aceitar cadastramentos de produtos com preços acima de zero reais (R$ 0,00). Para  realizar  essa  operação,  utilize  validadores  do  JSF.

● Todos os campos são obrigatórios.

## Instalação

Utilizando o Eclipse, vá em "File > Import > JSF Project" e escolha o diretório onde você baixou o projeto.

## Utilização

Para utilizar, é necessário configurar o servidor de aplicações WildFly (ou outro de sua preferência, mas talvez necessite de alguma alteração) e configurar o persistence.xml com a configuração do banco de dados que você utilizar.

```xml
<property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQL95Dialect" />
<jta-data-source>java:/pacienteSystem</jta-data-source> 
```

Obs: Não foi utilizado o Maven para realizar a build devido a limitações de acesso à internet no campus.
