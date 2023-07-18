package uz.spring.support_bot_v1

enum class LanguageEnum {
    Uzbek, English, Russian
}

enum class MessageType {
    QUESTION, ANSWER
}

enum class ErrorCode(val code: Int) {
    OPERATOR_NOT_FOUND(100),
    TIME_TABLE_NOT_FOUND(101)
}