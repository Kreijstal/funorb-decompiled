/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gk extends rk {
    static bi field_q;
    bi field_s;
    int field_m;
    boolean field_x;
    pm field_t;
    boolean field_o;
    private boolean field_p;
    double field_w;
    static String field_v;
    static vd field_u;
    static char[] field_y;
    vc field_n;
    static int field_r;

    final void d(int param0) {
        if (!this.field_x) {
          cb.field_a.a(this.field_n);
        }
        this.field_t.field_A.field_z.a((rk) (this), (byte) -66);
        if (param0 == 209) {
          return;
        }
        this.field_x = false;
    }

    void e(int param0) {
        int stackIn_3_0 = 0;
        double stackIn_10_0 = 0.0;
        double stackIn_11_1 = 0.0;
        int stackIn_13_0 = 0;
        vc stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        Object var24_ref = null;
        ee var24_ref_ee = null;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        Object var32 = null;
        dj var34 = null;
        double[] var38 = null;
        var24_ref = null;
        var34 = this.field_t.field_A.field_B;
        var3 = var34.field_E - this.field_t.field_E;
        var5 = -this.field_t.field_t + var34.field_t;
        var7 = var34.field_D - this.field_t.field_D;
        var9 = var7 * var7 + (var3 * var3 + var5 * var5);
        var11 = this.field_w * 2.0;
        if (!(var9 <= var11 * var11)) {
          stackIn_3_0 = (int)(0.5 + (double)this.field_m * var11 / Math.sqrt(var9));
        } else {
          stackIn_3_0 = this.field_m;
        }
        var13 = stackIn_3_0;
        if (256 < var13) {
          var13 = 256;
        }
        var38 = new double[12];
        var34.field_jb.a((byte) 71, var38);
        var15 = var38[3];
        var17 = var38[4];
        var19 = var38[5];
        if (var34 == this.field_t &&
          !this.field_o) {
          stackIn_13_0 = -1;
        } else {
          stackIn_10_0 = (var19 * var7 + (var3 * var15 + var17 * var5)) * 128.0;
          if (!(var9 <= var11 * var11)) {
            stackIn_11_1 = Math.sqrt(var9);
          } else {
            stackIn_11_1 = var11;
          }
          stackIn_13_0 = (int)(-(stackIn_10_0 / stackIn_11_1) + 128.5);
        }
        var21 = stackIn_13_0;
        if (param0 != 6466) {
          return;
        }
        this.field_n.b(eg.field_i * (fa.field_S * var13) + 16384 >> 15, var21);
        if (var9 >= 0.01) {
          var9 = 1.0 / Math.sqrt(var9);
          var5 = var5 * var9;
          var3 = var3 * var9;
          var7 = var7 * var9;
        }
        var22 = 2.0;
        if (this.field_t instanceof ee) {
          var24_ref_ee = (ee) (this.field_t);
          var22 = -(var24_ref_ee.field_L * var7) - (var5 * var24_ref_ee.field_G + var24_ref_ee.field_K * var3) + 2.0;
          if (var22 < 0.01) {
            this.field_n.d(0);
            return;
          }
        }
        var24 = -(var7 * var34.field_L) - (var34.field_G * var5 + var3 * var34.field_K) + 2.0;
        if (var24 < 0.01) {
          this.field_n.d(0);
          return;
        }
        var26 = (double)(256 * this.field_s.field_n) / (double)dk.field_k;
        var28 = 2.0 * var26 / var22;
        var30 = var24 * var28 / 2.0;
        var32 = this.field_n;
        synchronized (var32) {
          stackIn_26_0 = this.field_n;
          if (!(1600.0 <= var30)) {
            stackIn_27_1 = (int)(0.5 + var30);
          } else {
            stackIn_27_1 = 1600;
          }
          ((vc) (Object) stackIn_26_0).d(stackIn_27_1);
          if (this.field_p) {
            this.field_n.b(true);
            this.field_p = false;
          }
        }
        if (this.field_x) {
          cb.field_a.a(this.field_n);
          this.field_x = false;
        }
        return;
    }

    gk(pm param0, bi param1) {
        this(param0, param1, -1, false);
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        if (param0 == 14714) {
          field_v = null;
          field_y = null;
          return;
        }
        gk.c(118);
        field_v = null;
        field_y = null;
    }

    final void f(int param0) {
        if (param0 != 128) {
          return;
        }
        if (this.field_x) {
          this.a(true);
          return;
        }
        cb.field_a.b(this.field_n);
        this.a(true);
    }

    final void g(int param0) {
        dj var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22 = 0;
        double var23 = 0.0;
        hn var27 = null;
        double[] var31 = null;
        int stackIn_3_0 = 0;
        double stackIn_8_0 = 0.0;
        double stackIn_9_1 = 0.0;
        Throwable decompiledCaughtException = null;
        Object var25 = null;
        var27 = qn.field_v;
        var3 = var27.field_B;
        var4 = var3.field_E - var27.field_s;
        var6 = var3.field_t - var27.field_r;
        var8 = -var27.field_E + var3.field_D;
        var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4)) - var27.field_A;
        var12 = this.field_w * 2.0;
        if (!(var12 >= var10)) {
          stackIn_3_0 = (int)(0.5 + (double)this.field_m * var12 / var10);
        } else {
          stackIn_3_0 = this.field_m;
        }
        var14 = stackIn_3_0;
        if (var14 > 256) {
          var14 = 256;
        }
        var31 = new double[12];
        var3.field_jb.a((byte) 53, var31);
        var16 = var31[3];
        var18 = var31[4];
        var20 = var31[5];
        stackIn_8_0 = (var16 * var4 + var6 * var18 + var8 * var20) * 128.0;
        stackIn_9_1 = (!(var12 >= var10)) ? var10 : var12;
        var22 = (int)(-(stackIn_8_0 / stackIn_9_1) + 128.5);
        this.field_n.b(16384 + fa.field_S * (var14 * eg.field_i) >> 15, var22);
        if (var10 >= 0.1) {
          var10 = 1.0 / var10;
          var8 = var8 * var10;
          var4 = var4 * var10;
          var6 = var6 * var10;
        }
        var23 = (double)(param0 * this.field_s.field_n) / (double)dk.field_k;
        var25 = this.field_n;
        synchronized (var25) {
          this.field_n.d((int)(0.5 + var23));
          if (this.field_p) {
            this.field_n.b(true);
            this.field_p = false;
          }
        }
        if (!this.field_x) {
          return;
        }
        cb.field_a.a(this.field_n);
        this.field_x = false;
    }

    final static void a(boolean param0, String param1, byte param2, boolean param3) {
        im.a((byte) -110);
        vg.field_Z.g((byte) 105);
        om.field_p = new w(kj.field_c, (String) null, rk.field_f, param0, param3);
        dn.field_b = new ef(vg.field_Z, om.field_p);
        if (param2 >= -110) {
          return;
        }
        try {
          vg.field_Z.c(dn.field_b, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        if (this.field_x) {
          if (param0 == -25071) {
            if (null == this.field_t) {
              return;
            }
            if (!this.field_t.field_z) {
              this.e(param0 ^ -30893);
              return;
            }
            if (this.field_t.field_s != 0) {
              fieldTemp$0 = this.field_m - this.field_t.field_s;
              this.field_m = this.field_m - this.field_t.field_s;
              if (0 < fieldTemp$0) {
                this.e(param0 ^ -30893);
                return;
              }
            }
          } else {
            this.field_x = false;
            if (null == this.field_t) {
              return;
            }
            if (!this.field_t.field_z) {
              this.e(param0 ^ -30893);
              return;
            }
            if (this.field_t.field_s != 0) {
              fieldTemp$1 = this.field_m - this.field_t.field_s;
              this.field_m = this.field_m - this.field_t.field_s;
              if (0 < fieldTemp$1) {
                this.e(param0 ^ -30893);
                return;
              }
            }
          }
        } else {
          if (!this.field_n.c((byte) 119)) {
            this.a(true);
            return;
          }
          if (param0 == -25071) {
            if (null == this.field_t) {
              return;
            }
            if (!this.field_t.field_z) {
              this.e(param0 ^ -30893);
              return;
            }
            if (this.field_t.field_s != 0) {
              fieldTemp$3 = this.field_m - this.field_t.field_s;
              this.field_m = this.field_m - this.field_t.field_s;
              if (0 < fieldTemp$3) {
                this.e(param0 ^ -30893);
                return;
              }
            }
          } else {
            this.field_x = false;
            if (null == this.field_t) {
              return;
            }
            if (!this.field_t.field_z) {
              this.e(param0 ^ -30893);
              return;
            }
            if (this.field_t.field_s != 0) {
              fieldTemp$2 = this.field_m - this.field_t.field_s;
              this.field_m = this.field_m - this.field_t.field_s;
              if (0 < fieldTemp$2) {
                this.e(param0 ^ -30893);
                return;
              }
            }
          }
        }
        this.f(128);
    }

    gk(pm param0, bi param1, int param2, boolean param3) {
        this(param0.field_A, param0, param1, param2, param3);
    }

    gk(pm param0, bi param1, int param2) {
        this(param0, param1, param2, false);
    }

    final void a(byte param0) {
        int var2_int = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        if (!this.field_x) {
          var2 = this.field_n;
          synchronized (var2) {
            if (this.field_n.i()) {
              this.field_p = true;
            }
            this.field_n.d(0);
            this.field_n.h(0);
          }
        }
        var2_int = -9 % ((-15 - param0) / 48);
    }

    gk(hn param0, pm param1, bi param2, int param3, boolean param4) {
        this.field_m = 96;
        this.field_w = 1.0;
        this.field_x = true;
        try {
          this.field_s = param2;
          this.field_t = param1;
          this.field_n = vc.a(param2, 0, 0);
          this.field_n.c(param3);
          this.field_n.c(param4);
          param0.field_z.a((rk) (this), (byte) 106);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_y = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c13c9cd76cbe(boolean param0, String param1, int param2, boolean param3) {
        im.a((byte) -110);
        vg.field_Z.g((byte) 105);
        om.field_p = new w(kj.field_c, (String) null, rk.field_f, param0, param3);
        dn.field_b = new ef(vg.field_Z, om.field_p);
        if (param2 >= -110) {
          return;
        }
        try {
          vg.field_Z.c(dn.field_b, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }
}
