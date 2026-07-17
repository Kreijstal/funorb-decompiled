/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int field_a;
    static long field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          hb.field_l[md.field_c] = param1;
          qi.field_i[md.field_c] = md.field_c;
          hg.field_a[md.field_c] = param5;
          if (ok.field_b > param5) {
            qg.field_a = param5;
            break L0;
          } else {
            break L0;
          }
        }
        if (bd.field_a >= param5) {
          L1: {
            fb.field_m[md.field_c] = param3;
            k.field_i[md.field_c] = param4;
            cj.field_b[md.field_c] = param0;
            var6 = param0 + (param4 + param3);
            var8 = -80 / ((30 - param2) / 42);
            if (var6 != 0) {
              stackOut_16_0 = param3 * 1000 / var6;
              stackIn_17_0 = stackOut_16_0;
              break L1;
            } else {
              stackOut_15_0 = 0;
              stackIn_17_0 = stackOut_15_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_17_0;
            gk.field_a[md.field_c] = var7;
            if (va.field_b < var7) {
              va.field_b = var7;
              break L2;
            } else {
              break L2;
            }
          }
          md.field_c = md.field_c + 1;
          if (qg.field_a > var7) {
            qg.field_a = var7;
            return;
          } else {
            return;
          }
        } else {
          L3: {
            va.field_b = param5;
            fb.field_m[md.field_c] = param3;
            k.field_i[md.field_c] = param4;
            cj.field_b[md.field_c] = param0;
            var6 = param0 + (param4 + param3);
            var8 = -80 / ((30 - param2) / 42);
            if (var6 != 0) {
              stackOut_6_0 = param3 * 1000 / var6;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = 0;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          L4: {
            var7 = stackIn_7_0;
            gk.field_a[md.field_c] = var7;
            if (va.field_b < var7) {
              va.field_b = var7;
              break L4;
            } else {
              break L4;
            }
          }
          md.field_c = md.field_c + 1;
          if (qg.field_a > var7) {
            qg.field_a = var7;
            return;
          } else {
            return;
          }
        }
    }

    final static vk a(int param0) {
        try {
            Throwable var1 = null;
            vk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            vk stackOut_2_0 = null;
            L0: {
              if (param0 >= 2) {
                break L0;
              } else {
                field_b = -62L;
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (vk) Class.forName("gl").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              if (param2 <= 0) {
                stackOut_3_0 = var3_int;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param0 & 1;
                param2--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "nd.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
