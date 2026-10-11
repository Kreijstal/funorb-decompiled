/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends gk {
    private double field_J;
    static int field_z;
    static int[] field_C;
    private double field_G;
    private double field_E;
    static String field_D;
    private dc field_H;
    static bi field_F;
    static int field_I;
    private boolean field_B;

    final static nf[] a(mi param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nf[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            field_C = (int[]) null;
          }
          var4_int = param0.a(-26, param3);
          var5 = param0.a(var4_int, param1, -94);
          stackIn_3_0 = hf.a(param0, var4_int, (byte) -127, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nm.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    nm(pm param0, bi param1, dc param2, int param3) {
        super(param0, param1);
        try {
          this.field_n.e(param1.field_o.length * param3 >> 8);
          this.field_w = 0.2;
          this.field_H = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = tf.field_p;
        synchronized (var1_ref) {
          if (ic.field_b == lh.field_b) {
            return false;
          }
          gk.field_r = ke.field_P[ic.field_b];
          if (param0 != -96) {
            field_z = -30;
          }
          ad.field_h = mk.field_n[ic.field_b];
          ic.field_b = 127 & 1 + ic.field_b;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    public static void h(int param0) {
        if (param0 != 3981) {
          String var2 = (String) null;
          nm.a((mi) null, (String) null, -1, (String) null);
        }
        field_D = null;
        field_F = null;
        field_C = null;
    }

    final void b(int param0) {
        if (!this.field_t.field_z) {
          this.e(param0 + 31537);
          if (param0 != -25071) {
            nm.e((byte) -32);
          }
          return;
        }
        if (!this.field_H.c((byte) 105)) {
          this.f(128);
          return;
        }
        this.e(param0 + 31537);
        if (param0 != -25071) {
          nm.e((byte) -32);
        }
    }

    final void e(int param0) {
        double stackIn_8_0 = 0.0;
        int stackIn_12_0 = 0;
        double stackIn_19_0 = 0.0;
        double stackIn_19_1 = 0.0;
        double stackIn_20_2 = 0.0;
        vc stackIn_34_0 = null;
        int stackIn_35_1 = 0;
        double var3;
        double var5;
        double var7;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        double var19;
        int var21;
        double var23;
        double var25;
        double var27;
        int var29;
        double var30;
        double var32;
        double var34;
        double var36;
        double var38;
        double var40;
        double var42;
        double var44;
        dj var46;
        double[] var50;
        double var11Lifetime1;
        double var13Lifetime1;
        double var15Lifetime1;
        double var17Lifetime1;
        if (!this.field_H.c((byte) 105)) {
          this.field_B = false;
          this.field_n.h(0);
          this.field_n.d(0);
          return;
        }
        var46 = this.field_t.field_A.field_B;
        var3 = var46.field_E - this.field_H.field_cb;
        var5 = var46.field_t - this.field_H.field_L;
        var7 = var46.field_D - this.field_H.field_X;
        var9 = var7 * this.field_H.field_K + (var3 * this.field_H.field_x + var5 * this.field_H.field_P);
        var11 = var3;
        var13 = var5;
        var15 = var7;
        if (var9 >= 0.0) {
          if (this.field_H.field_y <= var9) {
            stackIn_8_0 = this.field_H.field_y;
          } else {
            stackIn_8_0 = var9;
          }
          var17 = stackIn_8_0;
          var15 = var15 - var17 * this.field_H.field_K;
          var13 = var13 - this.field_H.field_P * var17;
          var11 = var11 - var17 * this.field_H.field_x;
        }
        var17Lifetime1 = var11 * var11 + var13 * var13 + var15 * var15;
        var19 = 2.0 * this.field_w;
        if (!(var17Lifetime1 <= var19 * var19)) {
          stackIn_12_0 = (int)(0.5 + var19 * (double)this.field_m / Math.sqrt(var17Lifetime1));
        } else {
          stackIn_12_0 = this.field_m;
        }
        var21 = stackIn_12_0;
        if (param0 != 6466) {
          field_C = (int[]) null;
        }
        if (var21 > 256) {
          var21 = 256;
        }
        var50 = new double[12];
        var46.field_jb.a((byte) 85, var50);
        var23 = var50[3];
        var25 = var50[4];
        var27 = var50[5];
        stackIn_19_0 = 128.5;
        stackIn_19_1 = 128.0 * (var13 * var25 + var11 * var23 + var27 * var15);
        if (var17Lifetime1 <= var19 * var19) {
          stackIn_20_2 = var19;
        } else {
          stackIn_20_2 = Math.sqrt(var17Lifetime1);
        }
        var29 = (int)(stackIn_19_0 - stackIn_19_1 / stackIn_20_2);
        this.field_n.b(16384 + eg.field_i * var21 * fa.field_S >> 15, var29);
        var11Lifetime1 = -(var9 * this.field_H.field_x) + var3;
        var15Lifetime1 = -(this.field_H.field_K * var9) + var7;
        var13Lifetime1 = -(var9 * this.field_H.field_P) + var5;
        var30 = var46.field_K;
        var32 = var46.field_G;
        var34 = var46.field_L;
        if (this.field_B) {
          var32 = var32 + (-var13Lifetime1 + this.field_J);
          var30 = var30 + (this.field_G - var11Lifetime1);
          var34 = var34 + (-var15Lifetime1 + this.field_E);
        }
        this.field_G = var11Lifetime1;
        this.field_J = var13Lifetime1;
        this.field_E = var15Lifetime1;
        this.field_B = true;
        if (0.01 <= var17Lifetime1) {
          var17Lifetime1 = 1.0 / Math.sqrt(var17Lifetime1);
          var15Lifetime1 = var15Lifetime1 * var17Lifetime1;
          var13Lifetime1 = var13Lifetime1 * var17Lifetime1;
          var11Lifetime1 = var11Lifetime1 * var17Lifetime1;
        }
        var36 = -(var13Lifetime1 * var32) - var11Lifetime1 * var30 - var34 * var15Lifetime1 + 2.0;
        if (var36 < 0.01) {
          this.field_n.d(0);
          return;
        }
        var38 = -(var13Lifetime1 * var46.field_G) - var11Lifetime1 * var46.field_K - var15Lifetime1 * var46.field_L + 2.0;
        if (var38 < 0.01) {
          this.field_n.d(0);
          return;
        }
        var40 = (double)(this.field_s.field_n * 256) / (double)dk.field_k;
        var42 = var40 * 2.0 / var36;
        var44 = var38 * var42 / 2.0;
        stackIn_34_0 = this.field_n;
        if (!(1600.0 <= var44)) {
          stackIn_35_1 = (int)(var44 + 0.5);
        } else {
          stackIn_35_1 = 1600;
        }
        ((vc) (Object) stackIn_34_0).d(stackIn_35_1);
        if (this.field_x) {
          cb.field_a.a(this.field_n);
          this.field_x = false;
        }
        return;
    }

    final static boolean a(String param0, byte param1, String param2) {
        int var3_int = 0;
        String var4 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -74 % ((param1 - 19) / 41);
          var4 = pn.a(-1, param0);
          if (-1 != param2.indexOf(param0)) {
            return true;
          }
          if (param2.indexOf(var4) != -1) {
            return true;
          }
          stackIn_12_0 = (param2.startsWith(param0)) || (param2.startsWith(var4)) || (param2.endsWith(param0)) || (param2.endsWith(var4));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("nm.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_C = new int[8192];
        field_I = -1;
        field_D = "Username: ";
    }
}
