# Livro: Entendendo Algoritmos

## Objetivo

Este repositório tem como objetivo compartilhar os algoritmos desenvolvidos a partir da leitura do livro 'Entendendo Algoritmos', de Aditaya Y. Bhargava. As aplicações apresentadas são uma mistura de ideias próprias e exemplos do próprio livro. A intenção é fornecer tanto uma prática dos conceitos aprendidos quanto uma referência para os exemplos discutidos no texto.

## Códigos

**Busca Binária**

- **Sobre:** A busca binária é uma maneira eficiente de pesquisar um dado em uma coleção de dados ordenados. Para que a busca funcione e seja eficiente, é preciso que os dados estejam ordenados (alfabeticamente, numericamente, etc.) e que a coleção possua tipo de acesso aleatório, como arrays, por exemplo.

- **Funcionamento:** A ideia é encontrar a posição central dos elementos da coleção e verificar se o elemento desejado está a direita (ignorando todos à esquerda) ou à esquerda (ignorando todos à direita). O processo se repete até encontrar o dado desejado.

- **Tempo de execução:** O(log n)

- **Aplicação:** A ideia para aplicação foi procurar um contato em uma agenda preestabelecida em JSON. A agenda contém 50 contatos. Você pode encontrar o arquivo JSON com os contatos [aqui](busca-binaria/src/contatos/contatos.json).

**Ordenação por Seleção**

- **Sobre:** A ordenação por seleção é uma forma de ordenar uma coleção de dados selecionando item por item. É um algoritmo bom para ordenar, mas não é tão rápido quanto o quicksort.

- **Tempo de execução:** O(log n²)

- **Aplicação:** A ideia para aplicação foi baseada no próprio exemplo do livro, com algumas adições. No livro é proposto um algoritmo que ordena um array de forma decrescente. O exemplo neste repositório possui um esquema onde o usuário informa 10 valores que serão guardados em um array e posteriormente pode decidir se deseja sua ordenação em forma crescente ou decrescente.
