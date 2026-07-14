/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static rj field_c;
    static String field_a;
    static boolean[][] field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static boolean a(byte param0, uf param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = param1.j(-88);
          if (-2 == (var2 ^ -1)) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 < 39) {
          field_b = null;
          return var3 != 0;
        } else {
          return var3 != 0;
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= 30) {
          if (!li.field_N) {
            if (d.p(-67)) {
              if (vh.field_d == null) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (null != eb.field_l) {
              if (d.p(-67)) {
                if (vh.field_d != null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -14282) {
            boolean discarded$0 = jh.a((byte) -122);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new rj();
        field_b = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3]};
        field_a = null;
    }
}
