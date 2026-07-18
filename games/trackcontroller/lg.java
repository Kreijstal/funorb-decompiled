/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static char[] field_b;
    static long field_a;
    static cg[] field_d;
    static String field_c;

    final static boolean c(int param0) {
        kj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (kj) (Object) si.field_a.b(2);
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  boolean discarded$2 = lg.c(-128);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= var1.field_n) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L3: {
                    if (null == var4.field_j[var2]) {
                      break L3;
                    } else {
                      if (var4.field_j[var2].field_f != 0) {
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                  L4: {
                    if (var4.field_v[var2] != null) {
                      if (var4.field_v[var2].field_f == 0) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1_ref, "lg.B(" + param0 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static h a(int param0) {
        try {
            Throwable var1 = null;
            h stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            h stackOut_1_0 = null;
            try {
              L0: {
                stackOut_1_0 = (h) Class.forName("bi").newInstance();
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_c = "Click";
    }
}
