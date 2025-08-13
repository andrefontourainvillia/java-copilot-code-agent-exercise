---
name: 📝 Problema com Inscrições
about: Relatar problemas com inscrições ou cancelamentos de estudantes
title: "[INSCRIÇÃO] "
labels: ["inscrição", "estudante", "copilot"]
assignees: []

---

## 👨‍🎓 Informações do Estudante

**Email do Estudante:**
<!-- Email usado para a inscrição -->

**Nome do Estudante (se conhecido):**
<!-- Nome completo para facilitar identificação -->

## 🎯 Atividade Relacionada

**Nome da Atividade:**
<!-- Atividade onde ocorreu o problema -->

**Professor Responsável:**
<!-- Username do professor que tentou fazer a ação -->

## 🚨 Tipo de Problema

**☑️ Marque o tipo de problema:**

- [ ] **Não Consegue Se Inscrever**
  - Mensagem de erro: 
  - Horário da tentativa: 

- [ ] **Não Consegue Cancelar Inscrição**
  - Mensagem de erro: 
  - Motivo do cancelamento: 

- [ ] **Inscrição Duplicada**
  - Estudante aparece mais de uma vez na lista
  - Como foi identificado: 

- [ ] **Estudante Não Aparece na Lista**
  - Inscrição foi realizada mas não aparece
  - Data/hora da inscrição: 

- [ ] **Problema de Capacidade**
  - Atividade deveria estar cheia mas aceita mais inscrições
  - Ou vice-versa: atividade recusa inscrições mas tem vagas

- [ ] **Inscrição de Email Inválido**
  - Email não segue formato correto
  - Sistema deveria ter rejeitado mas aceitou

## 🔍 Detalhes do Problema

**Descrição Detalhada:**
<!-- Explique exatamente o que aconteceu -->

**Comportamento Esperado:**
<!-- O que deveria ter acontecido -->

**Comportamento Atual:**
<!-- O que realmente aconteceu -->

**Passos que Levaram ao Problema:**
1. 
2. 
3. 

## 📊 Estado Atual da Atividade

**Capacidade Máxima:**
<!-- Quantos estudantes a atividade suporta -->

**Número Atual de Inscritos:**
<!-- Quantos estudantes estão inscritos atualmente -->

**Lista de Participantes (se necessário):**
<!-- Cole aqui a lista se for relevante para o problema -->

## 📝 Ação Necessária

**☑️ Marque a ação solicitada:**

- [ ] **Inscrever Estudante**
  - Email: 
  - Justificativa: 

- [ ] **Cancelar Inscrição**
  - Email: 
  - Justificativa: 

- [ ] **Corrigir Lista de Participantes**
  - Problema específico: 
  - Correção necessária: 

- [ ] **Ajustar Capacidade da Atividade**
  - Capacidade atual: 
  - Nova capacidade: 
  - Justificativa: 

- [ ] **Limpar Inscrições Duplicadas**
  - Emails afetados: 

- [ ] **Verificar Integridade dos Dados**
  - Verificar toda a lista de participantes
  - Remover emails inválidos

## 📱 Informações Técnicas

**Navegador Usado (se relevante):**
<!-- Chrome, Firefox, Safari, Edge -->

**Mensagem de Erro Completa:**
```
Cole aqui a mensagem de erro exata, se houver
```

**Timestamp do Problema:**
<!-- Data e hora exatas quando o problema ocorreu -->

## 📝 Critérios de Aceitação

- [ ] Problema de inscrição completamente resolvido
- [ ] Estudante aparece/não aparece na lista conforme esperado
- [ ] Capacidade da atividade respeitada
- [ ] Não há duplicatas na lista de participantes
- [ ] Funcionalidade de inscrição/cancelamento funciona normalmente
- [ ] Validações apropriadas funcionando

## 🚨 Urgência

**Prioridade:**
<!-- Baixa/Média/Alta/Crítica -->

**Data Limite:**
<!-- Se há prazo para resolver -->

**Impacto:**
<!-- Quantos estudantes/professores são afetados -->

---

### ✅ Checklist para o Agente Copilot

#### Análise do Problema:
- [ ] Verificar estado atual da atividade no banco de dados
- [ ] Confirmar detalhes da inscrição/estudante
- [ ] Verificar logs de tentativas de inscrição
- [ ] Identificar causa raiz do problema

#### Correção de Dados:
- [ ] Corrigir lista de participantes se necessário
- [ ] Remover duplicatas se existirem
- [ ] Ajustar capacidade se solicitado
- [ ] Validar integridade dos dados após correção

#### Funcionalidade:
- [ ] Verificar que processo de inscrição funciona corretamente
- [ ] Testar processo de cancelamento
- [ ] Validar que capacidade máxima é respeitada
- [ ] Confirmar validações de email funcionando

#### Testes:
- [ ] Executar testes de inscrição/cancelamento
- [ ] Testar cenários de capacidade máxima
- [ ] Verificar validações de entrada
- [ ] Confirmar que interface reflete mudanças

### 🛠️ Arquivos Relevantes

**Backend:**
- `application/usecases/StudentRegistrationUseCase.java` - Lógica de inscrições
- `domain/entities/Activity.java` - Entidade da atividade
- `domain/valueobjects/Email.java` - Validação de email
- `presentation/controllers/ActivityController.java` - Endpoints

**Frontend:**
- `src/main/resources/static/app.js` - JavaScript de inscrições
- `src/main/resources/static/index.html` - Interface de inscrição

**Comandos para Teste:**
```bash
# Executar testes de inscrição
mvn test -Dtest=StudentRegistrationUseCaseTest

# Testar API de inscrição
curl -X POST http://localhost:8080/activities/{activityName}/signup \
  -d "email=test@mergington.edu&teacher_username=teacher1"

# Executar aplicação completa
mvn spring-boot:run
```