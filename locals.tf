//ルートディレクトリにlocals.tfを作成
$ touch locals.tf

locals {
name = replace(base.name(path.cwd), "_", "-")
region = "ap-northeast-1"
app  = "go-sample-server"
}
