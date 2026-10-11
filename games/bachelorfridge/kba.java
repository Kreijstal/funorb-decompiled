/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kba extends k {
    private int field_k;

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
          lu var3 = (lu) null;
          this.a((byte) 21, (lu) null, 123);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        lu var6 = null;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            var6 = (lu) null;
            this.a((byte) 39, (lu) null, -88);
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_k = param1.e((byte) 76) << 4;
            return;
          }
          if (1 != var4_int) {
            return;
          }
          stackIn_11_1 = (param1.b(16711935) == 1);
          this.field_f = stackIn_11_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("kba.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var6;
        int[] var7;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int[][] var18;
        int[][] var19;
        int[][] var23;
        int[] var24;
        int[] var25;
        int[] var29;
        int[] var30;
        int[][] var37;
        int[] var38;
        int[] var39;
        int[][] var40;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int[] var6Lifetime1;
        int[] var7Lifetime1;
        int[] var8Lifetime1;
        var17 = BachelorFridge.field_y;
        var23 = this.field_h.a(param1, -858);
        var19 = var23;
        var18 = var19;
        var3 = var18;
        if (!param0) {
          if (!this.field_h.field_b) {
            return var18;
          }
          var38 = this.a(1, param1, (byte) 109);
          var39 = this.a(2, param1, (byte) 126);
          var6 = var23[0];
          var7 = var23[1];
          var8 = var23[2];
          for (var9 = 0; hh.field_d > var9; var9++) {
            var10 = 255 * var38[var9] >> 12 & 255;
            var11 = var39[var9] * this.field_k >> 12;
            var12 = var11 * am.field_R[var10] >> 12;
            var13 = baa.field_z[var10] * var11 >> 12;
            var14 = var9 + (var12 >> 12) & wp.field_r;
            var15 = param1 + (var13 >> 12) & it.field_r;
            var40 = this.a((byte) -82, 0, var15);
            var6[var9] = var40[0][var14];
            var7[var9] = var40[1][var14];
            var8[var9] = var40[2][var14];
          }
          return var18;
        }
        this.a(false, -31);
        if (!this.field_h.field_b) {
          return var18;
        }
        var29 = this.a(1, param1, (byte) 109);
        var24 = var29;
        var30 = this.a(2, param1, (byte) 126);
        var25 = var30;
        var6Lifetime1 = var23[0];
        var7Lifetime1 = var23[1];
        var8Lifetime1 = var23[2];
        for (var9Lifetime1 = 0; hh.field_d > var9Lifetime1; var9Lifetime1++) {
          var10Lifetime1 = 255 * var29[var9Lifetime1] >> 12 & 255;
          var11Lifetime1 = var30[var9Lifetime1] * this.field_k >> 12;
          var12Lifetime1 = var11Lifetime1 * am.field_R[var10Lifetime1] >> 12;
          var13Lifetime1 = baa.field_z[var10Lifetime1] * var11Lifetime1 >> 12;
          var14Lifetime1 = var9Lifetime1 + (var12Lifetime1 >> 12) & wp.field_r;
          var15Lifetime1 = param1 + (var13Lifetime1 >> 12) & it.field_r;
          var37 = this.a((byte) -82, 0, var15Lifetime1);
          var6Lifetime1[var9Lifetime1] = var37[0][var14Lifetime1];
          var7Lifetime1[var9Lifetime1] = var37[1][var14Lifetime1];
          var8Lifetime1[var9Lifetime1] = var37[2][var14Lifetime1];
        }
        return var18;
    }

    public kba() {
        super(3, false);
        this.field_k = 32768;
    }

    final int[] a(int param0, int param1) {
        int var6 = 0;
        int[] var3;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int[] var15;
        int[] var25;
        int[] var26;
        int[] var27;
        var14 = BachelorFridge.field_y;
        var15 = this.field_j.a(param0, -1);
        var3 = var15;
        if (this.field_j.field_m) {
          var25 = this.a(1, param0, (byte) 123);
          var26 = this.a(2, param0, (byte) 108);
          for (var6 = 0; hh.field_d > var6; var6++) {
            var7 = var25[var6] >> 4 & 255;
            var8 = this.field_k * var26[var6] >> 12;
            var9 = var8 * am.field_R[var7] >> 12;
            var10 = baa.field_z[var7] * var8 >> 12;
            var11 = wp.field_r & (var9 >> 12) + var6;
            var12 = param0 + (var10 >> 12) & it.field_r;
            var27 = this.a(0, var12, (byte) 105);
            var15[var6] = var27[var11];
          }
        }
        if (param1 == 0) {
          return var3;
        }
        this.field_k = -80;
        return var3;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = de.d(hka.field_i, -257, hea.field_r);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (param0 > -120) {
            var3 = (String) null;
            kba.a(-83, (String) null);
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_8_0 = (String) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("kba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
