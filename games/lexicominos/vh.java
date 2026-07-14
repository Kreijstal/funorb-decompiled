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
        ng stackIn_1_0 = null;
        ng stackIn_2_0 = null;
        ng stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ng stackOut_0_0 = null;
        ng stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ng stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          stackOut_0_0 = jl.field_a;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_2_0 = (ng) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ng) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var4 = (vb) (Object) ((ng) (Object) stackIn_3_0).a(stackIn_3_1 != 0);
        L1: while (true) {
          if (var4 == null) {
            if (param0) {
              return;
            } else {
              var2 = ci.field_f.a(true);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  ck.a(param1, 2);
                  var2 = ci.field_f.f(2);
                  continue L2;
                }
              }
            }
          } else {
            vi.a(param1, var4, 1);
            var4 = (vb) (Object) jl.field_a.f(2);
            continue L1;
          }
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var4 = param1 + param3;
        L0: while (true) {
          if (var4 >= param2.length) {
            if (param0 != -42) {
              vh.a((byte) 51);
              return;
            } else {
              return;
            }
          } else {
            var5 = -param1 + var4;
            L1: while (true) {
              L2: {
                if (-1 < (var5 ^ -1)) {
                  break L2;
                } else {
                  if (param2[param1 + var5] < param2[var5]) {
                    var6 = param2[var5];
                    param2[var5] = param2[param1 + var5];
                    param2[param1 + var5] = var6;
                    var5 = var5 - param1;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = var4 + param1;
              continue L0;
            }
          }
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
