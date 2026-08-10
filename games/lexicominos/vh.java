/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_b;
    static ng field_a;

    final static void a(boolean param0, int param1) {
        kd var2 = null;
        int var3 = 0;
        vb var4 = null;
        ng stackIn_3_0 = null;
        ng stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = jl.field_a;

              if (param0) {
                stackIn_4_0 = (ng) ((Object) stackIn_3_0);
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = (ng) ((Object) stackIn_3_0);
                stackIn_4_1 = 1;
                break L1;
              }
            }
            var4 = (vb) ((Object) ((ng) (Object) stackIn_4_0).a(stackIn_4_1 != 0));
            L2: while (true) {
              if (var4 == null) {
                if (!param0) {
                  var2 = ci.field_f.a(true);
                  L3: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      ck.a(param1, 2);
                      var2 = ci.field_f.f(2);
                      continue L3;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                vi.a(param1, var4, 1);
                var4 = (vb) ((Object) jl.field_a.f(2));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vh.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != 119) {
            int[] var2 = (int[]) null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    if (-1 < (var5 ^ -1)) {
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = new ng();
    }
}
