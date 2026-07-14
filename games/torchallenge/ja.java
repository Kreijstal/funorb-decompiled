/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    int field_c;
    int field_i;
    static am field_g;
    int field_d;
    int field_h;
    static int field_f;
    static String field_b;
    static boolean[][] field_e;
    static boolean[][] field_j;
    static int field_a;

    final static boolean a(byte param0, int param1) {
        if (param0 >= 91) {
          if ((param1 ^ -1) <= -4) {
            if (10 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        int var1 = -91 / ((param0 - -62) / 55);
        field_j = null;
        field_b = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = df.a(param2, '_', "", (byte) 126);
        var3 = je.a(param2, 0);
        if (param1 > 74) {
          if (-1 == param0.indexOf(param2)) {
            if ((param0.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          boolean discarded$6 = ja.a((byte) -72, 59);
          if (-1 != param0.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if ((param0.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 18 % ((param0 - 73) / 49);
        lb.field_s = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = new am(2);
        field_e = new boolean[][]{new boolean[6], new boolean[6], new boolean[6]};
        field_j = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[1], new boolean[1]};
    }
}
