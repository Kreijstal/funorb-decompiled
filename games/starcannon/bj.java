/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static bk field_d;
    static int field_b;
    static int[] field_a;
    static int[] field_c;

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2) {
          param1 = s.a(param1, '_', "", (byte) -10);
          var3 = vh.a(param1, 0);
          if (param0.indexOf(param1) == -1) {
            if (0 != (param0.indexOf(var3) ^ -1)) {
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
          bj.a(-127);
          param1 = s.a(param1, '_', "", (byte) -10);
          var3 = vh.a(param1, 0);
          if (param0.indexOf(param1) != -1) {
            return true;
          } else {
            L0: {
              if (0 == param0.indexOf(var3)) {
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

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != -1) {
            field_b = 29;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_c = new int[8];
    }
}
