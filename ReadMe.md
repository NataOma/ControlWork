### [Итоговая контрольная работа по блоку специализация]

#### Задание

Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals.

#### 1. Использование команды cat в Linux

Создать два текстовых файла: pets.txt (Домашние животные) и pack_animals(вьючные животные), используя команду cat в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.  
Объединить содержимое этих двух файлов в один и просмотреть его содержимое.  
Переименовать получившийся файл в human_friends.txt.

```
mkdir test
cd test
ls

cat <<EOT >> pets.txt
cat
dog
hamster
EOT

# Проверяю:
cat pets.txt   
# Вывод:
cat  
dog  
hamster

cat <<EOT >> pack_animals.txt  
horse  
camel  
donkey
EOT

# Проверяю:
cat pack_animals.txt   
# Вывод:  
horse  
camel  
donkey

# Объединяю два файла в результирующий:  
cat pets.txt pack_animals.txt > animals.txt

# Проверяю:  
cat animals.txt   
# Вывод:  
cat  
dog  
hamster  
horse  
camel  
donkey  

# Переименовываю файл:  
mv animals.txt human_friends.txt  
# Проверяю:  
ls  
# Вывод:  
human_friends.txt  pack_animals.txt  pets.txt
```

[Команды в терминале](OC_and_vizual\task1.txt)

#### 2. Работа с директориями в Linux
Создать новую директорию и переместить туда файл "Human Friends".
```
# Проверяю:
ls
# Вывод:
human_friends.txt  pack_animals.txt  pets.txt
# Создаю новую деректорию:
mkdir new
# Проверяю:
ls
# Вывод:
human_friends.txt  new  pack_animals.txt  pets.txt
# Перемещаю фаил:
mv human_friends.txt new
# Проверяю:
ls
# Вывод:
new  pack_animals.txt  pets.txt
ls new
# Вывод:
human_friends.txt
```
[Команды в терминале](OC_and_vizual\task2.txt)

#### 3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину”
Подключить дополнительный репозиторий MySQL.
Установить один из пакетов из этого репозитория.

```
wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.30-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.30-1_all.deb

sudo apt update
sudo apt install mysql-server

# Проверяю:
systemctl status mysql
# Вывод:
● mysql.service - MySQL Community Server
     Loaded: loaded (/usr/lib/systemd/system/mysql.service; enabled; preset: enabled)
     Active: active (running) since Mon 2024-06-17 20:36:27 UTC; 1min 32s ago
       Docs: man:mysqld(8)
             http://dev.mysql.com/doc/refman/en/using-systemd.html
   Main PID: 2647 (mysqld)
     Status: "Server is operational"
      Tasks: 34 (limit: 4613)
     Memory: 430.9M (peak: 444.3M)
        CPU: 1.277s
     CGroup: /system.slice/mysql.service
             └─2647 /usr/sbin/mysqld

июн 17 20:36:26 ki systemd[1]: Starting mysql.service - MySQL Community Server...
июн 17 20:36:27 ki systemd[1]: Started mysql.service - MySQL Community Server.
```

[Команды в терминале](OC_and_vizual\task3.txt)

#### 4. Управление deb-пакетами

Установить и удалить deb-пакет с помощью dpkg.

```
# Загружаю пакет nginx:
wget -c http://ftp.ru.debian.org/debian/pool/main/n/nginx/nginx_1.22.1-9_amd64.deb
# Устанавливаю пакет:
sudo dpkg -i nginx_1.22.1-9_amd64.deb
# Исправление зависимостей…
sudo apt-get install -f

# Удаляю пакет:
sudo dpkg -r nginx nginx-common
```

[Команды в терминале](OC_and_vizual\task4.txt)
#### 5. Выложить историю команд в терминале ubuntu

Вывожу крайние 100 команд:

```
history 100  
```
[Часть истории команд](OC_and_vizual\linucshystory.jpg)
#### 6. Диаграмма классов
Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади,
верблюды и ослы.

Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)
![scheme](OOP\Диаграмма.png)
```
Animals
  - id
  - name
  - birthday

Pets (наследует от Animals)
  - typePet

  Cat (наследует от Pets)
    - commands

  Dog (наследует от Pets)
    - commands

  Hamster (наследует от Pets)
    - commands

PackAnimals (наследует от Animals)
  - typePackAnimals

  Horse (наследует от PackAnimals)
    - commands

  Camel (наследует от PackAnimals)
    - commands

  Donkey (наследует от PackAnimals)
    - commands
```
#### 7. Работа с MySQL

1) Создание базы данных:

```sql

CREATE DATABASE `HumanFriends`;

USE `HumanFriends`;

```

2) Создание таблиц:

```sql

CREATE TABLE Pets (

    id INT AUTO_INCREMENT PRIMARY KEY,

    name VARCHAR(50) NOT NULL,

    type VARCHAR(20) NOT NULL,

    birthDate DATE NOT NULL,

    commands VARCHAR(100)

);


CREATE TABLE PackAnimals (

    id INT AUTO_INCREMENT PRIMARY KEY,

    name VARCHAR(50) NOT NULL,

    type VARCHAR(20) NOT NULL,

    birthDate DATE NOT NULL,

    commands VARCHAR(100)

);

```

3) Заполнение таблиц данными:

```sql

INSERT INTO Pets (name, type, birthDate, commands) VALUES

('Fido', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),

('Whiskers', 'Cat', '2019-05-15', 'Sit, Pounce'),

...


INSERT INTO PackAnimals (name, type, birthDate, commands) VALUES

('Thunder', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),

('Sandy', 'Camel', '2016-11-03', 'Walk, Carry Load'),

...

```


4) Удаление записей о верблюдах:

```sql

DELETE FROM PackAnimals WHERE type = 'Camel';

```


5) Объединение таблиц лошадей и ослов:

```sql

CREATE TABLE HorsesAndDonkeys AS

SELECT id, name, type, birthDate, commands

FROM PackAnimals

WHERE type IN ('Horse', 'Donkey');

```


6) Создание таблицы для животных 1-3 лет и вычисление возраста:

```sql

CREATE TABLE YoungAnimals AS

SELECT *, TIMESTAMPDIFF(MONTH, birthDate, CURDATE())/12 AS age

FROM Pets

WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3

UNION

SELECT *, TIMESTAMPDIFF(MONTH, birthDate, CURDATE())/12 AS age

FROM PackAnimals

WHERE TIMESTAMPDIFF(YEAR, birthDate, CURDATE()) BETWEEN 1 AND 3;

```


7) Объединение всех таблиц в одну с информацией о принадлежности:

```sql

CREATE TABLE CombinedAnimals AS

SELECT 'Pets' AS source, id, name, type, birthDate, commands FROM Pets

UNION

SELECT 'PackAnimals' AS source, id, name, type, birthDate, commands FROM PackAnimals

UNION

SELECT 'HorsesAndDonkeys' AS source, id, name, type, birthDate, commands FROM HorsesAndDonkeys

UNION

SELECT 'YoungAnimals' AS source, id, name, type, birthDate, commands, age FROM YoungAnimals;

```

#### 8. ООП и Java
- Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6(Диаграмма классов) .



#### 9. Программа-реестр домашних животных
- Написать программу на Java, которая будет имитировать реестр домашних животных.



#### 10. Счетчик животных
- Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”. 


