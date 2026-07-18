/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$1 = oa.a(kk.c(-14047), 22347, "resizing", new Object[1]);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        int var1 = -1;
        field_a = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = ug.field_A.a(rk.field_g, true, mk.field_m, (byte) 124);
            ug.field_A.f(true);
            L1: while (true) {
              if (!ji.a((byte) -72)) {
                if (il.field_c != -1) {
                  var1_int = il.field_c;
                  ni.a(-126, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (!gb.field_d) {
                    if (ee.field_c != ca.field_i) {
                      if (!qa.field_c.b(12)) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        if (ca.field_i != bk.field_c) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      }
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  } else {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$13 = ug.field_A.a((byte) 86, pe.field_b, da.field_b);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "ka.B(" + 2 + ')');
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
    }
}
