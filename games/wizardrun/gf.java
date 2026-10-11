/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends rg {
    static String field_X;
    static int field_W;
    static String[] field_eb;
    private kd field_db;
    private int field_Z;
    private jc field_ab;
    private int field_fb;
    private int field_hb;
    private int field_U;
    private ub field_cb;
    private int field_gb;
    static rc field_ib;
    static String field_Y;
    static o field_bb;
    static ok field_V;

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            this.g(13);
          }
          if (super.a(param0, param1, (byte) -120, param3)) {
            return true;
          }
          if (null == this.field_ab) {
            return false;
          }
          if (param1 == 98) {
            this.field_ab.a(param3, 8);
          }
          if (param1 == 99) {
            this.field_ab.a(param3, 8);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("gf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_V = null;
        field_ib = null;
        field_bb = null;
        field_X = null;
        field_eb = null;
        field_Y = null;
        if (param0 != -68) {
          field_V = (ok) null;
        }
    }

    final boolean a(int param0) {
        this.g((byte) -3);
        if (param0 != 16) {
          ub var3 = (ub) null;
          this.c((ub) null, -46);
        }
        return super.a(16);
    }

    final void j(int param0) {
        if (this.field_db == sa.field_g) {
          return;
        }
        this.field_fb = 0;
        this.field_db = lj.field_c;
        this.a(this.field_cb, true);
        if (param0 != -8144) {
          ub var3 = (ub) null;
          this.a('ﾭ', 97, (byte) -70, (ub) null);
        }
        this.field_ab.field_G = 0;
        this.field_cb = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void g(byte param0) {
        if (null != this.field_db) {
          if (this.field_db != lj.field_c) {
            this.a(6154, this.field_cb.field_n + 12 + this.field_hb, 12 + this.field_cb.field_r);
            this.a(this.field_cb, true);
          }
          this.field_ab.field_G = 256;
          this.field_db = null;
        }
        super.g(param0);
    }

    private final void a(ub param0, boolean param1) {
        try {
          if (this.field_ab != null) {
            this.field_ab.a(false);
          }
          if (param0 != null) {
            param0.a(127, this.field_hb + 6, param0.field_n, param0.field_r, 6);
            this.field_ab = new jc(param0);
          } else {
            this.field_ab = new jc();
          }
          this.a((ub) (this.field_ab), (byte) 109);
          if (!param1) {
            gf.k(74);
          }
          this.field_cb = null;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "gf.RB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h(byte param0) {
        if (!qb.field_p) {
          throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(11579568, false);
        if (param0 < 53) {
          gf.k(90);
        }
        ml.field_t = 0;
    }

    gf(wi param0, ub param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, param1.field_n + 12 + param2);
        try {
          this.field_U = param3;
          this.field_gb = param3;
          this.field_hb = param2;
          this.field_Z = param4;
          this.a(param1, true);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void k(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        le var4_ref_le = null;
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
        le var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = wizardrun.field_H;
        try {
          ci.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ia.field_f.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_le = ia.field_f[var3];
            var4_ref_le.b(-119);
            gj.a((byte) 115, var3);
            var5 = var4_ref_le.field_r + var4_ref_le.field_g >> 1;
            var6 = var4_ref_le.field_D + var4_ref_le.field_K >> 1;
            var7 = var4_ref_le.field_E + var4_ref_le.field_M >> 1;
            var8 = ci.field_a[9] >> 2;
            var9 = ci.field_a[10] >> 2;
            var10_int = ci.field_a[11] >> 2;
            var11 = var10_int * cg.field_m[5] + (var9 * cg.field_m[4] + var8 * cg.field_m[3]) >> 14;
            var12 = var9 * cg.field_m[7] + (var8 * cg.field_m[6] + var10_int * cg.field_m[8]) >> 14;
            var13 = var10_int * cg.field_m[11] + cg.field_m[9] * var8 + var9 * cg.field_m[10] >> 14;
            var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
          }
          var3Lifetime1 = ci.field_a[9] >> 8;
          var4 = ci.field_a[10] >> 8;
          var5Lifetime1 = ci.field_a[11] >> 8;
          var6Lifetime1 = jd.field_f << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = qj.a(-2942, var6Lifetime1) >> 8;
          var9Lifetime1 = wizardrun.a((byte) -39, var6Lifetime1) >> 8;
          if (-1 != pg.field_n &&
            fi.field_B != -1) {
            var8Lifetime1 = 240 - fi.field_B;
            var9Lifetime1 = -128;
            var7Lifetime1 = pg.field_n - 320;
          }
          if (param0 >= -113) {
            return;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < ia.field_f.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ia.field_f.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = ia.field_f[var16];
            gj.a((byte) 115, var16);
            for (var18 = 0; var18 < 3; var18++) {
              cg.field_m[var18] = cg.field_m[var18] + cb.field_d[var15][var18];
            }
            ae.a(false, (byte) 106, var17, true, cg.field_m, false, ci.field_a);
            pi.a(var14, var12Lifetime1, var8Lifetime1, false, var9Lifetime1, var17, var7Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "gf.QB(" + param0 + ')');
        }
    }

    final static void b(int param0, String param1) {
        try {
          if (param0 != 9) {
            field_V = (ok) null;
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "gf.TB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void c(ub param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_cb = param0;
          if (param1 > -109) {
            return;
          }
          if (vg.field_W != this.field_db) {
            if (this.field_db != sa.field_g) {
              this.field_db = sa.field_g;
              this.field_fb = 0;
            }
          } else {
            this.b(this.field_cb.field_r + 12, 12 + this.field_hb + this.field_cb.field_n, 0, this.field_Z);
            this.field_fb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gf.VB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean g(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var3;
        var3 = wizardrun.field_H;
        if (null != this.field_db) {
          if (this.field_db == sa.field_g) {
            fieldTemp$4 = this.field_fb + 1;
            this.field_fb = this.field_fb + 1;
            if (fieldTemp$4 != this.field_gb) {
              this.field_ab.field_G = -((this.field_fb << 8) / this.field_gb) + 256;
            } else {
              this.field_db = vg.field_W;
              this.b(12 + this.field_cb.field_r, 12 - (-this.field_hb - this.field_cb.field_n), 0, this.field_Z);
              this.field_ab.field_G = 0;
              this.field_fb = 0;
            }
          } else {
            if (this.field_db == lj.field_c) {
              fieldTemp$5 = this.field_fb + 1;
              this.field_fb = this.field_fb + 1;
              if (fieldTemp$5 != this.field_U) {
                this.field_ab.field_G = (this.field_fb << 8) / this.field_U;
              } else {
                this.field_db = null;
                this.field_ab.field_G = 256;
              }
            }
          }
        }
        if (param0 != 1) {
          field_bb = (o) null;
        }
        return super.g(param0 ^ 0);
    }

    static {
        field_eb = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = "Discard";
        field_ib = new rc();
        field_V = new ok();
    }
}
