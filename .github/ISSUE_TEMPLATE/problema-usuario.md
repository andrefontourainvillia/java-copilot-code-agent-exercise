---
name: 👤 Problema de Conta de Usuário
about: Solicitar ajuda com login, acesso ou gestão de conta de professor
title: "[USUÁRIO] "
labels: ["usuário", "acesso", "copilot"]
assignees: []

---

## 👤 Informações do Usuário

**Nome de Usuário:**
<!-- Seu username atual no sistema (ex: teacher.silva) -->

**Nome de Exibição Desejado:**
<!-- Como seu nome deve aparecer no sistema (ex: Prof. Silva) -->

**Email de Contato:**
<!-- Para confirmações e comunicações -->

## 🚨 Tipo de Problema

**☑️ Marque o tipo de problema:**

- [ ] **Não Consigo Fazer Login**
  - Mensagem de erro: 
  - Última vez que conseguiu acessar: 

- [ ] **Esqueci Minha Senha**
  - Username: 
  - Email associado: 

- [ ] **Preciso de Nova Conta**
  - Username desejado: 
  - Nível de acesso: Professor/Administrador
  - Justificativa: 

- [ ] **Alterar Informações da Conta**
  - Informação a alterar: Nome de usuário/Nome de exibição/Senha
  - Valor atual: 
  - Novo valor: 

- [ ] **Problemas de Permissão**
  - Ação que não consigo realizar: 
  - Mensagem de erro (se houver): 

- [ ] **Desativar/Remover Conta**
  - Motivo: 
  - Data para desativação: 

## 🔍 Detalhes do Problema

**Descrição Detalhada:**
<!-- Explique o problema com mais detalhes -->

**Comportamento Esperado:**
<!-- O que deveria acontecer -->

**O Que Está Acontecendo:**
<!-- Descreva o comportamento atual -->

**Tentativas de Solução:**
<!-- O que já tentou fazer para resolver -->

## 📱 Informações do Ambiente

**Navegador Utilizado:**
<!-- Chrome, Firefox, Safari, Edge -->

**Sistema Operacional:**
<!-- Windows, macOS, Linux -->

**Já Funcionou Antes:**
<!-- Sim/Não - Se sim, quando parou de funcionar -->

## 📝 Critérios de Aceitação

- [ ] Problema de acesso resolvido
- [ ] Usuario consegue fazer login normalmente
- [ ] Permissões apropriadas configuradas
- [ ] Informações da conta atualizadas conforme solicitado
- [ ] Sistema funciona conforme esperado para o usuário

## 🔐 Informações de Segurança

**Urgência:**
<!-- Normal/Alta - justifique se for alta -->

**Acesso Necessário Imediatamente:**
<!-- Sim/Não - Se sim, explique por que -->

**Outras Contas Afetadas:**
<!-- Se o problema afeta outros usuários também -->

---

### ✅ Checklist para o Agente Copilot

#### Para Problemas de Login:
- [ ] Verificar se o usuário existe na base de dados
- [ ] Verificar configuração de senha/hash
- [ ] Testar autenticação com credenciais fornecidas
- [ ] Verificar logs de tentativas de login

#### Para Novos Usuários:
- [ ] Validar informações fornecidas
- [ ] Verificar se username não está em uso
- [ ] Criar usuário na migração do banco
- [ ] Configurar permissões apropriadas
- [ ] Testar login do novo usuário

#### Para Alterações de Conta:
- [ ] Validar alterações solicitadas
- [ ] Verificar que mudanças não quebram integridade
- [ ] Implementar alterações na base de dados
- [ ] Testar funcionalidades após mudanças

#### Para Problemas de Permissão:
- [ ] Verificar role do usuário no sistema
- [ ] Verificar configurações de segurança
- [ ] Confirmar endpoints e permissões necessárias
- [ ] Testar acesso após correções

### 🔧 Detalhes Técnicos

**Arquivos Relevantes:**
- `domain/entities/Teacher.java` - Entidade do usuário
- `infrastructure/migrations/V001_InitialDatabaseSetup.java` - Dados de usuários
- `infrastructure/persistence/TeacherRepositoryImpl.java` - Repositório
- `application/usecases/` - Casos de uso de autenticação

**Comandos para Teste:**
```bash
# Verificar usuários no banco
# (depende da configuração do MongoDB)

# Testar login via API
curl -X POST http://localhost:8080/auth/login \
  -d "teacher_username=username&password=password"

# Executar testes de autenticação
mvn test -Dtest=*Authentication*
```

**Variáveis de Ambiente:**
```bash
# Senhas padrão configuradas via ambiente
TEACHER_RODRIGUEZ_PASSWORD=senha123
TEACHER_CHEN_PASSWORD=senha123
ADMIN_PASSWORD=admin123
```