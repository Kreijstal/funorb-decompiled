/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uaa extends rqa {
    static int field_o;
    static String field_p;

    uaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= -17) {
          L0: {
            field_o = 19;
            if (null == di.a(param0, 0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == di.a(param0, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void b(int param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.c(0, 1);
        int var3 = 124 % ((-14 - param0) / 59);
        var2.c(0, 2);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 74 / ((param1 - -14) / 42);
        if (-5 >= (param0 ^ -1)) {
          if ((param0 ^ -1) == -13) {
            return 1;
          } else {
            return 1;
          }
        } else {
          return 2;
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 2) {
            field_o = 114;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(180, 119));
        } else {
          return new nc((Object) (Object) frb.a(180, 119));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 10;
        field_p = "Invalid password.";
    }
}
