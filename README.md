# Втора лабораториска вежба по Софтверско инженерство

## Бојан Вучков, бр. на индекс 216042

###  Control Flow Graph

![ControlFlowGraph](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/fc995738-2902-4e91-a12c-244ccca403ca)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 11. Ја добив според бројот на регионите.

### Тест случаи според критериумот Every Branch

1.User:\
  username: Bojan\
  password: null\
  email: bojan@gmail.com\
  Users:\
  username: Stefan\
  password: stefan123\
  email: stefan@gmail.com\
  username: bojan@gmail.com\
  password: bojan123\
  email: bojan@gmail.com\
2.User:\
  username: null\
  password: finki\
  email: bojan@gmail.com\
  Users:\
  username: Stefan\
  password: stefan123\
  email: stefan@gmail.com\
  username: bojan@gmail.com\
  password: bojan123\
  email: bojan@gmail.com\
3.User:\
  username: Bojan\
  password: softversko123$\
  email: bojangmail.com\
  Users:\
  username: Stefan\
  password: stefan123\
  email: stefan@gmail.com\
  username: bojan@gmail.com\
  password: bojan123\
  email: bojan@gmail.com\
4.User:\
  username: Bojan\
  password: softversko 123$\
  email: bojan@gmail.com\
  Users:\
  username: Stefan\
  password: stefan123\
  email: stefan@gmail.com\
  username: bojan@gmail.com\
  password: bojan123\
  email: bojan@gmail.com\
5.User:\
  username: Bojan\
  password: softversko123\
  email: bojan@gmail.com\
  Users:\
  username: Stefan\
  password: stefan123\
  email: stefan@gmail.com\
  username: bojan@gmail.com\
  password: bojan123\
  email: bojan@gmail.com\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/dfb4718b-3d82-4c6c-ae7b-438436587a0c)\
Со првиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/9ceb5ab5-3d93-4b75-b18c-53f521fda714)\
Прво се проверува условот, потоа се фрла исклучок и завршува програмата.

Со вториот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/8a7a3712-96f7-4909-81b7-c7e421ab12e3)\
Со овој тест пример се проверува условот дали корисничкото име е null. Овој услов е исполнет. Потоа, исполнет е и условот за дали емаилот содржи @ и . . Внатре во if-от се поминуваат сите линии затоа што има корисници коишто имаат ист емаил и лозинка и различен емаил и лозинка со постоечкиот корисник. Потоа се доаѓа до условот кадешто лозинката има помалку од 8 знаци и програмата завршува односно враќа false. 

Со третиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/0b0a609a-0bc1-4dca-903a-ff947afc0240)\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/775eb732-2024-4eb9-aa57-e86795aa2aa2)\
Со овој тест пример условите за корисничкото име дали е null, емаилот дали содржи @ и . и дали лозинката е со помалку од 8 знаци и во неа се содржи корисничкото име не се исполнети па се влегува во else делот. Лозинката не содржи празно место, па исполнет е условот за тоа. Следните линии во if делот се поминуваат сите затоа што лозинката содржи еден од специјлните знаци и со тоа програмата завршува овде.

Со четвртиот тест пример се опфаќа овој дел од кодот.\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/637548b6-7a56-4d41-977a-3948d562c611)\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/3b42bfe0-6aff-4839-885e-f0e3be081b65)\
Лозинката содржи празно место, па условот за празно место не е исполнет и со тоа програмата завршува односно враќа false.

Со петтиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/acabe998-e660-4bab-9a6d-e0c47be403a6)\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/3b42bfe0-6aff-4839-885e-f0e3be081b65)\
Со овој тест пример бидејќи лозинката не содржи специјален знак кога завршува for циклусот, програмата истотака завршува односно враќа false.

### Тест случаи според критериумот Multiple Condition

if (user==null || user.getPassword()==null || user.getEmail()==null)\
1.User: null\
2.User:\
  username: Bojan\
  password: null\
  email: bojan@gmail.com\
3.User:\
  username: Bojan\
  password: bojan123\
  email: null\
4.User:\
  username: Bojan\
  password: bojan123\
  email: bojan@gmail.com\
Првите 3 тест примери би го исполниле условот. Со првиот тест пример условот со проверка ќе заврши кај user==null бидејќи user e null. Со вториот тест пример условот со проверка ќе заврши кај user.getPassword()==null бидејќи user.getPassword() e null. Со третиот тест пример условот со проверка ќе заврши кај user.getEmail()==null бидејќи user.getEmail() e null.\
Последниот тест пример нема да го исполни условот бидејќи ниту user ниту password ниту email не е null.

### Објаснување на напишаните Unit Tests

Со asserтFalse се тестира дали функцијата со дадениот тест пример ќе врати false.\
Со asserтTrue се тестира дали функцијата со дадениот тест пример ќе врати true. \
Со asserтThrows се тестира дали функцијата со дадениот тест пример ќе фрли исклучок.\
Објаснувањето за користените тест примери е во претходните барања.
