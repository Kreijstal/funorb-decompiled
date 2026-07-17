/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_b;
    static ng field_a;

    final static void a(boolean param0, int param1) {
        kd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        vb var4 = null;
        ng stackIn_2_0 = null;
        ng stackIn_3_0 = null;
        ng stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_1_0 = null;
        ng stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ng stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = jl.field_a;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (ng) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (ng) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            var4 = (vb) (Object) ((ng) (Object) stackIn_4_0).a(stackIn_4_1 != 0);
            L2: while (true) {
              if (var4 == null) {
                if (!param0) {
                  var2 = ci.field_f.a(true);
                  L3: while (true) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      ck.a(4, 2);
                      var2 = ci.field_f.f(2);
                      continue L3;
                    }
                  }
                } else {
                  return;
                }
              } else {
                vi.a(4, var4, 1);
                var4 = (vb) (Object) jl.field_a.f(2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "vh.A(" + param0 + 44 + 4 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != 119) {
            Object var2 = null;
            vh.a((byte) 39, 124, (int[]) null, 22);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1 + param3;
            L1: while (true) {
              if (var4_int >= param2.length) {
                if (param0 == -42) {
                  break L0;
                } else {
                  vh.a((byte) 51);
                  return;
                }
              } else {
                var5 = -param1 + var4_int;
                L2: while (true) {
                  L3: {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (param2[param1 + var5] < param2[var5]) {
                        var6 = param2[var5];
                        param2[var5] = param2[param1 + var5];
                        param2[param1 + var5] = var6;
                        var5 = var5 - param1;
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4_int = var4_int + param1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("vh.B(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = new ng();
    }
}
