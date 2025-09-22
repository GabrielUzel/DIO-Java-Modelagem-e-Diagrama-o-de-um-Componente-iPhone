# Java Básico DIO - Modelagem de um componente iphone
Terceiro projeto do bootcamp de java da plataforma DIO. Este é um estudo sobre modelagem de classes utilizando o uml. A modelagem se baseia no primeiro iphone, apresentado em conferência em 2007.

## Modelagem 
```mermaid
classDiagram
    class MusicPlayer {
        <<interface>>
        +play()
        +pause()
        +chooseSong(String song)
        +nextSong()
        +previousSong()
        +changeVolume(int level)
        +showPlaylist()
    }

    class PhoneCall {
        <<interface>>
        +call(String number)
        +answerCall()
        +listenVoiceMail(String number)
        +hangUpCall()
        +sendMail(String number, String mensage)
        +blockNumber(String number)
        +showRecentCalls()
    }

    class InternetBrowser {
        <<interface>>
        +showPage(String url)
        +addNewTab()
        +refresh()
        +closeTab()
    }

    class iPhone {
        +turnOn()
        +turnOff()
        +restart()
        +showDeviceInfo()
        +checkBatteryLevel()
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> PhoneCall
    iPhone ..|> InternetBrowser
```
