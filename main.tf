 // Terraformのバックエンドの設定
$ mkdir aws-ecs-terraform && cd aws-ecs-terraform
$ touch main.tf 

 terraform {

  backend "S3" {
    bucket = "aws-ecs-terraform-tfstate"
    key = "terraform.tfstate"
    region = "ap-northeast-1" 
    dynamodb_table = "aws-ecs-terraform-tfstate-locking"
    encrypt = true   
 }


  required _providers {
  aws = {
      source = "hashicorp/aws"
      version = "~> 4.0"
  }

 }
}
  provider "aws" {
     region = local.region

}

//GiHubでコミット
$ git add. && git commit -m "Backend Configuration"

//復習2回目
//Terraformのバックエンドの設定
$ mkdir aws-ecs-terraform && cd aws-ecs-terraform
$ touch main.tf

terraform {
  backend "S3" {
    bucket = "aws-ecs-terraform-tfstate"
    key = "terraform.tfstate"
    region = "ap-northeast-1"
    dynamodb_table = "aws-ecs-terraform-tfstate-locking"
    encript = true
  }
}


//GiHubでコミット
$ git add. && git commit -m "Backend Configuration"
