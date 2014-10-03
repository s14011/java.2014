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

		1. 現在、「master」branchにいることを確認。いなければ切り替え。
<br />$ git branch 
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

	1. Ex1-0<br />
		「Hello World!」と表示する
	1. Ex1-2<br />
		テキストP20 演習 1-2
	1. Ex1-1<br />
		テキストP20 演習 1-3

1. Ex2

	1. Ex2-0<br />
		テキストP32 List 2-6
	1. Ex2-2<br />
		テキストP33 演習 2-2
	1. Ex2-3<br />
		テキストP40 演習 2-3
	1. Ex2-4<br />
		テキストP40 演習 2-4
	1. Ex2-5<br />
		テキストP41 演習 2-5
	1. Ex2-6<br />
		テキストP41 演習 2-6
	1. Ex2-7<br />
		テキストP44 演習 2-7
	1. Ex2-8<br />
		テキストP45 演習 2-8
	1. Ex2-9<br />
		テキストP45 演習 2-9
	1. Ex2-10<br />
		テキストP47 演習 2-10

1. Ex3

	1. Ex3-0
		
