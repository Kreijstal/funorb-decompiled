/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends pm {
    static String field_Q;
    da field_W;
    static ce field_I;
    double field_O;
    static be field_G;
    da field_X;
    static String field_K;
    double field_T;
    double field_L;
    static sh field_Z;
    static mn field_J;
    private da field_S;
    double field_H;
    double field_N;
    double field_U;
    double field_ab;
    double field_V;
    double field_R;
    double field_F;
    double field_Y;
    double field_P;
    double field_M;

    private final void a(byte param0, pm param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        java.awt.Color var11 = null;
        try {
          var3_double = this.field_E - param1.field_E;
          var5 = this.field_t - param1.field_t;
          if (param0 < 69) {
            var11 = (java.awt.Color) null;
            vg.a((String) null, true, -97, (java.awt.Color) null, false);
          }
          var7 = -param1.field_D + this.field_D;
          var9 = var7 * var7 + (var3_double * var3_double + var5 * var5);
          if (!(0.0001 > var9)) {
            var9 = (this.field_C + param1.field_C) / Math.sqrt(var9);
            if (var9 <= 1.0) {
              return;
            }
            this.field_D = var7 * var9 + param1.field_D;
            this.field_t = var9 * var5 + param1.field_t;
            this.field_E = var9 * var3_double + param1.field_E;
          } else {
            this.field_D = this.field_C + (param1.field_C + param1.field_D);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vg.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean g(byte param0) {
        if (param0 < 64) {
          this.field_U = -0.11064266696157023;
          return true;
        }
        return true;
    }

    final static void a(int param0, int param1, om param2) {
        hb var6 = null;
        int var4 = 0;
        try {
          var6 = vh.field_a;
          var6.b(true, param1);
          var6.field_n = var6.field_n + 1;
          var4 = var6.field_n;
          var6.f(param0 - 7830, 1);
          var6.f(113, param2.field_n);
          var6.a(false, param2.field_v);
          var6.d(-126, param2.field_r);
          var6.d(-100, param2.field_t);
          var6.d(param0 ^ -7846, param2.field_u);
          if (param0 != 7932) {
            java.awt.Color var5 = (java.awt.Color) null;
            vg.a((String) null, true, 52, (java.awt.Color) null, true);
          }
          var6.d(-105, param2.field_m);
          var6.e(26199, var4);
          var6.a(25859, var6.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vg.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, hf param1) {
        try {
          if (param0 > -29) {
            this.m(18);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, mb param1) {
        try {
          if (param0 != -23154) {
            this.field_N = -1.1636230847772295;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        try {
          if (param2 > -5) {
            this.field_R = 2.2622491296623233;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this.field_E = param3 + param2 * this.field_C;
        this.field_t = param4 * this.field_C + param1;
        this.field_D = this.field_C * param6 + param5;
        if (param0 != 256) {
          oi var15 = (oi) null;
          this.a((mn) null, 0.17170823466232027, -123, (vg) null, (oi) null);
        }
    }

    final static void a(String param0, boolean param1, int param2, java.awt.Color param3, boolean param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = fb.field_b.getGraphics();
            if (null == gh.field_f) {
              gh.field_f = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param1) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, wm.field_ab, im.field_b);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (param4) {
                return;
              }
              if (null == qm.field_z) {
                qm.field_z = fb.field_b.createImage(304, 34);
              }
              var10 = qm.field_z.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param2, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
              var10.setFont(gh.field_f);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
              var9.drawImage(qm.field_z, wm.field_ab / 2 - 152, -18 + im.field_b / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + wm.field_ab / 2;
              var8 = im.field_b / 2 - 18;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param2 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, var8 + 1, 301, 31);
              var9.fillRect(3 * param2 + (2 + var7), 2 + var8, 300 - param2 * 3, 30);
              var9.setFont(gh.field_f);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (304 - param0.length() * 6) / 2, var8 + 22);
            }
            if (eb.field_b != null) {
              var9.setFont(gh.field_f);
              var9.setColor(java.awt.Color.white);
              var9.drawString(eb.field_b, wm.field_ab / 2 - eb.field_b.length() * 6 / 2, -26 + im.field_b / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            fb.field_b.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("vg.Q(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        this.field_L = this.field_L - param3;
        this.field_T = this.field_T - param0;
        this.field_O = this.field_O - param2;
    }

    final void m(int param0) {
        if (param0 != 10959) {
          this.field_M = -0.7009354851461643;
        }
        if (!md.a(param0 ^ -10939)) {
          this.field_O = this.field_D;
          this.field_L = this.field_t;
          this.field_T = this.field_E;
          this.field_W = this.field_X;
        } else {
          this.field_L = this.field_A.field_B.field_t + this.field_ab * jg.field_b[0] + jg.field_b[1] * this.field_U + jg.field_b[2] * this.field_H;
          this.field_W = this.field_A.field_B.field_jb;
          this.field_O = this.field_F * jg.field_b[1] + (this.field_A.field_B.field_D + this.field_M * jg.field_b[0]) + this.field_N * jg.field_b[2];
          this.field_T = this.field_P * jg.field_b[2] + (this.field_A.field_B.field_E + this.field_R * jg.field_b[0] + jg.field_b[1] * this.field_V);
        }
    }

    final void a(hm param0, boolean param1) {
        try {
          if (!param1) {
            this.field_L = 0.011069630776745578;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pm param0, int param1) {
        try {
          if (param1 >= -81) {
            field_G = (be) null;
          }
          param0.a(-1, this);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        pm var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 instanceof wc) {
            this.a((byte) 124, param1);
          } else {
            param1.field_N = true;
          }
          if (!param0) {
            var4 = (pm) null;
            this.a((byte) 15, (pm) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        hf var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 72) {
            var4 = (hf) null;
            this.a(55, (hf) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vg.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
          return;
        }
        try {
          param1.field_N = true;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 > -54) {
          return false;
        }
        return false;
    }

    final void k(int param0) {
        dj var3;
        int var5_int;
        double var5;
        int var6;
        double var7;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        int var23;
        double var24;
        int var26;
        lc var27;
        lc var28;
        double[] var32;
        var26 = Confined.field_J ? 1 : 0;
        var27 = this.field_A.field_x;
        var28 = var27;
        var3 = this.field_A.field_B;
        var32 = new double[12];
        if (var28.field_a >= 2) {
          this.field_X.a((byte) 116, var3.field_jb, 0.05);
        } else {
          this.field_X.a((byte) 80, var32);
          var5_int = 0;
          var6 = 0;
          if (da.field_e == null) {
            if (mc.field_e[96]) {
              var5_int--;
            }
            if (mc.field_e[97]) {
              var5_int++;
            }
            if (mc.field_e[98]) {
              var6--;
            }
            if (mc.field_e[99]) {
              var6++;
            }
          }
          if (var5_int != 0) {
            hd.field_e.a((double)var5_int * -0.002, var32[8], var32[6], var32[7], 7);
            this.field_S.a(-98, hd.field_e);
          }
          if (var6 != 0) {
            hd.field_e.a(0.002 * (double)var6, var32[5], var32[3], var32[4], param0 ^ 3225);
            this.field_S.a(param0 - 3255, hd.field_e);
          }
          this.field_S.a(0.95, (byte) -65);
          this.field_X.a(-83, this.field_S);
        }
        this.field_X.a((byte) 20, var32);
        var5 = var32[3];
        var7 = var32[4];
        var9 = var32[5];
        var11 = var32[6];
        var13 = var32[7];
        var15 = var32[8];
        var17 = var32[9];
        var19 = var32[10];
        var21 = var32[11];
        for (var23 = 1; var23 < -1 + var28.field_a; var23++) {
          if (var3.field_D > var27.field_r[var23]) {
            continue;
          }
          break;
        }
        if (var28.field_D < var23) {
          var24 = var28.field_i;
        } else {
          if (var28.field_D <= var23) {
            var24 = var28.field_H + (var3.field_D - var28.field_r[-1 + var23]) * (-var28.field_H + var28.field_i) / (-var28.field_r[-1 + var23] + var28.field_r[var23]);
          } else {
            var24 = var28.field_H;
          }
        }
        var24 = var24 * 0.5;
        this.field_E = this.field_E + (-(var24 * var17) + var3.field_E - this.field_E) * this.field_Y;
        this.field_D = this.field_D + (-this.field_D + (var3.field_D - var24 * var21)) * this.field_Y;
        this.field_t = this.field_t + (-this.field_t + (-(var24 * var19) + var3.field_t)) * this.field_Y;
        if (param0 != 3230) {
          this.g((byte) 61);
        }
        if (md.a(-111)) {
          this.field_A.field_B.field_jb.a((byte) 107, var32);
          this.field_N = var32[11];
          this.field_V = var32[6];
          this.field_F = var32[8];
          this.field_H = var32[10];
          this.field_R = var32[3];
          this.field_P = var32[9];
          this.field_ab = var32[4];
          this.field_M = var32[5];
          this.field_U = var32[7];
        } else {
          this.field_M = var9;
          this.field_V = var11;
          this.field_U = var13;
          this.field_N = var21;
          this.field_P = var17;
          this.field_H = var19;
          this.field_F = var15;
          this.field_ab = var7;
          this.field_R = var5;
        }
    }

    final static void a(boolean param0, oc param1) {
        int var2_int = 0;
        oc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          if (param1.field_c == null) {
            return;
          }
          if (param1.field_d != 0 ||
            param1.field_i != 0) {
            for (var2_int = 0; var2_int < en.field_a; var2_int++) {
              var3 = kl.field_R[var2_int];
              if (var3.field_a == 2 &&
                var3.field_d == param1.field_d &&
                param1.field_i == var3.field_i) {
                return;
              }
            }
          }
          if (param1.field_h != null) {
          }
          hh.a(param1, -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
          field_Q = (String) null;
          return false;
        }
        return false;
    }

    final void a(boolean param0, il param1) {
        try {
          if (param0) {
            pm var4 = (pm) null;
            this.a((pm) null, 81);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, int param1) {
        try {
          if (param1 < 122) {
            oc var4 = (oc) null;
            vg.a(true, (oc) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, vg param1) {
        try {
          if (param0 != -1) {
            hm var4 = (hm) null;
            this.a((hm) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(cl param0, byte param1) {
        try {
          int var3_int = 111 / ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void l(int param0) {
        field_G = null;
        field_Z = null;
        field_J = null;
        field_I = null;
        field_Q = null;
        field_K = null;
        if (param0 <= 67) {
          java.awt.Color var2 = (java.awt.Color) null;
          vg.a((String) null, false, 1, (java.awt.Color) null, false);
        }
    }

    final boolean i(int param0) {
        if (param0 != 8) {
          this.field_H = 1.1121338314193603;
          return true;
        }
        return true;
    }

    final int[] a(int param0, boolean param1) {
        if (param1) {
          this.k(25);
        }
        double var3 = (double)param0;
        double var5 = 81920.0;
        return new int[]{(int)(var3 * this.field_T), (int)(this.field_L * var3), (int)(this.field_O * (double)param0), (int)(this.field_R * var5), (int)(this.field_ab * var5), (int)(var5 * this.field_M), (int)(var5 * this.field_V), (int)(this.field_U * var5), (int)(this.field_F * var5), (int)(this.field_P * 65536.0), (int)(65536.0 * this.field_H), (int)(this.field_N * 65536.0)};
    }

    vg(hn param0, double param1, double param2, double param3) {
        super(param0, param1, param2, param3, 0.2);
        this.field_X = new da();
        this.field_S = new da();
        this.field_U = 1.0;
        this.field_V = 0.0;
        this.field_ab = 0.0;
        this.field_H = 0.0;
        this.field_N = 1.0;
        this.field_Y = 0.1;
        this.field_P = 0.0;
        this.field_F = 0.0;
        this.field_R = 1.0;
        this.field_M = 0.0;
    }

    final void a(int param0, ah param1) {
        try {
          param1.field_N = true;
          int var3_int = -30 % ((14 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Q = "You already have the disruption cannon";
        field_K = "Hold <%0> to blast nearby enemies with lightning";
    }
}
