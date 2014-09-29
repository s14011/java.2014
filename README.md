## 演習の環境設定手順

1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git clone」

$ git clone https://github.com/KimiyukiYamauchi/java.2014 (任意のディレクトリ名)

2. リモートリポジトリ「origin」を別の名前に変える

$ git remote rename origin  (任意の別名)

3. 各自のGithubに演習をアップするためのリポジトリを作成
4. 上で作成したリモートリポジトリに「origin」と名前をつける

$ git remote add origin  (各自のリモートリポジトリのURL)

5. ローカルリポジトリをリモートのpushする

$ git push -u origin master

6. 以降は以下の操作

	* 演習を作成し、講師提出する場合、

		1. ローカルリポジトリをリモートのpushする 

$ git push

		2. 講師に演習を作成した旨連絡

	* ひな形などの最新を入手する場合、

		1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git pull」

$ git pull -u (自分がつけた別名) master

## 演習問題

1. Ex1
	1. Ex1-0
		「Hello World!」と表示する
	2. Ex1-2
		テキストP20 演習 1-2
	3. Ex1-1
		テキストP20 演習 1-3
2. Ex2
	1. Ex2-0
		テキストP32 List 2-6
	2. Ex2-2
		テキストP33 演習 2-2
	3. Ex2-3
		テキストP40 演習 2-3
	4. Ex2-4
		テキストP40 演習 2-4
	5. Ex2-5
		テキストP41 演習 2-5
	6. Ex2-6
		テキストP41 演習 2-6
	7. Ex2-7
		テキストP44 演習 2-7
	8. Ex2-8
		テキストP45 演習 2-8
	9. Ex2-9
		テキストP45 演習 2-9
	10. Ex2-10
		テキストP47 演習 2-10
