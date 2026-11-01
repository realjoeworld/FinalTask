import members.member1

fun main() {
    println("===== MZN TEAM DIRECTORY =====")

    val members = listOf(member1,TeamMember2, member3,member4)

    members.forEachIndexed { index, member ->
        println("Member ${index + 1}: ${member.name}, ${member.university}, ${member.age}, ${member.role}")
    }
    }
