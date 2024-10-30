# Etapa 1: Compilação
FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build-env
WORKDIR /app

# Copiar os arquivos de projeto e restaurar dependências
COPY *.csproj ./
RUN dotnet restore

# Copiar o restante do código e compilar
COPY . ./
RUN dotnet publish -c Release -o /out

# Etapa 2: Runtime
FROM mcr.microsoft.com/dotnet/aspnet:6.0
WORKDIR /app
COPY --from=build-env /out .

# Expor a porta padrão da API
EXPOSE 5000

# Executar a aplicação
ENTRYPOINT ["dotnet", "NomeDoSeuProjeto.dll"]
