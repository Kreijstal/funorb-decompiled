/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends km {
    private char[] field_Jb;
    private int field_Lb;
    private int field_Ob;
    private oj[] field_Wb;
    static lc field_Xb;
    private int field_Eb;
    private int field_Nb;
    static java.awt.Image field_Gb;
    private static long[] field_Mb;
    static eh field_Fb;
    static int field_Vb;
    static int field_Kb;
    private int field_Pb;
    private oj field_Qb;
    private int field_Hb;
    private int[] field_Sb;
    private hk[] field_Ib;
    private int field_Rb;
    static int field_Yb;
    static el field_Ub;
    private int field_Tb;

    final boolean i(int param0) {
        int var4 = 0;
        hk var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        hk[] var3 = this.field_Ib;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 | (0 != var5.field_nb ? 1 : 0);
        }
        if (var2 == 0 &&
          this.field_Tb != -1 &&
          this.field_Wb[this.field_Tb] != null) {
          var2 = this.field_Wb[this.field_Tb].i(-9184) ? 1 : 0;
        }
        if (param0 != -9184) {
          this.field_Jb = (char[]) null;
        }
        return var2 != 0;
    }

    oj(long param0, km param1, km param2, km param3, oj[] param4, int[] param5, String[] param6, char[] param7) {
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
        e var17 = null;
        e var18 = null;
        this.field_Tb = -1;
        try {
          this.field_Jb = param7;
          this.field_Sb = param5;
          this.field_Wb = param4;
          this.field_Nb = this.field_Sb.length;
          var17 = param3.field_C;
          var18 = var17;
          this.field_Ob = 2 + (var18.field_H + var18.field_G);
          this.field_Lb = this.field_Nb * this.field_Ob;
          this.field_Eb = 0;
          this.field_Ib = new hk[this.field_Nb];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_Nb; var13++) {
            if (0 < this.field_Jb[var13]) {
              param6[var13] = var11 + mb.a(true, this.field_Jb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Wb[var13] ||
              -1 == this.field_Sb[var13]) {
              var14 = da.field_h;
            }
            this.field_Ib[var13] = new hk(0L, param2, (km) null, param3, (mg) (var14), param6[var13]);
            this.a(0, this.field_Ib[var13]);
            var15 = var17.a(param6[var13]);
            if (var15 > this.field_Eb) {
              this.field_Eb = var15;
            }
          }
          this.field_Eb = this.field_Eb + (da.field_h.field_u + 10);
          this.b(12, (byte) 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("oj.<init>(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0 > -118) {
          this.a(false, -98, -15);
        }
        if (param2 != this.field_Tb) {
          if (null != this.field_Wb[param2]) {
            this.h(1026);
            this.b(0, (byte) 49);
            this.field_Tb = param2;
            this.field_Qb = this.field_Wb[this.field_Tb];
            nb.a(false, this.field_Qb);
            this.field_Qb.b(12, (byte) 49);
          } else {
            if (this.field_Sb[param2] == -1) {
              aa.a((byte) 83);
              f.a((byte) -38);
            } else {
              var5 = this.field_Sb[param2] | 32768;
              var6 = sd.field_e;
              if (var6 == 0 &&
                wl.field_d != null) {
                var6 = 1;
              }
              if (id.a(var6, (byte) 55) == 2) {
                sd.a(1, param3, var6, (byte) 58);
              }
              var8 = (String) null;
              jl.a(var5, sd.field_e, va.field_d, param1, (byte) 39, (String) null);
              uk.a(var5, 5, va.field_d, sd.field_e, oc.field_n);
              f.a((byte) -128);
              gg.a(15810);
            }
          }
        } else {
          this.h(1026);
          this.b(0, (byte) 49);
        }
    }

    final void h(int param0) {
        int var3 = 0;
        hk var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        hk[] var6 = this.field_Ib;
        hk[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_nb = 0;
          var4.field_xb = false;
        }
        if (null != this.field_Qb) {
          this.field_Qb.h(param0 + 0);
          this.field_Qb.a(false);
        }
        this.field_Tb = -1;
        this.field_Qb = null;
        this.b(12, (byte) 49);
        if (param0 != 1026) {
          this.field_Nb = -75;
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        stackIn_3_0 = (um.field_Gb != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != this.field_Qb) {
          if (var4 != 0 &&
            this.field_Qb.field_Tb == -1) {
            this.h(1026);
            this.b(0, (byte) 49);
            return true;
          }
          return this.field_Qb.a(true, param1, param2);
        }
        if (this.field_Qb == null &&
          dk.field_v == this &&
          var4 != 0) {
          f.a((byte) -99);
          return true;
        }
        if (!param0) {
          oj.e((byte) 20);
        }
        var5 = nm.field_d;
        if (var5 <= 0) {
          return false;
        }
        if (ne.field_a == var5) {
          var5 = 63;
        }
        var6 = 0;
        while (true) {
          if (var6 >= this.field_Jb.length) {
            return false;
          }
          if (var5 != this.field_Jb[var6]) {
            var6++;
            continue;
          }
          break;
        }
        this.a(-120, param2, var6, param1);
        return true;
    }

    public static void f(byte param0) {
        int var1 = 123 % ((param0 + 52) / 43);
        field_Xb = null;
        field_Fb = null;
        field_Ub = null;
        field_Mb = null;
        field_Gb = null;
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        return nm.a(mb.g((byte) -90), 123);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var7Lifetime1;
        this.field_Rb = this.field_Eb + param1 * 2;
        this.a(param2, this.field_Lb, this.field_Rb, (byte) -113, param3 - this.field_Lb);
        if (this.field_Hb != param4) {
          this.field_Hb = param4;
          this.b(this.field_Pb, (byte) 49);
        }
        for (var7 = param5; var7 < this.field_Nb; var7++) {
          this.field_Ib[var7].a(this.field_Rb, 0, 2, this.field_Ib[var7].field_F, param0, this.field_Ob, param1);
        }
        if (this.field_Tb != -1 &&
          null != this.field_Wb[this.field_Tb]) {
          var7Lifetime1 = this.field_Wb[this.field_Tb].field_Nb;
          for (var8 = this.field_F + this.field_Ob * (var7Lifetime1 + this.field_Tb); var8 > param3; var8 = var8 - this.field_Ob) {
          }
          this.field_Wb[this.field_Tb].a(param0, param1, param2 + this.field_Rb, var8, this.field_Ib[this.field_Tb].field_J, 0);
        }
    }

    final static void a(int param0, wg param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, wg param11, byte param12, int param13, e param14, int param15, int param16, e param17, int param18, wg param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          wf.a(param10, param17, 0, param14);
          vb.a(param0, (byte) 90, param16, param20, param18);
          bj.a(param8, 23, param15);
          if (param12 != -29) {
            field_Yb = 64;
          }
          sh.a((byte) -40, param9, param19, param11, param2, param5);
          ld.a(param12 ^ 28, param3, param6, param1);
          qd.a(param4, (byte) 41, param7, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("oj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        ij stackIn_80_0 = null;
        ij stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        ij stackIn_81_0;
        ij stackIn_81_1;
        boolean stackIn_81_3;
        int stackIn_109_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        float var1_float = 0.0f;
        pm var1 = null;
        RuntimeException var1_ref = null;
        float var2_float = 0.0f;
        ij var2 = null;
        ij var3 = null;
        fl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ij var7 = null;
        fl var3_refLifetime1;
        float var2_floatLifetime1;
        int var4Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (ln.field_g != bc.field_c) {
            var1_int = 1;
            if (!gb.field_H.field_g &&
              ke.field_p.field_g) {
              em.field_c = sg.field_i;
              jk.field_c = 2;
              ec.field_z = sj.field_o;
              var2_float = -cf.field_c + ec.field_z;
              while ((double)var2_float < -3.141592653589793) {
                var2_float = (float)((double)var2_float + 6.283185307179586);
              }
              while ((double)var2_float > 3.141592653589793) {
                var2_float = (float)((double)var2_float - 6.283185307179586);
              }
              if (!((double)Math.abs(var2_float) > 0.01) &&
                !((double)Math.abs(lj.field_r - em.field_c) > 0.05)) {
                lj.field_r = em.field_c;
                cf.field_c = ec.field_z;
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
              } else {
                var1_int = 0;
              }
            } else {
              if (gb.field_H.field_g &&
                !ke.field_p.field_g) {
                cf.field_c = sj.field_o;
                lj.field_r = sg.field_i;
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                ke.field_p.field_g = true;
                gb.c((byte) -44);
              }
            }
            ke.field_p.field_k = gb.field_H.field_k;
            if (!gb.field_H.field_d) {
              if (ke.field_p.field_d) {
                mj.field_D = 0;
                ke.field_p.field_d = false;
              }
              mj.field_D = mj.field_D + 16384;
              if (mj.field_D >= 262144) {
                mj.field_D = 262144;
              } else {
                var1_int = 0;
              }
            } else {
              mj.field_D = mj.field_D - 16384;
              if (mj.field_D > 0) {
                var1_int = 0;
              } else {
                mj.field_D = 0;
              }
            }
            if (gb.field_H.field_f > ke.field_p.field_f) {
              ke.field_p.field_f = ke.field_p.field_f + 1;
            } else {
              if (ke.field_p.field_f > gb.field_H.field_f) {
                ke.field_p.field_f = ke.field_p.field_f - 1;
              }
            }
            if (ke.field_p.field_f != gb.field_H.field_f) {
              var1_int = 0;
            }
            ke.field_p.field_m = gb.field_H.field_m;
            ke.field_p.field_e = gb.field_H.field_e;
            if (var1_int != 0) {
              ke.field_p = gb.field_H;
              ln.field_g = bc.field_c;
            }
          }
          if (jk.field_c != 0) {
            while ((double)cf.field_c < -3.141592653589793) {
              cf.field_c = (float)((double)cf.field_c + 6.283185307179586);
            }
            while (-3.141592653589793 > (double)ec.field_z) {
              ec.field_z = (float)((double)ec.field_z + 6.283185307179586);
            }
            while (3.141592653589793 < (double)cf.field_c) {
              cf.field_c = (float)((double)cf.field_c - 6.283185307179586);
            }
            while ((double)ec.field_z > 3.141592653589793) {
              ec.field_z = (float)((double)ec.field_z - 6.283185307179586);
            }
            var1_float = ec.field_z - cf.field_c;
            while ((double)var1_float < -3.141592653589793) {
              var1_float = (float)((double)var1_float + 6.283185307179586);
            }
            while ((double)var1_float > 3.141592653589793) {
              var1_float = (float)((double)var1_float - 6.283185307179586);
            }
            var2_floatLifetime1 = em.field_c - lj.field_r;
            cf.field_c = cf.field_c + 0.05000000074505806f * var1_float;
            lj.field_r = lj.field_r + var2_floatLifetime1 * 0.05000000074505806f;
            vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
            vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
            gb.c((byte) -44);
            if ((double)Math.abs(var1_float) < 0.0001 &&
              0.05 > (double)Math.abs(var2_floatLifetime1)) {
              lj.field_r = em.field_c;
              cf.field_c = ec.field_z;
              jk.field_c = 0;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
            } else {
              if ((double)Math.abs(var1_float) < 0.1 &&
                Math.abs(var2_floatLifetime1) < 1.0f) {
                jk.field_c = 1;
              }
            }
          }
          if (hm.field_c == 10) {
            ad.field_g[0] = 1.0;
            mj.field_D = 262144;
            em.field_c = 80.0f;
            lj.field_r = 80.0f;
            ad.field_g[2] = 0.0;
            co.field_h = 0;
            we.field_k = 50.0f;
            ao.field_Hb = 52.5f;
            cf.field_c = sj.field_o;
            if (id.field_r < 10) {
              jk.field_c = 2;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
            }
            if (id.field_r <= 350) {
              ec.field_z = sj.field_o;
              em.field_c = 80.0f;
            }
          }
          var1 = (pm) (gd.field_n.a((byte) -122));
          while (var1 != null) {
            fieldTemp$3 = var1.field_r - 1;
            var1.field_r = var1.field_r - 1;
            if (0 == fieldTemp$3) {
              var1.a(false);
            }
            var1 = (pm) (gd.field_n.a(16213));
          }
          var2 = (ij) (sk.field_a.a((byte) -69));
          while (var2 != null) {
            fieldTemp$2 = var2.field_o + 1;
            var2.field_o = var2.field_o + 1;
            if (fieldTemp$2 > 83) {
              var2.a(false);
            }
            var2 = (ij) (sk.field_a.a(16213));
          }
          if (0 == sh.a(4712, 40)) {
            stackIn_80_0 = null;
            stackIn_80_1 = null;
            stackIn_80_2 = sh.a(4712, 3);
            if (sh.a(4712, 2) != 0) {
              stackIn_81_0 = null;
              stackIn_81_1 = null;
              stackIn_81_3 = false;
            } else {
              stackIn_81_0 = null;
              stackIn_81_1 = null;
              stackIn_81_3 = true;
            }
            var7 = new ij(stackIn_80_2, stackIn_81_3, sh.a(4712, 64));
            var3 = (ij) (sk.field_a.a((byte) -64));
            while (var3 != null) {
              if (var7.field_l <= var3.field_l) {
                var3 = (ij) (sk.field_a.a(16213));
                continue;
              }
              break;
            }
            if (var3 != null) {
              td.a(var3, (byte) -93, var7);
            } else {
              sk.field_a.a(var7, (byte) -69);
            }
          }
          var3_ref = (fl) (sh.field_tb.a((byte) -68));
          while (var3_ref != null) {
            fieldTemp$1 = var3_ref.field_o - 1;
            var3_ref.field_o = var3_ref.field_o - 1;
            if (fieldTemp$1 > 0) {
              var3_ref.field_p = var3_ref.field_p + var3_ref.field_l;
              var3_ref.field_m = var3_ref.field_m + var3_ref.field_h;
              var3_ref.field_n = var3_ref.field_n + var3_ref.field_q;
              var3_ref.field_l = var3_ref.field_l + 48;
            } else {
              var3_ref.a(false);
            }
            var3_ref = (fl) (sh.field_tb.a(16213));
          }
          if (ke.field_p.field_e > 0 && (ke.field_p.field_e == 1 ||
            sh.a(4712, ke.field_p.field_e) == 0)) {
            while (true) {
              var4 = -4096 + sh.a(4712, 8193);
              var5 = -4096 + sh.a(4712, 8193);
              if (var4 * var4 + var5 * var5 >= 8388608) {
                continue;
              }
              break;
            }
            var3_refLifetime1 = new fl(0, 1638400, 0, var4, -8192, var5, 150);
            sh.field_tb.a(var3_refLifetime1, (byte) -104);
          }
          if (param0 > -32) {
            field_Mb = (long[]) null;
          }
          if (-4 != hm.field_c &&
            -2 != hm.field_c) {
            stackIn_109_0 = (gb.field_H.field_g) ? 2 : 1;
            wn.field_C = stackIn_109_0;
          } else {
            wn.field_C = 0;
          }
          if (wn.field_C != he.field_ec) {
            fieldTemp$0 = ai.field_f + 8;
            ai.field_f = ai.field_f + 8;
            if (fieldTemp$0 >= 256) {
              ai.field_f = 0;
              he.field_ec = wn.field_C;
            }
          } else {
            ai.field_f = 0;
          }
          var4Lifetime1 = 0;
          if (wn.field_C == 2) {
            var4Lifetime1 = vg.field_H.a(sl.field_a) + 17;
            if (var4Lifetime1 < 135) {
              var4Lifetime1 = 135;
            }
          } else {
            if (wn.field_C == 1) {
              var4Lifetime1 = vg.field_H.a(o.field_a) + 17 + 8;
            }
          }
          kd.field_t = kd.field_t + 0.10000000149011612f * (-kd.field_t + (float)var4Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "oj.J(" + param0 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != -10) {
          this.field_Jb = (char[]) null;
        }
        return this.field_Rb + (this.field_Qb == null ? 0 : this.field_Qb.g(-10));
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        hk var5_ref_hk;
        int var6;
        hk stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        oj var4;
        int var5;
        oj var7;
        var6 = Virogrid.field_F ? 1 : 0;
        for (var4_int = 0; var4_int < this.field_Ib.length; var4_int++) {
          var5_ref_hk = this.field_Ib[var4_int];
          if (var5_ref_hk.field_nb == 1) {
            this.a(-119, param2, var4_int, param0);
            stackIn_7_0 = var5_ref_hk;
            stackIn_8_1 = (var4_int == this.field_Tb);
            stackIn_7_0.field_xb = stackIn_8_1;
          }
        }
        var5 = -102 / ((19 - param1) / 36);
        if (this.field_Tb != -1) {
          var7 = this.field_Wb[this.field_Tb];
          var4 = var7;
          if (var4 != null) {
            var7.b(param0, -65, param2);
          }
        }
        if (this.field_Pb > 0) {
          this.b(-1 + this.field_Pb, (byte) 49);
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        int var4 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          we.field_h = param1 * 6;
          ve.field_x = new int[we.field_h + (we.field_h * (1 + we.field_h) / 2 + 1)];
          if (param0 != -9) {
            oj.f((byte) -16);
          }
          for (var2_int = 0; var2_int < we.field_h; var2_int++) {
            var3 = var2_int * var2_int;
            for (var4 = 0; var2_int >= var4; var4++) {
              var5 = var4 * var4;
              var6 = var5 + var3;
              if (0 == var5 &&
                var3 == 0) {
                of.a(2, aj.field_g, var2_int, var4);
              } else {
                var7 = aj.field_g * param1 / var6;
                stackIn_12_0 = 2;
                if (0 < var7) {
                  stackIn_13_1 = var7;
                } else {
                  stackIn_13_1 = 0;
                }
                of.a(stackIn_12_0, stackIn_13_1, var2_int, var4);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "oj.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        this.field_Pb = param0;
        if (param1 != 49) {
          this.field_Tb = 63;
        }
        for (var5 = 0; this.field_Nb > var5; var5++) {
          var3 = this.field_Ob * var5;
          var4 = this.field_Pb * this.field_Pb;
          this.field_Ib[var5].field_F = (var3 * (144 - var4) + (this.field_Hb - this.field_J) * var4) / 144;
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_Xb = new lc(13, 0, 1, 0);
        field_Mb = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) == 1L) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_Mb[var2] = var0;
        }
    }
}
