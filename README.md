# Connect Car
### Sprint 4 referente ao challenge 

## Descritivo
O projeto "ConectCar" apresenta uma solução inovadora para o mercado de 
reparação automotiva, enfocando a experiência digital e a eficiência dos serviços 
prestados. A proposta central é a criação de um sistema integrado que permite aos 
clientes do Centro Automotivo Porto a realização de diagnósticos veiculares e a 
contratação de serviços de reparo de forma online, sem a necessidade de 
deslocamento até a oficina mecânica para a primeira avaliação. A iniciativa busca 
superar o modelo tradicional e conservador do setor, onde a interação física é um 
pré-requisito para qualquer diagnóstico ou serviço. O diferencial trazido pelo projeto 
é o uso de Inteligência Artificial para fornecer diagnósticos assertivos, ágeis e 
confiáveis, garantindo ao cliente uma experiência denominada "phygital" — uma 
junção do físico com o digital. 

Este sistema não somente melhora a comodidade para o usuário, mas 
também otimiza o fluxo de trabalho da oficina ao diminuir o número de visitas 
desnecessárias. Ao mesmo tempo, oferece uma base de dados robusta para a 
gestão de clientes, veículos, serviços e mecânicos, como demonstrado no esquema 
do banco de dados fornecido. Os elementos como veículo, cliente, serviço e 
diagnóstico estão inter-relacionados, permitindo um acompanhamento detalhado de 
cada etapa do processo, desde a chegada do veículo até a finalização do serviço. 

O objetivo do sistema é não apenas fornecer um serviço mais rápido e 
prático, mas também construir credibilidade e eficiência que estão em falta no setor, 
onde muitas vezes os clientes desconfiam dos diagnósticos e serviços realizados 
manualmente. Com um banco de dados estruturado e um sistema interativo, o 
Centro Automotivo Porto busca se posicionar como uma referência no mercado, 
valorizando a transparência e a confiança na relação com o cliente. 

Por fim, os números revelam a relevância e o potencial do mercado, com a 
frota de veículos de passeio brasileira envelhecendo e a demanda por serviços de 
manutenção crescendo proporcionalmente. A Porto Seguro, dentro deste contexto, 
apresenta números significativos que solidificam a importância deste projeto, 
mostrando um incremento em prêmios no seguro automotivo e uma frota segurada 
expressiva, indicativos claros da confiança e dependência dos clientes para com a 
empresa e seus serviços.

## TECNOLOGIA UTILIZADA
 - JAVA

### Funcionalidades
 - Pacote: br.com.fiap.beans - Para a criação das classes principais e dos atributos 
do projeto.

 - Pacote: br.com.fiap.DAO - Para a criação da classe ClienteDAO, dessa forma 
pegando as informações do cliente para integração com banco de dados, método
inserir para utilizar o insert e inserir os dados no banco de dados

 - Pacote: br.com.fiap.main - Para testar as classes do pacote br.com.fiap.beans, 
br.com.fiap.DAO e do pacote Conexao. Criação de arrayList para armazenar os 
dados do mecanico, criação de for incom para exibir todos mecanicos e exibição 
padrao apenas com SystemOutPrintln para o resto das classes

 - Pacote: br.com.fiap. conexão – Para a integração com o banco de dados

 - Pacote: BO – Para criação do métodos realizados no crud de Cliente, Veiculo e 
Mecânico

 - Pacote: br.com.fiap.excecoes - Para as exceções do projeto, atualmente contando 
apenas com o método de falha na conexão com o banco de dados
 
 - Pacote: br.com.fiap.model - Para a criação da classe Endereço que sera utilizada 
pela API externa do viaCep
 
 - Pacote: br.com.fiap.resource - Para criação do servidor para integração da API 
interna com as demais materias, possui os metodos GET, POST, PUT, DELETE das 
seguintes classes: clienteResource, mecanicoResource, VeiculoResource.

- Pacote: br.com.fiap.service - para a integração da api viaCep
