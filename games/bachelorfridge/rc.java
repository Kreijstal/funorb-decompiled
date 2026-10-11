/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends k {
    static String field_k;
    static kv field_l;

    final int[] a(int param0, int param1) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int[] var7 = this.field_j.a(param0, -1);
        int[] var3 = var7;
        if (!this.field_j.field_m) {
          if (param1 == 0) {
            return var3;
          }
          return (int[]) null;
        }
        int[] var4 = this.a(0, param0, (byte) 120);
        for (var5 = 0; hh.field_d > var5; var5++) {
          var7[var5] = 4096 - var4[var5];
        }
        if (param1 == 0) {
          return var3;
        }
        return (int[]) null;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != -2) {
          return;
        }
        field_k = null;
    }

    public rc() {
        super(1, false);
    }

    final static sba a(vr param0, byte param1, vr param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sba stackIn_2_0 = null;
        sba stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 113) {
            stackIn_2_0 = (sba) null;
            return stackIn_2_0;
          }
          var5_int = param2.a(param4, false);
          var6 = param2.a((byte) 6, var5_int, param3);
          stackIn_4_0 = ev.a(128, var6, param2, param0, var5_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rc.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(byte param0, lu param1, int param2) {
        if (param0 != -71) {
          return;
        }
        try {
          if (param2 == 0) {
            this.field_f = param1.b(16711935) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var25;
        int[] var26;
        int[] var27;
        int[][] var32;
        int[][] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        int var11Lifetime1;
        int[][] var3Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        int[] var10Lifetime1;
        int[][] var13Lifetime1;
        int[][] var15Lifetime1;
        int[][] var20Lifetime1;
        var12 = BachelorFridge.field_y;
        if (!param0) {
          var20 = this.field_h.a(param1, -858);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!this.field_h.field_b) {
            return var13;
          }
          var33 = this.a((byte) -91, 0, param1);
          var34 = var33[0];
          var35 = var33[1];
          var36 = var33[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; hh.field_d > var11; var11++) {
            var8[var11] = -var34[var11] + 4096;
            var9[var11] = -var35[var11] + 4096;
            var10[var11] = -var36[var11] + 4096;
          }
          return var13;
        }
        field_l = (kv) null;
        var20Lifetime1 = this.field_h.a(param1, -858);
        var15Lifetime1 = var20Lifetime1;
        var13Lifetime1 = var15Lifetime1;
        var3Lifetime1 = var13Lifetime1;
        if (!this.field_h.field_b) {
          return var13Lifetime1;
        }
        var32 = this.a((byte) -91, 0, param1);
        var25 = var32[0];
        var21 = var25;
        var26 = var32[1];
        var22 = var26;
        var27 = var32[2];
        var23 = var27;
        var8Lifetime1 = var20Lifetime1[0];
        var9Lifetime1 = var20Lifetime1[1];
        var10Lifetime1 = var20Lifetime1[2];
        for (var11Lifetime1 = 0; hh.field_d > var11Lifetime1; var11Lifetime1++) {
          var8Lifetime1[var11Lifetime1] = -var25[var11Lifetime1] + 4096;
          var9Lifetime1[var11Lifetime1] = -var26[var11Lifetime1] + 4096;
          var10Lifetime1[var11Lifetime1] = -var27[var11Lifetime1] + 4096;
        }
        return var13Lifetime1;
    }

    static {
        field_k = "Achievements";
    }
}
