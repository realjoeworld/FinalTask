import members.member1

fun main() {
    println("===== MZN TEAM DIRECTORY =====")

    val members = listOf(member1,TeamMember2, member3,member4)

    for(member in members){
        println("${member.name}, ${member.age} ,${member.university}, ${member.role}")
    }
}