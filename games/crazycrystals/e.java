/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private boolean field_d;
    private String field_e;
    private boolean field_c;
    static String field_a;
    static String field_b;

    final boolean a(byte param0) {
        if (param0 != 47) {
            String discarded$0 = ((e) this).a(81);
        }
        return ((e) this).field_c;
    }

    final void a(int param0, boolean param1) {
        ((e) this).field_d = true;
        int var3 = -32 % ((32 - param0) / 45);
        ((e) this).field_c = param1 ? true : false;
    }

    final static void b(byte param0) {
        vl.field_f = new am(kg.a(hk.field_e, 100, 0));
        be.field_d = new am(kg.a(rh.field_g, 100, 0));
        tl.field_a = new am(kg.a(mo.field_i, 100, 0));
        jo.field_p = new am(kg.a(pl.field_h, 100, 0));
        sa.field_mb = new am(kg.a(sj.field_d, 100, 0));
        io.field_M = new am(kg.a(jn.field_m, 100, 0));
        ec.field_k = new am(kg.a(bb.field_x, 100, 0));
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, db param1, db param2) {
        hk.field_e = bl.a(param2, "initialset", "crushed").a();
        try {
            rh.field_g = ha.a(param1, "initialset", "fall-into-hole").b();
            mo.field_i = bl.a(param2, "initialset", "got-by-spider").a();
            pl.field_h = bl.a(param2, "initialset", "blown-up").a();
            sj.field_d = bl.a(param2, "initialset", "electrocuted-buzz").a();
            jn.field_m = ha.a(param1, "initialset", "electrocuted-end").b();
            bb.field_x = bl.a(param2, "initialset", "explode-into-sparks").a();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "e.A(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 > -9) {
            field_a = null;
        }
        return ((e) this).field_d;
    }

    final static void a(int param0, db param1, db param2, db param3) {
        RuntimeException var4 = null;
        wj[] var5 = null;
        wj[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        wj[] var10 = null;
        dl var11 = null;
        int var11_int = 0;
        dl var12 = null;
        int var13 = 0;
        wj[] var14 = null;
        dl var15 = null;
        int[][] var16 = null;
        dl var17 = null;
        dl var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            gk.field_d = bf.a(-1, "frame_top", "commonui", param2);
            lm.field_g = bf.a(-1, "frame_bottom", "commonui", param2);
            p.field_f = wl.a("jagex_logo_grey", param2, 10, "commonui");
            sb.field_B = bf.a(-1, "button", "commonui", param2);
            ao.field_b = we.a("validation", "commonui", param2, false);
            ba.field_i = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo12", 17153);
            ai.field_h = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo14", 17153);
            mo.field_m = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo14bold", 17153);
            var17 = new dl(param1.a(7693, "", "button.gif"), (java.awt.Component) (Object) jd.field_D);
            wj discarded$1 = ee.a(param2, "commonui", (byte) -92, "dropdown");
            var5 = ep.a(param2, "screen_options", "commonui", false);
            ik.field_g = new wj[4];
            pn.field_i = new wj[4];
            db.field_a = new wj[4];
            var6 = new wj[][]{db.field_a, ik.field_g, pn.field_i};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              if (var21.length <= var8) {
                var8 = var5[0].field_j[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_u;
                    hd.a(false);
                    var17.a();
                    kh.e(0, 0, kh.field_l, kh.field_d);
                    var15 = new dl(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.c(0, 0);
                    var11 = new dl(var9, var9);
                    var11.a();
                    var17.c(-var17.field_l + var9, 0);
                    var12 = new dl(var17.field_l + -(2 * var9), var9);
                    var12.a();
                    var17.c(-var9, 0);
                    lg.a(1);
                    sb.field_B = new dl[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = ol.a(var21[var11_int], 120, var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("e.H(").append(4).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    e(String param0) {
        ((e) this).field_c = false;
        ((e) this).field_d = false;
        try {
            ((e) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "e.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (param0 <= 118) {
            field_b = null;
        }
        return ((e) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Key";
        field_b = "Log in";
    }
}
