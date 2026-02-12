## 📌 Contextualização

A empresa fictícia **TechStore** necessita de um sistema de descontos flexível e de fácil manutenção, pois o time de marketing cria novas promoções com frequência, como:

- Desconto de Aniversário  
- Desconto por Volume  
- Desconto Sazonal  
- Black Friday  

Na implementação inicial, a classe `CalculadoraDeDesconto` utilizava estruturas condicionais (`if/else` ou `switch`) para decidir qual desconto aplicar.

Sempre que um novo desconto era criado, era necessário **alterar essa classe**, o que tornava o código:

- grande e difícil de manter  
- fortemente acoplado  
- pouco escalável  
- propenso a erros  

Essa abordagem violava o princípio **Open/Closed (OCP)** do SOLID.

### ❌ Problema da abordagem inicial

```java
switch(tipoDesconto) {
    case CUPOM: ...
    case VIP: ...
    case SAZONAL: ...
    case ANIVERSARIO: ...
}
```

---

## ✅ Solução

Para resolver o problema, o sistema foi refatorado utilizando o **Strategy Pattern**, aplicando o princípio **Open/Closed (OCP)**, que determina que o código deve estar **aberto para extensão e fechado para modificação**.

Foi criada uma interface comum chamada `DescontoService`, responsável por definir o contrato de aplicação de descontos.  
Cada tipo de desconto passou a ser implementado em uma classe específica, contendo apenas sua própria regra de negócio.

Dessa forma, a classe `CalculadoraDeDesconto` deixou de possuir condicionais (`if/else` ou `switch`) e passou a atuar apenas como **orquestradora**, selecionando dinamicamente a estratégia adequada em tempo de execução.

### 🚀 Benefícios

- ✅ Permite adicionar novos descontos sem alterar código existente  
- ✅ Remove estruturas condicionais complexas  
- ✅ Reduz acoplamento entre as classes  
- ✅ Melhora organização e manutenção  
- ✅ Aumenta escalabilidade do sistema  
- ✅ Atende aos princípios SRP e OCP  

### ➕ Extensão

Para adicionar um novo desconto, basta criar uma nova classe que implemente `DescontoService`, sem necessidade de modificar qualquer outra parte do sistema.
