/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rk {
    int field_t;
    bc[] field_q;
    int[] field_u;
    int field_r;
    byte[][][] field_s;
    static ej field_p;
    bc[] field_m;
    int[] field_o;
    int[] field_v;
    static ad field_n;

    final static char a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (0 != var2) {
          if (var2 >= 128) {
            if (var2 >= 160) {
              return (char)var2;
            } else {
              L0: {
                var3 = cd.field_m[var2 + -128];
                if (var3 != 0) {
                  break L0;
                } else {
                  var3 = 63;
                  break L0;
                }
              }
              var2 = var3;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    public static void b() {
        field_n = null;
        field_p = null;
    }

    dg() {
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 != 1) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = var3_int * param2;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                L2: {
                  if (0 != (param1 & 1)) {
                    var3_int = var3_int * param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "dg.B(" + 1 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ej();
    }
}
