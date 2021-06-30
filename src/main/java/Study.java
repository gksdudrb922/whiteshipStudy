public class Study {

    public String joinString() {
        String profile = "안녕하세요." +
                "Intellij 강의에 오신것을" +
                "환영합니다.";

        return profile;
    }

    public String createQuery() {
        String query = "SELECT" +
                "FROM member" +
                "WHERE member.name = 'han'";
        return query;
    }

    public void moveLineAndStatement() {

        System.out.println("라인 혹은 구문 단위로 이동시킵니다");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
