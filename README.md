# TestKtの使い方

## 概要
TestKtは「cat」と同じような動作をするKotlinで作成されたファイルです。  
ただし「cat」コマンドのオプションまでは実装しておらず、  
単純にファイルの中身を読み取り出力する動作となります。  


## 使い方
```
【実行フォーマット】
kotlin TestKt {絶対 or 相対ファイルパス}

【ワイルドカード指定】
kotlin TestKt *.txt
kotlin TestKt /root/test/*
kotlin TestKt *

【実行例】
kotlin TestKt sample.txt
kotlin TestKt /root/test/sample.txt
```