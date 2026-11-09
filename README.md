# JARVIS — projeto Android inicial

Este é o esqueleto inicial do aplicativo JARVIS em Kotlin + Jetpack Compose.

## O que já está preparado
- Tela inicial com identidade JARVIS.
- Área reservada para mapa.
- Botão de conversa por voz (interface; ainda sem reconhecimento/síntese conectado).
- Área de memória (interface; ainda sem banco de dados conectado).

## O que ainda precisa ser configurado
1. Abrir/importar o projeto no Android Studio.
2. Ajustar a versão do Android Gradle Plugin/Gradle se o Android Studio solicitar.
3. Configurar Google Maps e uma chave de API para o mapa real.
4. Definir o serviço de IA e um backend seguro. A chave da IA não deve ficar dentro do aplicativo.
5. Implementar reconhecimento de voz, fala e banco de dados persistente.

## Estrutura
- `app/src/main/java/com/rn/jarvis/MainActivity.kt`: tela principal.
- `app/src/main/AndroidManifest.xml`: permissões e configuração Android.
- `settings.gradle.kts`, `build.gradle.kts`: configuração Gradle.

Este pacote é um ponto de partida de código, não um APK instalado nem uma versão funcional completa.
