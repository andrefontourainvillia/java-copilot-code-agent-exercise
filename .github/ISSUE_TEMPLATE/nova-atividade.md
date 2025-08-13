---
name: 🎯 Nova Atividade Extracurricular
about: Solicitar a criação de uma nova atividade extracurricular no sistema
title: "[NOVA ATIVIDADE] "
labels: ["enhancement", "atividade", "copilot"]
assignees: []

---

## 📋 Descrição da Nova Atividade

**Nome da Atividade:**
<!-- Exemplo: Clube de Robótica, Banda Escolar, etc. -->

**Categoria:**
<!-- Selecione: esportes, artes, acadêmico, tecnologia, música, literatura, etc. -->

**Descrição da Atividade:**
<!-- Explique brevemente o que é a atividade e seus objetivos -->

## ⏰ Informações de Horário

**Dias da Semana:**
<!-- Exemplo: Segunda e Quarta, ou Terça e Quinta -->

**Horário de Início:**
<!-- Formato HH:MM - Exemplo: 15:30 -->

**Horário de Término:**
<!-- Formato HH:MM - Exemplo: 17:00 -->

**Capacidade Máxima de Participantes:**
<!-- Número máximo de estudantes que podem se inscrever -->

## 👨‍🏫 Informações do Professor Responsável

**Nome de Usuário do Professor:**
<!-- Seu username no sistema (ex: teacher.silva) -->

**Nome de Exibição:**
<!-- Como seu nome deve aparecer no sistema (ex: Prof. Silva) -->

## 📝 Critérios de Aceitação

- [ ] Nova atividade criada no banco de dados com todas as informações fornecidas
- [ ] Atividade aparece na listagem principal do sistema web
- [ ] Estudantes conseguem se inscrever na nova atividade
- [ ] Filtros de dia e horário funcionam corretamente com a nova atividade
- [ ] Validações de capacidade máxima estão funcionando
- [ ] Professor responsável consegue gerenciar inscrições da atividade

## 🔧 Detalhes Técnicos para Implementação

### Arquivos que Precisam ser Modificados:
- `infrastructure/migrations/` - Adicionar dados da nova atividade na migração
- `domain/entities/Activity.java` - Verificar se suporta os dados informados
- `application/usecases/ActivityUseCase.java` - Verificar funcionalidades necessárias

### Validações Necessárias:
- Nome da atividade único
- Horários válidos (início antes do término)
- Capacidade máxima > 0
- Dias da semana válidos
- Professor responsável existe no sistema

### Testes Necessários:
- Teste de criação da atividade
- Teste de inscrição de estudante
- Teste de validação de capacidade
- Teste de filtros no frontend

## 🎯 Contexto Adicional

**Urgência:** 
<!-- Normal/Alta - justifique se for alta -->

**Data Limite (se aplicável):**
<!-- Se a atividade precisa estar disponível até uma data específica -->

**Observações Especiais:**
<!-- Qualquer informação adicional relevante -->

---

### ✅ Checklist para o Agente Copilot

- [ ] Validar que todas as informações obrigatórias foram fornecidas
- [ ] Verificar se já existe atividade com o mesmo nome
- [ ] Confirmar que o professor responsável existe no sistema
- [ ] Implementar a nova atividade na migração do banco
- [ ] Executar testes para validar a implementação
- [ ] Verificar que a atividade aparece corretamente no frontend
- [ ] Documentar as mudanças se necessário