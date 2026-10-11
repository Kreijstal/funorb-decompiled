/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends tn {
    private int[] field_p;
    private int field_H;
    static String field_L;
    private int[] field_y;
    static byte[] field_w;
    private int[] field_q;
    int[] field_t;
    private qq[][] field_N;
    private int[] field_r;
    static String field_o;
    private qq[][] field_K;
    private int[] field_m;
    private ti field_Q;
    private int[] field_G;
    private int field_M;
    int[] field_F;
    private pi field_x;
    int[] field_u;
    private int[] field_I;
    private int[] field_P;
    private int[] field_E;
    private int[] field_s;
    private int[] field_J;
    private int[] field_A;
    private int[] field_T;
    private int field_C;
    private long field_O;
    private int field_D;
    private rc field_l;
    private long field_n;
    private boolean field_v;
    private boolean field_B;
    private int field_S;
    private gh field_z;

    final synchronized void e(int param0) {
        this.b(16384, true);
        if (param0 != 15) {
          this.field_r = (int[]) null;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        this.field_T[param0] = param2;
        if (param1 != -34) {
          this.field_K = (qq[][]) null;
        }
    }

    final synchronized tn b() {
        return (tn) ((Object) this.field_l);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = -117 / ((param0 + 22) / 39);
        this.field_E[param2] = param1;
        this.field_u[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param2, param0, param1, 2)) {
            return null;
          }
          if (param3 == -20487) {
            stackIn_7_0 = gq.d(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (bi) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ga.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int b(qq param0, byte param1) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var6Lifetime1;
        try {
          var3_int = (param0.field_r * param0.field_G >> 12) + param0.field_J;
          var3_int = var3_int + (this.field_r[param0.field_y] * (-8192 + this.field_T[param0.field_y]) >> 12);
          var5 = -50 % ((param1 + 60) / 41);
          var4 = param0.field_u;
          if (var4.field_o > 0 && (!(0 >= var4.field_f) ||
            this.field_p[param0.field_y] > 0)) {
            var6 = var4.field_f << 2;
            var7 = var4.field_j << 1;
            if (var7 > param0.field_C) {
              var6 = param0.field_C * var6 / var7;
            }
            var6 = var6 + (this.field_p[param0.field_y] >> 7);
            var8 = Math.sin((double)(param0.field_i & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var6 * var8);
          }
          var6Lifetime1 = (int)((double)(256 * param0.field_M.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ap.field_j + 0.5);
          stackIn_10_0 = (var6Lifetime1 < 1) ? 1 : var6Lifetime1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ga.BA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void f(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 256) {
          this.field_r = (int[]) null;
        }
        br var4 = (br) (this.field_Q.c(83));
        while (var4 != null) {
          var4.e(26005);
          var4 = (br) (this.field_Q.a(false));
        }
    }

    private final void a(int param0, int param1) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 2) {
          this.b(-91, (byte) 112, -1);
        }
        qq var3 = (qq) (this.field_l.field_n.d(0));
        while (var3 != null) {
          if ((0 > param0 || var3.field_y == param0) &&
            !(var3.field_E >= 0)) {
            this.field_N[var3.field_y][var3.field_H] = null;
            var3.field_E = 0;
          }
          var3 = (qq) (this.field_l.field_n.a((byte) -71));
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        qq var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        qq var8 = this.field_N[param2][param3];
        if (param0 != 29) {
          return;
        }
        if (var8 == null) {
          return;
        }
        this.field_N[param2][param3] = null;
        if ((2 & this.field_F[param2]) == 0) {
          var8.field_E = 0;
        } else {
          var6 = (qq) (this.field_l.field_n.d(0));
          while (var6 != null) {
            if (var8.field_y == var6.field_y && var6.field_E < 0 &&
              var6 != var8) {
              var8.field_E = 0;
              break;
            }
            var6 = (qq) (this.field_l.field_n.a((byte) -71));
          }
        }
    }

    final synchronized void c(int param0, boolean param1) {
        this.field_M = param0;
        if (param1) {
          this.field_t = (int[]) null;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 != 98) {
          this.b();
        }
    }

    private final void c(int param0, byte param1, int param2) {
        this.field_m[param2] = param0;
        this.field_P[param2] = we.a(-128, param0);
        int var4 = 120 % ((51 - param1) / 40);
        this.a(param2, param0, (byte) -16);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 > -67) {
          this.b(44, (byte) 25, -26);
        }
        if (param1 >= 0) {
          this.field_A[param1] = param2;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_A[var4] = param2;
          }
        }
    }

    final synchronized boolean a(bc param0, gh param1, int param2, int param3, io param4) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        int var11 = 0;
        br var12 = null;
        br var13 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param1.a();
          if (param2 <= 12) {
            this.field_s = (int[]) null;
          }
          var6_int = 1;
          var7 = null;
          if (0 < param3) {
            var7 = new int[]{param3};
          }
          var8 = (be) (param1.field_i.c(-126));
          while (var8 != null) {
            var9 = (int)var8.field_b;
            var12 = (br) (this.field_Q.a((long)var9, -25064));
            if (var12 == null) {
              var13 = lo.a(param0, (byte) 125, var9);
              if (var13 != null) {
                this.field_Q.a(var13, 87, (long)var9);
                if (!var13.a(param4, var8.field_j, (int[]) (var7), 1)) {
                  var6_int = 0;
                }
              } else {
                var6_int = 0;
              }
            } else {
              if (!var12.a(param4, var8.field_j, (int[]) (var7), 1)) {
                var6_int = 0;
                var8 = (be) (param1.field_i.a(false));
                continue;
              }
            }
            var8 = (be) (param1.field_i.a(false));
          }
          if (var6_int != 0) {
            param1.b();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ga.AA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_x.f()) {
          var2 = this.field_x.field_e * this.field_M / ap.field_j;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_O;
            if (0L <= this.field_n - var3) {
              this.field_O = var3;
            } else {
              var5 = (int)((-1L - this.field_O + (this.field_n + (long)var2)) / (long)var2);
              this.field_O = this.field_O + (long)var5 * (long)var2;
              this.field_l.a(var5);
              param0 = param0 - var5;
              this.a((byte) 42);
              if (this.field_x.f()) {
                continue;
              }
            }
            break;
          }
          this.field_l.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_l.a(param0);
        }

    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var18_int = 0;
        int var22_int = 0;
        qr dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ub stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_3 = false;
        fb stackIn_12_0;
        qr stackIn_12_1;
        qr stackIn_12_2;
        long stackIn_12_3;
        qr stackIn_13_1 = null;
        qr stackIn_13_2 = null;
        qr stackIn_13_4 = null;
        fb stackIn_31_0;
        qr stackIn_31_1;
        qr stackIn_31_2;
        long stackIn_31_3;
        qr stackIn_32_1;
        qr stackIn_32_2;
        qr stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        bi[] stackIn_82_0 = null;
        int stackIn_83_1 = 0;
        bi[] stackIn_88_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_155_0 = null;
        String stackIn_165_0 = null;
        String stackIn_170_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        pf var8 = null;
        long var9 = 0L;
        Object var11 = null;
        fb var12 = null;
        int var13 = 0;
        int var14 = 0;
        qr var18 = null;
        qr var19 = null;
        qr var20 = null;
        qr var21 = null;
        qr var22 = null;
        qr var23 = null;
        qr var24 = null;
        qr var25 = null;
        qr var26 = null;
        qr var27 = null;
        qr var28 = null;
        qr var29 = null;
        qr var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        bi var42 = null;
        qr var43 = null;
        qr var44 = null;
        qr var45 = null;
        qr var46 = null;
        qr var47 = null;
        qr var48 = null;
        qr var49 = null;
        Object var50 = null;
        bi var50_ref = null;
        Object var51 = null;
        bi var51_ref = null;
        Object var52 = null;
        bi var52_ref = null;
        Object var53 = null;
        bi var53_ref = null;
        bi var54 = null;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          stackIn_3_0 = qs.field_y;
          stackIn_3_1 = (cr.field_c * 4 + 8) * param5;
          stackIn_3_2 = (2 + cr.field_c) * 2;
          stackIn_4_3 = (hp.field_l == qs.field_y);
          var7_int = ((ub) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_4_3, -109, param0, 2) ? 1 : 0;
          var8 = qs.field_y.field_xb.field_M;
          if (param1 <= 109) {
            ga.a((nk[]) null, -36, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, 119, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, -57, (int[]) null, (bi[][]) null);
          }
          var9 = pr.a(14274);
          var11 = null;
          var12 = (fb) (var8.d(0));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_M) {
              var14 = param2 | param3;
              var12.field_Ub = new qr(0L, oj.field_zb);
              var12.a(4, var12.field_Ub);
              var12.field_Ub.field_y = 1;
              var12.field_Pb = new qr(0L, ek.field_E);
              var12.a(4, var12.field_Pb);
              var12.field_Rb = new qr(0L, oj.field_zb);
              var12.a(4, var12.field_Rb);
              var12.field_Rb.field_kb = 0;
              var12.field_Wb = new qr(0L, oj.field_zb);
              var12.a(4, var12.field_Wb);
              var12.field_Wb.field_kb = 0;
              var12.field_Ib = new qr(0L, ek.field_E);
              var12.a(4, var12.field_Ib);
              var12.field_Ib.field_y = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (ns.field_pb) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = oj.field_zb;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = ek.field_E;
              }
              stackIn_12_0.field_Mb = new qr(stackIn_12_3, stackIn_13_4);
              var12.a(4, var12.field_Mb);
              var12.field_xb = new qr[em.field_k];
              var12.field_Bb = new qr(0L, (qr) null);
              if ((1 << cp.field_q & var14) != 0) {
                var12.field_Mb.a(4, var12.field_Bb);
              }
              var12.field_oc = new qr(0L, (qr) null);
              if ((1 << vr.field_g & var14) != 0) {
                var12.field_Mb.a(4, var12.field_oc);
              }
              var12.field_ac = new qr(0L, (qr) null);
              if ((var14 & 1 << kf.field_i) != 0) {
                var12.field_Mb.a(4, var12.field_ac);
              }
              var12.field_Kb = new qr(0L, (qr) null);
              if (0 != (1 << v.field_e & var14)) {
                var12.field_Mb.a(4, var12.field_Kb);
              }
              var45 = var12.field_Bb;
              var44 = var12.field_Kb;
              var12.field_ac.field_G = 1;
              var43 = var12.field_oc;
              var43.field_G = 1;
              var44.field_G = 1;
              var45.field_G = 1;
              for (var18_int = 0; em.field_k > var18_int; var18_int++) {
                var12.field_xb[var18_int] = new qr(0L, (qr) null);
                if (0 != (var14 & 1 << var18_int + ml.field_j)) {
                  var12.field_Mb.a(4, var12.field_xb[var18_int]);
                }
                var12.field_xb[var18_int].field_G = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (ns.field_pb) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = ek.field_E;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = oj.field_zb;
              }
              stackIn_31_0.field_Ob = new qr(stackIn_31_3, stackIn_32_4);
              var12.a(4, var12.field_Ob);
              var12.field_Ob.field_y = 2;
              var12.field_Tb = new qr(0L, ek.field_E);
              var12.a(4, var12.field_Tb);
              var12.field_Sb = new qr(0L, gn.field_w);
              var12.a(4, var12.field_Sb);
              var12.field_Hb = new qr(0L, gn.field_w);
              var12.a(4, var12.field_Hb);
              var12.field_ic = new qr(0L, ii.field_u);
              var12.a(4, var12.field_ic);
              var12.e((byte) -126);
              var12.field_Db = new qr(0L, kq.field_h);
              var13 = 1;
              var12.a(4, var12.field_Db);
            }
            stackIn_36_0 = (!var12.field_Ab) ? param2 : param3;
            var14Lifetime1 = stackIn_36_0;
            var12.field_Ub.field_z = null;
            var12.field_Ub.field_mb = 0;
            var46 = var12.field_Ub;
            var46.field_K = 0;
            var12.field_Db.field_z = null;
            var12.field_Db.field_mb = 0;
            var47 = var12.field_Db;
            var47.field_K = 0;
            var12.field_Pb.field_z = null;
            var48 = var12.field_Pb;
            var12.field_Pb.field_mb = 0;
            var12.field_Rb.field_z = null;
            var48.field_K = 0;
            var12.field_Rb.field_mb = 0;
            var18 = var12.field_Rb;
            var18.field_K = 0;
            var12.field_Wb.field_z = null;
            var12.field_Wb.field_mb = 0;
            var19 = var12.field_Wb;
            var19.field_K = 0;
            var12.field_Ib.field_z = null;
            var20 = var12.field_Ib;
            var12.field_Ib.field_mb = 0;
            var20.field_K = 0;
            var12.field_Mb.field_z = null;
            var21 = var12.field_Mb;
            var12.field_Mb.field_mb = 0;
            var21.field_K = 0;
            for (var22_int = 0; em.field_k > var22_int; var22_int++) {
              var12.field_xb[var22_int].field_pb = null;
              var23 = var12.field_xb[var22_int];
              var12.field_xb[var22_int].field_mb = 0;
              var23.field_K = 0;
            }
            var12.field_Bb.field_pb = null;
            var12.field_Bb.field_mb = 0;
            var22 = var12.field_Bb;
            var12.field_Kb.field_pb = null;
            var22.field_K = 0;
            var12.field_Kb.field_mb = 0;
            var49 = var12.field_Kb;
            var12.field_oc.field_pb = null;
            var49.field_K = 0;
            var24 = var12.field_oc;
            var12.field_oc.field_mb = 0;
            var12.field_ac.field_pb = null;
            var24.field_K = 0;
            var25 = var12.field_ac;
            var12.field_ac.field_mb = 0;
            var25.field_K = 0;
            var12.field_Ob.field_z = null;
            var26 = var12.field_Ob;
            var12.field_Ob.field_mb = 0;
            var12.field_Tb.field_z = null;
            var26.field_K = 0;
            var12.field_Tb.field_mb = 0;
            var27 = var12.field_Tb;
            var12.field_Sb.field_z = null;
            var27.field_K = 0;
            var12.field_Sb.field_mb = 0;
            var28 = var12.field_Sb;
            var12.field_Hb.field_z = null;
            var28.field_K = 0;
            var12.field_Hb.field_mb = 0;
            var29 = var12.field_Hb;
            var29.field_K = 0;
            var12.field_ic.field_z = null;
            var12.field_ic.field_mb = 0;
            var30 = var12.field_ic;
            var30.field_K = 0;
            var12.field_K = qs.field_y.field_xb.field_K;
            var31 = 0;
            var32 = var12.field_Xb;
            if (!var12.f((byte) -78)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_Ab) {
                if (!var12.field_cc &&
                  !var12.field_Jb) {
                  if (!var12.field_Qb) {
                    var12.field_Ub.field_z = ng.field_b;
                  } else {
                    var12.field_Ub.field_z = lq.field_r;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Db.field_z = qn.field_a;
                }
              } else {
                if (var12.field_lc >= 0) {
                  var12.field_Ub.field_z = co.field_q;
                } else {
                  if (var12.field_mc && (var12.field_cc ||
                    var12.field_Jb)) {
                    var12.field_Db.field_z = qn.field_a;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (2 != var12.field_Fb) {
                      var12.field_Ub.field_z = tc.field_F;
                    } else {
                      var12.field_Db.field_z = ro.field_d;
                    }
                  }
                }
              }
              if (var12.field_Db.field_z == null) {
                var12.field_Ub.a(68, cr.field_c, (byte) 48, var31, 0);
              } else {
                var12.field_Db.a(68, cr.field_c, (byte) 72, var31, 0);
              }
              var12.field_Pb.field_z = nq.a(var12.field_Pb.field_nb, var32, 78);
              var12.field_Pb.a(78, cr.field_c, (byte) 85, var31, 70);
              if (var12.field_Pb.field_L &&
                !var12.field_Pb.field_z.equals(var32)) {
                dn.field_k = var32;
              }
              var12.field_Rb.field_z = Integer.toString(var12.field_Lb);
              if (var12.field_mc) {
                var12.field_Wb.field_z = "/" + var12.field_Eb;
                var12.field_Rb.field_y = 2;
                var33_int = (348 - var12.field_Wb.field_nb.c("/")) / 2;
                var12.field_Rb.a(var33_int - 150, cr.field_c, (byte) 83, var31, 150);
                var12.field_Wb.a(-var33_int + 198, cr.field_c, (byte) 84, var31, var33_int);
              } else {
                var12.field_Rb.field_y = 1;
                var12.field_Rb.a(48, cr.field_c, (byte) 108, var31, 150);
              }
              var12.field_Ib.field_z = Integer.toString(var12.field_Zb);
              var12.field_Ib.a(48, cr.field_c, (byte) 47, var31, 200);
              stackIn_71_0 = (!ns.field_pb) ? 200 : 250;
              var33_intLifetime1 = stackIn_71_0;
              var12.field_Mb.a(-2 + (365 - var33_intLifetime1), cr.field_c, (byte) 46, var31, var33_intLifetime1);
              var34_int = qo.field_b;
              if ((var14Lifetime1 & 1 << cp.field_q) != 0) {
                var50_ref = uk.field_b[var12.field_nc];
                var12.field_Bb.field_pb = var50_ref;
                var12.field_Bb.a(var50_ref.field_o, var12.field_Mb.field_mb, (byte) 111, 0, var34_int);
                var34_int = var34_int + (var50_ref.field_o + qo.field_b);
              }
              if ((var14Lifetime1 & 1 << vr.field_g) != 0) {
                if (!var12.field_cc) {
                  stackIn_80_0 = (var12.field_Jb) ? 1 : 0;
                } else {
                  stackIn_80_0 = 1;
                }
                var36 = stackIn_80_0;
                stackIn_82_0 = ji.field_E;
                if (var36 == 0) {
                  stackIn_83_1 = 0;
                } else {
                  stackIn_83_1 = 1;
                }
                var51_ref = stackIn_82_0[stackIn_83_1];
                var12.field_oc.field_pb = var51_ref;
                var12.field_oc.a(var51_ref.field_o, var12.field_Mb.field_mb, (byte) 124, 0, var34_int);
                var34_int = var34_int + (qo.field_b + var51_ref.field_o);
              }
              if (0 != (1 << kf.field_i & var14Lifetime1)) {
                var52_ref = j.field_s[-1 + var12.field_Fb];
                var12.field_ac.field_pb = var52_ref;
                var12.field_ac.a(var52_ref.field_o, var12.field_Mb.field_mb, (byte) 41, 0, var34_int);
                var34_int = var34_int + (qo.field_b + var52_ref.field_o);
              }
              if ((1 << v.field_e & var14Lifetime1) != 0) {
                stackIn_88_0 = tf.field_l;
                if (var12.field_ec) {
                  stackIn_91_1 = 1;
                } else {
                  stackIn_91_1 = 0;
                }
                var53_ref = stackIn_88_0[stackIn_91_1];
                var12.field_Kb.field_pb = var53_ref;
                var12.field_Kb.a(var53_ref.field_o, var12.field_Mb.field_mb, (byte) 127, 0, var34_int);
                var34_int = var34_int + (qo.field_b + var53_ref.field_o);
              }
              if (null != ln.field_O) {
                for (var36Lifetime1 = 0; var36Lifetime1 < em.field_k; var36Lifetime1++) {
                  if (ln.field_O[var36Lifetime1] != null &&
                    0 != (var14Lifetime1 & 1 << var36Lifetime1 + ml.field_j)) {
                    var42 = ln.field_O[var36Lifetime1][var12.field_dc[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_xb[var36Lifetime1].field_pb = var42;
                    var12.field_xb[var36Lifetime1].a(var54.field_o, var12.field_Mb.field_mb, (byte) 92, 0, var34_int);
                    var34_int = var34_int + (qo.field_b + var54.field_o);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Mb.field_K) / 2;
              if (0 < var36Lifetime2) {
                var12.field_Bb.field_hb = var12.field_Bb.field_hb + var36Lifetime2;
                var12.field_oc.field_hb = var12.field_oc.field_hb + var36Lifetime2;
                var12.field_ac.field_hb = var12.field_ac.field_hb + var36Lifetime2;
                var12.field_Kb.field_hb = var12.field_Kb.field_hb + var36Lifetime2;
                for (var37_int = 0; em.field_k > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_xb[var37_int];
                  dupTemp$0.field_hb = dupTemp$0.field_hb + var36Lifetime2;
                }
              }
              if (var12.field_Ab) {
                var37_intLifetime1 = var12.field_lc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Gb);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_Ob.field_z = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Ob.field_z = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Ob.a(var12.field_K - 365, cr.field_c, (byte) 57, var31, 365);
              var31 = var31 + cr.field_c;
              if (var12.field_jc != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(hl.field_H);
                discarded$2 = var37.append(var12.field_jc[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_Lb; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_jc[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Tb.field_z = var38;
                var39Lifetime1 = var12.field_Tb.field_nb.a(var38, var12.field_K - 2 * var12.field_Tb.field_kb);
                var12.field_Tb.a(var12.field_K, cr.field_c * var39Lifetime1, (byte) 73, var31, 0);
                var31 = var31 + var39Lifetime1 * cr.field_c;
              }
              if (var12.field_Jb) {
                var12.field_Sb.field_z = re.a(tq.field_a, 4371, new String[]{var32});
                var12.field_Sb.a(var12.field_K - tg.field_a * 2, cr.field_c, (byte) 80, var31, tg.field_a);
                var31 = var31 + cr.field_c;
              }
              if (var12.field_Yb) {
                var12.field_Hb.field_z = re.a(wj.field_n, 4371, new String[]{var32});
                var12.field_Hb.a(-(2 * tg.field_a) + var12.field_K, cr.field_c, (byte) 91, var31, tg.field_a);
                var31 = var31 + cr.field_c;
              }
            }
            var33 = fi.a(var12.field_hc, -11, var32);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_ic.field_nb.a(var33, -tg.field_a - tg.field_a + var12.field_K);
              var12.field_ic.field_z = var33;
              var12.field_ic.field_I = 256 * var12.field_Nb / ks.field_i;
              var12.field_ic.a(var12.field_K - tg.field_a * 2, cr.field_c * var34_intLifetime1, (byte) 112, var31, tg.field_a);
              var31 = var31 + var34_intLifetime1 * cr.field_c;
            }
            if (var7_int == 0) {
              var12.field_gb = -var12.field_mb + var31;
            }
            if (var13 != 0) {
              qs.field_y.field_xb.a(2, (qr) (var11), var12, (byte) 65);
            }
            for (var34_intLifetime2 = 0; em.field_k > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_xb[var34_intLifetime2].field_L) {
                if (null == ei.field_f) {
                  var35 = null;
                } else {
                  if (ei.field_f[var34_intLifetime2] != null) {
                    var35 = ei.field_f[var34_intLifetime2][var12.field_dc[var34_intLifetime2] & 255];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 == null) {
                  dn.field_k = gm.field_l[var34_intLifetime2];
                } else {
                  dn.field_k = gm.field_l[var34_intLifetime2] + " - " + (String) (var35);
                }
              }
            }
            if (var12.field_Bb.field_L) {
              if (var12.field_nc == 1) {
                var34 = va.field_i;
              } else {
                var34 = mk.field_e[var12.field_nc];
              }
              dn.field_k = vl.field_r + " - " + var34;
            }
            if (var12.field_Kb.field_L) {
              if (!var12.field_ec) {
                stackIn_155_0 = ek.field_G;
              } else {
                stackIn_155_0 = le.field_c;
              }
              dn.field_k = stackIn_155_0;
            }
            if (var12.field_oc.field_L) {
              if (!var12.field_cc &&
                !var12.field_Jb) {
                if (var12.field_mc) {
                  stackIn_165_0 = nr.field_o;
                } else {
                  stackIn_165_0 = ls.field_d;
                }
              } else {
                stackIn_165_0 = ns.field_qb;
              }
              dn.field_k = stackIn_165_0;
            }
            if (var12.field_ac.field_L) {
              if (var12.field_Fb == 2) {
                stackIn_170_0 = we.field_d;
              } else {
                stackIn_170_0 = wd.field_K;
              }
              dn.field_k = stackIn_170_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_rb != 0 &&
              !var12.f((byte) -78)) {
              if (var12.field_Db.field_rb != 0) {
                if (var12.field_Ab && (!var12.field_mc ||
                  !var12.field_cc &&
                  !var12.field_Jb)) {
                  os.a(var12.g(-121), param4, true);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  sq.a(-57, param4, var12.g(-103));
                }
              } else {
                aj.a(param6, (byte) -100, var12, var32);
              }
            }
            var12 = (fb) (var8.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "ga.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        this.field_H = param1;
        if (param0 != 598) {
          this.a(-76, -5, true, 106);
        }
    }

    final static void a(nk[] param0, int param1, bc param2, int[] param3, bi[][] param4, String[] param5, int param6, bc param7, byte[] param8, String[][] param9, bc param10, byte[] param11, boolean param12, String[][] param13, int param14, int[] param15, bi[][] param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          ur.a(param4, param1, param8, param12, param10, param15, param16, param5, (String[]) null, -82, param11, param7, param2, param0, param13, 1, param9, param3, param6);
          if (param14 != 16384) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("ga.DA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param10 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param11 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        this.field_x.d();
        if (param0 != 16384) {
          this.h(18);
        }
        this.field_z = null;
        this.a(-1, param1);
    }

    private final void b(int param0, byte param1) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        qq var3 = (qq) (this.field_l.field_n.d(0));
        if (param1 != 68) {
          return;
        }
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_y) {
            if (var3.field_K != null) {
              var3.field_K.g(ap.field_j / 100);
              if (var3.field_K.e()) {
                this.field_l.field_o.a(var3.field_K);
              }
              var3.d(false);
            }
            if (var3.field_E < 0) {
              this.field_N[var3.field_y][var3.field_H] = null;
            }
            var3.b((byte) -60);
          }
          var3 = (qq) (this.field_l.field_n.a((byte) -71));
        }
    }

    private final void a(boolean param0, int param1) {
        qq var3;
        int var4;
        qq var5;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          var5 = (qq) null;
          this.a(72, (qq) null, true);
        }
        if ((2 & this.field_F[param1]) != 0) {
          var3 = (qq) (this.field_l.field_n.d(0));
          while (var3 != null) {
            if (var3.field_y == param1) {
              if (null != this.field_N[param1][var3.field_H]) {
                var3 = (qq) (this.field_l.field_n.a((byte) -71));
                continue;
              }
              if (var3.field_E < 0) {
                var3.field_E = 0;
              }
            }
            var3 = (qq) (this.field_l.field_n.a((byte) -71));
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        ij.a(3974311, param4, true, param2, param0, param1);
        if (param3 > -57) {
          ga.a((nk[]) null, 95, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, -102, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, 52, (int[]) null, (bi[][]) null);
        }
    }

    final synchronized void a(gh param0, byte param1, boolean param2) {
        try {
          this.a(param2, param0, 114, true);
          if (param1 != 101) {
            this.field_n = -99L;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ga.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_x.f()) {
            var4_int = this.field_x.field_e * this.field_M / ap.field_j;
            while (true) {
              var5 = this.field_O + (long)param2 * (long)var4_int;
              if (0L <= this.field_n - var5) {
                this.field_O = var5;
                break;
              }
              var7 = (int)((-this.field_O + (this.field_n - (-(long)var4_int + 1L))) / (long)var4_int);
              this.field_O = this.field_O + (long)var7 * (long)var4_int;
              this.field_l.b(param0, param1, var7);
              param1 = param1 + var7;
              param2 = param2 - var7;
              this.a((byte) -64);
              if (this.field_x.f()) {
                continue;
              }
              this.field_l.b(param0, param1, param2);
              return;
            }
          }
          this.field_l.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ga.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.a((byte) -63, param1);
          }
        } else {
          this.field_y[param1] = 12800;
          this.field_G[param1] = 8192;
          if (param0 != -63) {
            this.d();
          }
          this.field_s[param1] = 16383;
          this.field_T[param1] = 8192;
          this.field_p[param1] = 0;
          this.field_J[param1] = 8192;
          this.a(true, param1);
          this.d(0, param1);
          this.field_F[param1] = 0;
          this.field_q[param1] = 32767;
          this.field_r[param1] = 256;
          this.field_t[param1] = 0;
          this.a(70, 8192, param1);
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3Lifetime1;
        if (!param1) {
          this.a(-1, 2);
        } else {
          this.b(-1, (byte) 68);
        }
        this.a((byte) -63, param0);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_I[var3] = this.field_m[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (16 > var5) {
          this.field_P[var5] = we.a(this.field_m[var5], -128);
          var5++;
        }
    }

    final boolean a(byte param0, qq param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_K != null) {
            var3_int = -106 % ((param0 - 64) / 53);
            return false;
          }
          if (param1.field_E >= 0) {
            param1.b((byte) -114);
            if (param1.field_z > 0 &&
              param1 == this.field_K[param1.field_y][param1.field_z]) {
              this.field_K[param1.field_y][param1.field_z] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ga.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 97 % ((-65 - param1) / 35);
        var4 = 240 & param0;
        if (128 == var4) {
          var5 = 15 & param0;
          var6 = (32672 & param0) >> 8;
          var7 = (8354916 & param0) >> 16;
          this.a((byte) 29, var7, var5, var6);
          return;
        }
        if (144 == var4) {
          var5Lifetime1 = param0 & 15;
          var6Lifetime1 = param0 >> 8 & 127;
          var7Lifetime1 = 127 & param0 >> 16;
          if (var7Lifetime1 <= 0) {
            this.a((byte) 29, 64, var5Lifetime1, var6Lifetime1);
          } else {
            this.a(var6Lifetime1, var5Lifetime1, var7Lifetime1, (byte) -49);
          }
          return;
        }
        if (var4 == 160) {
          var5Lifetime2 = param0 & 15;
          var6Lifetime2 = param0 >> 8 & 127;
          var7Lifetime2 = (param0 & 8368783) >> 16;
          this.a(var5Lifetime2, var7Lifetime2, true, var6Lifetime2);
          return;
        }
        if (var4 != 176) {
          if (var4 == 192) {
            var5Lifetime3 = param0 & 15;
            var6Lifetime3 = (32569 & param0) >> 8;
            this.a(var5Lifetime3, this.field_P[var5Lifetime3] + var6Lifetime3, (byte) 119);
            return;
          }
          if (var4 == 208) {
            var5Lifetime3Lifetime1 = param0 & 15;
            var6Lifetime3Lifetime1 = param0 >> 8 & 127;
            this.a(var5Lifetime3Lifetime1, (byte) 98, var6Lifetime3Lifetime1);
            return;
          }
          if (224 == var4) {
            var5Lifetime3Lifetime2 = 15 & param0;
            var6Lifetime3Lifetime2 = (127 & param0 >> 8) + (param0 >> 9 & 16256);
            this.b(var5Lifetime3Lifetime2, (byte) -34, var6Lifetime3Lifetime2);
            return;
          }
          var4 = param0 & 255;
          if (var4 != 255) {
            return;
          }
          this.a(-1, true);
          return;
        }
        var5Lifetime4 = 15 & param0;
        var6Lifetime4 = 127 & param0 >> 8;
        var7Lifetime3 = 127 & param0 >> 16;
        if (var6Lifetime4 == 0) {
          this.field_P[var5Lifetime4] = (var7Lifetime3 << 14) + we.a(-2080769, this.field_P[var5Lifetime4]);
        }
        if (var6Lifetime4 == 32) {
          this.field_P[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(-16257, this.field_P[var5Lifetime4]);
        }
        if (var6Lifetime4 == 1) {
          this.field_p[var5Lifetime4] = we.a(-16257, this.field_p[var5Lifetime4]) + (var7Lifetime3 << 7);
        }
        if (33 == var6Lifetime4) {
          this.field_p[var5Lifetime4] = var7Lifetime3 + we.a(this.field_p[var5Lifetime4], -128);
        }
        if (var6Lifetime4 == 5) {
          this.field_J[var5Lifetime4] = we.a(-16257, this.field_J[var5Lifetime4]) + (var7Lifetime3 << 7);
        }
        if (37 == var6Lifetime4) {
          this.field_J[var5Lifetime4] = var7Lifetime3 + we.a(this.field_J[var5Lifetime4], -128);
        }
        if (var6Lifetime4 == 7) {
          this.field_y[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(-16257, this.field_y[var5Lifetime4]);
        }
        if (39 == var6Lifetime4) {
          this.field_y[var5Lifetime4] = we.a(-128, this.field_y[var5Lifetime4]) + var7Lifetime3;
        }
        if (var6Lifetime4 == 10) {
          this.field_G[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(this.field_G[var5Lifetime4], -16257);
        }
        if (42 == var6Lifetime4) {
          this.field_G[var5Lifetime4] = we.a(this.field_G[var5Lifetime4], -128) + var7Lifetime3;
        }
        if (var6Lifetime4 == 11) {
          this.field_s[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(-16257, this.field_s[var5Lifetime4]);
        }
        if (var6Lifetime4 == 43) {
          this.field_s[var5Lifetime4] = var7Lifetime3 + we.a(this.field_s[var5Lifetime4], -128);
        }
        if (var6Lifetime4 == 64) {
          if (var7Lifetime3 < 64) {
            this.field_F[var5Lifetime4] = we.a(this.field_F[var5Lifetime4], -2);
          } else {
            this.field_F[var5Lifetime4] = ee.a(this.field_F[var5Lifetime4], 1);
          }
        }
        if (var6Lifetime4 == 65) {
          if (var7Lifetime3 < 64) {
            this.a(true, var5Lifetime4);
            this.field_F[var5Lifetime4] = we.a(this.field_F[var5Lifetime4], -3);
          } else {
            this.field_F[var5Lifetime4] = ee.a(this.field_F[var5Lifetime4], 2);
          }
        }
        if (var6Lifetime4 == 99) {
          this.field_q[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(127, this.field_q[var5Lifetime4]);
        }
        if (98 == var6Lifetime4) {
          this.field_q[var5Lifetime4] = var7Lifetime3 + we.a(16256, this.field_q[var5Lifetime4]);
        }
        if (var6Lifetime4 == 101) {
          this.field_q[var5Lifetime4] = we.a(this.field_q[var5Lifetime4], 127) + (16384 + (var7Lifetime3 << 7));
        }
        if (var6Lifetime4 == 100) {
          this.field_q[var5Lifetime4] = 16384 + (we.a(this.field_q[var5Lifetime4], 16256) + var7Lifetime3);
        }
        if (var6Lifetime4 == 120) {
          this.b(var5Lifetime4, (byte) 68);
        }
        if (var6Lifetime4 == 121) {
          this.a((byte) -63, var5Lifetime4);
        }
        if (var6Lifetime4 == 123) {
          this.a(var5Lifetime4, 2);
        }
        if (var6Lifetime4 == 6) {
          var8 = this.field_q[var5Lifetime4];
          if (var8 == 16384) {
            this.field_r[var5Lifetime4] = we.a(this.field_r[var5Lifetime4], -16257) + (var7Lifetime3 << 7);
          }
        }
        if (var6Lifetime4 == 38) {
          var8Lifetime1 = this.field_q[var5Lifetime4];
          if (var8Lifetime1 == 16384) {
            this.field_r[var5Lifetime4] = var7Lifetime3 + we.a(this.field_r[var5Lifetime4], -128);
          }
        }
        if (var6Lifetime4 == 16) {
          this.field_t[var5Lifetime4] = (var7Lifetime3 << 7) + we.a(this.field_t[var5Lifetime4], -16257);
        }
        if (var6Lifetime4 == 48) {
          this.field_t[var5Lifetime4] = we.a(this.field_t[var5Lifetime4], -128) + var7Lifetime3;
        }
        if (81 == var6Lifetime4) {
          if (var7Lifetime3 < 64) {
            this.d(0, var5Lifetime4);
            this.field_F[var5Lifetime4] = we.a(this.field_F[var5Lifetime4], -5);
          } else {
            this.field_F[var5Lifetime4] = ee.a(this.field_F[var5Lifetime4], 4);
          }
        }
        if (var6Lifetime4 == 17) {
          this.a(-72, (var7Lifetime3 << 7) + (-16257 & this.field_E[var5Lifetime4]), var5Lifetime4);
        }
        if (var6Lifetime4 == 49) {
          this.a(46, (this.field_E[var5Lifetime4] & -128) + var7Lifetime3, var5Lifetime4);
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void g(int param0) {
        if (param0 != 14745) {
          field_L = (String) null;
        }
        jq.field_d = null;
        rs.field_Fb = -1;
        sc.field_q = false;
        ra.field_g = -1;
        rq.field_e = 0;
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          this.field_u = (int[]) null;
        }
    }

    private final synchronized void a(boolean param0, gh param1, int param2, boolean param3) {
        int var6 = 0;
        int var5_int = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.b(16384, param3);
          this.field_x.a(param1.field_h);
          stackIn_4_1 = (param0);
          this.field_v = stackIn_4_1;
          this.field_O = 0L;
          var5_int = this.field_x.c();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_x.b(var6);
            this.field_x.d(var6);
            this.field_x.e(var6);
          }
          this.field_C = this.field_x.g();
          this.field_D = this.field_x.field_b[this.field_C];
          this.field_n = this.field_x.c(this.field_D);
          if (param2 < 32) {
            this.b(-59, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ga.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized tn d() {
        return null;
    }

    private final void d(int param0, int param1) {
        qq var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((4 & this.field_F[param1]) != param0) {
          var3 = (qq) (this.field_l.field_n.d(0));
          while (var3 != null) {
            if (var3.field_y == param1) {
              var3.field_j = 0;
            }
            var3 = (qq) (this.field_l.field_n.a((byte) -71));
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int stackIn_17_1 = 0;
        qq stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        qq var5;
        int var6_int;
        kk var6;
        qq var7;
        int var8;
        qq var9;
        int var10;
        br var11;
        br var12;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        this.a((byte) 29, 64, param1, param0);
        if (0 != (this.field_F[param1] & 2)) {
          var5 = (qq) (this.field_l.field_n.f(3725));
          while (var5 != null) {
            if (var5.field_y == param1 &&
              var5.field_E < 0) {
              this.field_N[param1][var5.field_H] = null;
              this.field_N[param1][param0] = var5;
              var6_int = (var5.field_G * var5.field_r >> 12) + var5.field_J;
              var5.field_J = var5.field_J + (-var5.field_H + param0 << 8);
              var5.field_G = 4096;
              var5.field_r = -var5.field_J + var6_int;
              var5.field_H = param0;
              return;
            }
            var5 = (qq) (this.field_l.field_n.b(-123));
          }
        }
        var11 = (br) (this.field_Q.a((long)this.field_I[param1], -25064));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_h[param0];
        if (var6 == null) {
          return;
        }
        var7 = new qq();
        var7.field_y = param1;
        var7.field_A = var12;
        var7.field_M = var6;
        var7.field_u = var11.field_j[param0];
        var7.field_z = var11.field_r[param0];
        var7.field_H = param0;
        var7.field_k = var11.field_s[param0] * param2 * param2 * var12.field_q + 1024 >> 11;
        var7.field_q = var11.field_t[param0] & 255;
        var8 = 26 % ((3 - param3) / 39);
        var7.field_J = (param0 << 8) - (var11.field_k[param0] & 32767);
        var7.field_B = 0;
        var7.field_E = -1;
        var7.field_F = 0;
        var7.field_h = 0;
        var7.field_v = 0;
        if (this.field_t[param1] != 0) {
          var7.field_K = al.a(var6, this.b(var7, (byte) -123), 0, this.a(var7, (byte) 120));
          stackIn_17_1 = -2139009338;
          stackIn_17_2 = var7;
          if (var12.field_k[param0] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a(stackIn_17_1, stackIn_17_2, stackIn_18_3);
        } else {
          var7.field_K = al.a(var6, this.b(var7, (byte) -6), this.a(var7, -1481279096), this.a(var7, (byte) 124));
        }
        if (0 > var12.field_k[param0]) {
          var7.field_K.f(-1);
        }
        if (0 <= var7.field_z) {
          var9 = this.field_K[param1][var7.field_z];
          if (var9 != null &&
            0 > var9.field_E) {
            this.field_N[param1][var9.field_H] = null;
            var9.field_E = 0;
          }
          this.field_K[param1][var7.field_z] = var7;
        }
        this.field_l.field_n.a((byte) -113, var7);
        this.field_N[param1][param0] = var7;
        return;
    }

    final boolean a(int param0, int[] param1, int param2, qq param3, int param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        kc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param3.field_p = ap.field_j / 100;
          if (0 <= param3.field_E && (param3.field_K == null ||
            param3.field_K.g())) {
            param3.d(false);
            param3.b((byte) -68);
            if (param3.field_z > 0 &&
              this.field_K[param3.field_y][param3.field_z] == param3) {
              this.field_K[param3.field_y][param3.field_z] = null;
              return true;
            }
            return true;
          }
          var6_int = param3.field_G;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_J[param3.field_y] * 0.0004921259842519685) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_G = var6_int;
          }
          param3.field_K.d(this.b(param3, (byte) -1));
          var7 = param3.field_u;
          param3.field_i = param3.field_i + var7.field_o;
          param3.field_C = param3.field_C + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param3.field_H << 8) + (param3.field_G * param3.field_r >> 12));
          if (var7.field_h > 0) {
            if (var7.field_a <= 0) {
              param3.field_h = param3.field_h + 128;
            } else {
              param3.field_h = param3.field_h + (int)(Math.pow(2.0, var9 * (double)var7.field_a) * 128.0 + 0.5);
            }
            if (var7.field_h * param3.field_h >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_n) {
            if (var7.field_k > 0) {
              param3.field_F = param3.field_F + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
            } else {
              param3.field_F = param3.field_F + 128;
            }
            while (param3.field_B < var7.field_n.length - 2) {
              if ((65280 & var7.field_n[2 + param3.field_B] << 8) < param3.field_F) {
                param3.field_B = param3.field_B + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_n.length == param3.field_B &&
              var7.field_n[1 + param3.field_B] == 0) {
              var8 = 1;
            }
          }
          if (param3.field_E >= 0 &&
            var7.field_e != null &&
            (1 & this.field_F[param3.field_y]) == 0 && (!(param3.field_z >= 0) ||
            this.field_K[param3.field_y][param3.field_z] != param3)) {
            if (var7.field_c > 0) {
              param3.field_E = param3.field_E + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
            } else {
              param3.field_E = param3.field_E + 128;
            }
            while (param3.field_v < -2 + var7.field_e.length) {
              if (param3.field_E > ((255 & var7.field_e[2 + param3.field_v]) << 8)) {
                param3.field_v = param3.field_v + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_e.length == param3.field_v) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            if (param2 != 2) {
              this.a(-71, -84, -11);
            }
            param3.field_K.a(param3.field_p, this.a(param3, -1481279096), this.a(param3, (byte) 122));
            return false;
          }
          param3.field_K.g(param3.field_p);
          if (param1 == null) {
            param3.field_K.a(param4);
          } else {
            param3.field_K.b(param1, param0, param4);
          }
          if (param3.field_K.e()) {
            this.field_l.field_o.a(param3.field_K);
          }
          param3.d(false);
          if (param3.field_E >= 0) {
            param3.b((byte) -58);
            if (param3.field_z > 0 &&
              this.field_K[param3.field_y][param3.field_z] == param3) {
              this.field_K[param3.field_y][param3.field_z] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("ga.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = -35 / ((51 - param2) / 61);
        if (param1 != this.field_I[param0]) {
          this.field_I[param0] = param1;
          for (var5 = 0; 128 > var5; var5++) {
            this.field_K[param0][var5] = null;
          }
        }
    }

    public static void d(int param0) {
        if (param0 != -17876) {
          field_o = (String) null;
        }
        field_o = null;
        field_w = null;
        field_L = null;
    }

    private final int a(qq param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 114) {
            this.field_u = (int[]) null;
          }
          var3_int = this.field_G[param0.field_y];
          if (var3_int < 8192) {
            stackIn_6_0 = 32 + param0.field_q * var3_int >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (128 - param0.field_q) * (-var3_int + 16384) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ga.SA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        int var8;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_C;
        var3 = this.field_D;
        var4 = this.field_n;
        if (null != this.field_z &&
          this.field_S == var3) {
          this.a(this.field_v, this.field_z, 33, this.field_B);
          this.a((byte) 109);
          return;
        }
        var6 = -102 / ((-15 - param0) / 34);
        while (true) {
          if (var3 != this.field_D) {
            this.field_C = var2;
            this.field_D = var3;
            this.field_n = var4;
            if (this.field_z != null) {
              stackIn_24_0 = ~var3;
              stackIn_24_1 = ~this.field_S;
              if (stackIn_24_0 < stackIn_24_1) {
                this.field_C = -1;
                this.field_D = this.field_S;
                this.field_n = this.field_x.c(this.field_D);
              }
            }
            return;
          }
          while (~this.field_x.field_b[var2] == ~var3) {
            this.field_x.b(var2);
            var7 = this.field_x.a(var2);
            if (var7 != 1) {
              if ((var7 & 128) != 0) {
                this.a(var7, (byte) -121);
              }
              this.field_x.d(var2);
              this.field_x.e(var2);
              continue;
            }
            this.field_x.e();
            this.field_x.e(var2);
            if (this.field_x.a()) {
              if (null != this.field_z) {
                this.a(this.field_z, (byte) 101, this.field_v);
                this.a((byte) 29);
                return;
              }
              if (this.field_v &&
                var3 != 0) {
                this.field_x.a(var4);
              } else {
                this.a(-1, true);
                this.field_x.d();
                return;
              }
            }
            break;
          }
          var2 = this.field_x.g();
          var3 = this.field_x.field_b[var2];
          var4 = this.field_x.c(var3);
        }
    }

    final void a(int param0, qq param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param0 != -2139009338) {
            this.field_z = (gh) null;
          }
          var4_int = param1.field_M.field_m.length;
          if (param2 &&
            param1.field_M.field_i) {
            var6 = -param1.field_M.field_l + (var4_int + var4_int);
            var5 = (int)((long)this.field_t[param1.field_y] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              param1.field_K.c(true);
              var5 = -var5 + var4_int + var4_int - 1;
            }
          } else {
            var5 = (int)((long)this.field_t[param1.field_y] * (long)var4_int >> 6);
          }
          param1.field_K.h(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ga.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(qq param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        kc var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_A[param0.field_y] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param1 != -1481279096) {
            stackIn_6_0 = 15;
            return stackIn_6_0;
          }
          var9 = param0.field_u;
          var10 = var9;
          var4 = this.field_y[param0.field_y] * this.field_s[param0.field_y] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = param0.field_k * var4 + 16384 >> 15;
          var4 = 128 + this.field_H * var4 >> 8;
          var4 = this.field_A[param0.field_y] * var4 + 128 >> 8;
          if (var10.field_h > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_h * 0.00001953125 * (double)var10.field_h));
          }
          if (null != var10.field_n) {
            var5 = param0.field_F;
            var6 = var10.field_n[1 + param0.field_B];
            if (param0.field_B < var10.field_n.length - 2) {
              var7 = var9.field_n[param0.field_B] << 8 & 65280;
              var8 = (255 & var10.field_n[2 + param0.field_B]) << 8;
              var6 = var6 + (-var6 + var10.field_n[param0.field_B + 3]) * (-var7 + var5) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param0.field_E > 0 &&
            var10.field_e != null) {
            var5Lifetime1 = param0.field_E;
            var6Lifetime1 = var10.field_e[1 + param0.field_v];
            if (var10.field_e.length - 2 > param0.field_v) {
              var7Lifetime1 = (255 & var9.field_e[param0.field_v]) << 8;
              var8Lifetime1 = var10.field_e[2 + param0.field_v] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (var10.field_e[param0.field_v + 3] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ga.PA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void d(int param0, byte param1, int param2) {
        this.c(param0, (byte) 113, param2);
        if (param1 != -110) {
          this.b();
        }
    }

    final synchronized boolean h(int param0) {
        if (param0 != 5309) {
          field_L = (String) null;
        }
        return this.field_x.f();
    }

    public ga() {
        this.field_p = new int[16];
        this.field_t = new int[16];
        this.field_N = new qq[16][128];
        this.field_r = new int[16];
        this.field_H = 256;
        this.field_M = 1000000;
        this.field_q = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_G = new int[16];
        this.field_K = new qq[16][128];
        this.field_u = new int[16];
        this.field_I = new int[16];
        this.field_F = new int[16];
        this.field_s = new int[16];
        this.field_m = new int[16];
        this.field_J = new int[16];
        this.field_A = new int[16];
        this.field_T = new int[16];
        this.field_E = new int[16];
        this.field_x = new pi();
        this.field_l = new rc(this);
        this.field_Q = new ti(128);
        this.a((byte) -90, -1, 256);
        this.a(-1, true);
    }

    ga(ga param0) {
        this.field_p = new int[16];
        this.field_t = new int[16];
        this.field_N = new qq[16][128];
        this.field_r = new int[16];
        this.field_H = 256;
        this.field_M = 1000000;
        this.field_q = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_G = new int[16];
        this.field_K = new qq[16][128];
        this.field_u = new int[16];
        this.field_I = new int[16];
        this.field_F = new int[16];
        this.field_s = new int[16];
        this.field_m = new int[16];
        this.field_J = new int[16];
        this.field_A = new int[16];
        this.field_T = new int[16];
        this.field_E = new int[16];
        this.field_x = new pi();
        this.field_l = new rc(this);
        try {
          this.field_Q = param0.field_Q;
          this.a((byte) -75, -1, 256);
          this.a(-1, true);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Seriously offensive language";
        field_w = new byte[]{(byte)4, (byte)2, (byte) 0, (byte)2, (byte) 0};
    }
}
