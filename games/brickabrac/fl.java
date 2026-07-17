/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fl extends k {
    private String field_k;
    static long field_l;
    static String field_m;
    private boolean field_n;

    final static void f(byte param0) {
        int var1 = 50 / ((31 - param0) / 52);
        vq.field_J = null;
        go.field_e = 0;
        th.field_h = false;
        b.field_a = -1;
        ad.field_j = -1;
    }

    final static void e() {
        jp var1 = null;
        jp var3 = null;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        try {
            var1 = new jp(540, 140);
            int var2 = 5;
            fc.a(-89, var1);
            mg.c();
            lb.d();
            ld.field_t = 0;
            jl.b(-115);
            var3 = var1.e();
            for (var4 = 0; 15 > var4; var4++) {
                var3.d(-2, -2, 16777215);
                lb.e(4, 4, 0, 0, 540, 140);
            }
            aa.field_b.g();
            var1.a(0, 0);
            sc.b(-123);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fl.Q(" + -41 + 41);
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        oh var4_ref_oh = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        String stackOut_14_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param1;
            int discarded$4 = -106;
            var3 = th.a(var5);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((fl) this).field_k)) {
                  break L1;
                } else {
                  int discarded$5 = 0;
                  var4_ref_oh = qc.a(param1);
                  if (var4_ref_oh != null) {
                    if (null == var4_ref_oh.field_g) {
                      ((fl) this).field_n = var4_ref_oh.field_c;
                      ((fl) this).field_k = param1;
                      break L1;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      return (String) (Object) stackIn_9_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((fl) this).field_n) {
                var4 = 21 / ((-16 - param0) / 50);
                stackOut_14_0 = gk.field_d;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_12_0 = ng.field_f;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("fl.C(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final static void b() {
        fp.field_A.setLength(0);
        ng.field_b = 0;
    }

    fl(vb param0) {
        super(param0);
        ((fl) this).field_n = false;
    }

    public static void f() {
        field_m = null;
    }

    final qh a(String param0, byte param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qh stackIn_4_0 = null;
        qh stackIn_11_0 = null;
        qh stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_10_0 = null;
        qh stackOut_15_0 = null;
        qh stackOut_14_0 = null;
        qh stackOut_3_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                fl.f((byte) -106);
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param0;
            if (se.a(17165, var4)) {
              L2: {
                if (!param0.equals((Object) (Object) ((fl) this).field_k)) {
                  L3: {
                    int discarded$2 = 0;
                    var3 = qc.a(param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_g != null) {
                        break L3;
                      } else {
                        ((fl) this).field_k = param0;
                        ((fl) this).field_n = var3.field_c;
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = hq.field_z;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!((fl) this).field_n) {
                  stackOut_15_0 = lp.field_xb;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = ae.field_c;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_3_0 = lp.field_xb;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("fl.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    final static int a(CharSequence param0) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = sq.a((byte) -32, 10, true, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fl.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -28734 + 41);
        }
        return stackIn_1_0;
    }

    final void e(byte param0) {
        ((fl) this).field_k = null;
        if (param0 != -22) {
            ((fl) this).e((byte) -82);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Orb coins: ";
    }
}
