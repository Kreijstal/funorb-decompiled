/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends fc {
    static ja field_m;
    int field_n;
    static int field_o;
    static String field_k;
    static kk field_i;
    byte[] field_l;
    static String field_j;

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 >= -119) {
                Object var3 = null;
                ei.a((qj) null, -127);
            }
            param1.addMouseListener((java.awt.event.MouseListener) (Object) hd.field_p);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hd.field_p);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) hd.field_p);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ei.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static ng a(int param0, ng param1, int[] param2) {
        ng var3 = null;
        RuntimeException var3_ref = null;
        ng stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new ng(0, param0, 0);
            var3.field_c = param1.field_c;
            var3.field_a = param1.field_a;
            var3.field_j = param1.field_j;
            var3.field_l = param2;
            var3.field_g = param1.field_g;
            var3.field_k = param1.field_k;
            var3.field_b = param1.field_b;
            var3.field_m = param1.field_m;
            stackOut_0_0 = (ng) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ei.B(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void e(int param0) {
        field_m = null;
        field_j = null;
        field_i = null;
        field_k = null;
        int var1 = 0;
    }

    final static String a(byte param0) {
        if (!(gl.field_I >= 2)) {
            return ee.field_f;
        }
        if (null != ff.field_b) {
            if (!ff.field_b.c(96)) {
                return pc.field_t;
            }
            return jb.field_c;
        }
        if (!field_i.c(-97)) {
            return sa.field_K;
        }
        if (!field_i.b("commonui", (byte) -3)) {
            return gj.field_e + " - " + field_i.a("commonui", 0) + "%";
        }
        if (!(ha.field_x.c(-50))) {
            return fd.field_f;
        }
        if (!ha.field_x.b("commonui", (byte) -3)) {
            return v.field_c + " - " + ha.field_x.a("commonui", 0) + "%";
        }
        if (!(ok.field_G.c(117))) {
            return ra.field_w;
        }
        if (!(ok.field_G.a((byte) 48))) {
            return ug.field_t + " - " + ok.field_G.a(true) + "%";
        }
        return f.field_d;
    }

    final static void a(qj param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~(3 & (param0.field_q | param0.field_t)) != param1) {
                var2_int = 4 - (3 & param0.field_t);
                var3 = -(3 & param0.field_q) + 4;
                var4 = param0.field_t + var2_int;
                var5 = new int[(param0.field_t + var2_int) * (var3 + param0.field_q)];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param0.field_q) {
                    param0.field_z = var5;
                    param0.field_t = param0.field_t + var2_int;
                    param0.field_r = param0.field_r - var2_int;
                    param0.field_o = param0.field_o - var3;
                    param0.field_q = param0.field_q + var3;
                    break L1;
                  } else {
                    var7 = 0;
                    L3: while (true) {
                      if (param0.field_t <= var7) {
                        var6++;
                        continue L2;
                      } else {
                        var5[(var3 + var6) * var4 - (-var2_int + -var7)] = param0.field_z[var7 + param0.field_t * var6];
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ei.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    final static void d(int param0) {
        oj.a(-108);
        if (null != ki.field_f) {
            r.a(-32652, ki.field_f);
        }
        ui.g(95);
        ij.a(13809);
        mi.k(10228);
        if (wf.a(-28510)) {
            ra.field_C.c(1, 7);
            me.a(-1, 0);
        }
        lj.a((byte) 117);
    }

    private ei() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ja();
        field_k = "Loading levels";
        field_j = "Names should contain a maximum of 12 characters";
    }
}
