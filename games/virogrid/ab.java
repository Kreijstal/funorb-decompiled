/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ab extends gf implements ta {
    static String field_I;
    static int[] field_H;
    static km field_K;
    static il field_L;
    private jb field_M;
    static bk field_G;
    static boolean field_J;
    private tg field_N;

    ab(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (ol) null);
        ((ab) this).field_M = new jb((ol) (Object) new cc(10000536), wd.field_a, 0, 0, 140, 25);
        ((ab) this).field_M.a(2, new al());
        ((ab) this).field_N = new tg(md.field_c, (cd) this);
        ((ab) this).field_E = new fi[]{(fi) (Object) ((ab) this).field_M, (fi) (Object) ((ab) this).field_N};
        ((ab) this).field_N.field_w = (ol) (Object) new hf();
        ((ab) this).d(false);
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (param0 != 12085) {
            ((ab) this).field_M = null;
        }
        if (!(((ab) this).field_M.a(param0 + -12086).a(param0 + -34328) == bm.field_i)) {
            return;
        }
        try {
            ce.a(((ab) this).field_M.f(-2), ((ab) this).field_M.g(param0 + -12114), -2, ((ab) this).field_M.g(true));
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ab.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        if (param0 >= -82) {
          return;
        } else {
          var2 = 250;
          ((ab) this).field_M.a(25, true, ((ab) this).field_m - 5 >> 1, ((ab) this).field_g + -var2 >> 1, 140);
          ((ab) this).field_N.a(30, true, (20 + (((ab) this).field_m - 30) >> 1) - -2, 140 + ((-var2 + ((ab) this).field_g >> 1) + 10), 100);
          return;
        }
    }

    final static boolean b(int param0, int param1) {
        if (param1 == 1) {
          if (mf.a(95, param0)) {
            if (param0 == -2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_L = null;
          if (mf.a(95, param0)) {
            if (param0 == -2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        hg var6 = null;
        CharSequence var7 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_26_0 = null;
        String stackOut_22_0 = null;
        String stackOut_19_0 = null;
        String stackOut_11_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param1;
            if (dm.a(var7, param0 + -1551)) {
              if (oa.field_q == 2) {
                if (jc.a(param1, true)) {
                  stackOut_8_0 = ql.field_k;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  int discarded$2 = -73;
                  if (!ch.a(param1)) {
                    L1: {
                      if (sg.field_j < 100) {
                        break L1;
                      } else {
                        if (bn.field_d <= 0) {
                          stackOut_16_0 = qi.field_a;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    if (sg.field_j < 200) {
                      if (!fm.a(param1, param0 ^ -1369854407)) {
                        var6 = gk.field_g;
                        var6.g(param2, 8);
                        var6.field_l = var6.field_l + 1;
                        var4 = var6.field_l;
                        var6.a(0, param0 ^ -25);
                        var6.a(param1, (byte) -112);
                        var6.b(var6.field_l + -var4, param0 + -74);
                        if (param0 != 73) {
                          var5 = null;
                          String discarded$3 = ab.a((byte) -58, (String) null, 66);
                          stackOut_26_0 = null;
                          stackIn_27_0 = stackOut_26_0;
                          break L0;
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_22_0 = oi.a(new String[1], kk.field_o, 2);
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                    } else {
                      stackOut_19_0 = qi.field_a;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  } else {
                    stackOut_11_0 = oi.a(new String[1], og.field_e, 2);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = jl.field_F;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = sa.field_l;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_27_0;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
            if (param1 < 113) {
                boolean discarded$0 = ab.b(-49, -84);
            }
            super.a(param0, 124, param2, param3);
            ((ab) this).field_N.field_C = ((ab) this).field_M.a(-1).a(-22243) == bm.field_i ? true : false;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ab.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        dk.field_j.b(bn.field_c, 4 + (((ab) this).field_l + param1), 4 + (dk.field_j.field_H + (((ab) this).field_u + param2)), 16777215, -1);
    }

    public static void e() {
        field_G = null;
        field_I = null;
        field_L = null;
        field_K = null;
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[128];
        field_I = "This option cannot be combined with the current settings for:  ";
        field_G = null;
    }
}
