package baekjoon.solve1074;

class Z_Intemediate {
    private static int arrSize = 4;    ////배열의 크기
    private static int[] dx = {0, 1, 0, 1};
    private static int[] dy = {0, 0, 1, 1};

    public static void main(String[] args) {
        int x = 0;      //시작 행
        int y = 0;      //시작 열

        makeInnerZ(x, y, arrSize);
    }

    private static void makeInnerZ(int x, int y, int size) {

        //큰 Z를 방문 확인 조건문
        //해당 위치를 방문 후, 내부 Z를 만들어낸다.
        if (size == 2) {
            System.out.printf("Outer Z : 행: %d, 열: %d \n", x, y);

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                System.out.printf("Inner Z : 행: %d, 열: %d \n", nx, ny);
            }

            System.out.println();
            return;
        }

        int newSize = size / 2;

        //2. 내부 Z를 만들기 위한 내부 Z
        makeInnerZ(x, y, newSize);
        makeInnerZ(x, y + newSize, newSize);
        makeInnerZ(x + newSize, y, newSize);
        makeInnerZ(x + newSize, y + newSize, newSize);
    }
}
