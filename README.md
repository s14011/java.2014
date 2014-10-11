## 演習の環境設定手順

1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git clone」
<br />$ git clone https://github.com/KimiyukiYamauchi/java.2014 (任意のディレクトリ名)<br /><br />
1. リモートリポジトリ「origin」を別の名前に変える
<br />$ git remote rename origin  (任意の別名)<br /><br />
1. 各自のGithubに演習をアップするためのリポジトリを作成<br /><br />
1. 上で作成したリモートリポジトリに「origin」と名前をつける
<br />$ git remote add origin  (各自のリモートリポジトリのURL)<br /><br />
1. ローカルリポジトリをリモートにpushする
<br />$ git push -u origin master<br /><br />
1. 以降は以下の操作

	* 演習を作成し、講師提出する場合、

		1. 「master」branchに切り替え。
<br />$ git checkout master <br /><br />
		1. 演習の作業を行うbranchを作成し、それにcheckout
<br />$ git checkout -b (演習リポジトリ名) <br /><br />
		1. 演習を行い、成果物をadd, commitで、リポジトリに登録 
<br />$ git add -A
<br />$ git commit -m "コメント"<br /><br />
		1. 演習の成果物を「master」branchにmerge
<br />$ git checkout master 
<br />$ git merge (演習リポジトリ名) <br /><br />
		1. ローカルの「master」をGithubに上げる
<br />$ git push <br /><br />
		1. 講師に演習を作成した旨連絡
			* yamauchi@std.it-college.ac.jp

	* ひな形などの最新を入手する場合、

		1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git pull」
<br />$ git pull (自分がつけた別名) master<br /><br />

## 演習問題

1. Ex1

	1. Ex1_0<br />
		「Hello World!」と表示する
	1. Ex1_2<br />
		テキストP20 演習 1-2<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。
	1. Ex1_1<br />
		テキストP20 演習 1-3<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。<br />
姓と名の間は１行空けること

1. Ex2

	1. Ex2_0<br />
		テキストP32 List 2-6
	1. Ex2_1<br />
		テキストP33 演習 2-2<br />
List 2-6(Ex2_0)の変数へ値を代入している箇所を小数部分を持つ実数値を代入する<br />
ように変更しなさい<br />
	1. Ex2_2<br />
		テキストP33 演習 2-2<br />
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ<br />
	1. Ex2_3<br />
		テキストP40 演習 2-3<br />
	1. Ex2_4<br />
		テキストP40 演習 2-4<br />
	1. Ex2_5<br />
		テキストP41 演習 2-5<br />
	1. Ex2_6<br />
		テキストP41 演習 2-6<br />
	1. Ex2_7<br />
		テキストP44 演習 2-7<br />
	1. Ex2_8<br />
		テキストP45 演習 2-8<br />
	1. Ex2_9<br />
		テキストP45 演習 2-9<br />
	1. Ex2_10<br />
		テキストP47 演習 2-10<br />

1. Ex3

	1. Ex3_0<br />
		テキストP52 List 3-1<br />
	1. Ex3_1<br />
		テキストP59 演習 3-1<br />
	1. Ex3_2<br />
		テキストP59 演習 3-2<br />
	1. Ex3_4<br />
		テキストP61 演習 3-4<br />
