package shamsiddin.project.chat.model

data class UserData(val name: String?, val id: String?, val password: String?) {

    constructor() : this(null, null, null)
}

