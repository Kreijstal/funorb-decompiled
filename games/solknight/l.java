/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_b;
    static String field_d;
    static int field_c;
    static int[] field_a;

    final static boolean a(int param0, int param1, int param2, da param3) {
        byte[] var6 = param3.b(param2, 12257, param1);
        byte[] var4 = var6;
        if (!(var6 != null)) {
            return false;
        }
        int var5 = -92 / ((param0 - 11) / 39);
        ua.a(0, var6);
        return true;
    }

    final static void a(int param0, int param1, m param2) {
        int var4 = 89 / ((-22 - param1) / 49);
        jd var3 = id.field_c;
        var3.e(param0, -2147483648);
        var3.c(109, param2.field_j);
        var3.a(true, param2.field_i);
    }

    public static void a(int param0) {
        if (param0 != 95) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2 == 0) {
          param0 = ml.a("", -30614, '_', param0);
          var3 = ji.a(param2 + 21762, param0);
          if (0 == (param1.indexOf(param0) ^ -1)) {
            if ((param1.indexOf(var3) ^ -1) != 0) {
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
          field_d = null;
          param0 = ml.a("", -30614, '_', param0);
          var3 = ji.a(param2 + 21762, param0);
          if (0 != (param1.indexOf(param0) ^ -1)) {
            return true;
          } else {
            L0: {
              if ((param1.indexOf(var3) ^ -1) == 0) {
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

    final static void a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          la.field_k = param1;
          if (null != ua.field_I) {
            ua.field_I.d(1349013231, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (null != ah.field_a) {
          ah.field_a.b(-15705, param1);
          var2 = 103 % ((param0 - 50) / 46);
          return;
        } else {
          var2 = 103 % ((param0 - 50) / 46);
          return;
        }
    }

    final static int a(byte param0) {
        if (param0 <= 94) {
            return -103;
        }
        return (int)(1000000000L / ta.field_a);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading sound effects";
        field_d = "OVER <%0>";
    }
}
