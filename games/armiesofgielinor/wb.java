/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String[][] field_a;
    static String[] field_b;
    static String field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 16711935 & op.field_c[0][param2];
            var6 = op.field_c[0][param2] & 65280;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-17 >= (var7 ^ -1)) {
                    break L3;
                  } else {
                    var8 = -(int)((double)(var7 >> -2026833630) * Math.sin((double)(-param3 + var7) * 3.141592653589793 / 10.0));
                    var9 = (int)((Math.cos((double)(var7 - param3) * 3.141592653589793 / 10.0) + 1.0) * (double)(var7 << -1992909502));
                    qn.h(20 + param1 - -var7, var8 + param4 + -13, 20 + param1 - -var7, -7 + var8 + param4, ((var9 + 128) * var6 & 16711680 | var5_int * (128 + var9) & -16711936) >>> -55666616);
                    var7++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                qn.h(param1 + 20, -13 + param4, 20 + param1, 2 + param4, 7816226);
                break L2;
              }
              if (param0 == 7816226) {
                break L0;
              } else {
                wb.a(37, 108, -63, 105, -25);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "wb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = (String[][]) null;
        if (param0) {
            field_b = (String[]) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, byte param1, String param2, String param3) {
        ah.field_d = param3;
        ga.field_d = param2;
        if (param1 != 32) {
            return;
        }
        try {
            af.a(param0, lo.field_o, param1 ^ -33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Owner";
    }
}
