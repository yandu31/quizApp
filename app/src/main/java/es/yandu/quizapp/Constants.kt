package es.yandu.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        /* First question */
        val question1 = Question(
            1, "1. What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austria",
            "Armenia", "Australia",
            1
        )
        questionsList.add(question1)

        /* Second question */
        val question2 = Question(
            2, "2. What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "New Zealand", "Australia",
            "Fiji", "United States",
            2
        )
        questionsList.add(question2)

        /* Third question */
        val question3 = Question(
            3, "3. What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Czech Republic", "Estonia",
            "Lithuania", "Belgium",
            4
        )
        questionsList.add(question3)

        /* Fourth question */
        val question4 = Question(
            4, "4. What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Jamaica",
            "Sudan", "Barbados",
            1
        )
        questionsList.add(question4)

        /* Fifth question */
        val question5 = Question(
            5, "5. What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway", "Denmark",
            "Sweden", "Iceland",
            2
        )
        questionsList.add(question5)

        /* Sixth question */
        val question6 = Question(
            6, "6. What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Australia", "Venezuela",
            "Fiji", "Barbados",
            3
        )
        questionsList.add(question6)

        /* Seventh question */
        val question7 = Question(
            7, "7. What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium", "Lithuania",
            "Germany", "Croatia",
            3
        )
        questionsList.add(question7)

        /* Eight question */
        val question8 = Question(
            8, "8. What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Italy", "Pakistan",
            "India", "Ireland",
            3
        )
        questionsList.add(question8)

        /* Ninth question */
        val question9 = Question(
            9, "9. What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Iraq", "Iran",
            "Kuwait", "Pakistan",
            3
        )
        questionsList.add(question9)

        /* Tenth question */
        val question10 = Question(
            10, "10. What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "England", "Hong Kong",
            2
        )
        questionsList.add(question10)

        return questionsList
    }

}