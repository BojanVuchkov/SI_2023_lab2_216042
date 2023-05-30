# Втора лабораториска вежба по Софтверско инженерство

## Бојан Вучков, бр. на индекс 216042

###  Control Flow Graph

![ControlFlowGraph](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/40186f46-be44-4163-9558-a4dfcec81c15)

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
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/31440fb3-8044-43dc-bcee-c82a3586f950)\
Со првиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/8e90f0f8-5039-4cb9-aa9a-ff717bccb3c5)\
Прво се проверува условот, потоа се фрла исклучок и завршува програмата.

Со вториот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/2a31ed2a-0639-4469-84c9-9be4881f18fd)\
Со овој тест пример се проверува условот дали корисничкото име е null. Овој услов е исполнет. Потоа, исполнет е и условот за дали емаилот содржи @ и . . Внатре во if-от се поминуваат сите линии затоа што има корисници коишто имаат ист емаил и лозинка и различен емаил и лозинка со постоечкиот корисник. Потоа се доаѓа до условот кадешто лозинката има помалку од 8 знаци и програмата завршува односно враќа false. 

Со третиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/07c58176-7206-482e-8aa9-f67ff7e92a31)
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/3cbc0f19-3328-4fbd-93a7-c4e228581f9d)\
Со овој тест пример условите за корисничкото име дали е null, емаилот дали содржи @ и . и дали лозинката е со помалку од 8 знаци и во неа се содржи корисничкото име не се исполнети па се влегува во else делот. Лозинката не содржи празно место, па исполнет е условот за тоа. Следните линии во if делот се поминуваат сите затоа што лозинката содржи еден од специјлните знаци и со тоа програмата завршува овде.

Со четвртиот тест пример се опфаќа овој дел од кодот.\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/5e218bed-7df8-4683-b6c9-dcc08afcff42)\
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/5be15e80-f60b-44e2-9529-0e0c570fb08d)\
Лозинката содржи празно место, па условот за празно место не е исполнет и со тоа програмата завршува односно враќа false.

Со петтиот тест пример се опфаќа овој дел од кодот.
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/4348d300-c466-445f-ac78-762db9b5a16e)
![image](https://github.com/BojanVuchkov/SI_2023_lab2_216042/assets/108575896/753de730-67a7-4fb7-acb7-ad6900541e48)\
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
