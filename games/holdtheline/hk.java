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
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              if (param0 < -41) {
                break L1;
              } else {
                hk.a(9);
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "hk.D(" + param0 + ')');
        }
    }

    final static tg a(wd param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        hn var3_ref = null;
        dd var3_ref2 = null;
        oe var4 = null;
        g var4_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        Object stackIn_2_0 = null;
        g stackIn_5_0 = null;
        oe stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_18_0 = null;
        g stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              if (!(param0 instanceof dd)) {
                L1: {
                  L2: {
                    var3_ref = (hn) (Object) param0;
                    var4 = new oe(param0.f(50), param0.field_k, param2);
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
                  stackOut_18_0 = (oe) var4;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                var3_ref2 = (dd) (Object) param0;
                var4_ref = new g(param0.f(50), param0.field_k, param2);
                var4_ref.field_n = var3_ref2.p(-1);
                var4_ref.field_j = var3_ref2.b((byte) -105);
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
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hk.A(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (tg) (Object) stackIn_19_0;
    }

    final static void a(int param0) {
        try {
            go.a(0, 4);
            if (param0 != -30500) {
                field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "hk.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
            dj.a(param0, qd.field_k, -94, ij.field_k);
            gn.field_g = true;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "hk.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Continue";
    }
}
