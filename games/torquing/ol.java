/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_d;
    static int[] field_c;
    static String field_e;
    static String field_b;
    static String field_a;
    static hc[] field_f;

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            jb.field_e = param0;
            try {
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (0 == param0.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              hp.a("document.cookie=\"" + var5 + "\"", 27476, param2);
            } catch (Throwable throwable) {
            }
            j.a(param1, param2);
          } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ol.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(double[] param0, byte param1) {
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double[] var8 = null;
        double[] var12 = null;
        var7 = Torquing.field_u;
        try {
          if (ia.field_i == 8) {
            return;
          }
          if (!(0.0 > param0[3]) &&
            !(ap.a(param0, 6, param0, 9) < 0.0)) {
            if (param0[9] == param0[6]) {
              if (param0[10] == param0[7]) {
                stackIn_16_0 = (param0[8] != param0[11]) ? 1 : 0;
              } else {
                stackIn_16_0 = 1;
              }
            } else {
              stackIn_16_0 = 1;
            }
            var2_int = stackIn_16_0;
            for (var3 = 0; var3 < ia.field_i; var3++) {
              var12 = bn.field_f[var3];
              if (param0[9] == var12[9] &&
                var12[10] == param0[10] &&
                param0[11] == var12[11]) {
                var5 = 0;
                var6 = 0;
                if (nl.field_y[var3] ^ var2_int == 0) {
                  if (var2_int == 0 &&
                    param0[5] == var12[5] &&
                    var12[4] == param0[4]) {
                    if (!(var12[3] > param0[3])) {
                      var6 = 1;
                    } else {
                      var5 = 1;
                    }
                  }
                } else {
                  if (nl.field_y[var3]) {
                    var5 = 1;
                  } else {
                    var6 = 1;
                  }
                }
                if (var5 != 0) {
                  bn.field_f[var3] = param0;
                  nl.field_y[var3] = var2_int != 0;
                  return;
                }
                if (var6 != 0) {
                  return;
                }
              }
            }
            bn.field_f[ia.field_i] = param0;
            nl.field_y[ia.field_i] = var2_int != 0;
            if (param1 < 25) {
              var8 = (double[]) null;
              ol.a((double[]) null, (byte) 52);
            }
            ia.field_i = ia.field_i + 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_46_0 = var2;
          stackIn_46_1 = new StringBuilder().append("ol.C(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 <= 100) {
          return (String) null;
        }
        return kj.field_d.h((byte) 118);
    }

    final static int b(int param0) {
        int var1 = -85 / ((-34 - param0) / 58);
        return 1;
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != -51) {
          return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_d = "This is a members-only world.";
        field_c = new int[128];
        field_e = "Waiting for fonts";
        field_b = "Members";
    }
}
