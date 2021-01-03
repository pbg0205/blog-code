package baekjoon.solve1074;

//1. Z 문제 블로그 코드 - 기본 Z

public class Z_basic {
    public static void main(String[] args) {
        int[] dx = {0, 1, 0, 1};
        int[] dy = {0, 0, 1, 1};

        int x = 0;  //기준 행
        int y = 0;  //기준 열

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            System.out.printf("행: %d, 열: %d \n", nx, ny);
        }
    }
}
