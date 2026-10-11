/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends k {
    static du field_l;
    static int[] field_k;

    final void a(byte param0, lu param1, int param2) {
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            stackIn_5_1 = (param1.b(16711935) == 1);
            this.field_f = stackIn_5_1;
          }
          if (param0 != -71) {
            this.a(-28, -75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("jq.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
          if (jv.field_j == 11) {
            dja.b(false);
          }
          nl.a(qd.field_q, mp.field_p, wk.field_b, -36);
          if (param1 > -122) {
            field_k = (int[]) null;
          }
          av.a(0, -77, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int var7 = 0;
        int[] var3;
        int var8;
        int var9;
        int[] var13;
        int[] var14;
        int[] var15;
        var9 = BachelorFridge.field_y;
        var3 = this.field_j.a(param0, -1);
        if (this.field_j.field_m) {
          var15 = this.a(0, param0, (byte) 116);
          var14 = this.a(1, param0, (byte) 115);
          var13 = this.a(2, param0, (byte) 118);
          for (var7 = 0; var7 < hh.field_d; var7++) {
            var8 = var13[var7];
            if (var8 == 4096) {
              var3[var7] = var15[var7];
            } else {
              if (0 != var8) {
                var3[var7] = var8 * var15[var7] + var14[var7] * (-var8 + 4096) >> 12;
              } else {
                var3[var7] = var14[var7];
              }
            }
          }
        }
        if (param1 != 0) {
          field_l = (du) null;
        }
        return var3;
    }

    final int[][] a(boolean param0, int param1) {
        int var16 = 0;
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var17;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int var18;
        int[] var56Lifetime1;
        var19 = BachelorFridge.field_y;
        var31 = this.field_h.a(param1, -858);
        var21 = var31;
        var20 = var21;
        var3 = var20;
        if (this.field_h.field_b) {
          var52 = this.a(2, param1, (byte) 114);
          var50 = this.a((byte) -112, 0, param1);
          var51 = this.a((byte) -98, 1, param1);
          var7 = var31[0];
          var8 = var31[1];
          var9 = var31[2];
          var53 = var50[0];
          var54 = var50[1];
          var55 = var50[2];
          var56 = var51[0];
          var57 = var51[1];
          var58 = var51[2];
          for (var16 = 0; hh.field_d > var16; var16++) {
            var17 = var52[var16];
            if (4096 != var17) {
              var56Lifetime1 = var51[0];
              if (var17 == 0) {
                var56Lifetime1 = var51[0];
                var7[var16] = var56Lifetime1[var16];
                var8[var16] = var57[var16];
                var9[var16] = var58[var16];
              } else {
                var18 = -var17 + 4096;
                var7[var16] = var53[var16] * var17 + var18 * var56Lifetime1[var16] >> 12;
                var8[var16] = var57[var16] * var18 + var17 * var54[var16] >> 12;
                var9[var16] = var58[var16] * var18 + var55[var16] * var17 >> 12;
              }
            } else {
              var7[var16] = var53[var16];
              var8[var16] = var54[var16];
              var9[var16] = var55[var16];
            }
          }
        }
        if (param0) {
          field_k = (int[]) null;
        }
        return var3;
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_k = (int[]) null;
        }
        field_k = null;
        field_l = null;
    }

    final static rga a(byte param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        rga var7 = null;
        int var8 = 0;
        rga stackIn_4_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_10_0 = null;
        rga stackIn_18_0 = null;
        rga stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = uc.field_j;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = rm.field_c;
            return stackIn_7_0;
          }
          var3 = fda.a(-1, '.', param1);
          if (var3.length < 2) {
            stackIn_10_0 = uc.field_j;
            return stackIn_10_0;
          }
          var4 = var3;
          if (param0 < 19) {
            field_k = (int[]) null;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ol.a(var6, 5431);
            if (var7 != null) {
              stackIn_18_0 = var7;
              return stackIn_18_0;
            }
          }
          stackIn_21_0 = lia.a(-58, var3[var3.length - 1]);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("jq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public jq() {
        super(3, false);
    }

    static {
        field_l = new du(14, 0, 4, 1);
    }
}
