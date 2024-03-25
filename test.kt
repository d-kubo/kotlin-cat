/**
 * @auther d-kubo
 * @creatdt 2024/3/25
 * @description:catコマンドと同様の動作
 */

import java.io.File

fun main(args:Array<String>) {
    // 引数の数チェック
    if(args.size == 0) {
        println("読み込むファイルの指定がありません。")
        return
    }

    for (path in args){
        var file = File(path)

        if(file.isDirectory) {
            println(file.name+"： ディレクトリです")
            continue
        }
    
        if( !file.exists()) {
            println("指定されたファイルは存在しません。")
            continue
        }

        // ファイルの内容取得
        println(file.readText())
    }
}
