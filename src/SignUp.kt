package src

fun signup(email : String, password : String, password2 : String) {
    if (password == password2) {
        println("회원 가입을 한다 : $email")
    }
}