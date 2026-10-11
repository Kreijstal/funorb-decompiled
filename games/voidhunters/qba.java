/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qba extends le {
    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 20382) {
          return;
        }
        fnb.a(param4, param3, param1, false, param2, 256);
    }

    final void a(int param0, int param1, ds param2) {
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == 0) {
            stackIn_5_1 = (param2.e((byte) -118) == 1);
            this.field_g = stackIn_5_1;
          }
          if (param1 > -60) {
            this.a(30, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("qba.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public qba() {
        super(3, false);
    }

    final int[] a(int param0, boolean param1) {
        int var7 = 0;
        int[] var3;
        int var8;
        int var9;
        int[] var13;
        int[] var14;
        int[] var15;
        var9 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        var3 = this.field_f.a((byte) -5, param0);
        if (this.field_f.field_e) {
          var14 = this.a(0, param0, 255);
          var15 = this.a(1, param0, 255);
          var13 = this.a(2, param0, 255);
          for (var7 = 0; var7 < hob.field_d; var7++) {
            var8 = var13[var7];
            if (var8 != 4096) {
              if (var8 != 0) {
                var3[var7] = var15[var7] * (4096 - var8) + var14[var7] * var8 >> 12;
              } else {
                var3[var7] = var15[var7];
              }
            } else {
              var3[var7] = var14[var7];
            }
          }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
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
        var19 = VoidHunters.field_G;
        if (param0 != 255) {
          this.a(86, 48);
        }
        var31 = this.field_d.a(param1, (byte) -99);
        var21 = var31;
        var20 = var21;
        var3 = var20;
        if (this.field_d.field_g) {
          var52 = this.a(2, param1, param0 ^ 0);
          var50 = this.a((byte) 79, 0, param1);
          var51 = this.a((byte) 31, 1, param1);
          var7 = var31[0];
          var8 = var31[1];
          var9 = var31[2];
          var53 = var50[0];
          var54 = var50[1];
          var55 = var50[2];
          var56 = var51[0];
          var57 = var51[1];
          var58 = var51[2];
          for (var16 = 0; hob.field_d > var16; var16++) {
            var17 = var52[var16];
            if (var17 != 4096) {
              var56Lifetime1 = var51[0];
              if (var17 == 0) {
                var56Lifetime1 = var51[0];
                var7[var16] = var56Lifetime1[var16];
                var8[var16] = var57[var16];
                var9[var16] = var58[var16];
              } else {
                var18 = -var17 + 4096;
                var7[var16] = var56Lifetime1[var16] * var18 + var17 * var53[var16] >> 12;
                var8[var16] = var17 * var54[var16] + var57[var16] * var18 >> 12;
                var9[var16] = var55[var16] * var17 + var18 * var58[var16] >> 12;
              }
            } else {
              var7[var16] = var53[var16];
              var8[var16] = var54[var16];
              var9[var16] = var55[var16];
            }
          }
        }
        return var3;
    }

    static {
    }
}
