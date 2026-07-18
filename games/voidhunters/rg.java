/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg implements dja {
    static String field_a;
    static boolean field_b;
    static String field_c;

    public final tv a(byte param0) {
        int var2 = -61 / ((param0 - -64) / 50);
        return (tv) (Object) new oca();
    }

    final static int b(byte param0) {
        int var1 = 0;
        L0: {
          var1 = 0;
          if (!vba.f((byte) -89)) {
            break L0;
          } else {
            if (null != qn.field_h.g(0)) {
              return qn.field_h.g(0).field_r;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = null;
        }
        return (tv[]) (Object) new oca[param1];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var7_int = param5 + param4;
            var8 = -param5 + param1;
            var11 = param4;
            L1: while (true) {
              if (var11 >= var7_int) {
                var10 = -param5 + param0;
                var9 = param2 - -param5;
                var11 = param1;
                L2: while (true) {
                  if (var8 >= var11) {
                    var11 = var7_int;
                    L3: while (true) {
                      if (var8 < var11) {
                        break L0;
                      } else {
                        var17 = rba.field_b[var11];
                        ww.a(param3, var9, var17, (byte) 75, param2);
                        ww.a(param3, param0, var17, (byte) 75, var10);
                        var11++;
                        continue L3;
                      }
                    }
                  } else {
                    ww.a(param3, param0, rba.field_b[var11], (byte) 75, param2);
                    var11--;
                    continue L2;
                  }
                }
              } else {
                ww.a(param3, param0, rba.field_b[var11], (byte) 75, param2);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var7, "rg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + 120 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Login: ";
        field_c = "Very long range";
    }
}
