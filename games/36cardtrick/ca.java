/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int field_b;
    static int[] field_c;
    static int field_a;
    static int field_d;

    final static void a(String param0, boolean param1, int param2) {
        try {
            ij.field_g = param1;
            r.field_p = true;
            if (param2 != 16777215) {
                qj var4 = (qj) null;
                ca.a((qk) null, (qj) null, -27, -28);
            }
            pc.field_a = new af(sd.field_c, vd.field_p, param0, ei.field_e, ij.field_g);
            sd.field_c.b(pc.field_a, (byte) -98);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ca.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(qk param0, qj param1, int param2, int param3) {
        try {
            vb.field_b = va.a(22018) * param2 / 1000;
            ch.a(-114, param0);
            kk.a(-16998, param0);
            ab.a(param0, 0);
            pf.d(260);
            ri.a((byte) -124);
            h.field_F = param3 + -vb.field_b;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ca.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(qk param0, qk param1, qk param2, int param3) {
        wb discarded$1 = null;
        RuntimeException var4 = null;
        wb[] var5 = null;
        wb[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        wb[] var10 = null;
        kc var11 = null;
        int var11_int = 0;
        kc var12 = null;
        int var13 = 0;
        wb[] var14 = null;
        kc var15 = null;
        int[][] var16 = null;
        kc var17 = null;
        kc var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = Main.field_T;
        try {
          L0: {
            se.field_G = gl.a("frame_top", param1, "commonui", -13244);
            rc.field_k = gl.a("frame_bottom", param1, "commonui", param3 + 11944);
            pb.field_k = ce.a(param3 ^ 25118, "jagex_logo_grey", "commonui", param1);
            eg.field_c = gl.a("button", param1, "commonui", -13244);
            gh.field_n = vc.a("validation", "commonui", 0, param1);
            me.field_c = (ee) ((Object) ec.a("commonui", param2, false, "arezzo12", param1));
            j.field_C = (ee) ((Object) ec.a("commonui", param2, false, "arezzo14", param1));
            vd.field_p = (ee) ((Object) ec.a("commonui", param2, false, "arezzo14bold", param1));
            var17 = new kc(param0.a((byte) 7, "", "button.gif"), (java.awt.Component) ((Object) tb.field_c));
            discarded$1 = lh.a("dropdown", param1, "commonui", 105);
            var5 = lk.a("screen_options", "commonui", (byte) 98, param1);
            ri.field_d = new wb[4];
            fb.field_b = new wb[4];
            nb.field_d = new wb[4];
            var6 = new wb[][]{nb.field_d, fb.field_b, ri.field_d};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_j;
            var8 = 1;
            L1: while (true) {
              if ((var8 ^ -1) <= (var19.length ^ -1)) {
                L2: {
                  if (param3 == -25188) {
                    break L2;
                  } else {
                    field_c = (int[]) null;
                    break L2;
                  }
                }
                var8 = var5[0].field_i[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (-4 >= (var9 ^ -1)) {
                    var9 = var17.field_o;
                    ji.a(true);
                    var17.c();
                    vj.e(0, 0, vj.field_l, vj.field_g);
                    var15 = new kc(var9, var9);
                    var18 = var15;
                    var18.c();
                    var17.b(0, 0);
                    var11 = new kc(var9, var9);
                    var11.c();
                    var17.b(var9 - var17.field_p, 0);
                    var12 = new kc(-(2 * var9) + var17.field_p, var9);
                    var12.c();
                    var17.b(-var9, 0);
                    gg.a(14756);
                    eg.field_c = new kc[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L4: while (true) {
                      if ((var14.length ^ -1) >= (var11_int ^ -1)) {
                        var9++;
                        continue L3;
                      } else {
                        var14[var11_int] = a.a(var5[var9], var19[var11_int], -88);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var19[0].clone());
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ca.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final static gk a(boolean param0) {
        if (param0) {
            return (gk) null;
        }
        return (gk) ((Object) new ec());
    }

    public static void a(byte param0) {
        if (param0 <= 126) {
            return;
        }
        field_c = null;
    }

    static {
        field_a = -1;
        field_c = new int[16];
    }
}
