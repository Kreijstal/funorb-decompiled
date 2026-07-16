/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_d;
    static String field_e;
    static String field_a;
    static int field_c;
    static int[] field_b;

    final static vn[] a(int param0, int param1, int param2, int param3, int param4) {
        vn[] var6 = new vn[9];
        vn[] var5 = var6;
        vn dupTemp$0 = qk.c(param4, (byte) -71, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        vn dupTemp$1 = qk.c(param3, (byte) -71, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param2 != 12692) {
            field_a = null;
            if (-1 == (param1 ^ -1)) {
                return var5;
            }
            var6[4] = qk.c(param1, (byte) -71, 64);
            return var5;
        }
        if (-1 != (param1 ^ -1)) {
            var6[4] = qk.c(param1, (byte) -71, 64);
            return var5;
        }
        return var5;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 <= 57) {
            field_d = null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (!ec.field_n.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (param0.length() <= var3) {
                  L3: {
                    if (param1 == 27994) {
                      break L3;
                    } else {
                      field_a = null;
                      break L3;
                    }
                  }
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_20_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Screen Size";
        field_d = "Orb coins: ";
        field_a = "Connection restored.";
        field_b = new int[8192];
    }
}
