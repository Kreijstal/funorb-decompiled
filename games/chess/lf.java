/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kn {
    int field_R;
    static int field_S;
    static int field_T;
    static boolean field_U;
    static String field_P;
    static boolean field_O;
    static String field_Q;
    static String field_N;

    public static void j(int param0) {
        field_N = null;
        field_P = null;
        field_Q = null;
        if (param0 != 1839839976) {
          lf.a(77, (byte) -29, 121, -13, -95, 88);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        gb.field_A[ed.field_b] = param3;
        vn.field_Ab[ed.field_b] = ed.field_b;
        hg.field_d[ed.field_b] = param5;
        if (!(nj.field_t <= param5)) {
          bh.field_F = param5;
        }
        if (param5 > bj.field_gb) {
          eb.field_y = param5;
        }
        hn.field_e[ed.field_b] = param0;
        in.field_j[ed.field_b] = param2;
        oc.field_n[ed.field_b] = param4;
        int var6 = param4 + param2 + param0;
        int var7 = var6 == 0 ? 0 : 1000 * param0 / var6;
        gh.field_a[ed.field_b] = var7;
        if (bh.field_F > var7) {
          bh.field_F = var7;
        }
        if (param1 != 117) {
          lf.a(-126, (byte) -125, 10, 121, 120, 92);
        }
        ed.field_b = ed.field_b + 1;
        if (eb.field_y < var7) {
          eb.field_y = var7;
        }
    }

    final static void a(int param0, em param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        fn stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        fn var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        em var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Chess.field_G;
        try {
          var44 = param1;
          if (var44.field_y != null &&
            1 < var44.field_j) {
            var60 = var44.field_y;
            h.a(var60, 0, param4 ^ 1187586933, lc.field_n, 0);
          } else {
            d.l(465918340);
          }
          var54 = new int[param1.field_t];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param1.field_t];
          var62 = lk.field_c;
          var63 = ab.field_r;
          var61 = pa.field_o;
          if (param4 != 29521) {
            lf.i(-127);
          }
          for (var13 = 0; param1.field_t > var13; var13++) {
            var14 = var61[var13] * param3 + (var62[var13] * param7 + var63[var13] * param0) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (128 <= var14) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = 128 + var14;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = param5 * var62[var13] + param6 * var63[var13] + param2 * var61[var13] >> 8;
            stackIn_20_0 = gf.field_b;
            if (0 <= var15) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; um.field_a > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = ve.field_Hb[var13Lifetime1];
            var15Lifetime1 = param1.field_g[var14Lifetime1];
            var16 = param1.field_A[var14Lifetime1];
            var17 = param1.field_J[var14Lifetime1];
            if (param1.field_l[var14Lifetime1] >= lk.field_c.length) {
              stackIn_27_0 = -1;
            } else {
              stackIn_27_0 = param1.field_l[var14Lifetime1];
            }
            var18 = stackIn_27_0;
            if (lk.field_c.length > param1.field_C[var14Lifetime1]) {
              stackIn_30_0 = param1.field_C[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var19 = stackIn_30_0;
            if (lk.field_c.length > param1.field_E[var14Lifetime1]) {
              stackIn_33_0 = param1.field_E[var14Lifetime1];
            } else {
              stackIn_33_0 = -1;
            }
            var20 = stackIn_33_0;
            if (null != m.field_e &&
              null != param1.field_G &&
              param1.field_G.length > var14Lifetime1 &&
              -1 != param1.field_G[var14Lifetime1] &&
              m.field_e.length > param1.field_G[var14Lifetime1]) {
              stackIn_40_0 = m.field_e[param1.field_G[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = qm.field_c[var15Lifetime1];
            var23 = tc.field_w[var15Lifetime1];
            var24 = qm.field_c[var16];
            var25 = tc.field_w[var16];
            var26 = qm.field_c[var17];
            var27 = tc.field_w[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_45_0 = var21.field_g;
              } else {
                stackIn_45_0 = 8355711;
              }
              var30 = stackIn_45_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (var32 * var28 & 16711796) >>> 8 | (var31 * var28 & -16711780) >>> 8;
              var33 = var33 + 65793 * var29;
              bb.a(var22, var26, 8355711 & var33 >> 1, var25, var24, var23, 1, var27);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_49_0 = var21.field_g;
              } else {
                stackIn_49_0 = 8355711;
              }
              var34 = stackIn_49_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = var36 * var28 >>> 8 & -1258225920 | var35 * var28 >>> 8 & -687931137;
              var38 = 1107361536 & var36 * var29 >>> 8 | (-16711811 & var29 * var35) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = (16711928 & var36 * var30) >>> 8 | -1929445121 & var30 * var35 >>> 8;
              var39 = var39 + var33 * 65793;
              qn.a(var26, var37 >> 8 & 255, 255 & var37, param4 ^ 29521, var27, var37 >> 16, var23, var25, var38 >> 16, 255 & var38 >> 8, var24, 255 & var38, 255 & var39, var22, var39 >> 16, (var39 & 65501) >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("lf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public lf() {
        super(0, 0, 0, 0, (jm) null, (rg) null);
        this.field_R = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        km var7 = null;
        if (param1 != 0) {
          return;
        }
        if (null == this.field_M) {
          return;
        }
        if (this.field_R == 0) {
          return;
        }
        if (this.field_R != 256) {
          var7 = new km(this.field_M.field_y, this.field_M.field_C);
          tl.a((byte) -67, var7);
          this.field_M.a(0, param1, -110, 0);
          fd.a(28773);
          var7.b(this.field_u + param3, param0 + this.field_r, this.field_R);
          if (param2 > -80) {
            em var6 = (em) null;
            lf.a(-25, (em) null, -102, -7, -85, 43, 21, 65);
          }
          return;
        }
        this.field_M.a(param0 + this.field_r, param1, -108, param3 + this.field_u);
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
          field_T = -61;
        }
        if (0 < an.field_e &&
          fm.field_V) {
          wb.g(0, 0, wb.field_h, uh.field_m.field_wb);
          la.field_c.a(false, param1);
        }
        if ((0 < aj.field_c || ed.field_c > 0) &&
          jh.field_a) {
          wb.g(0, 0, wb.field_h, uh.field_m.field_wb);
          ah.field_i.a(false, param1);
        }
    }

    lf(mf param0) {
        super(param0.field_u, param0.field_r, param0.field_y, param0.field_C, (jm) null, (rg) null);
        try {
          param0.a(0, 34, this.field_C, this.field_y, 0);
          this.field_M = param0;
          this.field_R = 256;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int i(int param0) {
        em var2;
        if (il.field_a < 2) {
          return 0;
        }
        if (param0 < 90) {
          var2 = (em) null;
          lf.a(40, (em) null, 32, -29, 40, -127, 89, -102);
        }
        if (se.field_V == 0) {
          if (!fl.field_m.c((byte) 123)) {
            return 20;
          }
          if (!fl.field_m.b("commonui", 100)) {
            return 40;
          }
          if (!Chess.field_B.c((byte) 127)) {
            return 50;
          }
          if (!Chess.field_B.b("commonui", 100)) {
            return 60;
          }
          if (!bi.field_a.c((byte) 121)) {
            return 70;
          }
          if (!bi.field_a.b((byte) -40)) {
            return 80;
          }
          return 100;
        }
        if (null != qa.field_c) {
          if (!qa.field_c.c((byte) 124)) {
            return 14;
          }
          if (!qa.field_c.a(4, "")) {
            return 29;
          }
          if (!qa.field_c.b("", 100)) {
            return 29;
          }
        }
        if (!fl.field_m.c((byte) 124)) {
          return 43;
        }
        if (!fl.field_m.b("commonui", 100)) {
          return 57;
        }
        if (!Chess.field_B.c((byte) 126)) {
          return 71;
        }
        if (!Chess.field_B.b("commonui", 100)) {
          return 80;
        }
        if (!bi.field_a.c((byte) 125)) {
          return 82;
        }
        if (!bi.field_a.b((byte) -40)) {
          return 86;
        }
        return 100;
    }

    static {
        field_S = 80;
        field_T = -1;
        field_Q = "This game option is only available to members.";
        field_P = "You have declined the invitation.";
        field_U = true;
        field_O = false;
    }
}
