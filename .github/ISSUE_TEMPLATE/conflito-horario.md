---
name: 📅 Conflito de Horário
about: Relatar ou resolver conflitos de agenda entre atividades
title: "[CONFLITO] "
labels: ["conflito", "agenda", "copilot"]
assignees: []

---

## ⚠️ Descrição do Conflito

**Tipo de Conflito:**
<!-- Selecione: Atividades no mesmo horário, Professor com dupla agenda, Sala ocupada, etc. -->

**Atividades Envolvidas:**
<!-- Liste as atividades que estão em conflito -->
1. 
2. 

**Descrição do Problema:**
<!-- Explique detalhadamente qual é o conflito -->

## 📅 Informações de Horário

### Atividade 1
**Nome:** 
**Dias:** 
**Horário:** 
**Professor:** 
**Local (se aplicável):** 

### Atividade 2
**Nome:** 
**Dias:** 
**Horário:** 
**Professor:** 
**Local (se aplicável):** 

## 🔍 Análise do Conflito

**Como o Conflito Foi Identificado:**
<!-- Durante inscrição, visualização da agenda, etc. -->

**Impacto nos Estudantes:**
<!-- Quantos estudantes são afetados e como -->

**Impacto nos Professores:**
<!-- Como afeta os professores responsáveis -->

## 💡 Solução Proposta

**☑️ Marque a solução preferida:**

- [ ] **Alterar Horário da Atividade 1**
  - Novo horário proposto: 
  - Justificativa: 

- [ ] **Alterar Horário da Atividade 2**
  - Novo horário proposto: 
  - Justificativa: 

- [ ] **Alterar Dia da Semana**
  - Atividade a alterar: 
  - Novos dias propostos: 
  - Justificativa: 

- [ ] **Redistribuir Professores**
  - Nova distribuição: 
  - Justificativa: 

- [ ] **Alteração de Local/Sala**
  - Nova configuração: 
  - Justificativa: 

- [ ] **Outra Solução**
  - Descrição: 

## 📋 Validações Necessárias

**Aprovação dos Professores:**
- [ ] Professor da Atividade 1 concorda com mudanças
- [ ] Professor da Atividade 2 concorda com mudanças

**Impacto nos Estudantes Inscritos:**
- [ ] Estudantes da Atividade 1 podem comparecer no novo horário
- [ ] Estudantes da Atividade 2 podem comparecer no novo horário
- [ ] Comunicação enviada aos estudantes afetados

**Recursos e Infraestrutura:**
- [ ] Novo horário não conflita com outras atividades
- [ ] Salas/equipamentos disponíveis no novo horário
- [ ] Transporte escolar não é afetado (se aplicável)

## 📝 Critérios de Aceitação

- [ ] Conflito de horário completamente resolvido
- [ ] Nenhuma nova sobreposição criada
- [ ] Estudantes inscritos mantidos nas atividades
- [ ] Professores podem cumprir seus compromissos
- [ ] Sistema reflete as mudanças corretamente
- [ ] Filtros de horário funcionam adequadamente

## 🚨 Urgência e Prioridade

**Urgência:**
<!-- Imediata (bloqueador), Alta (esta semana), Normal (próxima semana) -->

**Data Limite para Resolução:**
<!-- Quando o conflito precisa estar resolvido -->

**Consequências se Não Resolvido:**
<!-- O que acontece se o conflito não for solucionado -->

## 📞 Comunicação Necessária

**Pessoas a Notificar:**
- [ ] Professores envolvidos
- [ ] Estudantes inscritos
- [ ] Administração escolar
- [ ] Pais/responsáveis (se necessário)

**Método de Comunicação:**
<!-- Email, sistema interno, aviso na escola, etc. -->

## 🔧 Detalhes Técnicos para Resolução

**Dados a Atualizar:**
- [ ] Horários na base de dados
- [ ] Cronograma de professores
- [ ] Sistema de reserva de salas (se existir)

**Validações a Implementar:**
- [ ] Verificação automática de conflitos
- [ ] Alertas para novos conflitos
- [ ] Validação de disponibilidade

---

### ✅ Checklist para o Agente Copilot

#### Análise do Conflito:
- [ ] Confirmar que o conflito realmente existe
- [ ] Identificar todas as atividades/pessoas afetadas
- [ ] Verificar dados atuais no sistema
- [ ] Analisar impacto da mudança proposta

#### Validação da Solução:
- [ ] Verificar que solução proposta é viável
- [ ] Confirmar que não cria novos conflitos
- [ ] Validar disponibilidade de recursos necessários
- [ ] Checar compatibilidade com outros compromissos

#### Implementação:
- [ ] Atualizar dados das atividades afetadas
- [ ] Verificar integridade dos dados após mudanças
- [ ] Executar testes para validar mudanças
- [ ] Confirmar que sistema reflete as alterações

#### Prevenção:
- [ ] Implementar validações para prevenir conflitos futuros
- [ ] Adicionar alertas no sistema (se necessário)
- [ ] Documentar processo de resolução

### 🛠️ Comandos Úteis para Investigação

```bash
# Executar aplicação para testar
mvn spring-boot:run

# Testar funcionalidades de horário
mvn test -Dtest=*Schedule*

# Verificar dados de atividades
# (consultar base MongoDB se necessário)
```

### 📂 Arquivos Relevantes

- `domain/entities/Activity.java` - Lógica de horários
- `domain/valueobjects/ScheduleDetails.java` - Detalhes de agenda
- `infrastructure/migrations/V001_InitialDatabaseSetup.java` - Dados iniciais
- `application/usecases/ActivityUseCase.java` - Lógica de negócio