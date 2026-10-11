/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tm {
    static vh field_d;
    eg[] field_a;
    static int field_f;
    boolean field_g;
    nc[] field_j;
    dd[] field_e;
    private int[][] field_k;
    static ko field_i;
    static ea field_b;
    static cd field_h;
    static int[] field_c;

    void a(int[] param0, int[] param1, int param2, int param3) {
        try {
          this.field_j[param2].b(param1, param0);
          if (param3 != -3637) {
            this.a(-49, false);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tm.DA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    String a(int param0, byte param1) {
        if (param1 <= 108) {
          return (String) null;
        }
        return this.a((byte) 102, param0);
    }

    abstract int a(int param0, boolean param1);

    void a(int param0, int param1, int[] param2, int[] param3, boolean param4) {
        if (param0 != -1912602369) {
          return;
        }
        try {
          this.a(param4, param2, param1, param3, -20263);
          this.field_j[param1].b(param3, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tm.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        this.field_k = new int[16][];
        if (param0 > -124) {
          this.field_j = (nc[]) null;
        }
        for (var2 = 0; var2 < this.field_k.length; var2++) {
          this.field_k[var2] = ta.a(new int[]{0, 0, 128, this.a(var2, true)}, -119);
        }
    }

    final static hj a(int param0, int param1) {
        hj[] var2;
        int var3;
        int var4;
        int var5;
        hj[] var6;
        var5 = Pool.field_O;
        var6 = lm.a((byte) -32);
        var2 = var6;
        var3 = 0;
        var4 = -81 / ((param1 + 69) / 37);
        while (var3 < var6.length) {
          if (var6[var3].field_i == param0) {
            return var6[var3];
          }
          var3++;
        }
        return null;
    }

    final void a(boolean param0, int[] param1, int param2, int[] param3, int param4) {
        int var13 = 0;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        try {
          if (no.field_n[param2] <= 0) {
            return;
          }
          var8 = -param3[2] + param1[2];
          var6_int = param1[0] - param3[0];
          var7 = param1[1] - param3[1];
          var10 = param3[8] * var8 + (param3[7] * var7 + var6_int * param3[6]) >> 3;
          var9 = param3[4] * var7 + (param3[3] * var6_int + var8 * param3[5]) >> 3;
          if (param4 != -20263) {
            this.field_a = (eg[]) null;
          }
          var8 = var8 * param3[11] + param3[9] * var6_int + var7 * param3[10] >> 16;
          if (var8 <= 0) {
            return;
          }
          var7Lifetime1 = (qh.field_c + fb.field_d << 4) + var10 / var8;
          var6_intLifetime1 = (qh.field_b + fb.field_q << 4) + var9 / var8;
          var11 = 32 + 589824 / var8;
          if (!param0) {
            stackIn_10_0 = ff.field_h;
          } else {
            stackIn_10_0 = ff.field_i;
          }
          var15 = stackIn_10_0;
          var14 = var15;
          var12 = var14;
          for (var13 = 0; var13 < var15.length; var13++) {
            ff.field_a[var13] = md.a(md.a(rb.b(no.field_n[param2] * rb.b(var15[var13], 65280) >>> 8, 973143808), rb.b(-16776974, rb.b(16711680, var15[var13]) * no.field_n[param2]) >>> 8), rb.b(-1912602369, no.field_n[param2] * rb.b(255, var15[var13]) >>> 8));
          }
          if (2147483647L > 64L * ((long)var11 * (long)var11)) {
            qh.a(var6_intLifetime1, var7Lifetime1, var11, 64, ff.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("tm.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    final eg g(int param0) {
        int var6 = 0;
        int var15 = 0;
        int var3;
        int var4;
        int var5;
        double var7;
        double var9;
        double var11;
        double var13;
        double var16;
        double var18;
        double var20;
        double var22;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        eg var29;
        var28 = Pool.field_O;
        var29 = new eg((3 + ne.field_v) * (hr.field_b + 1), 2 * (hr.field_b * ne.field_v), ne.field_v);
        if (param0 != -930305852) {
          field_h = (cd) null;
        }
        var3 = var29.a(-383, -383, 384);
        var4 = var29.a(384, -383, 384);
        var5 = var29.a(-383, 384, 384);
        var29.a((short)var3, (short)var4, (short)var5);
        for (var6 = 0; var6 < hr.field_b; var6++) {
          var7 = Math.cos((double)var6 * 3.141592653589793 / (double)hr.field_b) * 8.0;
          var9 = 8.0 * Math.sin(3.141592653589793 * (double)var6 / (double)hr.field_b);
          var11 = 8.0 * Math.cos((double)(1 + var6) * 3.141592653589793 / (double)hr.field_b);
          var13 = Math.sin((double)(var6 + 1) * 3.141592653589793 / (double)hr.field_b) * 8.0;
          for (var15 = 0; var15 < ne.field_v; var15++) {
            var16 = Math.cos(3.141592653589793 * (double)(2 * var15) / (double)ne.field_v);
            var18 = Math.sin(3.141592653589793 * (double)(var15 * 2) / (double)ne.field_v);
            var20 = Math.cos(3.141592653589793 * (double)(2 + var15 * 2) / (double)ne.field_v);
            var22 = Math.sin((double)(2 * (var15 + 1)) * 3.141592653589793 / (double)ne.field_v);
            var24 = var29.a(cr.a(4885, var16 * var9), cr.a(4885, var9 * var18), cr.a(4885, var7));
            var25 = var29.a(cr.a(4885, var20 * var9), cr.a(param0 + 930310737, var9 * var22), cr.a(param0 ^ -930300975, var7));
            var26 = var29.a(cr.a(4885, var13 * var16), cr.a(4885, var13 * var18), cr.a(4885, var11));
            var27 = var29.a(cr.a(4885, var20 * var13), cr.a(4885, var13 * var22), cr.a(4885, var11));
            if (var24 != var25) {
              var29.a(var24, var26, var25, (byte) 0, (short) 96, this.a(true));
            }
            if (var26 != var27) {
              var29.a(var27, var25, var26, (byte) 0, (short) 96, this.a(true));
            }
          }
        }
        var29.e();
        return var29;
    }

    final void a(int param0) {
        if (this.field_a != null) {
          this.field_j = new nc[this.field_a.length];
        }
        if (param0 != 7096) {
          this.field_k = (int[][]) null;
        }
        this.f(-128);
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != -22799) {
          field_i = (ko) null;
        }
        field_i = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    int b(int param0) {
        if (param0 != 384) {
          this.field_g = true;
        }
        return this.field_j.length;
    }

    void a(int param0, di param1) {
        try {
          if (param0 != 198123656) {
            this.h(32);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int[] b(int param0, int param1) {
        if (param1 != 0) {
          return (int[]) null;
        }
        return this.field_k[param0];
    }

    void a(di param0, byte param1) {
        try {
          if (param1 != 117) {
            this.b(-29, 80);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(int param0, sq param1, byte param2) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -111) {
            this.field_k = (int[][]) null;
          }
          if (param1 instanceof fj) {
            stackIn_4_0 = or.field_k[param0];
            return stackIn_4_0;
          }
          if (this.c(2)) {
            stackIn_7_0 = ho.field_u[param0];
            return stackIn_7_0;
          }
          if (0 != param0 &&
            param0 != 8) {
            stackIn_14_0 = this.a((byte) 33, param0 >> 3 & 1);
            return stackIn_14_0;
          }
          stackIn_12_0 = ho.field_u[param0];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("tm.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    void h(int param0) {
        int var2 = -55 % ((29 - param0) / 44);
    }

    abstract String a(byte param0, int param1);

    void a(boolean param0, int[] param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0) {
            this.field_a = (eg[]) null;
          }
          if (!this.field_g) {
            this.field_j[param2] = (nc) (kh.field_gc.b(param1, this.field_a[param2], -25431));
          } else {
            this.field_j[param2] = (nc) (kh.field_gc.a(param1, (byte) 103, this.field_a[param2]));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("tm.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final void e(int param0) {
        if (param0 != -26707) {
          int[] var3 = (int[]) null;
          this.a(true, (int[]) null, 13, (int[]) null, -85);
        }
    }

    abstract boolean c(int param0);

    private final byte a(boolean param0) {
        if (!param0) {
          return (byte) -68;
        }
        return (byte) 0;
    }

    void a(int param0, al param1) {
        try {
          if (param0 != 2147483647) {
            this.field_j = (nc[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tm.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    tm() {
        this.field_g = true;
    }

    static {
        field_i = new ko();
        field_b = null;
        field_h = new cd();
    }
}
