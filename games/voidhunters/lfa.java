/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends le {
    static int field_m;
    private int field_l;
    static boolean field_j;
    private int field_i;
    private int field_k;

    public lfa() {
        super(1, false);
        this.field_l = 4096;
        this.field_i = 4096;
        this.field_k = 4096;
    }

    final static void a(byte param0, boolean param1) {
        if (wga.field_a == null) {
          if (param0 == 34) {
            return;
          }
          field_j = true;
          return;
        }
        if (!wga.field_a.a(param1, false)) {
          if (param0 == 34) {
            return;
          }
          field_j = true;
          return;
        }
        wga.field_a = null;
        if (param0 == 34) {
          return;
        }
        field_j = true;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[][] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var28;
        int[] var29;
        int[] var30;
        int[][] var35;
        int[][] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int[][] var3Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        int[] var10Lifetime1;
        int[][] var16Lifetime1;
        int[][] var18Lifetime1;
        int[][] var23Lifetime1;
        var15 = VoidHunters.field_G;
        if (param0 == 255) {
          var23 = this.field_d.a(param1, (byte) -92);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!this.field_d.field_g) {
            return var3;
          }
          var36 = this.a((byte) 95, 0, param1);
          var37 = var36[0];
          var39 = var36[1];
          var38 = var36[2];
          var8 = var23[0];
          var9 = var23[1];
          var10 = var23[2];
          for (var11 = 0; hob.field_d > var11; var11++) {
            var12 = var37[var11];
            var13 = var38[var11];
            var14 = var39[var11];
            if (var12 == var13 &&
              var13 == var14) {
              var8[var11] = this.field_i * var12 >> 12;
              var9[var11] = this.field_l * var13 >> 12;
              var10[var11] = var14 * this.field_k >> 12;
            } else {
              var8[var11] = this.field_i;
              var9[var11] = this.field_l;
              var10[var11] = this.field_k;
            }
          }
          return var3;
        }
        field_j = true;
        var23Lifetime1 = this.field_d.a(param1, (byte) -92);
        var18Lifetime1 = var23Lifetime1;
        var16Lifetime1 = var18Lifetime1;
        var3Lifetime1 = var16Lifetime1;
        if (!this.field_d.field_g) {
          return var3Lifetime1;
        }
        var35 = this.a((byte) 95, 0, param1);
        var28 = var35[0];
        var24 = var28;
        var30 = var35[1];
        var26 = var30;
        var29 = var35[2];
        var25 = var29;
        var8Lifetime1 = var23Lifetime1[0];
        var9Lifetime1 = var23Lifetime1[1];
        var10Lifetime1 = var23Lifetime1[2];
        for (var11Lifetime1 = 0; hob.field_d > var11Lifetime1; var11Lifetime1++) {
          var12Lifetime1 = var28[var11Lifetime1];
          var13Lifetime1 = var29[var11Lifetime1];
          var14Lifetime1 = var30[var11Lifetime1];
          if (var12Lifetime1 == var13Lifetime1 &&
            var13Lifetime1 == var14Lifetime1) {
            var8Lifetime1[var11Lifetime1] = this.field_i * var12Lifetime1 >> 12;
            var9Lifetime1[var11Lifetime1] = this.field_l * var13Lifetime1 >> 12;
            var10Lifetime1[var11Lifetime1] = var14Lifetime1 * this.field_k >> 12;
          } else {
            var8Lifetime1[var11Lifetime1] = this.field_i;
            var9Lifetime1[var11Lifetime1] = this.field_l;
            var10Lifetime1[var11Lifetime1] = this.field_k;
          }
        }
        return var3Lifetime1;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 > -60) {
            this.field_l = 58;
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_i = param2.e(1869);
            return;
          }
          if (var4_int == 1) {
            this.field_l = param2.e(1869);
            return;
          }
          if (var4_int != 2) {
            return;
          }
          this.field_k = param2.e(1869);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("lfa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_j = true;
    }
}
