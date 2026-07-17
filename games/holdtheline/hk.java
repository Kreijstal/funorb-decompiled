/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int field_e;
    static int[][] field_c;
    static String field_b;
    static hj[] field_a;
    static int field_d;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -41) {
            hk.a(9);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static tg a(wd param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        hn var3_ref = null;
        oe var4 = null;
        g var4_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        dd var7 = null;
        Object stackIn_2_0 = null;
        g stackIn_5_0 = null;
        oe stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_16_0 = null;
        g stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              if (!(param0 instanceof dd)) {
                L1: {
                  L2: {
                    var3_ref = (hn) (Object) param0;
                    var4 = new oe(param0.f(50), param0.field_k, false);
                    var5 = var3_ref.field_A;
                    var6 = var3_ref.field_K;
                    var4.field_l = var3_ref.field_H;
                    if (var6 < var5) {
                      break L2;
                    } else {
                      var4.field_k = var3_ref.field_F;
                      var4.field_m = var3_ref.field_Q;
                      if (HoldTheLine.field_D == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5 = 1.0f - var5;
                  var4.field_k = var3_ref.field_Q;
                  var6 = -var6 + 1.0f;
                  var4.field_m = var3_ref.field_F;
                  break L1;
                }
                L3: {
                  if (0.0f == var5) {
                    break L3;
                  } else {
                    var4 = oc.a(var5, param1 ^ 16711934, var4);
                    var6 = (-var5 + var6) / (-var5 + 1.0f);
                    break L3;
                  }
                }
                L4: {
                  if (var6 == 1.0f) {
                    break L4;
                  } else {
                    var4 = ua.a(false, var6, var4);
                    break L4;
                  }
                }
                if (!Float.isNaN(var4.field_e)) {
                  stackOut_16_0 = (oe) var4;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                var7 = (dd) (Object) param0;
                var4_ref = new g(param0.f(50), param0.field_k, false);
                var4_ref.field_n = var7.p(-1);
                var4_ref.field_j = var7.b((byte) -105);
                stackOut_4_0 = (g) var4_ref;
                stackIn_5_0 = stackOut_4_0;
                return (tg) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("hk.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + 0 + 41);
        }
        return (tg) (Object) stackIn_17_0;
    }

    final static void a(int param0) {
        go.a(0, 4);
        if (param0 != -30500) {
            field_c = null;
        }
    }

    final static void a(boolean param0) {
        dj.a(param0, qd.field_k, -94, ij.field_k);
        gn.field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Continue";
    }
}
