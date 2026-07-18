/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ab extends l {
    boolean field_u;
    static String field_t;
    static int[] field_r;
    volatile boolean field_s;
    boolean field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, km[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param5[0].field_v;
                  var7 = param5[2].field_v;
                  var8 = param5[1].field_v;
                  param5[0].e(param2, param3, param0);
                  param5[2].e(param1 + (param2 + -var7), param3, param0);
                  wb.b(o.field_d);
                  wb.e(param2 + var6_int, param3, -var7 + (param1 + param2), param3 - -param5[1].field_u);
                  var9 = param2 + var6_int;
                  var10 = -var7 + (param1 + param2);
                  param2 = var9;
                  L2: while (true) {
                    if (var10 <= param2) {
                      wb.a(o.field_d);
                      break L0;
                    } else {
                      param5[1].e(param2, param3, param0);
                      param2 = param2 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("ab.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(-104).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    abstract int f(int param0);

    public static void g() {
        field_r = null;
        int var1 = 55;
        field_t = null;
    }

    abstract byte[] a(boolean param0);

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        ve var8 = null;
        nk var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            int discarded$7 = 21257;
            if (ed.a(var10)) {
              if (ld.field_g == 2) {
                var8 = mn.a(-1, param2);
                if (var8 != null) {
                  o discarded$8 = me.field_e.b((o) (Object) var8, (byte) 123);
                  L1: while (true) {
                    var7 = (ve) (Object) me.field_e.a((byte) -110);
                    if (var7 == null) {
                      var8.c(-2193);
                      var8.d(-1);
                      wg.field_w = wg.field_w - 1;
                      var9 = qn.field_U;
                      var9.f(param0, -104);
                      var9.field_l = var9.field_l + 1;
                      var5 = var9.field_l;
                      var9.c(1, (byte) 66);
                      var9.a(-110, param2);
                      var9.a(var9.field_l - var5, -1);
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    } else {
                      var7.field_Ib = var7.field_Ib - 1;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_8_0 = oc.a(kj.field_f, new String[1], (byte) -114);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ik.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = qj.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ab.I(").append(param0).append(',').append(21250).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return (String) (Object) stackIn_14_0;
    }

    final static void d() {
        l var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Chess.field_G;
        try {
          f.field_a = null;
          wc.field_v = 0;
          wg.field_w = 0;
          me.field_e.e(-31023);
          cl.field_e.e(-31023);
          var1 = bf.field_M.a(false);
          L0: while (true) {
            if (var1 == null) {
              var1 = r.field_Ib.a(false);
              L1: while (true) {
                if (var1 == null) {
                  ld.field_g = 0;
                  return;
                } else {
                  var1.d(-1);
                  var1 = r.field_Ib.a(0);
                  continue L1;
                }
              }
            } else {
              var1.d(-1);
              var1 = bf.field_M.a(0);
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1_ref, "ab.G(" + -42 + ')');
        }
    }

    final static void h() {
        fm.field_R = new String[38];
        fm.field_R[16] = cn.field_a;
        fm.field_R[17] = aa.field_a;
        fm.field_R[7] = jg.field_L;
        fm.field_R[27] = ec.field_g;
        fm.field_R[15] = qa.field_b;
        fm.field_R[20] = sh.field_c;
        fm.field_R[28] = se.field_Z;
        fm.field_R[6] = jg.field_L;
        fm.field_R[34] = ca.field_e;
        fm.field_R[33] = qm.field_a;
        fm.field_R[13] = rc.field_b;
        fm.field_R[21] = ec.field_g;
        fm.field_R[30] = ma.field_H;
        fm.field_R[32] = hj.field_k;
        fm.field_R[3] = vm.field_g;
        fm.field_R[18] = dh.field_h;
        fm.field_R[29] = wf.field_P;
        fm.field_R[22] = se.field_Z;
        fm.field_R[8] = hm.field_f;
        fm.field_R[24] = ma.field_H;
        fm.field_R[14] = ao.field_c;
        fm.field_R[0] = jf.field_e;
        fm.field_R[11] = kl.field_f;
        fm.field_R[23] = wf.field_P;
        fm.field_R[31] = ue.field_b;
        fm.field_R[19] = ti.field_a;
        fm.field_R[26] = fc.field_c;
        fm.field_R[37] = r.field_Zb;
        fm.field_R[2] = tc.field_y;
        fm.field_R[9] = gl.field_a;
        fm.field_R[4] = ij.field_d;
        fm.field_R[10] = oh.field_d;
        fm.field_R[5] = vc.field_c;
        fm.field_R[25] = ac.field_p;
        fm.field_R[1] = qa.field_a;
        ec.field_d = new eb(0, 0, 120, 24, fm.field_R[9]);
        qh.field_b = new eb(0, 0, 120, 24, ef.field_l);
    }

    ab() {
        ((ab) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_t = "This password contains your Player Name, and would be easy to guess";
    }
}
