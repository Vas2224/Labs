// Настройка учетных данных Git
//git config --global user.name " Имя"
//git config --global user.email "email"

// Создание токена и SSH-ключа
// token: для начала создадим token, для этого зайдем в настройки, затем "управление токенами", создаем новый token
//Клонируем, вводя в терминал след. строку: git clone https://<your-username>:<your-token>@github.com/<your-username>/<your-repo>.git
//В < > указать свои данные
//Чтобы войти в клонированный репозиторий нужно ввести: cd <свой репозиторий>

//SSH: для начала сгенерируем в Git Bash SSH-ключ: ssh-keygen -t ed25519 -C "your_email@example.com"
//Добавляем SSH-ключ в ssh-agent, ssh-agent — программа для хранения и управления SSH-ключами
//Запускаем командой eval "$(ssh-agent -s)", Если в ответ терминал покажет надпись «Agent pid» и число — значит, всё ок
//Теперь добавляем ключ: ssh-add ~/.ssh/id_ed25519
//Чтобы добавить ключ на GitHub, нужно его скопировать командой clip: clip < ~/.ssh/id_ed25519.pub
//Добавляем ключ на GitHub: в настройках выбираем раздел SSH-ключи тыкаем и добавляем

//Базовые команды Git
//Создание файлов и коммиты
//echo "Первый файл" > file1.txt
//git add file1.txt
//git commit -m "Добавлен file1.txt"

//echo "Второй файл" > file2.txt
//git add file2.txt
//git commit -m "Добавлен file2.txt"

//echo "Третий файл" > file3.txt
//git add file3.txt
//git commit -m "Добавлен file3.txt"

//Выполняется push в main
//git push origin main

//Создание ветки branch1
//git checkout -b branch1
//echo "Четвертый файл" > file4.txt
//git add file4.txt
//git commit -m "Добавлен file4.txt"

//echo "Пятый файл" > file5.txt
//git add file5.txt
//git commit -m "Добавлен file5.txt"

//Выполняется push branch1
//git push origin branch1

//Создание ветки branch2
//git checkout main
//git checkout -b branch2
//echo "Шестой файл" > file6.txt
//git add file6.txt
//git commit -m "Добавлен file6.txt"

//echo "Седьмой файл" > file7.txt
//git add file7.txt
//git commit -m "Добавлен file7.txt"

//Выполняется push branch2
//git push origin branch2

//Merge branch1 в main через merge request
//Для merge нужно перейти на сайт репозитория и выполнить merge request для branch1 -> main


//Переключение на branch2 и выполнение merge/rebase с main
//git checkout branch2
//git pull origin main --rebase
//Если есть конфликты, решить их вручную, затем выполнить:
//git rebase --continue
//Merge branch2 в main через merge request
//Для merge нужно перейти на сайт репозитория и выполнить merge request для branch2 -> main

