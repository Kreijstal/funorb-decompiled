/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static long field_b;
    static h field_a;

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -44) {
          L0: {
            field_b = -103L;
            if (field_a.a(0)) {
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
            if (field_a.a(0)) {
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

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = hb.field_l[0];
            var2 = 32 % ((param0 - -17) / 41);
            var3 = 1;
            L1: while (true) {
              if (hb.field_l.length <= var3) {
                break L0;
              } else {
                var4 = hb.field_l[var3];
                gl.a(dj.field_c, var3 << 1651852708, dj.field_c, var1_int, var4);
                var1_int = var1_int + var4;
                var3++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "bb.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = (h) null;
        }
    }

    static {
    }
}
