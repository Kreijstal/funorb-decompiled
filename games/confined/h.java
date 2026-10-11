/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends ee {
    static dd field_R;
    static int[] field_V;
    tf field_Z;
    ek field_ab;
    static int field_W;
    private int field_bb;
    static od field_Y;
    double[] field_T;
    kh field_Q;
    private int field_U;
    hm field_X;

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_6_0 = !(param1.f(-107));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("h.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (this.field_N) {
          return;
        }
        this.a(512, true, param1, (byte) 44, di.field_d, this.field_A.field_B.field_jb, param3, param4, param0, this.field_U);
        if (param2 >= -5) {
          return;
        }
        try {
          this.field_ab.a(param3, param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "h.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
          return true;
        }
        return true;
    }

    final void a(mn param0, byte param1) {
        try {
          int var3_int = 61 / ((-2 - param1) / 62);
          this.field_ab.a(-117, param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "h.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(cl param0, byte param1) {
        try {
          int var3_int = 53 % ((param1 + 35) / 60);
          param0.a((byte) -77, this.field_A.field_B);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "h.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 8) {
          this.field_U = -15;
        }
        stackIn_7_0 = (this.field_A.field_K == null) || !(this.field_D > this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a]);
        return stackIn_7_0;
    }

    final double[] e(int param0) {
        if (param0 != 3008) {
          this.c(-47);
        }
        return this.field_Z.a(param0 + 16774207);
    }

    final static void a(byte param0, boolean param1) {
        ac.a(false);
        lc.field_J = null;
        if (param0 != -6) {
          h.l(95);
        }
        oj.field_B = 0;
        hc.field_u = hk.field_f;
        bg.field_f = 0;
        ef.field_tb = 3001;
        qn.field_v.field_J.field_o = 1;
        qn.field_v.field_y = false;
        rm.field_f = null;
        qn.field_v.field_J.a(12631, true);
        qn.field_v.field_l = -qn.field_v.field_x.field_r[qn.field_v.field_x.field_t];
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        this.field_Z.a(param0, param3, param2, 70);
    }

    final void a(pm param0, int param1) {
        if (param1 >= -81) {
          return;
        }
        try {
          param0.a(640, this);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "h.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
          this.a(64, true, -1.505505235267183);
          return true;
        }
        return true;
    }

    h(hn param0, dj param1, int param2) {
        super(param0, param1.field_E, param1.field_t, -0.1 + (-param1.field_C + param1.field_D), 0.1, 0.01);
        this.field_Z = new tf((ee) (this));
        this.field_U = 0;
        this.field_T = new double[3];
        this.field_X = new hm((pm) (this), ki.field_a);
        try {
          this.field_Q = new kh((pm) (this), (bi) null, 0);
          this.field_L = param1.field_L;
          this.field_G = param1.field_G;
          this.field_bb = param2;
          this.field_K = param1.field_K;
          this.field_Z.b(118);
          this.field_ab = new ek((ee) (this), true, false, param1.field_Bb.field_b - 4);
          if (param1.field_Bb.field_b <= 8) {
            this.field_ab.field_d = 0;
          }
          this.field_ab.field_l = param1.field_Bb.field_l;
          if (param1.field_Gb > 0) {
            this.field_U = 256;
          }
          new gk((pm) (this), d.field_b).field_w = this.field_C * 2.0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static l a(boolean param0, byte[] param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        l stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (l) (stackIn_2_0);
          }
          var2 = new l(param1, jl.field_p, ij.field_r, rg.field_I, sd.field_f, an.field_p, rj.field_f);
          ql.a(param0);
          if (param0) {
            var3 = (byte[]) null;
            h.a(true, (byte[]) null);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("h.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
          return -0.6423134079966774;
        }
        return this.field_ab.a(param0 ^ 14170, false, param1, param2);
    }

    final static void m(int param0) {
        int var1;
        int var2;
        var2 = Confined.field_J ? 1 : 0;
        s.field_K = false;
        cb.field_b = null;
        if (param0 != -31574) {
          field_R = (dd) null;
        }
        if (rk.field_f) {
          ki.field_c.i((byte) 92);
        } else {
          var1 = oi.field_q;
          if (var1 > 0) {
            if (var1 == 1) {
              cb.field_b = jc.field_b;
            } else {
              cb.field_b = b.a(new String[]{Integer.toString(var1)}, gj.field_g, param0 + 32751);
            }
            cb.field_b = pf.a(11739, new CharSequence[]{(CharSequence) ((Object) cb.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) f.field_a)});
          }
          ki.field_c.n(10);
          bn.c(param0 + 31574);
        }
    }

    final void g(int param0) {
        if (param0 != 26402) {
          oi var3 = (oi) null;
          this.a((mn) null, -0.7945570901746162, -12, (vg) null, (oi) null);
        }
        ka var2 = this.a((byte) -116, ck.field_a, 2.0);
        var2.field_M.field_w = this.field_C * 4.0;
        this.field_A.field_B.field_Nb[this.field_bb] = null;
        kc.a(db.field_u, (pm) (this), param0 - 26281, false);
    }

    public static void l(int param0) {
        if (param0 != 0) {
          return;
        }
        field_Y = null;
        field_V = null;
        field_R = null;
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 72) {
            this.field_Q = (kh) null;
          }
          stackIn_5_0 = !(param0.f(-94));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("h.WA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int var13_int = 0;
        double var5;
        double var7;
        double var9;
        double var11;
        h var14;
        int var29;
        dj var30;
        double[] var34;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        double var23;
        double var25;
        double var27;
        double var11Lifetime1;
        double var11Lifetime2;
        double var13Lifetime1;
        double var15Lifetime1;
        double var15Lifetime2;
        double var17Lifetime1;
        double var17Lifetime2;
        double var19Lifetime1;
        double var19Lifetime2;
        double var21Lifetime1;
        double var23Lifetime1;
        var29 = Confined.field_J ? 1 : 0;
        var30 = this.field_A.field_B;
        var34 = new double[12];
        var30.field_jb.a((byte) 122, var34);
        var5 = var34[9];
        var7 = var34[10];
        var9 = var34[11];
        var11 = 0.01;
        for (var13_int = 0; var13_int < 5; var13_int++) {
          var14 = var30.field_Nb[var13_int];
          if (var14 != null) {
            if (this == var14) {
              var11 = -0.01;
            } else {
              var15 = var14.field_E - this.field_E;
              var17 = var14.field_t - this.field_t;
              var15 = var15 + 8.0 * (var14.field_K - this.field_K);
              var17 = var17 + 8.0 * (var14.field_G - this.field_G);
              var19 = -this.field_D + var14.field_D;
              var19 = var19 + 8.0 * (var14.field_L - this.field_L);
              var21 = var15 * var5 + var7 * var17 + var19 * var9;
              var19 = var19 - var9 * var21;
              var17 = var17 - var7 * var21;
              var15 = var15 - var5 * var21;
              var23 = var19 * var19 + (var15 * var15 + var17 * var17);
              if (var23 >= 0.1) {
                var23 = 0.01 / var23;
                var17 = var17 * var23;
                var19 = var19 * var23;
                var15 = var15 * var23;
              } else {
                var15 = var11;
                var19 = 0.0;
                var17 = 0.0;
              }
              this.field_K = this.field_K - var15;
              this.field_G = this.field_G - var17;
              this.field_L = this.field_L - var19;
            }
          }
        }
        var13 = -var30.field_E + this.field_E;
        var15Lifetime1 = this.field_t - var30.field_t;
        var13 = var13 + 8.0 * (this.field_K - var30.field_K);
        var15Lifetime1 = var15Lifetime1 + (this.field_G - var30.field_G) * 8.0;
        var17Lifetime1 = -var30.field_D + this.field_D;
        var17Lifetime1 = var17Lifetime1 + (-var30.field_L + this.field_L) * 8.0;
        var19Lifetime1 = var17Lifetime1 * var9 + (var13 * var5 + var15Lifetime1 * var7);
        var15Lifetime1 = var15Lifetime1 - var19Lifetime1 * var7;
        var17Lifetime1 = var17Lifetime1 - var9 * var19Lifetime1;
        var13 = var13 - var5 * var19Lifetime1;
        var21Lifetime1 = (var30.field_C * 2.0 - Math.sqrt(var17Lifetime1 * var17Lifetime1 + (var15Lifetime1 * var15Lifetime1 + var13 * var13))) * 0.07;
        this.field_L = this.field_L + var21Lifetime1 * var17Lifetime1;
        this.field_K = this.field_K + var13 * var21Lifetime1;
        this.field_G = this.field_G + var15Lifetime1 * var21Lifetime1;
        var23Lifetime1 = -(var17Lifetime1 * var7) + var9 * var15Lifetime1;
        var25 = -(var13 * var9) + var5 * var17Lifetime1;
        this.field_G = this.field_G + 0.005 * var25;
        var27 = var13 * var7 - var15Lifetime1 * var5;
        this.field_K = this.field_K + var23Lifetime1 * 0.005;
        this.field_L = this.field_L + var27 * 0.005;
        var11Lifetime1 = -this.field_E + var30.field_E;
        var13Lifetime1 = var30.field_t - this.field_t;
        var15Lifetime2 = -this.field_D + var30.field_D;
        var17Lifetime2 = var9 * var15Lifetime2 + (var7 * var13Lifetime1 + var5 * var11Lifetime1);
        var19Lifetime2 = 0.01 + 0.05 * (-0.1 + (-var30.field_C + var17Lifetime2));
        this.field_L = 0.95 * (var19Lifetime2 * var9 + this.field_L);
        this.field_G = 0.95 * (var19Lifetime2 * var7 + this.field_G);
        this.field_K = 0.95 * (var19Lifetime2 * var5 + this.field_K);
        var11Lifetime2 = this.field_K * this.field_K + this.field_G * this.field_G + this.field_L * this.field_L;
        if (0.09 < var11Lifetime2) {
          var11Lifetime2 = 0.3 / Math.sqrt(var11Lifetime2);
          this.field_L = this.field_L * var11Lifetime2;
          this.field_K = this.field_K * var11Lifetime2;
          this.field_G = this.field_G * var11Lifetime2;
        }
        super.a(param0, param1);
        this.field_Z.c(16777215);
        this.field_ab.a(this.field_Z, 3);
        if (this.field_A.field_B.field_Gb <= 0) {
          if (this.field_U > 0) {
            this.field_U = this.field_U - 16;
          }
        } else {
          if (256 > this.field_U) {
            this.field_U = this.field_U + 16;
          }
        }
    }

    static {
        field_V = new int[]{1, 1, 1, 1, 3, 0, 0, 0, 3, 2, 2, 2, 4, 3, 2, 3, 4, 0, 2, 4, 5, 3, 5, 4, 5};
    }
}
