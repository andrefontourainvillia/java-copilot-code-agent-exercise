---
name: 🐛 Relatório de Bug
about: Relatar um problema ou erro no sistema de gestão escolar
title: "[BUG] "
labels: ["bug", "copilot"]
assignees: []

---

## 🐛 Descrição do Bug

**Resumo do Problema:**
<!-- Descreva brevemente o que não está funcionando -->

**Comportamento Esperado:**
<!-- O que deveria acontecer -->

**Comportamento Atual:**
<!-- O que está acontecendo atualmente -->

## 🔍 Informações Detalhadas

**Área do Sistema Afetada:**
<!-- Selecione: Login, Listagem de Atividades, Inscrições, Filtros, Admin, etc. -->

**Frequência do Problema:**
<!-- Sempre, Às vezes, Raramente -->

**Usuários Afetados:**
<!-- Professores, Estudantes, Administradores, Todos -->

## 📱 Ambiente

**Navegador:**
<!-- Chrome, Firefox, Safari, Edge, etc. -->

**Sistema Operacional:**
<!-- Windows, macOS, Linux, Mobile -->

**Tela/Resolução (se relevante):**
<!-- Desktop, Tablet, Mobile -->

## 🔄 Passos para Reproduzir

1. Vá para...
2. Clique em...
3. Preencha...
4. Veja o erro...

**Dados de Teste (se aplicável):**
<!-- Informações específicas usadas para reproduzir o erro -->

## 🖼️ Evidências

**Mensagem de Erro (se houver):**
```
Cole aqui a mensagem de erro exata
```

**Screenshot (se possível):**
<!-- Anexe ou descreva o que aparece na tela -->

**Console do Navegador (se aplicável):**
```javascript
// Cole aqui erros do console (F12 > Console)
```

## 💥 Impacto

**Severidade:**
<!-- Crítico (sistema não funciona), Alto (funcionalidade importante quebrada), Médio (inconveniente), Baixo (cosmético) -->

**Urgência:**
<!-- Imediato (bloqueador), Alto (próximos dias), Normal (próxima versão) -->

**Workaround Disponível:**
<!-- Existe alguma forma de contornar o problema? -->

## 📝 Critérios de Aceitação para Correção

- [ ] O comportamento relatado não ocorre mais
- [ ] A funcionalidade funciona conforme esperado
- [ ] Não há regressões em outras funcionalidades
- [ ] Testes automated cobrem o cenário corrigido

## 🔧 Informações Técnicas (Se Conhecidas)

**Possível Causa:**
<!-- Se você tem ideia do que pode estar causando -->

**Logs Relevantes:**
```
Cole aqui logs do servidor ou aplicação se disponíveis
```

**Endpoint API Relacionado:**
<!-- Se o bug está relacionado a uma API específica -->

## 📋 Contexto Adicional

**Quando o Problema Começou:**
<!-- Sempre existiu, começou recentemente, após alguma mudança -->

**Funcionalidades Relacionadas Afetadas:**
<!-- Outras partes do sistema que podem estar impactadas -->

---

### ✅ Checklist para o Agente Copilot

- [ ] Reproduzir o bug seguindo os passos fornecidos
- [ ] Identificar a causa raiz do problema
- [ ] Verificar se existem casos similares ou relacionados
- [ ] Implementar correção mínima e precisa
- [ ] Criar/atualizar testes para cobrir o cenário
- [ ] Executar testes para garantir que não há regressões
- [ ] Verificar que a correção resolve o problema completamente
- [ ] Documentar a solução se necessário

### 🎯 Dicas para Investigação

**Arquivos Prováveis:**
- Frontend: `src/main/resources/static/`
- Controllers: `src/main/java/.../presentation/controllers/`
- Use Cases: `src/main/java/.../application/usecases/`
- Entities: `src/main/java/.../domain/entities/`

**Comandos Úteis:**
```bash
# Executar testes
mvn test

# Executar aplicação local
mvn spring-boot:run

# Verificar logs
tail -f logs/application.log
```