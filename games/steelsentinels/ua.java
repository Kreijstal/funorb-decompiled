/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ck {
    static int[] field_z;
    static int[][] field_t;
    int[] field_s;
    int field_B;
    static int[] field_O;
    byte[][][] field_F;
    static int[] field_J;
    static String field_L;
    static int[] field_v;
    static int[] field_P;
    int field_q;
    static int field_p;
    static int[] field_E;
    wj[] field_K;
    static int[] field_D;
    int[] field_A;
    int[] field_w;
    static int[][][] field_I;
    static int[][] field_C;
    static String field_u;
    wj[] field_y;
    static int[] field_x;
    static int[] field_N;
    static int field_r;
    static String[] field_M;
    static int field_G;
    static char[] field_H;
    static int field_o;

    final static void a(int param0, int param1) {
        cf.field_o = param1 * 400 / 150;
        cf.field_D = 100 * param1 / 150;
        if (param0 != -10931) {
          ua.a(-70, -65);
          cf.field_x = (param1 << 16) / 150;
          return;
        } else {
          cf.field_x = (param1 << 16) / 150;
          return;
        }
    }

    public static void a() {
        field_O = null;
        field_P = null;
        field_x = null;
        field_M = null;
        field_H = null;
        field_E = null;
        int var1 = -125;
        field_N = null;
        field_L = null;
        field_u = null;
        field_z = null;
        field_D = null;
        field_J = null;
        field_C = null;
        field_I = null;
        field_v = null;
        field_t = null;
    }

    ua() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[30][4];
        field_J = new int[]{75, 78, 27, 77, 24, 76, 28, 83, 24, 24, 45, 102, 2, 7, 12, 17, 31, -1, -1, -1};
        field_D = new int[]{72, 34, 43, 73, 23, 23, 23, 23, 23, 23, 74, 25, 2, 7, 16, 12, 27, 25, 22, -1};
        field_p = 0;
        field_C = new int[30][];
        field_v = new int[]{0, 37, 96, 29, 1, 17, 3, 26, 26, 26, 2, 30, 0, 21, 10, 26, -1, -1, -1, -1};
        field_O = new int[]{69, 68, 19, 70, 24, 24, 24, 20, 71, 33, 100, 24, 24, 24, 20, 1, 6, 28, 29, 22, -1, -1, -1};
        field_E = new int[]{79, 81, 51, 51, 51, 80, 24, 24, 24, 24, 24, 24, 24, 103, 38, 36, 82, 44, 3, 8, 16, 19, -1, -1, -1, -1};
        field_u = "Passwords can only contain letters and numbers";
        field_x = new int[]{55, 53, 18, 24, 24, 24, 54, 29, 56, 29, 29, 97, 17, -1, -1, -1, -1, -1, -1, -1};
        field_P = new int[]{57, 98, 21, 23, 23, 60, 58, 21, 23, 23, 59, 0, 5, 16, 10, -1, -1, -1, -1};
        field_L = "Full";
        field_z = new int[]{62, 61, 20, 3, 24, 24, 24, 20, 37, 37, 31, 1, 6, 22, 33, 21, -1, -1, -1};
        field_I = new int[30][][];
        field_N = new int[]{65, 99, 22, 22, 64, 67, 25, 25, 66, 32, 1, 6, 6, 11, 18, -1, -1, -1};
        al.a(56, new int[19], 0, new int[3][], 0, 8000, -1);
        al.a(75, new int[26], 0, new int[3][], 0, 8000, -1);
        al.a(114, field_x, 0, new int[4][], 0, 8000, 5);
        al.a(53, new int[19], 0, new int[1][], 0, 8000, -1);
        al.a(57, new int[19], 0, new int[5][], 0, 8000, 5);
        al.a(119, field_P, 0, new int[4][], 0, 8000, -1);
        al.a(79, field_P, 258, new int[5][], 2, 16000, 5);
        al.a(114, new int[17], 0, new int[0][], 0, 8000, -1);
        al.a(90, new int[17], 0, new int[4][], 0, 8000, 5);
        al.a(125, field_v, 0, new int[0][], 0, 8000, -1);
        al.a(100, field_x, 1, new int[5][], 1, 16000, 5);
        al.a(66, field_P, 17, new int[5][], 1, 16000, 5);
        al.a(91, new int[16], 33, new int[4][], 1, 16000, 5);
        al.a(93, field_z, 49, new int[4][], 1, 16000, 5);
        al.a(117, field_x, 32, new int[5][], 0, 16000, 5);
        al.a(109, new int[16], 48, new int[4][], 0, 16000, 5);
        al.a(116, field_N, 65, new int[6][], 1, 16000, 5);
        al.a(68, field_z, 2, new int[5][], 2, 16000, 3);
        al.a(62, field_N, 18, new int[5][], 2, 16000, 3);
        al.a(123, field_O, 34, new int[6][], 2, 16000, 3);
        al.a(125, field_N, 50, new int[5][], 2, 16000, 5);
        al.a(79, field_O, 66, new int[6][], 2, 16000, 3);
        al.a(62, field_O, 81, new int[5][], 1, 16000, 3);
        al.a(63, field_D, 64, new int[6][], 0, 16000, 3);
        al.a(57, field_D, 97, new int[5][], 1, 16000, 3);
        al.a(88, field_P, 82, new int[5][], 2, 16000, 3);
        al.a(110, field_J, 3, new int[5][], 3, 16000, 3);
        al.a(73, field_D, 19, new int[4][], 3, 16000, 2);
        al.a(80, field_E, 113, new int[6][], 1, 16000, 1);
        al.a(61, field_O, 129, new int[5][], 1, 16000, 0);
        field_M = new String[255];
        field_r = 1;
        field_G = 15;
        field_H = new char[]{'[', ']', '#'};
    }
}
