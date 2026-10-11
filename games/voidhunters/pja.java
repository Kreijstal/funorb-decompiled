/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pja extends le {
    static slb field_l;
    static String field_o;
    int field_p;
    int[] field_k;
    static int[] field_n;
    private int field_m;
    int field_j;
    static String field_i;

    final static void e(int param0) {
        if (bm.field_o == null) {
          return;
        }
        if (param0 <= -42) {
          if (psb.field_b != null) {
            spb.a((byte) -95);
            ip.field_p.height = eta.field_a.height;
            ip.field_p.width = eta.field_a.width;
          }
          return;
        }
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 >= -60) {
            this.field_m = 105;
          }
          if (0 == param0) {
            this.field_m = param2.e(1869);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pja.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
          field_o = (String) null;
          return this.field_m;
        }
        return this.field_m;
    }

    final void c(int param0) {
        super.c(-75);
        if (param0 >= -23) {
          this.a(52);
          this.field_k = null;
          return;
        }
        this.field_k = null;
    }

    public pja() {
        super(0, false);
        this.field_m = -1;
    }

    final static int b(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3 = (int)(-kba.field_a.field_c + (float)param1);
        int var4 = (int)((float)param2 - kba.field_a.field_b);
        if (param0 > 83) {
          var5 = (int)(640.0 / (double)kba.field_a.field_a);
          var6 = qua.a(var5, (byte) 119, var4, var3);
          var7 = 33554432 / var6;
          if (var7 > 128) {
            var7 = 128;
          }
          return var7;
        }
        return 77;
    }

    public static void d(int param0) {
        field_o = null;
        if (param0 != -1) {
          return;
        }
        field_n = null;
        field_l = null;
        field_i = null;
    }

    final boolean f(int param0) {
        if (null != this.field_k) {
          return true;
        }
        if (this.field_m < param0) {
          return false;
        }
        ima var2 = dbb.field_o < 0 ? ima.a(qnb.field_o, this.field_m) : ima.a(qnb.field_o, dbb.field_o, this.field_m);
        var2.d();
        this.field_k = var2.b();
        this.field_p = var2.field_e;
        this.field_j = var2.field_f;
        return true;
    }

    int[][] a(int param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int[][] var3Lifetime1;
        int[] var4Lifetime1;
        int[] var5Lifetime1;
        int[] var6Lifetime1;
        int[][] var12Lifetime1;
        int[][] var13Lifetime1;
        int[][] var14Lifetime1;
        var11 = VoidHunters.field_G;
        if (param0 != 255) {
          this.a(53);
          var14 = this.field_d.a(param1, (byte) -110);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!this.field_d.field_g) {
            return var3;
          }
          if (!this.f(0)) {
            return var3;
          }
          var4 = var14[0];
          var5 = var14[1];
          var6 = var14[2];
          stackIn_9_0 = this.field_j;
          if (noa.field_o != this.field_p) {
            stackIn_10_1 = param1 * this.field_p / noa.field_o;
          } else {
            stackIn_10_1 = param1;
          }
          var7 = stackIn_9_0 * stackIn_10_1;
          if (this.field_j != hob.field_d) {
            for (var8 = 0; hob.field_d > var8; var8++) {
              var9 = this.field_j * var8 / hob.field_d;
              var10 = this.field_k[var9 + var7];
              var6[var8] = dla.a(var10, 255) << 4;
              var5[var8] = dla.a(4080, var10 >> 4);
              var4[var8] = dla.a(var10 >> 12, 4080);
            }
          } else {
            for (var8 = 0; hob.field_d > var8; var8++) {
              incrementValue$2 = var7;
              var7++;
              var9 = this.field_k[incrementValue$2];
              var6[var8] = dla.a(255, var9) << 4;
              var5[var8] = dla.a(4080, var9 >> 4);
              var4[var8] = dla.a(4080, var9 >> 12);
            }
          }
          return var3;
        }
        var14Lifetime1 = this.field_d.a(param1, (byte) -110);
        var13Lifetime1 = var14Lifetime1;
        var12Lifetime1 = var13Lifetime1;
        var3Lifetime1 = var12Lifetime1;
        if (!this.field_d.field_g) {
          return var3Lifetime1;
        }
        if (!this.f(0)) {
          return var3Lifetime1;
        }
        var4Lifetime1 = var14Lifetime1[0];
        var5Lifetime1 = var14Lifetime1[1];
        var6Lifetime1 = var14Lifetime1[2];
        stackIn_26_0 = this.field_j;
        if (noa.field_o != this.field_p) {
          stackIn_27_1 = param1 * this.field_p / noa.field_o;
        } else {
          stackIn_27_1 = param1;
        }
        var7Lifetime1 = stackIn_26_0 * stackIn_27_1;
        if (this.field_j != hob.field_d) {
          for (var8Lifetime1 = 0; hob.field_d > var8Lifetime1; var8Lifetime1++) {
            var9Lifetime1 = this.field_j * var8Lifetime1 / hob.field_d;
            var10Lifetime1 = this.field_k[var9Lifetime1 + var7Lifetime1];
            var6Lifetime1[var8Lifetime1] = dla.a(var10Lifetime1, 255) << 4;
            var5Lifetime1[var8Lifetime1] = dla.a(4080, var10Lifetime1 >> 4);
            var4Lifetime1[var8Lifetime1] = dla.a(var10Lifetime1 >> 12, 4080);
          }
        } else {
          for (var8Lifetime1 = 0; hob.field_d > var8Lifetime1; var8Lifetime1++) {
            incrementValue$1 = var7Lifetime1;
            var7Lifetime1++;
            var9Lifetime1 = this.field_k[incrementValue$1];
            var6Lifetime1[var8Lifetime1] = dla.a(255, var9Lifetime1) << 4;
            var5Lifetime1[var8Lifetime1] = dla.a(4080, var9Lifetime1 >> 4);
            var4Lifetime1[var8Lifetime1] = dla.a(4080, var9Lifetime1 >> 12);
          }
        }
        return var3Lifetime1;
    }

    static {
        field_n = new int[8192];
        field_l = new slb();
        field_i = "Left click to fire/recall the grapple";
    }
}
