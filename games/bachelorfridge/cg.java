/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends eo {
    private int[] field_n;
    on field_q;
    private float field_r;
    private boolean field_p;
    private boolean field_s;
    private int field_o;

    cg(lu param0) {
        this.field_q = new on(param0);
        this.field_p = param0.b(16711935) == 1 ? true : false;
        this.field_s = param0.b(16711935) == 1 ? true : false;
        param0.b(16711935);
        param0.b(16711935);
        int var2 = param0.b(16711935) & 3;
        param0.b(true);
        param0.b(true);
        param0.b(16711935);
        param0.b(16711935);
        param0.b(16711935);
        if (var2 == 1) {
          return;
        }
        if (var2 == 2) {
          return;
        }
        if (var2 == 3) {
        }
    }

    final int[] a(q param0, vr param1, float param2, boolean param3) {
        int[] var5;
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
        int var16;
        int var17;
        int var18;
        int[] var30;
        int[] var31;
        int[] var32;
        int[] var39;
        int[] var40;
        int[] var41;
        int stackIn_6_1 = 0;
        int stackIn_56_1 = 0;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int[] var33;
        int[] var34;
        int[] var35;
        int[] var42;
        int[] var43;
        int[] var44;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var9Lifetime3;
        int var18Lifetime3;
        int var9Lifetime2Lifetime1;
        int var9Lifetime2Lifetime2;
        int[] var5Lifetime1;
        int[] var6Lifetime1;
        int[] var7Lifetime1;
        int[] var8Lifetime1;
        int var9Lifetime3Lifetime1;
        int var9Lifetime3Lifetime2;
        if (this.field_n == null) {
          if (!this.field_q.a(param0, param1, -90)) {
            return null;
          }
          if (!param3) {
            stackIn_6_1 = 128;
          } else {
            stackIn_6_1 = 64;
          }
          this.field_o = stackIn_6_1;
          this.field_n = this.field_q.a((double)param2, this.field_s, param0, this.field_o, this.field_o, param1, true, -1);
          this.field_r = param2;
          if (!this.field_p) {
            return this.field_n;
          }
          var39 = new int[this.field_o];
          var30 = var39;
          var5 = var30;
          var40 = new int[this.field_o];
          var31 = var40;
          var6 = var31;
          var41 = new int[this.field_o];
          var32 = var41;
          var7 = var32;
          var8 = new int[this.field_o * this.field_o];
          var13 = this.field_o;
          var14 = this.field_o;
          var15 = var13 - 1;
          var16 = var14 - 1;
          var17 = var13 * var14;
          var12 = 1 * var13;
          var11 = 1 * var13;
          for (var18 = 2; var18 >= 0; var18--) {
            for (var9 = var15; var9 >= 0; var9--) {
              var12--;
              var10 = this.field_n[var12];
              var5[var9] = var5[var9] + (var10 >> 16 & 255);
              var6[var9] = var6[var9] + (var10 >> 8 & 255);
              var7[var9] = var7[var9] + (var10 & 255);
            }
            if (var12 == 0) {
              var12 = var17;
            }
          }
          var23 = var17;
          for (var29 = var16; var29 >= 0; var29--) {
            var24 = 1;
            var25 = 1;
            var28 = 0;
            var27 = 0;
            var26 = 0;
            for (var9Lifetime3 = 2; var9Lifetime3 >= 0; var9Lifetime3--) {
              var25--;
              var26 = var26 + var39[var25];
              var28 = var28 + var40[var25];
              var27 = var27 + var41[var25];
              if (var25 == 0) {
                var25 = var13;
              }
            }
            for (var9Lifetime3Lifetime1 = var15; var9Lifetime3Lifetime1 >= 0; var9Lifetime3Lifetime1--) {
              var25--;
              var24--;
              var18Lifetime3 = var26 / 9;
              var19 = var28 / 9;
              var20 = var27 / 9;
              var23--;
              var8[var23] = var18Lifetime3 << 16 | var19 << 8 | var20;
              var26 = var26 + (var39[var25] - var39[var24]);
              var27 = var27 + (var41[var25] - var41[var24]);
              var28 = var28 + (var40[var25] - var40[var24]);
              if (var25 == 0) {
                var25 = var13;
              }
              if (var24 == 0) {
                var24 = var13;
              }
            }
            for (var9Lifetime3Lifetime2 = var15; var9Lifetime3Lifetime2 >= 0; var9Lifetime3Lifetime2--) {
              var12--;
              var22 = this.field_n[var12];
              var11--;
              var21 = this.field_n[var11];
              var5[var9Lifetime3Lifetime2] = var5[var9Lifetime3Lifetime2] + ((var22 >> 16 & 255) - (var21 >> 16 & 255));
              var6[var9Lifetime3Lifetime2] = var6[var9Lifetime3Lifetime2] + ((var22 >> 8 & 255) - (var21 >> 8 & 255));
              var7[var9Lifetime3Lifetime2] = var7[var9Lifetime3Lifetime2] + ((var22 & 255) - (var21 & 255));
            }
            if (var12 == 0) {
              var12 = var17;
            }
            if (var11 == 0) {
              var11 = var17;
            }
          }
          this.field_n = var8;
          return this.field_n;
        }
        if (this.field_r == param2) {
          return this.field_n;
        }
        if (!this.field_q.a(param0, param1, -90)) {
          return null;
        }
        if (!param3) {
          stackIn_56_1 = 128;
        } else {
          stackIn_56_1 = 64;
        }
        this.field_o = stackIn_56_1;
        this.field_n = this.field_q.a((double)param2, this.field_s, param0, this.field_o, this.field_o, param1, true, -1);
        this.field_r = param2;
        if (!this.field_p) {
          return this.field_n;
        }
        var42 = new int[this.field_o];
        var33 = var42;
        var5Lifetime1 = var33;
        var43 = new int[this.field_o];
        var34 = var43;
        var6Lifetime1 = var34;
        var44 = new int[this.field_o];
        var35 = var44;
        var7Lifetime1 = var35;
        var8Lifetime1 = new int[this.field_o * this.field_o];
        var13Lifetime1 = this.field_o;
        var14Lifetime1 = this.field_o;
        var15Lifetime1 = var13Lifetime1 - 1;
        var16Lifetime1 = var14Lifetime1 - 1;
        var17Lifetime1 = var13Lifetime1 * var14Lifetime1;
        var12Lifetime1 = 1 * var13Lifetime1;
        var11Lifetime1 = 1 * var13Lifetime1;
        for (var18Lifetime1 = 2; var18Lifetime1 >= 0; var18Lifetime1--) {
          for (var9Lifetime1 = var15Lifetime1; var9Lifetime1 >= 0; var9Lifetime1--) {
            var12Lifetime1--;
            var10Lifetime1 = this.field_n[var12Lifetime1];
            var5Lifetime1[var9Lifetime1] = var5Lifetime1[var9Lifetime1] + (var10Lifetime1 >> 16 & 255);
            var6Lifetime1[var9Lifetime1] = var6Lifetime1[var9Lifetime1] + (var10Lifetime1 >> 8 & 255);
            var7Lifetime1[var9Lifetime1] = var7Lifetime1[var9Lifetime1] + (var10Lifetime1 & 255);
          }
          if (var12Lifetime1 == 0) {
            var12Lifetime1 = var17Lifetime1;
          }
        }
        var23Lifetime1 = var17Lifetime1;
        for (var29Lifetime1 = var16Lifetime1; var29Lifetime1 >= 0; var29Lifetime1--) {
          var24Lifetime1 = 1;
          var25Lifetime1 = 1;
          var28Lifetime1 = 0;
          var27Lifetime1 = 0;
          var26Lifetime1 = 0;
          for (var9Lifetime2 = 2; var9Lifetime2 >= 0; var9Lifetime2--) {
            var25Lifetime1--;
            var26Lifetime1 = var26Lifetime1 + var42[var25Lifetime1];
            var28Lifetime1 = var28Lifetime1 + var43[var25Lifetime1];
            var27Lifetime1 = var27Lifetime1 + var44[var25Lifetime1];
            if (var25Lifetime1 == 0) {
              var25Lifetime1 = var13Lifetime1;
            }
          }
          for (var9Lifetime2Lifetime1 = var15Lifetime1; var9Lifetime2Lifetime1 >= 0; var9Lifetime2Lifetime1--) {
            var25Lifetime1--;
            var24Lifetime1--;
            var18Lifetime2 = var26Lifetime1 / 9;
            var19Lifetime1 = var28Lifetime1 / 9;
            var20Lifetime1 = var27Lifetime1 / 9;
            var23Lifetime1--;
            var8Lifetime1[var23Lifetime1] = var18Lifetime2 << 16 | var19Lifetime1 << 8 | var20Lifetime1;
            var26Lifetime1 = var26Lifetime1 + (var42[var25Lifetime1] - var42[var24Lifetime1]);
            var27Lifetime1 = var27Lifetime1 + (var44[var25Lifetime1] - var44[var24Lifetime1]);
            var28Lifetime1 = var28Lifetime1 + (var43[var25Lifetime1] - var43[var24Lifetime1]);
            if (var25Lifetime1 == 0) {
              var25Lifetime1 = var13Lifetime1;
            }
            if (var24Lifetime1 == 0) {
              var24Lifetime1 = var13Lifetime1;
            }
          }
          for (var9Lifetime2Lifetime2 = var15Lifetime1; var9Lifetime2Lifetime2 >= 0; var9Lifetime2Lifetime2--) {
            var12Lifetime1--;
            var22Lifetime1 = this.field_n[var12Lifetime1];
            var11Lifetime1--;
            var21Lifetime1 = this.field_n[var11Lifetime1];
            var5Lifetime1[var9Lifetime2Lifetime2] = var5Lifetime1[var9Lifetime2Lifetime2] + ((var22Lifetime1 >> 16 & 255) - (var21Lifetime1 >> 16 & 255));
            var6Lifetime1[var9Lifetime2Lifetime2] = var6Lifetime1[var9Lifetime2Lifetime2] + ((var22Lifetime1 >> 8 & 255) - (var21Lifetime1 >> 8 & 255));
            var7Lifetime1[var9Lifetime2Lifetime2] = var7Lifetime1[var9Lifetime2Lifetime2] + ((var22Lifetime1 & 255) - (var21Lifetime1 & 255));
          }
          if (var12Lifetime1 == 0) {
            var12Lifetime1 = var17Lifetime1;
          }
          if (var11Lifetime1 == 0) {
            var11Lifetime1 = var17Lifetime1;
          }
        }
        this.field_n = var8Lifetime1;
        return this.field_n;
    }
}
