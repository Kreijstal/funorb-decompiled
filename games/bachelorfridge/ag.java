/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends k {
    private int field_l;
    private int field_m;
    static String field_k;

    final int[][] a(boolean param0, int param1) {
        int var13 = 0;
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        var16 = BachelorFridge.field_y;
        if (param0) {
          this.field_l = -114;
        }
        var19 = this.field_h.a(param1, -858);
        var18 = var19;
        var17 = var18;
        var3 = var17;
        if (this.field_h.field_b) {
          var5 = hh.field_d / this.field_l;
          var6 = bi.field_g / this.field_m;
          if (var6 > 0) {
            var7_int = param1 % var6;
            var4 = this.a((byte) -77, 0, var7_int * bi.field_g / var6);
          } else {
            var4 = this.a((byte) -78, 0, 0);
          }
          var7 = var4[0];
          var8 = var4[1];
          var9 = var4[2];
          var10 = var19[0];
          var11 = var19[1];
          var12 = var19[2];
          for (var13 = 0; var13 < hh.field_d; var13++) {
            if (var5 <= 0) {
              var14 = 0;
            } else {
              var15 = var13 % var5;
              var14 = var15 * hh.field_d / var5;
            }
            var10[var13] = var7[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }
        return var17;
    }

    final static long e(int param0) {
        if (param0 != -9109) {
          jfa var2 = (jfa) null;
          ag.a((jfa) null, (byte) 80);
        }
        return -pk.field_c + f.b((byte) 73);
    }

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int var11;
        int var7Lifetime1;
        var9 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.a(122, 93);
        }
        var10 = this.field_j.a(param0, param1 - 1);
        var3 = var10;
        if (this.field_j.field_m) {
          var5 = hh.field_d / this.field_l;
          var6 = bi.field_g / this.field_m;
          if (var6 > 0) {
            var7 = param0 % var6;
            var4 = this.a(0, var7 * bi.field_g / var6, (byte) 110);
          } else {
            var4 = this.a(0, 0, (byte) 116);
          }
          var11 = 0;
          var7Lifetime1 = var11;
          while (var11 < hh.field_d) {
            if (0 >= var5) {
              var10[var11] = var4[0];
            } else {
              var8 = var11 % var5;
              var10[var11] = var4[var8 * hh.field_d / var5];
            }
            var11++;
          }
        }
        return var10;
    }

    public ag() {
        super(1, false);
        this.field_l = 4;
        this.field_m = 4;
    }

    final static void a(jfa param0, byte param1) {
        int var2_int = 0;
        if (bp.e(param1 ^ 29881)) {
          return;
        }
        try {
          sja.field_fb.c(92, (byte) 111);
          sja.field_fb.field_g = sja.field_fb.field_g + 2;
          if (param1 != -104) {
            field_k = (String) null;
          }
          var2_int = sja.field_fb.field_g;
          rha.a(param0.field_g, sja.field_fb, (byte) -107);
          sja.field_fb.a((byte) -88, sja.field_fb.field_g - var2_int);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ag.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        int var1 = -112 / ((39 - param0) / 53);
        field_k = null;
    }

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        try {
          ur.field_e[pe.field_m] = (oha) ((Object) new t(param17, param1, param4, param12, param14, param11, param0, param7, param10, param3, param2, param16, param18, param5, param13, param15, param6, param8, param9));
          pe.field_m = pe.field_m + 1;
          if (param19 != -4313) {
            field_k = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ag.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            this.a(true, -64);
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_m = param1.b(param0 ^ -16711866);
            }
          } else {
            this.field_l = param1.b(16711935);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ag.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = "Please select options in the following rows:  ";
    }
}
