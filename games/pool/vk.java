/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends kd {
    private int[] field_Y;
    private int[] field_T;
    static tf field_db;
    private int[] field_G;
    int[] field_L;
    private int[] field_s;
    private int[] field_cb;
    private int[] field_r;
    private int[] field_v;
    private int field_N;
    private int[] field_A;
    private gq field_Z;
    static dd[] field_y;
    private int[] field_B;
    int[] field_U;
    private int[] field_p;
    private int field_w;
    private int[] field_q;
    int[] field_F;
    private pr[][] field_R;
    private int[] field_K;
    private bm field_z;
    private pr[][] field_I;
    private int[] field_J;
    static int field_bb;
    static String field_O;
    private boolean field_M;
    private int field_t;
    private ib field_u;
    private long field_D;
    private long field_ab;
    private int field_X;
    static int field_H;
    static String field_P;
    private boolean field_W;
    static nl field_V;
    private cg field_C;
    static String field_x;
    private int field_S;

    final synchronized int d() {
        return 0;
    }

    final synchronized kd a() {
        return (kd) ((Object) this.field_u);
    }

    final synchronized boolean a(cf param0, di param1, cg param2, int param3, int param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        te var8 = null;
        int var9 = 0;
        g var10 = null;
        int var11 = 0;
        var11 = Pool.field_O;
        try {
          if (param3 <= 54) {
            return true;
          }
          param2.b();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (te) (param2.field_m.a(0));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_c;
            var10 = (g) (this.field_z.a(false, (long)var9));
            if (var10 == null) {
              var10 = hk.a(param1, (byte) 127, var9);
              if (var10 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_z.a((byte) -120, var10, (long)var9);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (!var10.a(23605, var8.field_l, (int[]) (var7), param0))) {
              var6_int = 0;
            }
            var8 = (te) (param2.field_m.b(-1));
          }
          if (var6_int != 0) {
            param2.a();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vk.FA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_V = null;
        if (param0 != -819201) {
          return;
        }
        field_x = null;
        field_P = null;
        field_O = null;
        field_y = null;
        field_db = null;
    }

    private final int a(boolean param0, pr param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kp var9 = null;
        kp var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_T[param1.field_t] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param1.field_x;
          var10 = var9;
          var4 = this.field_G[param1.field_t] * this.field_K[param1.field_t] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param1.field_E >> 15;
          if (!param0) {
            this.field_t = 0;
          }
          var4 = this.field_w * var4 + 128 >> 8;
          var4 = var4 * this.field_T[param1.field_t] + 128 >> 8;
          if (var10.field_e > 0) {
            var4 = (int)(Math.pow(0.5, (double)param1.field_p * 0.00001953125 * (double)var10.field_e) * (double)var4 + 0.5);
          }
          if (var10.field_a != null) {
            var5 = param1.field_z;
            var6 = var10.field_a[param1.field_F + 1];
            if (var10.field_a.length - 2 > param1.field_F) {
              var7 = var9.field_a[param1.field_F] << 8 & 65280;
              var8 = (255 & var10.field_a[param1.field_F + 2]) << 8;
              var6 = var6 + (-var6 + var10.field_a[3 + param1.field_F]) * (-var7 + var5) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param1.field_G > 0 &&
            var10.field_l != null) {
            var5Lifetime1 = param1.field_G;
            var6Lifetime1 = var10.field_l[param1.field_w + 1];
            if (param1.field_w < var10.field_l.length - 2) {
              var7Lifetime1 = (var9.field_l[param1.field_w] & 255) << 8;
              var8Lifetime1 = var10.field_l[2 + param1.field_w] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_l[3 + param1.field_w]) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("vk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.a((byte) -44, param1);
          }
          return;
        }
        this.field_G[param1] = 12800;
        this.field_B[param1] = 8192;
        this.field_K[param1] = 16383;
        this.field_Y[param1] = 8192;
        this.field_q[param1] = 0;
        this.field_s[param1] = 8192;
        this.d(param1, 0);
        this.a(param1, false);
        if (param0 != -44) {
          cg var4 = (cg) null;
          this.a((cg) null, 67, false);
        }
        this.field_F[param1] = 0;
        this.field_cb[param1] = 32767;
        this.field_p[param1] = 256;
        this.field_U[param1] = 0;
        this.a(8192, param1, 6779);
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param1 == 1) {
            stackIn_3_0 = nr.a(new String[]{param0}, -1, th.field_k);
            return stackIn_3_0;
          }
          var3_int = 23 / ((param2 + 71) / 45);
          if (param1 == 2) {
            stackIn_7_0 = nr.a(new String[]{param0}, -1, up.field_I);
            return stackIn_7_0;
          }
          if (3 == param1) {
            stackIn_11_0 = nr.a(new String[]{param0}, -1, da.field_a);
            return stackIn_11_0;
          }
          if (param1 == 4) {
            stackIn_15_0 = nr.a(new String[]{param0}, -1, s.field_g);
            return stackIn_15_0;
          }
          if (param1 == 5) {
            stackIn_18_0 = nr.a(new String[]{param0}, -1, lh.field_a);
            return stackIn_18_0;
          }
          if (param1 == 6) {
            stackIn_22_0 = nr.a(new String[]{param0}, -1, hr.field_w);
            return stackIn_22_0;
          }
          if (param1 == 7) {
            stackIn_25_0 = nr.a(new String[]{param0}, -1, ii.field_f);
            return stackIn_25_0;
          }
          if (param1 == 8) {
            stackIn_29_0 = nr.a(new String[]{param0}, -1, fd.field_M);
            return stackIn_29_0;
          }
          if (param1 == 11) {
            stackIn_33_0 = nr.a(new String[]{param0}, -1, sg.field_I);
            return stackIn_33_0;
          }
          if (param1 == 12) {
            stackIn_36_0 = nr.a(new String[]{param0}, -1, sd.field_U);
            return stackIn_36_0;
          }
          if (param1 != 13) {
            return null;
          }
          stackIn_40_0 = nr.a(new String[]{param0}, -1, np.field_c);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("vk.P(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Pool.field_O;
        try {
          if (this.field_Z.a()) {
            var4_int = this.field_N * this.field_Z.field_f / bp.field_h;
            while (true) {
              var5 = this.field_ab + (long)var4_int * (long)param2;
              if (0L <= this.field_D - var5) {
                this.field_ab = var5;
                break;
              }
              var7 = (int)(((long)var4_int + this.field_D - this.field_ab - 1L) / (long)var4_int);
              this.field_ab = this.field_ab + (long)var7 * (long)var4_int;
              this.field_u.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.d((byte) -89);
              if (this.field_Z.a()) {
                continue;
              }
              this.field_u.a(param0, param1, param2);
              return;
            }
          }
          this.field_u.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("vk.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte param0, pr param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 118) {
            field_y = (dd[]) null;
          }
          var3_int = this.field_B[param1.field_t];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - (32 + (-param1.field_m + 128) * (16384 - var3_int) >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = param1.field_m * var3_int + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vk.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0, pr param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16257) {
            this.field_z = (bm) null;
          }
          if (null != param1.field_o) {
            return false;
          }
          if (param1.field_G < 0) {
            return true;
          }
          param1.a((byte) -117);
          if (param1.field_n > 0 &&
            param1 == this.field_R[param1.field_t][param1.field_n]) {
            this.field_R[param1.field_t][param1.field_n] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("vk.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Pool.field_O;
        if (this.field_v[param2] != param1) {
          this.field_v[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_R[param2][var4] = null;
          }
        }
        if (param0 > -98) {
          this.b(112, -108, -34, -62);
        }
    }

    final synchronized void e(int param0) {
        this.a(true, param0);
    }

    private final int b(int param0, pr param1) {
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_v * param1.field_r >> 12) + param1.field_B;
          var3_int = var3_int + ((-8192 + this.field_Y[param1.field_t]) * this.field_p[param1.field_t] >> 12);
          var4 = param1.field_x;
          if (param0 != 1) {
            stackIn_2_0 = -128;
            return stackIn_2_0;
          }
          if (var4.field_o > 0 && (!(var4.field_b <= 0) ||
            this.field_q[param1.field_t] > 0)) {
            var5 = var4.field_b << 2;
            var6 = var4.field_n << 1;
            if (param1.field_q < var6) {
              var5 = param1.field_q * var5 / var6;
            }
            var5 = var5 + (this.field_q[param1.field_t] >> 7);
            var7 = Math.sin((double)(param1.field_s & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_C.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)bp.field_h);
          stackIn_13_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("vk.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param0) {
          this.a(-1, 0);
        } else {
          this.c(-45, -1);
        }
        this.a((byte) -44, -1);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_v[var3] = this.field_r[var3];
        }
        if (param1 != 123) {
          return;
        }
        int var4 = 0;
        var3Lifetime1 = var4;
        while (16 > var4) {
          this.field_J[var4] = rb.b(this.field_r[var4], -128);
          var4++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_A[param1] = param0;
        this.field_L[param1] = (int)(Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param2 != 6779) {
          this.a(-51, false);
        }
    }

    private final void a(int param0, int param1) {
        pr var3;
        if (param1 != 0) {
          return;
        }
        var3 = (pr) (this.field_u.field_t.c((byte) 124));
        while (var3 != null) {
          if ((param0 < 0 ||
            param0 == var3.field_t) &&
            var3.field_G < 0) {
            this.field_I[var3.field_t][var3.field_A] = null;
            var3.field_G = 0;
          }
          var3 = (pr) (this.field_u.field_t.f((byte) -5));
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 62 / ((param0 + 68) / 53);
        if (param1 >= 0) {
          this.field_T[param1] = param2;
        } else {
          for (var5 = 0; 16 > var5; var5++) {
            this.field_T[var5] = param2;
          }
        }
    }

    final synchronized void a(cg param0, int param1, boolean param2) {
        if (param1 != 8821) {
          return;
        }
        try {
          this.a(param0, true, (byte) -14, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vk.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1) {
        pr var3 = null;
        if (param1 != (this.field_F[param0] & 2)) {
          var3 = (pr) (this.field_u.field_t.c((byte) -92));
          while (var3 != null) {
            if (var3.field_t == param0 && null == this.field_I[param0][var3.field_A] &&
              !(var3.field_G >= 0)) {
              var3.field_G = 0;
            }
            var3 = (pr) (this.field_u.field_t.f((byte) -5));
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 8192) {
          this.field_q = (int[]) null;
        }
    }

    private final void a(int param0, boolean param1) {
        pr var3 = null;
        if ((4 & this.field_F[param0]) != 0) {
          var3 = (pr) (this.field_u.field_t.c((byte) 88));
          while (var3 != null) {
            if (var3.field_t == param0) {
              var3.field_y = 0;
            }
            var3 = (pr) (this.field_u.field_t.f((byte) -5));
          }
        }
        if (param1) {
          field_db = (tf) null;
        }
    }

    final synchronized boolean d(int param0) {
        if (param0 != -11414) {
          return true;
        }
        return this.field_Z.a();
    }

    private final void d(byte param0) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var2 = this.field_X;
        var3 = this.field_t;
        if (param0 != -89) {
          this.a(false, 85);
        }
        var4 = this.field_D;
        if (null != this.field_C &&
          this.field_S == var3) {
          this.a(this.field_C, this.field_W, (byte) -14, this.field_M);
          this.d((byte) -89);
          return;
        }
        while (true) {
          if (var3 != this.field_t) {
            this.field_D = var4;
            this.field_X = var2;
            this.field_t = var3;
            if (null != this.field_C) {
              stackIn_27_0 = var3;
              stackIn_27_1 = this.field_S;
              if (stackIn_27_0 > stackIn_27_1) {
                this.field_X = -1;
                this.field_t = this.field_S;
                this.field_D = this.field_Z.b(this.field_t);
              }
            }
            return;
          }
          while (~var3 == ~this.field_Z.field_g[var2]) {
            this.field_Z.a(var2);
            var6 = this.field_Z.d(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.b(var6, -122);
              }
              this.field_Z.f(var2);
              this.field_Z.e(var2);
              continue;
            }
            this.field_Z.c();
            this.field_Z.e(var2);
            if (this.field_Z.f()) {
              if (this.field_C != null) {
                this.a(this.field_C, 8821, this.field_M);
                this.d((byte) -89);
                return;
              }
              if (this.field_M &&
                var3 != 0) {
                this.field_Z.a(var4);
              } else {
                this.b(true, 123);
                this.field_Z.e();
                return;
              }
            }
            break;
          }
          var2 = this.field_Z.b();
          var3 = this.field_Z.field_g[var2];
          var4 = this.field_Z.b(var3);
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pr var6 = null;
        int var7 = Pool.field_O;
        pr var8 = this.field_I[param0][param1];
        if (var8 == null) {
          return;
        }
        if (param2 < 18) {
          this.field_F = (int[]) null;
        }
        this.field_I[param0][param1] = null;
        if ((2 & this.field_F[param0]) == 0) {
          var8.field_G = 0;
        } else {
          var6 = (pr) (this.field_u.field_t.c((byte) 124));
          while (var6 != null) {
            if (var8.field_t == var6.field_t && var6.field_G < 0 &&
              var6 != var8) {
              var8.field_G = 0;
              break;
            }
            var6 = (pr) (this.field_u.field_t.f((byte) -5));
          }
        }
    }

    final synchronized void a(cg param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          this.a(param1, -1);
          this.field_Z.a(param0.field_l);
          this.field_ab = 0L;
          this.field_M = param3 ? true : false;
          var5_int = this.field_Z.d();
          if (param2 != -14) {
            this.a();
          }
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_Z.a(var6);
            this.field_Z.f(var6);
            this.field_Z.e(var6);
          }
          this.field_X = this.field_Z.b();
          this.field_t = this.field_Z.field_g[this.field_X];
          this.field_D = this.field_Z.b(this.field_t);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vk.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(boolean param0) {
        int var3 = Pool.field_O;
        if (!param0) {
          field_H = -40;
        }
        g var4 = (g) (this.field_z.a(0));
        while (var4 != null) {
          var4.c(23478);
          var4 = (g) (this.field_z.b(-1));
        }
    }

    final long c(byte param0) {
        if (param0 >= -46) {
          this.field_t = 53;
        }
        return this.field_ab / (long)this.field_Z.field_f;
    }

    private final void c(byte param0, int param1, int param2) {
        if (param0 != -62) {
          this.field_z = (bm) null;
        }
    }

    private final void c(int param0, int param1) {
        pr var3;
        var3 = (pr) (this.field_u.field_t.c((byte) 62));
        if (param0 >= -17) {
          this.a(-123, -25, 81);
        }
        while (var3 != null) {
          if (0 > param1 ||
            param1 == var3.field_t) {
            if (null != var3.field_o) {
              var3.field_o.c(bp.field_h / 100);
              if (var3.field_o.g()) {
                this.field_u.field_p.b(var3.field_o);
              }
              var3.a(2);
            }
            if (var3.field_G < 0) {
              this.field_I[var3.field_t][var3.field_A] = null;
            }
            var3.a((byte) -117);
          }
          var3 = (pr) (this.field_u.field_t.f((byte) -5));
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_17_1 = 0;
        pr stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        pr var5;
        int var6_int;
        jg var6;
        pr var7;
        pr var8;
        int var9;
        g var10;
        g var11;
        var9 = Pool.field_O;
        this.c(param3, param1, 104, 64);
        if (0 != (this.field_F[param3] & 2)) {
          var5 = (pr) (this.field_u.field_t.a((byte) -127));
          while (var5 != null) {
            if (param3 == var5.field_t &&
              var5.field_G < 0) {
              this.field_I[param3][var5.field_A] = null;
              this.field_I[param3][param1] = var5;
              var6_int = var5.field_B + (var5.field_r * var5.field_v >> 12);
              var5.field_B = var5.field_B + (param1 - var5.field_A << 8);
              var5.field_v = -var5.field_B + var6_int;
              var5.field_r = 4096;
              var5.field_A = param1;
              return;
            }
            var5 = (pr) (this.field_u.field_t.b((byte) -46));
          }
        }
        var10 = (g) (this.field_z.a(false, (long)this.field_v[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_u[param1];
        if (var6 == null) {
          return;
        }
        var7 = new pr();
        var7.field_u = var11;
        var7.field_C = var6;
        var7.field_t = param3;
        var7.field_x = var10.field_t[param1];
        var7.field_n = var10.field_p[param1];
        var7.field_A = param1;
        var7.field_E = 1024 + param2 * param2 * var11.field_q * var10.field_n[param1] >> 11;
        var7.field_m = var10.field_v[param1] & 255;
        var7.field_B = -(32767 & var10.field_s[param1]) + (param1 << 8);
        var7.field_w = param0;
        var7.field_G = -1;
        var7.field_z = 0;
        var7.field_F = 0;
        var7.field_p = 0;
        if (this.field_U[param3] != 0) {
          var7.field_o = nb.b(var6, this.b(1, var7), 0, this.a((byte) 123, var7));
          stackIn_17_1 = -123;
          stackIn_17_2 = var7;
          if (var11.field_s[param1] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a(stackIn_17_1, stackIn_17_2, stackIn_18_3);
        } else {
          var7.field_o = nb.b(var6, this.b(param0 + 1, var7), this.a(true, var7), this.a((byte) 121, var7));
        }
        if (var11.field_s[param1] < 0) {
          var7.field_o.e(-1);
        }
        if (var7.field_n >= 0) {
          var8 = this.field_R[param3][var7.field_n];
          if (var8 != null &&
            var8.field_G < 0) {
            this.field_I[param3][var8.field_A] = null;
            var8.field_G = 0;
          }
          this.field_R[param3][var7.field_n] = var7;
        }
        this.field_u.field_t.b((byte) -93, var7);
        this.field_I[param3][param1] = var7;
        return;
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = Pool.field_O;
        var3 = 240 & param0;
        if (param1 != -122) {
          this.a();
        }
        if (128 == var3) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = (8324615 & param0) >> 16;
          this.c(var4, var5, 37, var6);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = 127 & param0 >> 8;
          var6Lifetime1 = (8367257 & param0) >> 16;
          if (0 < var6Lifetime1) {
            this.b(param1 + 122, var5Lifetime1, var6Lifetime1, var4Lifetime1);
          } else {
            this.c(var4Lifetime1, var5Lifetime1, 96, 64);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (param0 & 32765) >> 8;
          var6Lifetime2 = (param0 & 8339384) >> 16;
          this.a(var6Lifetime2, var5Lifetime2, param1 ^ -8314, var4Lifetime2);
          return;
        }
        if (176 != var3) {
          if (192 == var3) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.b(-118, this.field_J[var4Lifetime3] + var5Lifetime3, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (param0 & 32677) >> 8;
            this.c((byte) -62, var4Lifetime3Lifetime1, var5Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = ((param0 & 32702) >> 8) + ((8323364 & param0) >> 9);
            this.b((byte) 90, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.b(true, 123);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = param0 >> 8 & 127;
        var6Lifetime3 = (param0 & 8325787) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_J[var4Lifetime4] = rb.b(this.field_J[var4Lifetime4], -2080769) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(-16257, this.field_J[var4Lifetime4]);
        }
        if (var5Lifetime4 == 1) {
          this.field_q[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(-16257, this.field_q[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.field_q[var4Lifetime4] = rb.b(-128, this.field_q[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_s[var4Lifetime4] = rb.b(this.field_s[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_s[var4Lifetime4] = var6Lifetime3 + rb.b(-128, this.field_s[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.field_G[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(-16257, this.field_G[var4Lifetime4]);
        }
        if (var5Lifetime4 == 39) {
          this.field_G[var4Lifetime4] = var6Lifetime3 + rb.b(-128, this.field_G[var4Lifetime4]);
        }
        if (10 == var5Lifetime4) {
          this.field_B[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(-16257, this.field_B[var4Lifetime4]);
        }
        if (42 == var5Lifetime4) {
          this.field_B[var4Lifetime4] = rb.b(-128, this.field_B[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_K[var4Lifetime4] = rb.b(-16257, this.field_K[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_K[var4Lifetime4] = rb.b(this.field_K[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (64 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.field_F[var4Lifetime4] = rb.b(this.field_F[var4Lifetime4], -2);
          } else {
            this.field_F[var4Lifetime4] = md.a(this.field_F[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.field_F[var4Lifetime4] = md.a(this.field_F[var4Lifetime4], 2);
          } else {
            this.d(var4Lifetime4, param1 ^ -122);
            this.field_F[var4Lifetime4] = rb.b(this.field_F[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_cb[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(127, this.field_cb[var4Lifetime4]);
        }
        if (98 == var5Lifetime4) {
          this.field_cb[var4Lifetime4] = var6Lifetime3 + rb.b(this.field_cb[var4Lifetime4], 16256);
        }
        if (101 == var5Lifetime4) {
          this.field_cb[var4Lifetime4] = 16384 - (-rb.b(127, this.field_cb[var4Lifetime4]) - (var6Lifetime3 << 7));
        }
        if (100 == var5Lifetime4) {
          this.field_cb[var4Lifetime4] = rb.b(this.field_cb[var4Lifetime4], 16256) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.c(-50, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a((byte) -44, var4Lifetime4);
        }
        if (var5Lifetime4 == 123) {
          this.a(var4Lifetime4, 0);
        }
        if (6 == var5Lifetime4) {
          var7 = this.field_cb[var4Lifetime4];
          if (var7 == 16384) {
            this.field_p[var4Lifetime4] = rb.b(this.field_p[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_cb[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_p[var4Lifetime4] = rb.b(-128, this.field_p[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (16 == var5Lifetime4) {
          this.field_U[var4Lifetime4] = (var6Lifetime3 << 7) + rb.b(this.field_U[var4Lifetime4], -16257);
        }
        if (48 == var5Lifetime4) {
          this.field_U[var4Lifetime4] = rb.b(this.field_U[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, false);
            this.field_F[var4Lifetime4] = rb.b(this.field_F[var4Lifetime4], -5);
          } else {
            this.field_F[var4Lifetime4] = md.a(this.field_F[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.a((this.field_A[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), var4Lifetime4, param1 + 6901);
        }
        if (var5Lifetime4 == 49) {
          this.a(var6Lifetime3 + (this.field_A[var4Lifetime4] & -128), var4Lifetime4, 6779);
        }
    }

    final synchronized kd b() {
        return null;
    }

    final synchronized void a(int param0, byte param1) {
        this.field_w = param0;
        if (param1 > 0) {
          pr var4 = (pr) null;
          this.a(70, (pr) null, true);
        }
    }

    final void a(int param0, pr param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        try {
          var4_int = param1.field_C.field_n.length;
          var6 = 11 % ((-54 - param0) / 63);
          if (param2 &&
            param1.field_C.field_o) {
            var7 = var4_int + (var4_int - param1.field_C.field_m);
            var4_int = var4_int << 8;
            var5 = (int)((long)var7 * (long)this.field_U[param1.field_t] >> 6);
            if (var5 >= var4_int) {
              param1.field_o.a(true);
              var5 = var4_int + var4_int - (1 + var5);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_U[param1.field_t] >> 6);
          }
          param1.field_o.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("vk.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, int param1) {
        this.field_Z.e();
        this.field_C = null;
        if (param1 != -1) {
          pr var4 = (pr) null;
          this.a(88, (pr) null, true);
        }
        this.b(param0, 123);
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_Y[param1] = param2;
        if (param0 != 90) {
          this.b((byte) 60, 14, -98);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        var6 = Pool.field_O;
        if (this.field_Z.a()) {
          var2 = this.field_Z.field_f * this.field_N / bp.field_h;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_ab;
            if (0L <= this.field_D - var3) {
              this.field_ab = var3;
              break;
            }
            var5 = (int)((-this.field_ab + this.field_D + ((long)var2 - 1L)) / (long)var2);
            this.field_ab = this.field_ab + (long)var5 * (long)var2;
            this.field_u.a(var5);
            param0 = param0 - var5;
            this.d((byte) -89);
            if (!this.field_Z.a()) {
              break;
            }
          }
        }
        this.field_u.a(param0);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, pr param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        kp var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Pool.field_O;
        try {
          param4.field_D = bp.field_h / 100;
          if (param4.field_G >= 0 && (param4.field_o == null ||
            param4.field_o.i())) {
            param4.a(param3 ^ 3);
            param4.a((byte) -117);
            if (0 < param4.field_n &&
              param4 == this.field_R[param4.field_t][param4.field_n]) {
              this.field_R[param4.field_t][param4.field_n] = null;
              return true;
            }
            return true;
          }
          var6_int = param4.field_r;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_s[param4.field_t]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_r = var6_int;
          }
          param4.field_o.f(this.b(param3 ^ 0, param4));
          var7 = param4.field_x;
          param4.field_s = param4.field_s + var7.field_o;
          if (param3 != 1) {
            this.d(27);
          }
          param4.field_q = param4.field_q + 1;
          var8 = 0;
          var9 = (double)((param4.field_r * param4.field_v >> 12) + (-60 + param4.field_A << 8)) * 0.000005086263020833333;
          if (var7.field_e > 0) {
            if (var7.field_k <= 0) {
              param4.field_p = param4.field_p + 128;
            } else {
              param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_k));
            }
            if (param4.field_p * var7.field_e >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_a != null) {
            if (var7.field_j > 0) {
              param4.field_z = param4.field_z + (int)(0.5 + Math.pow(2.0, (double)var7.field_j * var9) * 128.0);
            } else {
              param4.field_z = param4.field_z + 128;
            }
            while (var7.field_a.length - 2 > param4.field_F) {
              if ((65280 & var7.field_a[param4.field_F + 2] << 8) < param4.field_z) {
                param4.field_F = param4.field_F + 2;
                continue;
              }
              break;
            }
            if (var7.field_a.length - 2 == param4.field_F &&
              var7.field_a[1 + param4.field_F] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_G >= 0 &&
            var7.field_l != null &&
            (this.field_F[param4.field_t] & 1) == 0 && (!(param4.field_n >= 0) ||
            param4 != this.field_R[param4.field_t][param4.field_n])) {
            if (var7.field_g > 0) {
              param4.field_G = param4.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
            } else {
              param4.field_G = param4.field_G + 128;
            }
            while (-2 + var7.field_l.length > param4.field_w) {
              if (((255 & var7.field_l[2 + param4.field_w]) << 8) < param4.field_G) {
                param4.field_w = param4.field_w + 2;
                continue;
              }
              break;
            }
            if (var7.field_l.length - 2 == param4.field_w) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_o.a(param4.field_D, this.a(true, param4), this.a((byte) 120, param4));
            return false;
          }
          param4.field_o.c(param4.field_D);
          if (param1 == null) {
            param4.field_o.a(param0);
          } else {
            param4.field_o.a(param1, param2, param0);
          }
          if (param4.field_o.g()) {
            this.field_u.field_p.b(param4.field_o);
          }
          param4.a(2);
          if (param4.field_G >= 0) {
            param4.a((byte) -117);
            if (0 < param4.field_n &&
              this.field_R[param4.field_t][param4.field_n] == param4) {
              this.field_R[param4.field_t][param4.field_n] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("vk.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    public vk() {
        this.field_G = new int[16];
        this.field_s = new int[16];
        this.field_r = new int[16];
        this.field_v = new int[16];
        this.field_T = new int[16];
        this.field_cb = new int[16];
        this.field_B = new int[16];
        this.field_F = new int[16];
        this.field_q = new int[16];
        this.field_w = 256;
        this.field_U = new int[16];
        this.field_p = new int[16];
        this.field_Y = new int[16];
        this.field_R = new pr[16][128];
        this.field_K = new int[16];
        this.field_J = new int[16];
        this.field_N = 1000000;
        this.field_L = new int[16];
        this.field_I = new pr[16][128];
        this.field_A = new int[16];
        this.field_Z = new gq();
        this.field_u = new ib(this);
        this.field_z = new bm(128);
        this.a((byte) -127, -1, 256);
        this.b(true, 123);
    }

    static {
        field_O = "Enter name of friend to delete from list";
        field_db = new tf(0);
        field_P = "Private";
        field_V = new nl();
        field_x = "Join";
    }
}
