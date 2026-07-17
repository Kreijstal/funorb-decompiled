/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ms.field_d != param1) {
                ct.field_v = new int[param1];
                var3_int = 0;
                L2: while (true) {
                  if (param1 <= var3_int) {
                    ms.field_d = param1;
                    break L1;
                  } else {
                    ct.field_v[var3_int] = (var3_int << 12) / param1;
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (df.field_f == param0) {
                break L3;
              } else {
                L4: {
                  if (ms.field_d == param0) {
                    mo.field_c = ct.field_v;
                    break L4;
                  } else {
                    mo.field_c = new int[param0];
                    var5 = 0;
                    var3_int = var5;
                    L5: while (true) {
                      if (param0 <= var5) {
                        break L4;
                      } else {
                        mo.field_c[var5] = (var5 << 12) / param0;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
                df.field_f = param0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "ji.B(" + param0 + 44 + param1 + 44 + 37 + 41);
        }
    }

    static {
    }
}
