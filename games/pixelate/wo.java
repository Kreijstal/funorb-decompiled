/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wo {
    static int field_d;
    od field_g;
    static String field_e;
    static String field_b;
    static String field_a;
    static byte[][] field_f;
    static tf field_c;
    static int field_h;

    wo(String param0, ak param1) {
        String[] var3 = null;
        ak[] var4 = null;
        try {
            var3 = new String[]{param0, a.field_J, fl.field_c};
            var4 = new ak[]{param1, wa.field_f, (ak) ((Object) v.field_e)};
            this.field_g = new od(0L, ab.field_a, var3, vl.field_J, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        dd discarded$2 = null;
        Random var3 = null;
        if (param1 > -11) {
          var3 = (Random) null;
          discarded$2 = wo.a(-98, -125, (Random) null, (byte) -68);
          wa.field_b = 1000000000L / (long)param0;
          return;
        } else {
          wa.field_b = 1000000000L / (long)param0;
          return;
        }
    }

    final static de b(int param0, int param1) {
        int var2 = -108 / ((34 - param0) / 49);
        return oc.field_H[param1];
    }

    final static dd a(int param0, int param1, Random param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        dd stackIn_9_0 = null;
        dd stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        dd stackOut_10_0 = null;
        dd stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if ((param0 ^ -1) != -2) {
                break L1;
              } else {
                L2: {
                  if (ok.a(param2, -108, 4) != 0) {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    break L2;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    break L2;
                  }
                }
                var4_int = stackIn_4_0;
                break L1;
              }
            }
            L3: {
              if (2 != param0) {
                break L3;
              } else {
                var4_int = 1;
                break L3;
              }
            }
            if (param3 == 116) {
              stackOut_10_0 = mc.a(param2, param1, var4_int != 0, tm.field_Y[param0], -67);
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_8_0 = (dd) null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wo.G(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = param4;
        this.field_g.a(-19360, param2, var7, param0, param1, var6, param3);
        ak.field_E.a(0, fq.field_q, 0, param4 ^ 261, wa.field_f.field_K);
        kc.field_u.a(fq.field_q - -2, 18, 0, 256, -2 + (-hk.field_b + (wa.field_f.field_K - 2) - 80));
        ae.field_e.a(fq.field_q + 2, 18, -80 + (-2 + (-hk.field_b + wa.field_f.field_K)), 256, 82 + hk.field_b);
        ma.field_z.a(0, wa.field_f.field_K, 20, fq.field_q + 2 - -20, false, hk.field_b, 2, -fq.field_q + wa.field_f.field_nb - 22);
        v.field_e.a(20, true, 2, hk.field_b);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_f = (byte[][]) null;
        if (!param0) {
          field_b = (String) null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void c(int param0, int param1) {
        pc var2 = null;
        if (param0 != -1) {
          field_f = (byte[][]) null;
          var2 = aa.field_f;
          var2.g(param1, 15514);
          var2.e(160, 1);
          var2.e(160, 3);
          return;
        } else {
          var2 = aa.field_f;
          var2.g(param1, 15514);
          var2.e(160, 1);
          var2.e(160, 3);
          return;
        }
    }

    final static void a(int param0) {
        tf var1 = null;
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        try {
            var1 = new tf(50, 30);
            pm.field_l = new tf[param0];
            for (var2 = 3; (var2 ^ -1) < -1; var2--) {
                var1.c();
                t.d();
                rk.field_e.b(Integer.toString(var2), t.field_j >> -918059839, t.field_d, 0, -1);
                pm.field_l[-var2 + 3] = new tf(150, 90);
                pm.field_l[3 + -var2].c();
                var1.d(0, 0, t.field_j, t.field_d);
            }
            qa.field_f.a(param0 ^ 19695);
            jg.field_J = rk.field_e.c(bb.field_e);
            rf.field_n = rk.field_e.c(po.field_j);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wo.A(" + param0 + ')');
        }
    }

    final static mk a(cb param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Component discarded$2 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        mk var7 = null;
        java.awt.Frame var8 = null;
        mk stackIn_2_0 = null;
        mk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_6_0 = null;
        mk stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = uc.a(param0, param5, param4, param2, param3, true);
            var6 = var8;
            if (param1 == 150) {
              if (var8 != null) {
                var7 = new mk();
                var7.field_f = var8;
                discarded$2 = var7.field_f.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param4, param2);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackOut_6_0 = (mk) (var7);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (mk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6_ref);
            stackOut_8_1 = new StringBuilder().append("wo.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_a = "No highscores";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
