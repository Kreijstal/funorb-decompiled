/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends le {
    private int field_l;
    private int field_i;
    private int field_k;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (0 != var4_int) {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_j = param2.e(1869);
              } else {
                if (var4_int == 3) {
                  this.field_i = param2.e(1869);
                }
              }
            } else {
              this.field_k = param2.e(1869);
            }
          } else {
            this.field_l = param2.e(1869);
          }
          if (param1 > -60) {
            this.a(-126, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("il.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        var25 = VoidHunters.field_G;
        try {
          dda.a(param3, 74);
          var7_int = 0;
          var8 = param3 - param6;
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = param3;
          var10 = -param3;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          var33 = rba.field_b[param5];
          var26 = var33;
          var15 = var26;
          var16 = -var8 + param4;
          ww.a(param1, var16, var15, (byte) 75, param4 - param3);
          var17 = param4 + var8;
          ww.a(param0, var17, var33, (byte) 75, var16);
          if (param2 > 0) {
            il.a(-21, -8, (byte) 1, -122, 112, 81, 20);
          }
          ww.a(param1, param3 + param4, var33, (byte) 75, var17);
          while (var9 > var7_int) {
            var14 += 2;
            var13 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (var12 >= 0 &&
              1 <= var11) {
              dw.field_a[var11] = var7_int;
              var11--;
              var12 = var12 - (var11 << 1);
            }
            var7_int++;
            if (0 <= var10) {
              var9--;
              var10 = var10 - (var9 << 1);
              if (var9 < var8) {
                var29 = rba.field_b[var9 + param5];
                var30 = rba.field_b[param5 - var9];
                var20 = dw.field_a[var9];
                var21 = param4 + var7_int;
                var22 = -var7_int + param4;
                var23 = var20 + param4;
                var24 = param4 - var20;
                ww.a(param1, var24, var29, (byte) 75, var22);
                ww.a(param0, var23, var29, (byte) 75, var24);
                ww.a(param1, var21, var29, (byte) 75, var23);
                ww.a(param1, var24, var30, (byte) 75, var22);
                ww.a(param0, var23, var30, (byte) 75, var24);
                ww.a(param1, var21, var30, (byte) 75, var23);
              } else {
                var27 = rba.field_b[param5 + var9];
                var28 = rba.field_b[param5 - var9];
                var20 = param4 + var7_int;
                var21 = -var7_int + param4;
                ww.a(param1, var20, var27, (byte) 75, var21);
                ww.a(param1, var20, var28, (byte) 75, var21);
              }
            }
            var31 = rba.field_b[var7_int + param5];
            var32 = rba.field_b[-var7_int + param5];
            var20Lifetime1 = var9 + param4;
            var21Lifetime1 = -var9 + param4;
            if (var8 <= var7_int) {
              ww.a(param1, var20Lifetime1, var31, (byte) 75, var21Lifetime1);
              ww.a(param1, var20Lifetime1, var32, (byte) 75, var21Lifetime1);
              continue;
            }
            if (var7_int > var11) {
              stackIn_20_0 = dw.field_a[var7_int];
            } else {
              stackIn_20_0 = var11;
            }
            var22Lifetime1 = stackIn_20_0;
            var23Lifetime1 = var22Lifetime1 + param4;
            var24Lifetime1 = -var22Lifetime1 + param4;
            ww.a(param1, var24Lifetime1, var31, (byte) 75, var21Lifetime1);
            ww.a(param0, var23Lifetime1, var31, (byte) 75, var24Lifetime1);
            ww.a(param1, var20Lifetime1, var31, (byte) 75, var23Lifetime1);
            ww.a(param1, var24Lifetime1, var32, (byte) 75, var21Lifetime1);
            ww.a(param0, var23Lifetime1, var32, (byte) 75, var24Lifetime1);
            ww.a(param1, var20Lifetime1, var32, (byte) 75, var23Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "il.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public il() {
        super(0, true);
        this.field_k = 20;
        this.field_i = 0;
        this.field_l = 1365;
        this.field_j = 0;
    }

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        var14 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        var15 = this.field_f.a((byte) 16, param0);
        var3 = var15;
        if (this.field_f.field_e) {
          for (var4 = 0; var4 < hob.field_d; var4++) {
            var5 = this.field_j + (grb.field_l[var4] << 12) / this.field_l;
            var6 = this.field_i + (sj.field_p[param0] << 12) / this.field_l;
            var7 = var5;
            var8 = var6;
            var9 = var5;
            var10 = var6;
            var11 = var5 * var5 >> 12;
            var12 = var6 * var6 >> 12;
            var13 = 0;
            while (var11 + var12 < 16384) {
              if (this.field_k > var13) {
                var10 = var8 + 2 * (var10 * var9 >> 12);
                var9 = var7 - var12 + var11;
                var12 = var10 * var10 >> 12;
                var11 = var9 * var9 >> 12;
                var13++;
                continue;
              }
              break;
            }
            stackIn_11_0 = var15;
            stackIn_11_1 = var4;
            if (var13 >= -1 + this.field_k) {
              stackIn_12_2 = 0;
            } else {
              stackIn_12_2 = (var13 << 12) / this.field_k;
            }
            stackIn_11_0[stackIn_11_1] = stackIn_12_2;
          }
        }
        return var15;
    }

    static {
    }
}
