---
name: ✏️ Modificar Atividade Existente
about: Solicitar alterações em uma atividade extracurricular já existente
title: "[MODIFICAR ATIVIDADE] "
labels: ["enhancement", "atividade", "modificação", "copilot"]
assignees: []

---

## 🎯 Atividade a Ser Modificada

**Nome Atual da Atividade:**
<!-- Exemplo: Chess Club, Art Club, etc. -->

## 📝 Alterações Solicitadas

### Informações Básicas
**☑️ Marque os campos que devem ser alterados:**

- [ ] **Nome da Atividade**
  - Nome atual: 
  - Novo nome: 

- [ ] **Descrição da Atividade**
  - Nova descrição: 

- [ ] **Categoria**
  - Categoria atual: 
  - Nova categoria: 

### Horários e Agenda
- [ ] **Dias da Semana**
  - Dias atuais: 
  - Novos dias: 

- [ ] **Horário de Início**
  - Horário atual: 
  - Novo horário: 

- [ ] **Horário de Término**
  - Horário atual: 
  - Novo horário: 

### Capacidade e Gestão
- [ ] **Capacidade Máxima**
  - Capacidade atual: 
  - Nova capacidade: 

- [ ] **Professor Responsável**
  - Professor atual: 
  - Novo professor: 

## 🔍 Justificativa da Mudança

**Motivo da Alteração:**
<!-- Explique por que as mudanças são necessárias -->

**Impacto nos Estudantes Inscritos:**
<!-- Como essas mudanças afetarão os estudantes já inscritos? -->

## 📝 Critérios de Aceitação

- [ ] Alterações aplicadas corretamente na base de dados
- [ ] Informações atualizadas aparecem no sistema web
- [ ] Estudantes já inscritos permanecem inscritos (se aplicável)
- [ ] Novas inscrições respeitam as regras atualizadas
- [ ] Filtros de busca funcionam com as informações atualizadas
- [ ] Notificação aos estudantes inscritos sobre mudanças (se necessário)

## 🚨 Considerações Especiais

**Conflitos de Horário:**
- [ ] Verificar se não há conflito com outras atividades
- [ ] Validar se o horário está dentro do funcionamento da escola

**Estudantes Já Inscritos:**
- [ ] Manter inscrições existentes
- [ ] Verificar se nova capacidade comporta inscritos atuais
- [ ] Comunicar mudanças aos participantes

## 🔧 Detalhes Técnicos para Implementação

### Arquivos que Podem Precisar de Modificação:
- `infrastructure/migrations/` - Atualizar dados da atividade
- `domain/entities/Activity.java` - Verificar validações necessárias
- `application/usecases/ActivityUseCase.java` - Implementar lógica de atualização
- `presentation/controllers/ActivityController.java` - Endpoint de atualização (se necessário)

### Validações Necessárias:
- Nome único (se alterando nome)
- Horários válidos
- Capacidade suficiente para inscritos atuais
- Professor responsável existe no sistema
- Não criar conflitos de agenda

### Dados a Preservar:
- Lista de participantes atual
- Histórico de atividade
- Relacionamentos com professores

## ⚠️ Pontos de Atenção

**Urgência:** 
<!-- Normal/Alta - justifique se for alta -->

**Data para Implementar:**
<!-- Quando a mudança deve estar ativa -->

**Comunicação Necessária:**
<!-- Se estudantes/professores precisam ser notificados -->

---

### ✅ Checklist para o Agente Copilot

- [ ] Validar que a atividade informada existe no sistema
- [ ] Confirmar que todas as alterações solicitadas são válidas
- [ ] Verificar impacto nos estudantes já inscritos
- [ ] Implementar as mudanças na base de dados
- [ ] Executar testes para validar as alterações
- [ ] Verificar se não há conflitos de horário
- [ ] Confirmar que a atividade atualizada aparece corretamente no frontend
- [ ] Documentar as alterações realizadas