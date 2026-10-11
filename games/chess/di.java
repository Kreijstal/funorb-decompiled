/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends ci {
    private char[] field_Lb;
    static String field_Qb;
    private tl[] field_Nb;
    private di field_Kb;
    private int field_Sb;
    private int field_Ob;
    private int field_Eb;
    private di[] field_Mb;
    private int field_Rb;
    private int field_Fb;
    private int[] field_Gb;
    private int field_Jb;
    private int field_Hb;
    private int field_Pb;
    static byte[][] field_Ib;

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Chess.field_G;
        this.field_Eb = param0;
        for (var5 = 0; var5 < this.field_Sb; var5++) {
          var3 = var5 * this.field_Pb;
          var4 = this.field_Eb * this.field_Eb;
          this.field_Nb[var5].field_V = ((-var4 + 144) * var3 + var4 * (this.field_Fb - this.field_wb)) / 144;
        }
        if (param1 > -54) {
          di.a(58, '/');
        }
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 != -49) {
          return true;
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    final static void f(byte param0) {
        int var3 = 0;
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        le stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Chess.field_G;
        try {
          var1_int = ak.field_j;
          var2 = 0;
          if (gm.field_f == 2) {
            var3_long = -jg.field_M + ud.a(2);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < ka.field_g.length; var3++) {
            var4 = cb.field_k[var3];
            if (var4 >= 0) {
              if (ol.field_R.field_h == var4) {
                var5 = kj.field_h;
              } else {
                var5 = kg.field_V;
              }
            } else {
              var5 = le.field_f;
            }
            var6 = ka.field_g[var3];
            if (gm.field_f == 2 &&
              1 == var2) {
              if (hj.field_l.length > ik.field_a.length) {
                stackIn_17_0 = hj.field_l.length;
              } else {
                stackIn_17_0 = ik.field_a.length;
              }
              var7 = stackIn_17_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (-var7 + (var3 - 6) + ik.field_a.length < 0) {
                  stackIn_23_0 = "";
                } else {
                  stackIn_23_0 = ik.field_a[ik.field_a.length + (-6 + var3) - var7];
                }
                var6 = stackIn_23_0;
              }
              if (tj.field_p.length >= em.field_m.length) {
                stackIn_27_0 = tj.field_p.length;
              } else {
                stackIn_27_0 = em.field_m.length;
              }
              var8 = stackIn_27_0;
              if (var3 >= 7 + var7 &&
                var3 < var7 + 7 + var8) {
                if (tj.field_p.length > var3 - 7 - var7) {
                  stackIn_33_0 = tj.field_p[var3 - 7 - var7];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = kn.a(!(0 > var4), false, var6);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + ob.field_C;
            if (0 <= var4) {
              if (var4 != ol.field_R.field_h) {
                stackIn_45_0 = ie.field_b;
              } else {
                stackIn_45_0 = in.field_d;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + ek.field_b;
              if (var9 != null) {
                var9.a(-m.field_d + var8Lifetime1, var7Lifetime1 + (m.field_d << 1), (kl.field_i << 1) + vh.field_c, true, var1_int);
              }
              var1_int = var1_int + kl.field_i;
            }
            if (var4 >= 0) {
              ce.field_a.a(var6, var8Lifetime1, var1_int + rm.field_S, var5, -1);
              var1_int = var1_int + (vh.field_c + kl.field_i + ek.field_b);
            } else {
              vj.field_d.a(var6, var8Lifetime1, var1_int + b.field_d, var5, -1);
              var1_int = var1_int + fd.field_n;
            }
          }
          if (param0 <= 88) {
            di.a(35, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "di.F(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        tl var5 = null;
        int var6 = 0;
        boolean stackIn_22_1 = false;
        tl stackIn_23_0 = null;
        di var4 = null;
        di var7 = null;
        var6 = Chess.field_G;
        var4_int = 0;
        if (param0 != -44) {
          this.n(-2);
        }
        while (var4_int < this.field_Nb.length) {
          var5 = this.field_Nb[var4_int];
          if (1 == var5.field_L) {
            this.a((byte) 24, param1, var4_int, param2);
            stackIn_23_0 = var5;
            stackIn_22_1 = (this.field_Jb == var4_int);
            stackIn_23_0.field_gb = stackIn_22_1;
          }
          var4_int++;
        }
        if (this.field_Jb != -1) {
          var7 = this.field_Mb[this.field_Jb];
          var4 = var7;
          if (var4 != null) {
            var7.a((byte) -44, param1, param2);
          }
        }
        if (this.field_Eb > 0) {
          this.a(-1 + this.field_Eb, (byte) -77);
        }
    }

    public static void g(byte param0) {
        if (param0 != -54) {
          field_Qb = (String) null;
        }
        field_Qb = null;
        field_Ib = (byte[][]) null;
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Chess.field_G;
        if (this.field_Jb == param2) {
          this.n(param0 ^ 75);
          this.a(0, (byte) -93);
        } else {
          if (this.field_Mb[param2] != null) {
            this.n(-79);
            this.a(0, (byte) -120);
            this.field_Jb = param2;
            this.field_Kb = this.field_Mb[this.field_Jb];
            q.a(this.field_Kb, 0);
            this.field_Kb.a(12, (byte) -73);
          } else {
            if (this.field_Gb[param2] == -1) {
              lc.a(103);
              rc.b(0);
            } else {
              var5 = this.field_Gb[param2] | 32768;
              var6 = vk.field_g;
              if (var6 == 0 &&
                null != pd.field_Rb) {
                var6 = 1;
              }
              if (lg.a(105, var6) == 2) {
                oj.a(var6, (byte) -99, 1, param3);
              }
              var8 = (String) null;
              ke.a(9822, vk.field_g, ij.field_c, param1, var5, (String) null);
              hn.a(ij.field_c, vk.field_g, (byte) -54, var5, re.field_p);
              rc.b(param0 ^ 24);
              e.h((byte) -120);
            }
          }
        }
        if (param0 != 24) {
          di.a(19, '6');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Chess.field_G;
        int var7Lifetime1;
        if (param5 != 6) {
          return;
        }
        this.field_Hb = param4 * 2 + this.field_Ob;
        this.a(param2, this.field_Hb, -2147483648, this.field_Rb, param3 - this.field_Rb);
        if (param0 != this.field_Fb) {
          this.field_Fb = param0;
          this.a(this.field_Eb, (byte) -100);
        }
        for (var7 = 0; this.field_Sb > var7; var7++) {
          this.field_Nb[var7].a(this.field_Hb, param1, this.field_Pb, 0, this.field_Nb[var7].field_V, (byte) -22, param4);
        }
        if (-1 != this.field_Jb &&
          null != this.field_Mb[this.field_Jb]) {
          var7Lifetime1 = this.field_Mb[this.field_Jb].field_Sb;
          for (var8 = this.field_Pb * (var7Lifetime1 + this.field_Jb) + this.field_V; var8 > param3; var8 = var8 - this.field_Pb) {
          }
          this.field_Mb[this.field_Jb].a(this.field_Nb[this.field_Jb].field_wb, param1, this.field_Hb + param2, var8, param4, 6);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = -41 % ((param1 - 13) / 48);
        ob.field_C = param0;
        kd.field_Hb = param2;
    }

    final boolean m(int param0) {
        int var2;
        tl[] var3;
        int var4;
        tl var5;
        int var6;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        var6 = Chess.field_G;
        if (param0 >= -86) {
          return false;
        }
        var2 = 0;
        var3 = this.field_Nb;
        var4 = 0;
        while (var4 < var3.length) {
          var5 = var3[var4];
          stackIn_7_0 = var2;
          stackIn_7_1 = -1;
          if (stackIn_7_1 == ~var5.field_L) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          var2 = stackIn_7_0 | stackIn_10_1;
          var4++;
        }
        if (var2 == 0 &&
          -1 != this.field_Jb &&
          null != this.field_Mb[this.field_Jb]) {
          stackIn_17_0 = (!this.field_Mb[this.field_Jb].m(-120)) ? 0 : 1;
          var2 = stackIn_17_0;
        }
        return var2 != 0;
    }

    final void n(int param0) {
        int var4 = 0;
        tl var5 = null;
        int var6 = Chess.field_G;
        int var3 = -115 / ((4 - param0) / 56);
        tl[] var7 = this.field_Nb;
        tl[] var2 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          var5.field_L = 0;
          var5.field_gb = false;
        }
        if (this.field_Kb != null) {
          this.field_Kb.n(105);
          this.field_Kb.c(-2193);
        }
        this.field_Kb = null;
        this.field_Jb = -1;
        this.a(12, (byte) -88);
    }

    di(long param0, ci param1, ci param2, ci param3, di[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        lh var17 = null;
        lh var18 = null;
        this.field_Jb = -1;
        try {
          this.field_Gb = param5;
          this.field_Lb = param7;
          this.field_Mb = param4;
          this.field_Sb = this.field_Gb.length;
          var17 = param3.field_xb;
          var18 = var17;
          this.field_Pb = 2 + (var18.field_C + var18.field_t);
          this.field_Nb = new tl[this.field_Sb];
          this.field_Rb = this.field_Sb * this.field_Pb;
          this.field_Ob = 0;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Sb > var13; var13++) {
            if (0 < this.field_Lb[var13]) {
              param6[var13] = var11 + sc.a(this.field_Lb[var13], 123).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Mb[var13] ||
              this.field_Gb[var13] == -1) {
              var14 = mc.field_b;
            }
            this.field_Nb[var13] = new tl(0L, param2, (ci) null, param3, (km) (var14), param6[var13]);
            this.a((byte) 127, this.field_Nb[var13]);
            var15 = var17.b(param6[var13]);
            if (this.field_Ob < var15) {
              this.field_Ob = var15;
            }
          }
          this.field_Ob = this.field_Ob + (10 + mc.field_b.field_v);
          this.a(12, (byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final int l(int param0) {
        if (param0 <= 12) {
          return -9;
        }
        return this.field_Hb + (null == this.field_Kb ? 0 : this.field_Kb.l(47));
    }

    final boolean b(byte param0, int param1, int param2) {
        int var7 = 0;
        int var8 = Chess.field_G;
        int var5 = -41 / ((11 - param0) / 60);
        int var4 = vg.field_a == 85 ? 1 : 0;
        if (null != this.field_Kb) {
          if (var4 != 0 &&
            -1 == this.field_Kb.field_Jb) {
            this.n(69);
            this.a(0, (byte) -61);
            return true;
          }
          return this.field_Kb.b((byte) -88, param1, param2);
        }
        if (this.field_Kb == null && tl.field_Fb == this &&
          var4 != 0) {
          rc.b(0);
          return true;
        }
        int var6 = d.field_Ib;
        if (var6 <= 0) {
          return false;
        }
        if (var6 == ql.field_f) {
          var6 = 63;
        }
        for (var7 = 0; this.field_Lb.length > var7; var7++) {
          if (this.field_Lb[var7] == var6) {
            this.a((byte) 24, param2, var7, param1);
            return true;
          }
        }
        return false;
    }

    final static void a(int param0, boolean param1) {
        if (param0 > -18) {
          di.a(42, 'ￖ');
        }
        if (lk.a((byte) 81)) {
          param1 = false;
        }
        hl.a(-416228287, param1);
        if (fn.field_a) {
          wb.g(qa.field_f.field_a.field_mb, qa.field_f.field_a.field_V, qa.field_f.field_a.field_M, qa.field_f.field_a.field_pb);
          qa.field_f.field_a.a(false, param1);
        }
        cn.a(16384, param1);
    }

    final static void k(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        em var4_ref_em = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        em var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Chess.field_G;
        try {
          th.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ei.field_v.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_em = ei.field_v[var3];
            var4_ref_em.a(32767);
            cn.a((byte) 25, var3);
            var5 = var4_ref_em.field_K + var4_ref_em.field_P >> 1;
            var6 = var4_ref_em.field_v + var4_ref_em.field_I >> 1;
            var7 = var4_ref_em.field_n + var4_ref_em.field_x >> 1;
            var8 = th.field_c[9] >> 2;
            var9 = th.field_c[10] >> 2;
            var10_int = th.field_c[11] >> 2;
            var11 = var9 * ua.field_b[4] + (ua.field_b[3] * var8 + ua.field_b[5] * var10_int) >> 14;
            var12 = var10_int * ua.field_b[8] + var8 * ua.field_b[6] + ua.field_b[7] * var9 >> 14;
            var13 = var10_int * ua.field_b[11] + var8 * ua.field_b[9] + var9 * ua.field_b[10] >> 14;
            var2[var3] = var6 * var12 + (var11 * var5 + var13 * var7) >> 16;
          }
          var3Lifetime1 = th.field_c[param0] >> 8;
          var4 = th.field_c[10] >> 8;
          var5Lifetime1 = th.field_c[11] >> 8;
          var6Lifetime1 = sl.field_a << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = pj.a(106, var6Lifetime1) >> 8;
          var9Lifetime1 = rf.a(var6Lifetime1, 255) >> 8;
          if (hn.field_k != -1 &&
            rf.field_b != -1) {
            var8Lifetime1 = -rf.field_b + 240;
            var9Lifetime1 = -128;
            var7Lifetime1 = -320 + hn.field_k;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; ei.field_v.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ei.field_v.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = ei.field_v[var16];
            cn.a((byte) 25, var16);
            for (var18 = 0; var18 < 3; var18++) {
              ua.field_b[var18] = ua.field_b[var18] + ql.field_a[var15][var18];
            }
            hb.a(false, th.field_c, (byte) -98, ua.field_b, false, var17, true);
            lf.a(var8Lifetime1, var17, var14, var9Lifetime1, 29521, var12Lifetime1, var13Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "di.I(" + param0 + ')');
        }
    }

    static {
        field_Qb = "Password: ";
        field_Ib = new byte[250][];
    }
}
