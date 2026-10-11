/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends kb {
    private long field_k;
    static String field_u;
    private long[] field_o;
    static String[] field_n;
    private long field_m;
    private long field_p;
    static dd field_r;
    static String field_q;
    private int field_l;
    private int field_j;
    static vh field_t;
    static boolean field_s;

    final static boolean b(int param0) {
        int var1 = 10 % ((param0 + 65) / 42);
        return gk.field_kb;
    }

    final int b(long param0, byte param1) {
        int var4;
        int var5;
        int var6;
        var6 = Pool.field_O;
        var4 = 53 % ((param1 - 46) / 44);
        if (this.field_p > this.field_m) {
          this.field_k = this.field_k + (-this.field_m + this.field_p);
          this.field_m = this.field_m + (this.field_p - this.field_m);
          this.field_p = this.field_p + param0;
          return 1;
        }
        var5 = 0;
        do {
          var5++;
          this.field_p = this.field_p + param0;
        } while (var5 < 10 &&
          this.field_m > this.field_p);
        if (this.field_p < this.field_m) {
          this.field_p = this.field_m;
        }
        return var5;
    }

    final static qp a(vh param0, vh param1, sf param2, vh param3, byte param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        qp stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        qp[] var11 = null;
        int var12 = 0;
        sf var13_ref_sf = null;
        int var13 = 0;
        int var15 = 0;
        ap var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = Pool.field_O;
        try {
          if (param2 == null) {
            return null;
          }
          if (null != param2.field_F) {
            stackIn_7_0 = param2.field_F.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null == param2.field_D) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param2.field_D.length;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new qp[var7];
          if (null != param2.field_F) {
            for (var12 = 0; param2.field_F.length > var12; var12++) {
              var13_ref_sf = jp.field_N.a((byte) -55, param2.field_F[var12]);
              var8[var12] = var13_ref_sf.field_G;
              var9[var12] = param2.field_w[var12];
              var11[var12] = hk.a(param0, param1, var13_ref_sf, param3, (byte) 125);
            }
          }
          if (null != param2.field_D) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param2.field_D.length; var14++) {
              var15 = param2.field_D[var14];
              if (var15 != -1) {
                var16 = o.field_x.a(127, var15);
                var8[var12Lifetime1 + var14] = var16.e(0);
                var9[var12Lifetime1 + var14] = param2.field_A[var14];
                if (var9[var14 + var12Lifetime1] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var12Lifetime1 + var14] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param2.field_D[var14];
              } else {
                var8[var12Lifetime1 + var14] = w.field_m;
                var9[var14 + var12Lifetime1] = param2.field_A[var14];
                var10[var12Lifetime1 + var14] = param2.field_D[var14];
              }
            }
          }
          if (param4 <= 73) {
            hk.c((byte) -82);
          }
          stackIn_30_0 = new qp(0L, param0, param3, param1, var11, var20, var8, var21);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("hk.K(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(')').toString());
        }
    }

    final long a(int param0) {
        this.field_m = this.field_m + this.a(false);
        if (this.field_m < this.field_p) {
          return (this.field_p - this.field_m) / 1000000L;
        }
        if (param0 != 31) {
          hk.d(-46);
        }
        return 0L;
    }

    public static void c(byte param0) {
        field_n = null;
        field_u = null;
        field_q = null;
        field_r = null;
        if (param0 != 122) {
          hk.c(-66);
        }
        field_t = null;
    }

    final void b(byte param0) {
        this.field_k = 0L;
        if (this.field_p > this.field_m) {
          this.field_m = this.field_m + (this.field_p - this.field_m);
        }
        if (param0 != 26) {
          vh var3 = (vh) null;
          hk.a((vh) null, (vh) null, (sf) null, (vh) null, (byte) 20);
        }
    }

    final static java.applet.Applet d(int param0) {
        if (param0 < 54) {
          return (java.applet.Applet) null;
        }
        if (oc.field_t != null) {
          return oc.field_t;
        }
        return (java.applet.Applet) ((Object) ni.field_ib);
    }

    final static void c(int param0) {
        int var1 = ml.b(27);
        if (param0 != 1527590113) {
          return;
        }
        int var2 = ok.k((byte) 59);
        db.field_Vb.a((kp.field_d << 1) + var1, ba.field_wb - qe.field_o, -6316, kk.field_z - kp.field_d, (qe.field_o << 1) + var2);
        jj.h(-9395);
    }

    final static g a(di param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        g stackIn_2_0 = null;
        g stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.b(param2, -31413);
          var3 = var4;
          if (param1 < 85) {
            stackIn_2_0 = (g) null;
            return stackIn_2_0;
          }
          if (var4 == null) {
            return null;
          }
          stackIn_7_0 = new g(var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hk.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var8Lifetime1;
        if (param0 < 44) {
          hk.c((byte) -91);
        }
        int var7 = -512;
        int var9 = 320;
        if (param2 * var7 + param5 * var9 < 0 &&
          var7 * param1 + param4 * var9 < 0) {
          return true;
        }
        var7Lifetime1 = 512;
        var9Lifetime1 = 320;
        if (param5 * var9Lifetime1 + param2 * var7Lifetime1 < 0 &&
          param4 * var9Lifetime1 + param1 * var7Lifetime1 < 0) {
          return true;
        }
        int var8 = -512;
        var9Lifetime2 = 240;
        if (var8 * param6 + var9Lifetime2 * param5 < 0 &&
          var8 * param3 + param4 * var9Lifetime2 < 0) {
          return true;
        }
        var8Lifetime1 = 512;
        var9Lifetime3 = 240;
        if (param5 * var9Lifetime3 + var8Lifetime1 * param6 < 0 &&
          0 > var9Lifetime3 * param4 + var8Lifetime1 * param3) {
          return true;
        }
        return false;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Pool.field_O;
        long var2 = System.nanoTime();
        long var4 = -this.field_k + var2;
        this.field_k = var2;
        if (-5000000000L < var4 &&
          5000000000L > var4) {
          this.field_o[this.field_j] = var4;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
          this.field_j = (this.field_j + 1) % 10;
        }
        long var6 = 0L;
        if (param0) {
          hk.b(85);
        }
        for (var8 = 1; this.field_l >= var8; var8++) {
          var6 = var6 + this.field_o[(10 + this.field_j - var8) % 10];
        }
        return var6 / (long)this.field_l;
    }

    hk() {
        this.field_o = new long[10];
        this.field_p = 0L;
        this.field_l = 1;
        this.field_j = 0;
        this.field_k = 0L;
        this.field_m = 0L;
        this.field_m = System.nanoTime();
        this.field_p = System.nanoTime();
    }

    static {
        field_u = "Solicitation";
        field_q = "You now have <%0> lives";
        field_r = new dd(360, 240);
    }
}
