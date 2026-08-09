/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends nm {
    static boolean field_p;
    private int field_o;
    static String field_k;
    private int field_r;
    private int field_m;
    private int field_q;
    private jp field_s;
    static String field_n;
    private String field_l;
    static int field_i;
    private boolean field_j;

    final static void a(mf param0, mf param1, byte param2, mf param3) {
        jp var17 = null;
        tp[] var5 = null;
        tp[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        tp[] var14 = null;
        int var11_int = 0;
        jp var15 = null;
        jp var18 = null;
        jp var11 = null;
        jp var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        try {
            nf.field_W = cr.a("commonui", param3, "frame_top", param2 ^ -57);
            qc.field_l = cr.a("commonui", param3, "frame_bottom", 2);
            ka.field_n = pl.a("commonui", "jagex_logo_grey", (byte) -110, param3);
            sf.field_U = cr.a("commonui", param3, "button", 2);
            df.field_a = bd.a("commonui", "validation", param3, (byte) -8);
            og.field_Yb = (dh) ((Object) si.a((byte) -118, "commonui", "arezzo12", param3, param0));
            a.field_u = (dh) ((Object) si.a((byte) -108, "commonui", "arezzo14", param3, param0));
            wm.field_a = (dh) ((Object) si.a((byte) -126, "commonui", "arezzo14bold", param3, param0));
            var17 = new jp(param1.a(122, "button.gif", ""), (java.awt.Component) ((Object) kj.field_D));
            uo.a((byte) 29, param3, "dropdown", "commonui");
            var5 = wq.a("commonui", param3, "screen_options", param2 ^ 946715361);
            mq.field_b = new tp[4];
            cd.field_b = new tp[4];
            ng.field_d = new tp[4];
            var6 = new tp[][]{mq.field_b, ng.field_d, cd.field_b};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_j;
            for (var8 = 1; var19.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_i[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; var9 < 3; var9++) {
                var14 = var6[var9];
                tp[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = ek.a(var5[var9], (byte) -85, var19[var11_int]);
                }
            }
            var9 = var17.field_C;
            jf.d(param2 ^ 88);
            var17.g();
            lb.a(0, 0, lb.field_c, lb.field_d);
            var15 = new jp(var9, var9);
            var18 = var15;
            var18.g();
            var17.d(0, 0);
            var11 = new jp(var9, var9);
            var11.g();
            if (param2 != -59) {
                nq.d(-50);
            }
            var17.d(var9 - var17.field_D, 0);
            var12 = new jp(-(var9 * 2) + var17.field_D, var9);
            var12.g();
            var17.d(-var9, 0);
            sc.b(-81);
            sf.field_U = new jp[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "nq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_j = oh.a(pq.field_k, po.field_a, (byte) -24, this.field_r, this.field_m, this.field_s);
        this.field_j = this.field_s.d(this.field_m, this.field_r, pq.field_k, po.field_a);
    }

    final static void e(int param0) {
        if (!(eo.field_f == null)) {
            eo.field_f.f();
        }
        if (!(jk.field_w == null)) {
            jk.field_w.f();
        }
        if (param0 < 39) {
            nq.a(-13, -69);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 > -40) {
            return;
        }
        field_n = null;
    }

    final static void d(int param0) {
        if (param0 != 2) {
            field_i = 90;
        }
        ld.field_s = true;
        ng.field_b = 0;
    }

    final static void a(int param0, int param1) {
        nm var2 = null;
        int var3 = 0;
        e var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 13330) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            var4 = (e) ((Object) na.field_Q.d(-37));
            L2: while (true) {
              if (var4 == null) {
                var2 = ej.field_F.d(param1 ^ -13402);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ma.b((byte) -85, param0);
                    var2 = ej.field_F.a((byte) 116);
                    continue L3;
                  }
                }
              } else {
                ud.a(param0, var4, (byte) 80);
                var4 = (e) ((Object) na.field_Q.a((byte) 116));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "nq.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static hl a(byte param0, String param1, mf param2, mf param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hl stackIn_2_0 = null;
        hl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2.a(param1, false);
            var6 = param2.a(var5_int, -80, param4);
            if (param0 == -37) {
              stackIn_4_0 = wn.a(var5_int, param3, param2, var6, (byte) -112);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("nq.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nq(int param0, int param1, jp param2, String param3) {
        try {
            this.field_s = param2;
            this.field_m = param0;
            this.field_r = param1;
            this.field_l = param3.toLowerCase();
            this.field_q = 2 * lm.field_b - -ob.field_D.c(this.field_l);
            this.field_o = ob.field_D.field_P + 2 * ki.field_a - -ob.field_D.field_F;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "nq.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.field_s.c(this.field_m, this.field_r);
        if (param0 != 2) {
            return;
        }
        if (!(!this.field_j)) {
            hj.a(-lm.field_b + pq.field_k, -ki.field_a + po.field_a, this.field_o, this.field_q, this.field_l, 16777215);
        }
    }

    static {
        field_k = "Join";
        field_n = "Invalid password.";
        field_p = false;
    }
}
