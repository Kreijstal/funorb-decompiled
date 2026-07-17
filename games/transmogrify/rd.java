/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static q field_d;
    static int field_a;
    static int field_f;
    static int[] field_c;
    static String field_b;
    static int[] field_e;

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            ka.c();
            ug.field_c = new int[260];
            nd.field_m = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= ug.field_c.length) {
                    break L0;
                  } else {
                    ug.field_c[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                ug.field_c[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "rd.A(" + 1 + 41);
        }
    }

    final static void a(String param0) {
        try {
            hi.a(-23883, param0);
            int discarded$0 = 1702;
            jj.a(false, gb.field_c);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "rd.B(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 > 46) {
          L0: {
            L1: {
              if (bi.field_L < 20) {
                break L1;
              } else {
                if (!pa.b(-120)) {
                  break L1;
                } else {
                  L2: {
                    if (db.field_d <= 0) {
                      break L2;
                    } else {
                      if (Transmogrify.d(false)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 28) {
            return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new q();
        field_c = new int[]{0, 21, 21, 21, 8, 9, 10, 11, 11, 16, 17, 18, 17, 18, 17, 18, 17, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 30, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25};
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_f = -1;
    }
}
