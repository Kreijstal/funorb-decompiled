/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends mg {
    static db field_N;
    private boolean field_J;
    static long field_P;
    private le field_D;
    static String field_G;
    static int field_K;
    private int field_F;
    private int field_E;
    private String field_Q;
    private int field_H;
    static bj field_L;
    static String[] field_C;
    static int field_I;
    static db field_O;
    static bj field_M;

    final String b(int param0) {
        int var2 = 0;
        String var3 = null;
        w stackIn_2_0 = null;
        w stackIn_3_0 = null;
        w stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        w stackIn_6_0 = null;
        w stackIn_7_0 = null;
        w stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        w stackOut_5_0 = null;
        w stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        w stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        w stackOut_1_0 = null;
        w stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        w stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = ((jf) this).field_A.field_m ? 1 : 0;
        if (param0 < 121) {
          L0: {
            int discarded$2 = jf.a((byte) 47, -104);
            ((jf) this).field_A.field_m = ((jf) this).field_m;
            var3 = ((jf) this).field_A.b(122);
            stackOut_5_0 = ((jf) this).field_A;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (w) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (w) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_m = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            ((jf) this).field_A.field_m = ((jf) this).field_m;
            var3 = ((jf) this).field_A.b(122);
            stackOut_1_0 = ((jf) this).field_A;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (w) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (w) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_m = stackIn_4_1 != 0;
          return var3;
        }
    }

    jf(int param0, int param1, int param2, int param3, w param4, boolean param5, int param6, int param7, le param8, int param9, String param10) {
        super(param0, param1, param2, param3, (rd) null, (vd) null);
        ((jf) this).field_Q = param10;
        ((jf) this).field_H = param9;
        ((jf) this).field_A = param4;
        ((jf) this).field_J = param5 ? true : false;
        ((jf) this).field_D = param8;
        ((jf) this).field_F = param6;
        ((jf) this).field_E = param7;
        int var12 = ((jf) this).field_F + -((jf) this).field_E;
        int var13 = ((jf) this).field_D.a(param10, var12, ((jf) this).field_D.field_E) + 2 * ((jf) this).field_E;
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((jf) this).a(var13, param2, true, param1, param0);
        }
        int var14 = !((jf) this).field_J ? ((jf) this).field_F - -(((jf) this).field_E * 2) : 0;
        ((jf) this).field_A.a(param3 + -(2 * ((jf) this).field_E), -((jf) this).field_F + param2 + -(((jf) this).field_E * 3), true, ((jf) this).field_E - -(var13 + -param3 >> 247415809), var14);
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_O = null;
        field_C = null;
        field_L = null;
        if (param0 >= -124) {
            int discarded$0 = jf.a((byte) -30, 19);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = ((jf) this).field_t - -param2;
        int var6 = param1 + ((jf) this).field_o;
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = !((jf) this).field_J ? 0 : -(2 * ((jf) this).field_E) + (-((jf) this).field_F + ((jf) this).field_j);
        int discarded$0 = ((jf) this).field_D.a(((jf) this).field_Q, var5 - (-var7 + -((jf) this).field_E), var6 + ((jf) this).field_E, -((jf) this).field_E + ((jf) this).field_F, ((jf) this).field_v - 2 * ((jf) this).field_E, ((jf) this).field_H, -1, ((jf) this).field_J ? 0 : 2, 1, ((jf) this).field_D.field_E);
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) - -(param1 >>> -1268433343 & 1431655765);
        param1 = ((-858993457 & param1) >>> -676515678) + (858993459 & param1);
        param1 = 252645135 & (param1 >>> -1799299612) + param1;
        if (param0 <= 80) {
          int discarded$2 = jf.a((byte) 29, -19);
          param1 = param1 + (param1 >>> 293964808);
          param1 = param1 + (param1 >>> 1413088816);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 293964808);
          param1 = param1 + (param1 >>> 1413088816);
          return param1 & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "THREE";
        field_L = new bj(0);
        field_C = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_O = new db(311, 450);
        field_M = new bj(3);
    }
}
