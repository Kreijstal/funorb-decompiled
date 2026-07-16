/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static hl field_g;
    static int[] field_c;
    static int field_d;
    ah field_b;
    String field_h;
    String field_a;
    String field_e;
    int field_f;

    final static void a(int param0) {
        t.a(4, param0 ^ param0);
    }

    public static void b(int param0) {
        field_c = null;
        field_g = null;
        if (param0 != -1) {
            Object var2 = null;
            in.a((java.applet.Applet) null, -107);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf((int) (char)param1);
                var4 = "reload.ws";
                if (-1 >= (var3 ^ -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(ai.a(var5, (byte) -112, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TetraLink.field_J;
        ra.g(param0, param1, param3 - -1, 10000536);
        ra.g(param0, param4 + param1, 1 + param3, 12105912);
        int var5 = 1;
        if (!(ra.field_i <= param1 - -var5)) {
            var5 = ra.field_i - param1;
        }
        int var6 = param4;
        if (param1 + var6 > ra.field_g) {
            var6 = ra.field_g - param1;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = 48 * var7 / param4 + 152;
            var9 = var8 << -646221016 | var8 << -1200424912 | var8;
            ra.field_b[param0 + (var7 + param1) * ra.field_f] = var9;
            ra.field_b[param0 + ra.field_f * (var7 + param1) - -param3] = var9;
        }
        if (param2 > -33) {
            field_g = null;
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (ie.field_l.startsWith("win")) {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (param1.startsWith("https://")) {
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              L2: {
                var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                if (param0 == 18) {
                  break L2;
                } else {
                  in.b(119);
                  break L2;
                }
              }
              var3 = 0;
              L3: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_18_0 != 0;
    }

    private in() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 3;
        field_c = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
    }
}
