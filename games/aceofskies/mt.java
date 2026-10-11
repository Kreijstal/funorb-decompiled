/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt extends mk {
    private byte[] field_F;
    private int[] field_E;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int stackIn_91_0 = 0;
        int stackIn_139_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int[] var27;
        int[] var28;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var15Lifetime5;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var14Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        int var15Lifetime6;
        int var15Lifetime7;
        int var15Lifetime8;
        int var16Lifetime6;
        int var16Lifetime7;
        int var16Lifetime8;
        int var17Lifetime6;
        int var17Lifetime7;
        int var17Lifetime8;
        int var18Lifetime6;
        int var18Lifetime7;
        int var19Lifetime6;
        int var19Lifetime7;
        int var20Lifetime6;
        int var23Lifetime2;
        int var24Lifetime2;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        int var14Lifetime3Lifetime1;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        int var15Lifetime3Lifetime1;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var16Lifetime1Lifetime3;
        int var16Lifetime1Lifetime4;
        int var16Lifetime3Lifetime1;
        int var16Lifetime4Lifetime1;
        int var17Lifetime1Lifetime1;
        int var17Lifetime1Lifetime2;
        int var17Lifetime1Lifetime3;
        int var17Lifetime1Lifetime4;
        int var17Lifetime3Lifetime1;
        int var17Lifetime4Lifetime1;
        int var18Lifetime1Lifetime1;
        int var18Lifetime1Lifetime2;
        int var18Lifetime1Lifetime3;
        int var18Lifetime3Lifetime1;
        int var19Lifetime1Lifetime1;
        int var19Lifetime1Lifetime2;
        int var19Lifetime1Lifetime3;
        int var19Lifetime3Lifetime1;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var20Lifetime1Lifetime3;
        int var20Lifetime3Lifetime1;
        int var21Lifetime1Lifetime1;
        int var22Lifetime1Lifetime1;
        int var24Lifetime3;
        int var18Lifetime1Lifetime4;
        int var17Lifetime1Lifetime2Lifetime1;
        int var18Lifetime1Lifetime2Lifetime1;
        int var19Lifetime1Lifetime2Lifetime1;
        int var20Lifetime1Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2Lifetime1;
        int var20Lifetime1Lifetime2Lifetime2;
        int var21Lifetime1Lifetime1Lifetime1;
        int var22Lifetime1Lifetime1Lifetime1;
        if (this.field_D.h()) {
          throw new IllegalStateException();
        }
        var6 = this.field_D.field_f;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_z;
        var7 = param1 * var6 + param0;
        var8 = 0;
        var9 = this.field_p;
        var10 = this.field_o;
        var11 = var6 - var10;
        var12 = 0;
        if (param1 < this.field_D.field_w) {
          var13_int = this.field_D.field_w - param1;
          var9 = var9 - var13_int;
          param1 = this.field_D.field_w;
          var8 = var8 + var13_int * var10;
          var7 = var7 + var13_int * var6;
        }
        if (param1 + var9 > this.field_D.field_D) {
          var9 = var9 - (param1 + var9 - this.field_D.field_D);
        }
        if (param0 < this.field_D.field_z) {
          var13_intLifetime1 = this.field_D.field_z - param0;
          var10 = var10 - var13_intLifetime1;
          param0 = this.field_D.field_z;
          var8 = var8 + var13_intLifetime1;
          var7 = var7 + var13_intLifetime1;
          var12 = var12 + var13_intLifetime1;
          var11 = var11 + var13_intLifetime1;
        }
        if (param0 + var10 > this.field_D.field_k) {
          var13_intLifetime2 = param0 + var10 - this.field_D.field_k;
          var10 = var10 - var13_intLifetime2;
          var12 = var12 + var13_intLifetime2;
          var11 = var11 + var13_intLifetime2;
        }
        if (var10 > 0) {
          if (var9 <= 0) {
            return;
          }
          var28 = this.field_D.field_E;
          var27 = var28;
          var13 = var27;
          if (param4 == 0) {
            if (param2 == 1) {
              for (var14 = -var9; var14 < 0; var14++) {
                var15 = var7 + var10 - 3;
                while (var7 < var15) {
                  incrementValue$27 = var7;
                  var7++;
                  incrementValue$28 = var8;
                  var8++;
                  var13[incrementValue$27] = this.field_E[this.field_F[incrementValue$28] & 255];
                  incrementValue$29 = var7;
                  var7++;
                  incrementValue$30 = var8;
                  var8++;
                  var13[incrementValue$29] = this.field_E[this.field_F[incrementValue$30] & 255];
                  incrementValue$31 = var7;
                  var7++;
                  incrementValue$32 = var8;
                  var8++;
                  var13[incrementValue$31] = this.field_E[this.field_F[incrementValue$32] & 255];
                  incrementValue$33 = var7;
                  var7++;
                  incrementValue$34 = var8;
                  var8++;
                  var13[incrementValue$33] = this.field_E[this.field_F[incrementValue$34] & 255];
                }
                var15 += 3;
                while (var7 < var15) {
                  incrementValue$25 = var7;
                  var7++;
                  incrementValue$26 = var8;
                  var8++;
                  var13[incrementValue$25] = this.field_E[this.field_F[incrementValue$26] & 255];
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 0) {
              var14Lifetime6 = (param3 & 16711680) >> 16;
              var15Lifetime6 = (param3 & 65280) >> 8;
              var16 = param3 & 255;
              for (var17 = -var9; var17 < 0; var17++) {
                for (var18 = -var10; var18 < 0; var18++) {
                  incrementValue$23 = var8;
                  var8++;
                  var19 = this.field_E[this.field_F[incrementValue$23] & 255];
                  var20 = (var19 & 16711680) * var14Lifetime6 & -16777216;
                  var21 = (var19 & 65280) * var15Lifetime6 & 16711680;
                  var22 = (var19 & 255) * var16 & 65280;
                  incrementValue$24 = var7;
                  var7++;
                  var13[incrementValue$24] = (var20 | var21 | var22) >>> 8;
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 3) {
              for (var14Lifetime7 = -var9; var14Lifetime7 < 0; var14Lifetime7++) {
                for (var15Lifetime7 = -var10; var15Lifetime7 < 0; var15Lifetime7++) {
                  incrementValue$21 = var8;
                  var8++;
                  var16Lifetime6 = this.field_E[this.field_F[incrementValue$21] & 255];
                  var17Lifetime6 = var16Lifetime6 + param3;
                  var18Lifetime6 = (var16Lifetime6 & 16711935) + (param3 & 16711935);
                  var19Lifetime6 = (var18Lifetime6 & 16777472) + (var17Lifetime6 - var18Lifetime6 & 65536);
                  incrementValue$22 = var7;
                  var7++;
                  var13[incrementValue$22] = var17Lifetime6 - var19Lifetime6 | var19Lifetime6 - (var19Lifetime6 >>> 8);
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 != 2) {
              throw new IllegalArgumentException();
            }
            var14Lifetime8 = param3 >>> 24;
            var15Lifetime8 = 256 - var14Lifetime8;
            var16Lifetime7 = (param3 & 16711935) * var15Lifetime8 & -16711936;
            var17Lifetime7 = (param3 & 65280) * var15Lifetime8 & 16711680;
            param3 = (var16Lifetime7 | var17Lifetime7) >>> 8;
            for (var18Lifetime7 = -var9; var18Lifetime7 < 0; var18Lifetime7++) {
              for (var19Lifetime7 = -var10; var19Lifetime7 < 0; var19Lifetime7++) {
                incrementValue$19 = var8;
                var8++;
                var20Lifetime6 = this.field_E[this.field_F[incrementValue$19] & 255];
                var16Lifetime8 = (var20Lifetime6 & 16711935) * var14Lifetime8 & -16711936;
                var17Lifetime8 = (var20Lifetime6 & 65280) * var14Lifetime8 & 16711680;
                incrementValue$20 = var7;
                var7++;
                var13[incrementValue$20] = ((var16Lifetime8 | var17Lifetime8) >>> 8) + param3;
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param4 != 1) {
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            if (param2 == 1) {
              for (var14Lifetime1 = -var9; var14Lifetime1 < 0; var14Lifetime1++) {
                for (var15Lifetime1 = -var10; var15Lifetime1 < 0; var15Lifetime1++) {
                  incrementValue$6 = var8;
                  var8++;
                  var16Lifetime1 = this.field_F[incrementValue$6];
                  if (var16Lifetime1 == 0) {
                    var7++;
                  } else {
                    var17Lifetime1 = this.field_E[var16Lifetime1 & 255];
                    var18Lifetime1 = var28[var7];
                    var19Lifetime1 = var17Lifetime1 + var18Lifetime1;
                    var20Lifetime1 = (var17Lifetime1 & 16711935) + (var18Lifetime1 & 16711935);
                    var18Lifetime1Lifetime4 = (var20Lifetime1 & 16777472) + (var19Lifetime1 - var20Lifetime1 & 65536);
                    incrementValue$7 = var7;
                    var7++;
                    var13[incrementValue$7] = var19Lifetime1 - var18Lifetime1Lifetime4 | var18Lifetime1Lifetime4 - (var18Lifetime1Lifetime4 >>> 8);
                  }
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 0) {
              var14Lifetime1Lifetime1 = (param3 & 16711680) >> 16;
              var15Lifetime1Lifetime1 = (param3 & 65280) >> 8;
              var16Lifetime1Lifetime1 = param3 & 255;
              for (var17Lifetime1Lifetime1 = -var9; var17Lifetime1Lifetime1 < 0; var17Lifetime1Lifetime1++) {
                for (var18Lifetime1Lifetime1 = -var10; var18Lifetime1Lifetime1 < 0; var18Lifetime1Lifetime1++) {
                  incrementValue$4 = var8;
                  var8++;
                  var19Lifetime1Lifetime1 = this.field_F[incrementValue$4];
                  if (var19Lifetime1Lifetime1 == 0) {
                    var7++;
                  } else {
                    var20Lifetime1Lifetime1 = this.field_E[var19Lifetime1Lifetime1 & 255];
                    var21Lifetime1 = (var20Lifetime1Lifetime1 & 16711680) * var14Lifetime1Lifetime1 & -16777216;
                    var22Lifetime1 = (var20Lifetime1Lifetime1 & 65280) * var15Lifetime1Lifetime1 & 16711680;
                    var23 = (var20Lifetime1Lifetime1 & 255) * var16Lifetime1Lifetime1 & 65280;
                    var20Lifetime1Lifetime1Lifetime1 = (var21Lifetime1 | var22Lifetime1 | var23) >>> 8;
                    var24 = var28[var7];
                    var25 = var20Lifetime1Lifetime1Lifetime1 + var24;
                    var26 = (var20Lifetime1Lifetime1Lifetime1 & 16711935) + (var24 & 16711935);
                    var24Lifetime3 = (var26 & 16777472) + (var25 - var26 & 65536);
                    incrementValue$5 = var7;
                    var7++;
                    var13[incrementValue$5] = var25 - var24Lifetime3 | var24Lifetime3 - (var24Lifetime3 >>> 8);
                  }
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 3) {
              for (var14Lifetime1Lifetime2 = -var9; var14Lifetime1Lifetime2 < 0; var14Lifetime1Lifetime2++) {
                for (var15Lifetime1Lifetime2 = -var10; var15Lifetime1Lifetime2 < 0; var15Lifetime1Lifetime2++) {
                  incrementValue$2 = var8;
                  var8++;
                  var16Lifetime1Lifetime2 = this.field_F[incrementValue$2];
                  if (var16Lifetime1Lifetime2 <= 0) {
                    stackIn_139_0 = 0;
                  } else {
                    stackIn_139_0 = this.field_E[var16Lifetime1Lifetime2];
                  }
                  var17Lifetime1Lifetime2 = stackIn_139_0;
                  var18Lifetime1Lifetime2 = var17Lifetime1Lifetime2 + param3;
                  var19Lifetime1Lifetime2 = (var17Lifetime1Lifetime2 & 16711935) + (param3 & 16711935);
                  var20Lifetime1Lifetime2 = (var19Lifetime1Lifetime2 & 16777472) + (var18Lifetime1Lifetime2 - var19Lifetime1Lifetime2 & 65536);
                  var17Lifetime1Lifetime2Lifetime1 = var18Lifetime1Lifetime2 - var20Lifetime1Lifetime2 | var20Lifetime1Lifetime2 - (var20Lifetime1Lifetime2 >>> 8);
                  var20Lifetime1Lifetime2Lifetime1 = var28[var7];
                  var18Lifetime1Lifetime2Lifetime1 = var17Lifetime1Lifetime2Lifetime1 + var20Lifetime1Lifetime2Lifetime1;
                  var19Lifetime1Lifetime2Lifetime1 = (var17Lifetime1Lifetime2Lifetime1 & 16711935) + (var20Lifetime1Lifetime2Lifetime1 & 16711935);
                  var20Lifetime1Lifetime2Lifetime2 = (var19Lifetime1Lifetime2Lifetime1 & 16777472) + (var18Lifetime1Lifetime2Lifetime1 - var19Lifetime1Lifetime2Lifetime1 & 65536);
                  incrementValue$3 = var7;
                  var7++;
                  var13[incrementValue$3] = var18Lifetime1Lifetime2Lifetime1 - var20Lifetime1Lifetime2Lifetime2 | var20Lifetime1Lifetime2Lifetime2 - (var20Lifetime1Lifetime2Lifetime2 >>> 8);
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 != 2) {
              throw new IllegalArgumentException();
            }
            var14Lifetime1Lifetime3 = param3 >>> 24;
            var15Lifetime1Lifetime3 = 256 - var14Lifetime1Lifetime3;
            var16Lifetime1Lifetime3 = (param3 & 16711935) * var15Lifetime1Lifetime3 & -16711936;
            var17Lifetime1Lifetime3 = (param3 & 65280) * var15Lifetime1Lifetime3 & 16711680;
            param3 = (var16Lifetime1Lifetime3 | var17Lifetime1Lifetime3) >>> 8;
            for (var18Lifetime1Lifetime3 = -var9; var18Lifetime1Lifetime3 < 0; var18Lifetime1Lifetime3++) {
              for (var19Lifetime1Lifetime3 = -var10; var19Lifetime1Lifetime3 < 0; var19Lifetime1Lifetime3++) {
                incrementValue$0 = var8;
                var8++;
                var20Lifetime1Lifetime3 = this.field_F[incrementValue$0];
                if (var20Lifetime1Lifetime3 == 0) {
                  var7++;
                } else {
                  var21Lifetime1Lifetime1 = this.field_E[var20Lifetime1Lifetime3 & 255];
                  var16Lifetime1Lifetime4 = (var21Lifetime1Lifetime1 & 16711935) * var14Lifetime1Lifetime3 & -16711936;
                  var17Lifetime1Lifetime4 = (var21Lifetime1Lifetime1 & 65280) * var14Lifetime1Lifetime3 & 16711680;
                  var21Lifetime1Lifetime1Lifetime1 = ((var16Lifetime1Lifetime4 | var17Lifetime1Lifetime4) >>> 8) + param3;
                  var22Lifetime1Lifetime1 = var28[var7];
                  var23Lifetime2 = var21Lifetime1Lifetime1Lifetime1 + var22Lifetime1Lifetime1;
                  var24Lifetime2 = (var21Lifetime1Lifetime1Lifetime1 & 16711935) + (var22Lifetime1Lifetime1 & 16711935);
                  var22Lifetime1Lifetime1Lifetime1 = (var24Lifetime2 & 16777472) + (var23Lifetime2 - var24Lifetime2 & 65536);
                  incrementValue$1 = var7;
                  var7++;
                  var13[incrementValue$1] = var23Lifetime2 - var22Lifetime1Lifetime1Lifetime1 | var22Lifetime1Lifetime1Lifetime1 - (var22Lifetime1Lifetime1Lifetime1 >>> 8);
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 == 1) {
            for (var14Lifetime2 = -var9; var14Lifetime2 < 0; var14Lifetime2++) {
              for (var15Lifetime2 = -var10; var15Lifetime2 < 0; var15Lifetime2++) {
                incrementValue$17 = var8;
                var8++;
                var16Lifetime2 = this.field_F[incrementValue$17];
                if (var16Lifetime2 == 0) {
                  var7++;
                } else {
                  var17Lifetime2 = this.field_E[var16Lifetime2 & 255] | -16777216;
                  var18Lifetime2 = 255;
                  var19Lifetime2 = 0;
                  var20Lifetime2 = var28[var7];
                  incrementValue$18 = var7;
                  var7++;
                  var13[incrementValue$18] = (((var17Lifetime2 & 16711935) * var18Lifetime2 + (var20Lifetime2 & 16711935) * var19Lifetime2 & -16711936) >> 8) + (((var17Lifetime2 & -16711936) >>> 8) * var18Lifetime2 + ((var20Lifetime2 & -16711936) >>> 8) * var19Lifetime2 & -16711936);
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 == 0) {
            if ((param3 & 16777215) == 16777215) {
              var14Lifetime3 = param3 >>> 24;
              var15Lifetime3 = 256 - var14Lifetime3;
              for (var16Lifetime3 = -var9; var16Lifetime3 < 0; var16Lifetime3++) {
                for (var17Lifetime3 = -var10; var17Lifetime3 < 0; var17Lifetime3++) {
                  incrementValue$15 = var8;
                  var8++;
                  var18Lifetime3 = this.field_F[incrementValue$15];
                  if (var18Lifetime3 == 0) {
                    var7++;
                  } else {
                    var19Lifetime3 = this.field_E[var18Lifetime3 & 255];
                    var20Lifetime3 = var28[var7];
                    incrementValue$16 = var7;
                    var7++;
                    var13[incrementValue$16] = ((var19Lifetime3 & 16711935) * var14Lifetime3 + (var20Lifetime3 & 16711935) * var15Lifetime3 & -16711936) + ((var19Lifetime3 & 65280) * var14Lifetime3 + (var20Lifetime3 & 65280) * var15Lifetime3 & 16711680) >> 8;
                  }
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            var14Lifetime3Lifetime1 = (param3 & 16711680) >> 16;
            var15Lifetime3Lifetime1 = (param3 & 65280) >> 8;
            var16Lifetime3Lifetime1 = param3 & 255;
            var17Lifetime3Lifetime1 = param3 >>> 24;
            var18Lifetime3Lifetime1 = 256 - var17Lifetime3Lifetime1;
            for (var19Lifetime3Lifetime1 = -var9; var19Lifetime3Lifetime1 < 0; var19Lifetime3Lifetime1++) {
              for (var20Lifetime3Lifetime1 = -var10; var20Lifetime3Lifetime1 < 0; var20Lifetime3Lifetime1++) {
                incrementValue$12 = var8;
                var8++;
                var21Lifetime2 = this.field_F[incrementValue$12];
                if (var21Lifetime2 == 0) {
                  var7++;
                } else {
                  var22Lifetime2 = this.field_E[var21Lifetime2 & 255];
                  if (var17Lifetime3Lifetime1 == 255) {
                    var23Lifetime1 = (var22Lifetime2 & 16711680) * var14Lifetime3Lifetime1 & -16777216;
                    var24Lifetime1 = (var22Lifetime2 & 65280) * var15Lifetime3Lifetime1 & 16711680;
                    var25Lifetime1 = (var22Lifetime2 & 255) * var16Lifetime3Lifetime1 & 65280;
                    incrementValue$13 = var7;
                    var7++;
                    var13[incrementValue$13] = (var23Lifetime1 | var24Lifetime1 | var25Lifetime1) >>> 8;
                  } else {
                    var23Lifetime1 = (var22Lifetime2 & 16711680) * var14Lifetime3Lifetime1 & -16777216;
                    var24Lifetime1 = (var22Lifetime2 & 65280) * var15Lifetime3Lifetime1 & 16711680;
                    var25Lifetime1 = (var22Lifetime2 & 255) * var16Lifetime3Lifetime1 & 65280;
                    var22Lifetime2 = (var23Lifetime1 | var24Lifetime1 | var25Lifetime1) >>> 8;
                    var26Lifetime1 = var28[var7];
                    incrementValue$14 = var7;
                    var7++;
                    var13[incrementValue$14] = ((var22Lifetime2 & 16711935) * var17Lifetime3Lifetime1 + (var26Lifetime1 & 16711935) * var18Lifetime3Lifetime1 & -16711936) + ((var22Lifetime2 & 65280) * var17Lifetime3Lifetime1 + (var26Lifetime1 & 65280) * var18Lifetime3Lifetime1 & 16711680) >> 8;
                  }
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 != 3) {
            if (param2 != 2) {
              throw new IllegalArgumentException();
            }
            var14Lifetime4 = param3 >>> 24;
            var15Lifetime4 = 256 - var14Lifetime4;
            var16Lifetime4 = (param3 & 16711935) * var15Lifetime4 & -16711936;
            var17Lifetime4 = (param3 & 65280) * var15Lifetime4 & 16711680;
            param3 = (var16Lifetime4 | var17Lifetime4) >>> 8;
            for (var18Lifetime4 = -var9; var18Lifetime4 < 0; var18Lifetime4++) {
              for (var19Lifetime4 = -var10; var19Lifetime4 < 0; var19Lifetime4++) {
                incrementValue$8 = var8;
                var8++;
                var20Lifetime4 = this.field_F[incrementValue$8];
                if (var20Lifetime4 == 0) {
                  var7++;
                } else {
                  var21Lifetime3 = this.field_E[var20Lifetime4 & 255];
                  var16Lifetime4Lifetime1 = (var21Lifetime3 & 16711935) * var14Lifetime4 & -16711936;
                  var17Lifetime4Lifetime1 = (var21Lifetime3 & 65280) * var14Lifetime4 & 16711680;
                  incrementValue$9 = var7;
                  var7++;
                  var13[incrementValue$9] = ((var16Lifetime4Lifetime1 | var17Lifetime4Lifetime1) >>> 8) + param3;
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          var14Lifetime5 = param3 >>> 24;
          var15Lifetime5 = 256 - var14Lifetime5;
          for (var16Lifetime5 = -var9; var16Lifetime5 < 0; var16Lifetime5++) {
            for (var17Lifetime5 = -var10; var17Lifetime5 < 0; var17Lifetime5++) {
              incrementValue$10 = var8;
              var8++;
              var18Lifetime5 = this.field_F[incrementValue$10];
              if (var18Lifetime5 <= 0) {
                stackIn_91_0 = 0;
              } else {
                stackIn_91_0 = this.field_E[var18Lifetime5];
              }
              var19Lifetime5 = stackIn_91_0;
              var20Lifetime5 = var19Lifetime5 + param3;
              var21Lifetime4 = (var19Lifetime5 & 16711935) + (param3 & 16711935);
              var22Lifetime3 = (var21Lifetime4 & 16777472) + (var20Lifetime5 - var21Lifetime4 & 65536);
              var22Lifetime3 = var20Lifetime5 - var22Lifetime3 | var22Lifetime3 - (var22Lifetime3 >>> 8);
              if (var19Lifetime5 == 0 &&
                var14Lifetime5 != 255) {
                var19Lifetime5 = var22Lifetime3;
                var22Lifetime3 = var28[var7];
                var22Lifetime3 = ((var19Lifetime5 & 16711935) * var14Lifetime5 + (var22Lifetime3 & 16711935) * var15Lifetime5 & -16711936) + ((var19Lifetime5 & 65280) * var14Lifetime5 + (var22Lifetime3 & 65280) * var15Lifetime5 & 16711680) >> 8;
              }
              var13[var7++] = var22Lifetime3;
            }
            var7 = var7 + var11;
            var8 = var8 + var12;
          }
          return;
        }
        return;
    }

    mt(kj param0, byte[] param1, int[] param2, int param3, int param4) {
        super(param0, param3, param4);
        this.field_F = param1;
        this.field_E = param2;
    }

    final void b(int param0, int param1) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_38_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_386_0 = 0;
        int stackIn_433_0 = 0;
        int stackIn_452_0 = 0;
        int stackIn_499_0 = 0;
        int stackIn_518_0 = 0;
        int stackIn_564_0 = 0;
        int stackIn_583_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        var3 = this.field_D.field_E;
        if (field_A == 0) {
          if (field_f == 0) {
            var5 = field_i;
            while (var5 < 0) {
              var6 = field_w;
              var7 = field_j;
              var8 = field_h;
              var9 = field_k;
              if (var7 >= 0 &&
                var8 >= 0 &&
                var7 - (this.field_o << 12) < 0 &&
                var8 - (this.field_p << 12) < 0) {
                while (var9 < 0) {
                  var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                  incrementValue$16 = var6;
                  var6++;
                  var11 = incrementValue$16;
                  var32 = var3;
                  var23 = var32;
                  var12 = var23;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 == 2) {
                              var15 = this.field_F[var10];
                              if (var15 != 0) {
                                var16 = this.field_E[var15 & 255];
                                var17 = (var16 & 16711935) * field_C & -16711936;
                                var18 = (var16 & 65280) * field_C & 16711680;
                                var16 = ((var17 | var18) >>> 8) + field_s;
                                var19 = var32[var11];
                                var20 = var16 + var19;
                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_57_0 = 0;
                            } else {
                              stackIn_57_0 = this.field_E[var15];
                            }
                            var16 = stackIn_57_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var32[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var32[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var32[var11];
                            var21 = var16 + var20;
                            var22 = (var16 & 16711935) + (var20 & 16711935);
                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = var32[var11];
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                        }
                      }
                    } else {
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 != 2) {
                              throw new IllegalArgumentException();
                            }
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              incrementValue$17 = var11;
                              var11++;
                              var12[incrementValue$17] = ((var17 | var18) >>> 8) + field_s;
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_38_0 = 0;
                            } else {
                              stackIn_38_0 = this.field_E[var15];
                            }
                            var16 = stackIn_38_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var32[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var32[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            if ((field_d & 16777215) != 16777215) {
                              if (field_C == 255) {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var12[var11] = (var17 | var18 | var19) >>> 8;
                              } else {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var16 = (var17 | var18 | var19) >>> 8;
                                var20 = var32[var11];
                                var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                              }
                            } else {
                              var17 = field_d >>> 24;
                              var18 = 256 - var17;
                              var19 = var32[var11];
                              var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                            }
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var12[var11] = this.field_E[var15 & 255];
                        }
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = (var15 & 16711935) * field_C & -16711936;
                          var17 = (var15 & 65280) * field_C & 16711680;
                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                        } else {
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = field_d;
                          var17 = var15 + var16;
                          var18 = (var15 & 16711935) + (var16 & 16711935);
                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        }
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var16 | var17 | var18) >>> 8;
                      }
                    } else {
                      var12[var11] = this.field_E[this.field_F[var10] & 255];
                    }
                  }
                  var9++;
                }
              }
              var5++;
              field_w = field_w + field_r;
            }
            return;
          }
          if (field_f >= 0) {
            var5 = field_i;
            while (var5 < 0) {
              var6 = field_w;
              var7 = field_j;
              var8 = field_h + field_c;
              var9 = field_k;
              if (var7 >= 0 &&
                var7 - (this.field_o << 12) < 0) {
                if (var8 < 0) {
                  var4 = (field_f - 1 - var8) / field_f;
                  var9 = var9 + var4;
                  var8 = var8 + field_f * var4;
                  var6 = var6 + var4;
                }
                var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
                if ((1 + var8 - (this.field_p << 12) - field_f) / field_f > var9) {
                  var9 = var4;
                }
                while (var9 < 0) {
                  var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                  incrementValue$12 = var6;
                  var6++;
                  var11 = incrementValue$12;
                  var34 = var3;
                  var25 = var34;
                  var12 = var25;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 == 2) {
                              var15 = this.field_F[var10];
                              if (var15 != 0) {
                                var16 = this.field_E[var15 & 255];
                                var17 = (var16 & 16711935) * field_C & -16711936;
                                var18 = (var16 & 65280) * field_C & 16711680;
                                var16 = ((var17 | var18) >>> 8) + field_s;
                                var19 = var34[var11];
                                var20 = var16 + var19;
                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_188_0 = 0;
                            } else {
                              stackIn_188_0 = this.field_E[var15];
                            }
                            var16 = stackIn_188_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var34[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var34[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var34[var11];
                            var21 = var16 + var20;
                            var22 = (var16 & 16711935) + (var20 & 16711935);
                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = var34[var11];
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                        }
                      }
                    } else {
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 != 2) {
                              throw new IllegalArgumentException();
                            }
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              incrementValue$13 = var11;
                              var11++;
                              var12[incrementValue$13] = ((var17 | var18) >>> 8) + field_s;
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_169_0 = 0;
                            } else {
                              stackIn_169_0 = this.field_E[var15];
                            }
                            var16 = stackIn_169_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var34[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var34[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            if ((field_d & 16777215) != 16777215) {
                              if (field_C == 255) {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var12[var11] = (var17 | var18 | var19) >>> 8;
                              } else {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var16 = (var17 | var18 | var19) >>> 8;
                                var20 = var34[var11];
                                var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                              }
                            } else {
                              var17 = field_d >>> 24;
                              var18 = 256 - var17;
                              var19 = var34[var11];
                              var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                            }
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var12[var11] = this.field_E[var15 & 255];
                        }
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = (var15 & 16711935) * field_C & -16711936;
                          var17 = (var15 & 65280) * field_C & 16711680;
                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                        } else {
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = field_d;
                          var17 = var15 + var16;
                          var18 = (var15 & 16711935) + (var16 & 16711935);
                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        }
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var16 | var17 | var18) >>> 8;
                      }
                    } else {
                      var12[var11] = this.field_E[this.field_F[var10] & 255];
                    }
                  }
                  var8 = var8 + field_f;
                  var9++;
                }
              }
              var5++;
              field_j = field_j + field_q;
              field_w = field_w + field_r;
            }
          } else {
            var5 = field_i;
            while (var5 < 0) {
              var6 = field_w;
              var7 = field_j;
              var8 = field_h + field_c;
              var9 = field_k;
              if (var7 >= 0 &&
                var7 - (this.field_o << 12) < 0) {
                var4 = var8 - (this.field_p << 12);
                if (var8 - (this.field_p << 12) >= 0) {
                  var4 = (field_f - var4) / field_f;
                  var9 = var9 + var4;
                  var8 = var8 + field_f * var4;
                  var6 = var6 + var4;
                }
                var4 = (var8 - field_f) / field_f;
                if ((var8 - field_f) / field_f > var9) {
                  var9 = var4;
                }
                while (var9 < 0) {
                  var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                  incrementValue$14 = var6;
                  var6++;
                  var11 = incrementValue$14;
                  var33 = var3;
                  var24 = var33;
                  var12 = var24;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 == 2) {
                              var15 = this.field_F[var10];
                              if (var15 != 0) {
                                var16 = this.field_E[var15 & 255];
                                var17 = (var16 & 16711935) * field_C & -16711936;
                                var18 = (var16 & 65280) * field_C & 16711680;
                                var16 = ((var17 | var18) >>> 8) + field_s;
                                var19 = var33[var11];
                                var20 = var16 + var19;
                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_123_0 = 0;
                            } else {
                              stackIn_123_0 = this.field_E[var15];
                            }
                            var16 = stackIn_123_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var33[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var33[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var33[var11];
                            var21 = var16 + var20;
                            var22 = (var16 & 16711935) + (var20 & 16711935);
                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = var33[var11];
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                        }
                      }
                    } else {
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 != 2) {
                              throw new IllegalArgumentException();
                            }
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              incrementValue$15 = var11;
                              var11++;
                              var12[incrementValue$15] = ((var17 | var18) >>> 8) + field_s;
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_104_0 = 0;
                            } else {
                              stackIn_104_0 = this.field_E[var15];
                            }
                            var16 = stackIn_104_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var33[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var33[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            if ((field_d & 16777215) != 16777215) {
                              if (field_C == 255) {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var12[var11] = (var17 | var18 | var19) >>> 8;
                              } else {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var16 = (var17 | var18 | var19) >>> 8;
                                var20 = var33[var11];
                                var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                              }
                            } else {
                              var17 = field_d >>> 24;
                              var18 = 256 - var17;
                              var19 = var33[var11];
                              var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                            }
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var12[var11] = this.field_E[var15 & 255];
                        }
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = (var15 & 16711935) * field_C & -16711936;
                          var17 = (var15 & 65280) * field_C & 16711680;
                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                        } else {
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = field_d;
                          var17 = var15 + var16;
                          var18 = (var15 & 16711935) + (var16 & 16711935);
                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        }
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var16 | var17 | var18) >>> 8;
                      }
                    } else {
                      var12[var11] = this.field_E[this.field_F[var10] & 255];
                    }
                  }
                  var8 = var8 + field_f;
                  var9++;
                }
              }
              var5++;
              field_j = field_j + field_q;
              field_w = field_w + field_r;
            }
          }
        } else if (field_A >= 0) {
          if (field_f == 0) {
            var5 = field_i;
            while (var5 < 0) {
              var6 = field_w;
              var7 = field_j + field_x;
              var8 = field_h;
              var9 = field_k;
              if (var8 >= 0 &&
                var8 - (this.field_p << 12) < 0) {
                if (var7 < 0) {
                  var4 = (field_A - 1 - var7) / field_A;
                  var9 = var9 + var4;
                  var7 = var7 + field_A * var4;
                  var6 = var6 + var4;
                }
                var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
                if ((1 + var7 - (this.field_o << 12) - field_A) / field_A > var9) {
                  var9 = var4;
                }
                while (var9 < 0) {
                  var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                  incrementValue$4 = var6;
                  var6++;
                  var11 = incrementValue$4;
                  var38 = var3;
                  var29 = var38;
                  var12 = var29;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 == 2) {
                              var15 = this.field_F[var10];
                              if (var15 != 0) {
                                var16 = this.field_E[var15 & 255];
                                var17 = (var16 & 16711935) * field_C & -16711936;
                                var18 = (var16 & 65280) * field_C & 16711680;
                                var16 = ((var17 | var18) >>> 8) + field_s;
                                var19 = var38[var11];
                                var20 = var16 + var19;
                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_452_0 = 0;
                            } else {
                              stackIn_452_0 = this.field_E[var15];
                            }
                            var16 = stackIn_452_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var38[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var38[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var38[var11];
                            var21 = var16 + var20;
                            var22 = (var16 & 16711935) + (var20 & 16711935);
                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = var38[var11];
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                        }
                      }
                    } else {
                      if (var13 != 1) {
                        if (var13 != 0) {
                          if (var13 != 3) {
                            if (var13 != 2) {
                              throw new IllegalArgumentException();
                            }
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              incrementValue$5 = var11;
                              var11++;
                              var12[incrementValue$5] = ((var17 | var18) >>> 8) + field_s;
                            }
                          } else {
                            var15 = this.field_F[var10];
                            if (var15 <= 0) {
                              stackIn_433_0 = 0;
                            } else {
                              stackIn_433_0 = this.field_E[var15];
                            }
                            var16 = stackIn_433_0;
                            var17 = field_d;
                            var18 = var16 + var17;
                            var19 = (var16 & 16711935) + (var17 & 16711935);
                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                            if (var16 == 0 &&
                              field_C != 255) {
                              var16 = var20;
                              var20 = var38[var11];
                              var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                            var38[var11] = var20;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            if ((field_d & 16777215) != 16777215) {
                              if (field_C == 255) {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var12[var11] = (var17 | var18 | var19) >>> 8;
                              } else {
                                var17 = (var16 & 16711680) * field_n & -16777216;
                                var18 = (var16 & 65280) * field_e & 16711680;
                                var19 = (var16 & 255) * field_b & 65280;
                                var16 = (var17 | var18 | var19) >>> 8;
                                var20 = var38[var11];
                                var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                              }
                            } else {
                              var17 = field_d >>> 24;
                              var18 = 256 - var17;
                              var19 = var38[var11];
                              var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                            }
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var12[var11] = this.field_E[var15 & 255];
                        }
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = (var15 & 16711935) * field_C & -16711936;
                          var17 = (var15 & 65280) * field_C & 16711680;
                          var12[var11] = ((var16 | var17) >>> 8) + field_s;
                        } else {
                          var15 = this.field_E[this.field_F[var10] & 255];
                          var16 = field_d;
                          var17 = var15 + var16;
                          var18 = (var15 & 16711935) + (var16 & 16711935);
                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        }
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var16 | var17 | var18) >>> 8;
                      }
                    } else {
                      var12[var11] = this.field_E[this.field_F[var10] & 255];
                    }
                  }
                  var7 = var7 + field_A;
                  var9++;
                }
              }
              var5++;
              field_j = field_j + field_q;
              field_h = field_h + field_v;
              field_w = field_w + field_r;
            }
          } else if (field_f >= 0) {
            for (var5 = field_i; var5 < 0; var5++) {
              var6 = field_w;
              var7 = field_j + field_x;
              var8 = field_h + field_c;
              var9 = field_k;
              if (var7 < 0) {
                var4 = (field_A - 1 - var7) / field_A;
                var9 = var9 + var4;
                var7 = var7 + field_A * var4;
                var8 = var8 + field_f * var4;
                var6 = var6 + var4;
              }
              var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
              if ((1 + var7 - (this.field_o << 12) - field_A) / field_A > var9) {
                var9 = var4;
              }
              if (var8 < 0) {
                var4 = (field_f - 1 - var8) / field_f;
                var9 = var9 + var4;
                var7 = var7 + field_A * var4;
                var8 = var8 + field_f * var4;
                var6 = var6 + var4;
              }
              var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
              if ((1 + var8 - (this.field_p << 12) - field_f) / field_f > var9) {
                var9 = var4;
              }
              while (var9 < 0) {
                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                incrementValue$0 = var6;
                var6++;
                var11 = incrementValue$0;
                var40 = var3;
                var31 = var40;
                var12 = var31;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 == 2) {
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              var16 = ((var17 | var18) >>> 8) + field_s;
                              var19 = var40[var11];
                              var20 = var16 + var19;
                              var21 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                            }
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_583_0 = 0;
                          } else {
                            stackIn_583_0 = this.field_E[var15];
                          }
                          var16 = stackIn_583_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var40[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var40[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = (var16 & 16711680) * field_n & -16777216;
                          var18 = (var16 & 65280) * field_e & 16711680;
                          var19 = (var16 & 255) * field_b & 65280;
                          var16 = (var17 | var18 | var19) >>> 8;
                          var20 = var40[var11];
                          var21 = var16 + var20;
                          var22 = (var16 & 16711935) + (var20 & 16711935);
                          var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                          var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        var17 = var40[var11];
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711935) * field_C & -16711936;
                            var18 = (var16 & 65280) * field_C & 16711680;
                            incrementValue$1 = var11;
                            var11++;
                            var12[incrementValue$1] = ((var17 | var18) >>> 8) + field_s;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_564_0 = 0;
                          } else {
                            stackIn_564_0 = this.field_E[var15];
                          }
                          var16 = stackIn_564_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var40[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var40[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          if ((field_d & 16777215) != 16777215) {
                            if (field_C == 255) {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var12[var11] = (var17 | var18 | var19) >>> 8;
                            } else {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var16 = (var17 | var18 | var19) >>> 8;
                              var20 = var40[var11];
                              var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                          } else {
                            var17 = field_d >>> 24;
                            var18 = 256 - var17;
                            var19 = var40[var11];
                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                          }
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var12[var11] = this.field_E[var15 & 255];
                      }
                    }
                  }
                } else {
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 != 2) {
                          throw new IllegalArgumentException();
                        }
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var12[var11] = ((var16 | var17) >>> 8) + field_s;
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      }
                    } else {
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var16 | var17 | var18) >>> 8;
                    }
                  } else {
                    var12[var11] = this.field_E[this.field_F[var10] & 255];
                  }
                }
                var7 = var7 + field_A;
                var8 = var8 + field_f;
                var9++;
              }
              field_j = field_j + field_q;
              field_h = field_h + field_v;
              field_w = field_w + field_r;
            }
          } else {
            for (var5 = field_i; var5 < 0; var5++) {
              var6 = field_w;
              var7 = field_j + field_x;
              var8 = field_h + field_c;
              var9 = field_k;
              if (var7 < 0) {
                var4 = (field_A - 1 - var7) / field_A;
                var9 = var9 + var4;
                var7 = var7 + field_A * var4;
                var8 = var8 + field_f * var4;
                var6 = var6 + var4;
              }
              var4 = (1 + var7 - (this.field_o << 12) - field_A) / field_A;
              if ((1 + var7 - (this.field_o << 12) - field_A) / field_A > var9) {
                var9 = var4;
              }
              var4 = var8 - (this.field_p << 12);
              if (var8 - (this.field_p << 12) >= 0) {
                var4 = (field_f - var4) / field_f;
                var9 = var9 + var4;
                var7 = var7 + field_A * var4;
                var8 = var8 + field_f * var4;
                var6 = var6 + var4;
              }
              var4 = (var8 - field_f) / field_f;
              if ((var8 - field_f) / field_f > var9) {
                var9 = var4;
              }
              while (var9 < 0) {
                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                incrementValue$2 = var6;
                var6++;
                var11 = incrementValue$2;
                var39 = var3;
                var30 = var39;
                var12 = var30;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 == 2) {
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              var16 = ((var17 | var18) >>> 8) + field_s;
                              var19 = var39[var11];
                              var20 = var16 + var19;
                              var21 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                            }
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_518_0 = 0;
                          } else {
                            stackIn_518_0 = this.field_E[var15];
                          }
                          var16 = stackIn_518_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var39[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var39[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = (var16 & 16711680) * field_n & -16777216;
                          var18 = (var16 & 65280) * field_e & 16711680;
                          var19 = (var16 & 255) * field_b & 65280;
                          var16 = (var17 | var18 | var19) >>> 8;
                          var20 = var39[var11];
                          var21 = var16 + var20;
                          var22 = (var16 & 16711935) + (var20 & 16711935);
                          var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                          var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        var17 = var39[var11];
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711935) * field_C & -16711936;
                            var18 = (var16 & 65280) * field_C & 16711680;
                            incrementValue$3 = var11;
                            var11++;
                            var12[incrementValue$3] = ((var17 | var18) >>> 8) + field_s;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_499_0 = 0;
                          } else {
                            stackIn_499_0 = this.field_E[var15];
                          }
                          var16 = stackIn_499_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var39[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var39[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          if ((field_d & 16777215) != 16777215) {
                            if (field_C == 255) {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var12[var11] = (var17 | var18 | var19) >>> 8;
                            } else {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var16 = (var17 | var18 | var19) >>> 8;
                              var20 = var39[var11];
                              var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                          } else {
                            var17 = field_d >>> 24;
                            var18 = 256 - var17;
                            var19 = var39[var11];
                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                          }
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var12[var11] = this.field_E[var15 & 255];
                      }
                    }
                  }
                } else {
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 != 2) {
                          throw new IllegalArgumentException();
                        }
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var12[var11] = ((var16 | var17) >>> 8) + field_s;
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      }
                    } else {
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var16 | var17 | var18) >>> 8;
                    }
                  } else {
                    var12[var11] = this.field_E[this.field_F[var10] & 255];
                  }
                }
                var7 = var7 + field_A;
                var8 = var8 + field_f;
                var9++;
              }
              field_j = field_j + field_q;
              field_h = field_h + field_v;
              field_w = field_w + field_r;
            }
          }
        } else if (field_f == 0) {
          var5 = field_i;
          while (var5 < 0) {
            var6 = field_w;
            var7 = field_j + field_x;
            var8 = field_h;
            var9 = field_k;
            if (var8 >= 0 &&
              var8 - (this.field_p << 12) < 0) {
              var4 = var7 - (this.field_o << 12);
              if (var7 - (this.field_o << 12) >= 0) {
                var4 = (field_A - var4) / field_A;
                var9 = var9 + var4;
                var7 = var7 + field_A * var4;
                var6 = var6 + var4;
              }
              var4 = (var7 - field_A) / field_A;
              if ((var7 - field_A) / field_A > var9) {
                var9 = var4;
              }
              while (var9 < 0) {
                var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
                incrementValue$10 = var6;
                var6++;
                var11 = incrementValue$10;
                var35 = var3;
                var26 = var35;
                var12 = var26;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 == 2) {
                            var15 = this.field_F[var10];
                            if (var15 != 0) {
                              var16 = this.field_E[var15 & 255];
                              var17 = (var16 & 16711935) * field_C & -16711936;
                              var18 = (var16 & 65280) * field_C & 16711680;
                              var16 = ((var17 | var18) >>> 8) + field_s;
                              var19 = var35[var11];
                              var20 = var16 + var19;
                              var21 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                            }
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_255_0 = 0;
                          } else {
                            stackIn_255_0 = this.field_E[var15];
                          }
                          var16 = stackIn_255_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var35[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var35[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = (var16 & 16711680) * field_n & -16777216;
                          var18 = (var16 & 65280) * field_e & 16711680;
                          var19 = (var16 & 255) * field_b & 65280;
                          var16 = (var17 | var18 | var19) >>> 8;
                          var20 = var35[var11];
                          var21 = var16 + var20;
                          var22 = (var16 & 16711935) + (var20 & 16711935);
                          var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                          var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        var17 = var35[var11];
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                      }
                    }
                  } else {
                    if (var13 != 1) {
                      if (var13 != 0) {
                        if (var13 != 3) {
                          if (var13 != 2) {
                            throw new IllegalArgumentException();
                          }
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711935) * field_C & -16711936;
                            var18 = (var16 & 65280) * field_C & 16711680;
                            incrementValue$11 = var11;
                            var11++;
                            var12[incrementValue$11] = ((var17 | var18) >>> 8) + field_s;
                          }
                        } else {
                          var15 = this.field_F[var10];
                          if (var15 <= 0) {
                            stackIn_236_0 = 0;
                          } else {
                            stackIn_236_0 = this.field_E[var15];
                          }
                          var16 = stackIn_236_0;
                          var17 = field_d;
                          var18 = var16 + var17;
                          var19 = (var16 & 16711935) + (var17 & 16711935);
                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                          if (var16 == 0 &&
                            field_C != 255) {
                            var16 = var20;
                            var20 = var35[var11];
                            var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                          var35[var11] = var20;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          if ((field_d & 16777215) != 16777215) {
                            if (field_C == 255) {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var12[var11] = (var17 | var18 | var19) >>> 8;
                            } else {
                              var17 = (var16 & 16711680) * field_n & -16777216;
                              var18 = (var16 & 65280) * field_e & 16711680;
                              var19 = (var16 & 255) * field_b & 65280;
                              var16 = (var17 | var18 | var19) >>> 8;
                              var20 = var35[var11];
                              var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                            }
                          } else {
                            var17 = field_d >>> 24;
                            var18 = 256 - var17;
                            var19 = var35[var11];
                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                          }
                        }
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var12[var11] = this.field_E[var15 & 255];
                      }
                    }
                  }
                } else {
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 != 2) {
                          throw new IllegalArgumentException();
                        }
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var12[var11] = ((var16 | var17) >>> 8) + field_s;
                      } else {
                        var15 = this.field_E[this.field_F[var10] & 255];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      }
                    } else {
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var16 | var17 | var18) >>> 8;
                    }
                  } else {
                    var12[var11] = this.field_E[this.field_F[var10] & 255];
                  }
                }
                var7 = var7 + field_A;
                var9++;
              }
            }
            var5++;
            field_h = field_h + field_v;
            field_w = field_w + field_r;
          }
        } else if (field_f >= 0) {
          var5 = field_i;
          while (var5 < 0) {
            var6 = field_w;
            var7 = field_j + field_x;
            var8 = field_h + field_c;
            var9 = field_k;
            var4 = var7 - (this.field_o << 12);
            if (var7 - (this.field_o << 12) >= 0) {
              var4 = (field_A - var4) / field_A;
              var9 = var9 + var4;
              var7 = var7 + field_A * var4;
              var8 = var8 + field_f * var4;
              var6 = var6 + var4;
            }
            var4 = (var7 - field_A) / field_A;
            if ((var7 - field_A) / field_A > var9) {
              var9 = var4;
            }
            if (var8 < 0) {
              var4 = (field_f - 1 - var8) / field_f;
              var9 = var9 + var4;
              var7 = var7 + field_A * var4;
              var8 = var8 + field_f * var4;
              var6 = var6 + var4;
            }
            var4 = (1 + var8 - (this.field_p << 12) - field_f) / field_f;
            if ((1 + var8 - (this.field_p << 12) - field_f) / field_f > var9) {
              var9 = var4;
            }
            while (var9 < 0) {
              var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
              incrementValue$6 = var6;
              var6++;
              var11 = incrementValue$6;
              var37 = var3;
              var28 = var37;
              var12 = var28;
              var13 = param0;
              var14 = param1;
              if (var14 != 0) {
                if (var14 != 1) {
                  if (var14 != 2) {
                    throw new IllegalArgumentException();
                  }
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 == 2) {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711935) * field_C & -16711936;
                            var18 = (var16 & 65280) * field_C & 16711680;
                            var16 = ((var17 | var18) >>> 8) + field_s;
                            var19 = var37[var11];
                            var20 = var16 + var19;
                            var21 = (var16 & 16711935) + (var19 & 16711935);
                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 <= 0) {
                          stackIn_386_0 = 0;
                        } else {
                          stackIn_386_0 = this.field_E[var15];
                        }
                        var16 = stackIn_386_0;
                        var17 = field_d;
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                        if (var16 == 0 &&
                          field_C != 255) {
                          var16 = var20;
                          var20 = var37[var11];
                          var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                        }
                        var37[var11] = var20;
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        var17 = (var16 & 16711680) * field_n & -16777216;
                        var18 = (var16 & 65280) * field_e & 16711680;
                        var19 = (var16 & 255) * field_b & 65280;
                        var16 = (var17 | var18 | var19) >>> 8;
                        var20 = var37[var11];
                        var21 = var16 + var20;
                        var22 = (var16 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                      }
                    }
                  } else {
                    var15 = this.field_F[var10];
                    if (var15 != 0) {
                      var16 = this.field_E[var15 & 255];
                      var17 = var37[var11];
                      var18 = var16 + var17;
                      var19 = (var16 & 16711935) + (var17 & 16711935);
                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                    }
                  }
                } else {
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 != 2) {
                          throw new IllegalArgumentException();
                        }
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = (var16 & 16711935) * field_C & -16711936;
                          var18 = (var16 & 65280) * field_C & 16711680;
                          incrementValue$7 = var11;
                          var11++;
                          var12[incrementValue$7] = ((var17 | var18) >>> 8) + field_s;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 <= 0) {
                          stackIn_367_0 = 0;
                        } else {
                          stackIn_367_0 = this.field_E[var15];
                        }
                        var16 = stackIn_367_0;
                        var17 = field_d;
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                        if (var16 == 0 &&
                          field_C != 255) {
                          var16 = var20;
                          var20 = var37[var11];
                          var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                        }
                        var37[var11] = var20;
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        if ((field_d & 16777215) != 16777215) {
                          if (field_C == 255) {
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var12[var11] = (var17 | var18 | var19) >>> 8;
                          } else {
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var37[var11];
                            var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                        } else {
                          var17 = field_d >>> 24;
                          var18 = 256 - var17;
                          var19 = var37[var11];
                          var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                        }
                      }
                    }
                  } else {
                    var15 = this.field_F[var10];
                    if (var15 != 0) {
                      var12[var11] = this.field_E[var15 & 255];
                    }
                  }
                }
              } else {
                if (var13 != 1) {
                  if (var13 != 0) {
                    if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = (var15 & 16711935) * field_C & -16711936;
                      var17 = (var15 & 65280) * field_C & 16711680;
                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                    } else {
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                  } else {
                    var15 = this.field_E[this.field_F[var10] & 255];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  }
                } else {
                  var12[var11] = this.field_E[this.field_F[var10] & 255];
                }
              }
              var7 = var7 + field_A;
              var8 = var8 + field_f;
              var9++;
            }
            var5++;
            field_j = field_j + field_q;
            field_h = field_h + field_v;
            field_w = field_w + field_r;
          }
        } else {
          var5 = field_i;
          while (var5 < 0) {
            var6 = field_w;
            var7 = field_j + field_x;
            var8 = field_h + field_c;
            var9 = field_k;
            var4 = var7 - (this.field_o << 12);
            if (var7 - (this.field_o << 12) >= 0) {
              var4 = (field_A - var4) / field_A;
              var9 = var9 + var4;
              var7 = var7 + field_A * var4;
              var8 = var8 + field_f * var4;
              var6 = var6 + var4;
            }
            var4 = (var7 - field_A) / field_A;
            if ((var7 - field_A) / field_A > var9) {
              var9 = var4;
            }
            var4 = var8 - (this.field_p << 12);
            if (var8 - (this.field_p << 12) >= 0) {
              var4 = (field_f - var4) / field_f;
              var9 = var9 + var4;
              var7 = var7 + field_A * var4;
              var8 = var8 + field_f * var4;
              var6 = var6 + var4;
            }
            var4 = (var8 - field_f) / field_f;
            if ((var8 - field_f) / field_f > var9) {
              var9 = var4;
            }
            while (var9 < 0) {
              var10 = (var8 >> 12) * this.field_o + (var7 >> 12);
              incrementValue$8 = var6;
              var6++;
              var11 = incrementValue$8;
              var36 = var3;
              var27 = var36;
              var12 = var27;
              var13 = param0;
              var14 = param1;
              if (var14 != 0) {
                if (var14 != 1) {
                  if (var14 != 2) {
                    throw new IllegalArgumentException();
                  }
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 == 2) {
                          var15 = this.field_F[var10];
                          if (var15 != 0) {
                            var16 = this.field_E[var15 & 255];
                            var17 = (var16 & 16711935) * field_C & -16711936;
                            var18 = (var16 & 65280) * field_C & 16711680;
                            var16 = ((var17 | var18) >>> 8) + field_s;
                            var19 = var36[var11];
                            var20 = var16 + var19;
                            var21 = (var16 & 16711935) + (var19 & 16711935);
                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                          }
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 <= 0) {
                          stackIn_321_0 = 0;
                        } else {
                          stackIn_321_0 = this.field_E[var15];
                        }
                        var16 = stackIn_321_0;
                        var17 = field_d;
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                        if (var16 == 0 &&
                          field_C != 255) {
                          var16 = var20;
                          var20 = var36[var11];
                          var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                        }
                        var36[var11] = var20;
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        var17 = (var16 & 16711680) * field_n & -16777216;
                        var18 = (var16 & 65280) * field_e & 16711680;
                        var19 = (var16 & 255) * field_b & 65280;
                        var16 = (var17 | var18 | var19) >>> 8;
                        var20 = var36[var11];
                        var21 = var16 + var20;
                        var22 = (var16 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                      }
                    }
                  } else {
                    var15 = this.field_F[var10];
                    if (var15 != 0) {
                      var16 = this.field_E[var15 & 255];
                      var17 = var36[var11];
                      var18 = var16 + var17;
                      var19 = (var16 & 16711935) + (var17 & 16711935);
                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                    }
                  }
                } else {
                  if (var13 != 1) {
                    if (var13 != 0) {
                      if (var13 != 3) {
                        if (var13 != 2) {
                          throw new IllegalArgumentException();
                        }
                        var15 = this.field_F[var10];
                        if (var15 != 0) {
                          var16 = this.field_E[var15 & 255];
                          var17 = (var16 & 16711935) * field_C & -16711936;
                          var18 = (var16 & 65280) * field_C & 16711680;
                          incrementValue$9 = var11;
                          var11++;
                          var12[incrementValue$9] = ((var17 | var18) >>> 8) + field_s;
                        }
                      } else {
                        var15 = this.field_F[var10];
                        if (var15 <= 0) {
                          stackIn_302_0 = 0;
                        } else {
                          stackIn_302_0 = this.field_E[var15];
                        }
                        var16 = stackIn_302_0;
                        var17 = field_d;
                        var18 = var16 + var17;
                        var19 = (var16 & 16711935) + (var17 & 16711935);
                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                        if (var16 == 0 &&
                          field_C != 255) {
                          var16 = var20;
                          var20 = var36[var11];
                          var20 = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                        }
                        var36[var11] = var20;
                      }
                    } else {
                      var15 = this.field_F[var10];
                      if (var15 != 0) {
                        var16 = this.field_E[var15 & 255];
                        if ((field_d & 16777215) != 16777215) {
                          if (field_C == 255) {
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var12[var11] = (var17 | var18 | var19) >>> 8;
                          } else {
                            var17 = (var16 & 16711680) * field_n & -16777216;
                            var18 = (var16 & 65280) * field_e & 16711680;
                            var19 = (var16 & 255) * field_b & 65280;
                            var16 = (var17 | var18 | var19) >>> 8;
                            var20 = var36[var11];
                            var12[var11] = ((var16 & 16711935) * field_C + (var20 & 16711935) * field_a & -16711936) + ((var16 & 65280) * field_C + (var20 & 65280) * field_a & 16711680) >> 8;
                          }
                        } else {
                          var17 = field_d >>> 24;
                          var18 = 256 - var17;
                          var19 = var36[var11];
                          var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                        }
                      }
                    }
                  } else {
                    var15 = this.field_F[var10];
                    if (var15 != 0) {
                      var12[var11] = this.field_E[var15 & 255];
                    }
                  }
                }
              } else {
                if (var13 != 1) {
                  if (var13 != 0) {
                    if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = (var15 & 16711935) * field_C & -16711936;
                      var17 = (var15 & 65280) * field_C & 16711680;
                      var12[var11] = ((var16 | var17) >>> 8) + field_s;
                    } else {
                      var15 = this.field_E[this.field_F[var10] & 255];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                  } else {
                    var15 = this.field_E[this.field_F[var10] & 255];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  }
                } else {
                  var12[var11] = this.field_E[this.field_F[var10] & 255];
                }
              }
              var7 = var7 + field_A;
              var8 = var8 + field_f;
              var9++;
            }
            var5++;
            field_j = field_j + field_q;
            field_h = field_h + field_v;
            field_w = field_w + field_r;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$13 = 0;
        int incrementValue$12 = 0;
        int incrementValue$11 = 0;
        int incrementValue$10 = 0;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$9 = 0;
        int incrementValue$4 = 0;
        int incrementValue$8 = 0;
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int stackIn_44_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_142_0 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18_int;
        int[] var18;
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
        int var30;
        int var31;
        int var32;
        int var33;
        int[] var34;
        int[] var35;
        int var16Lifetime1;
        int var16Lifetime2;
        int var18_intLifetime1;
        int var18_intLifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var21Lifetime5;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        int var22Lifetime4;
        int var22Lifetime5;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var23Lifetime4;
        int var23Lifetime5;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var28Lifetime1;
        int var28Lifetime2;
        int var28Lifetime3;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var19Lifetime5;
        int var19Lifetime6;
        int var19Lifetime7;
        int var20Lifetime6;
        int var20Lifetime7;
        int var20Lifetime8;
        int var21Lifetime6;
        int var21Lifetime7;
        int var21Lifetime8;
        int var21Lifetime9;
        int var22Lifetime6;
        int var22Lifetime7;
        int var22Lifetime8;
        int var22Lifetime9;
        int var23Lifetime6;
        int var23Lifetime7;
        int var24Lifetime5;
        int var24Lifetime6;
        int var25Lifetime5;
        int var25Lifetime6;
        int var26Lifetime5;
        int var26Lifetime6;
        int var27Lifetime5;
        int var27Lifetime6;
        int var30Lifetime2;
        int var31Lifetime2;
        int var19Lifetime1Lifetime1;
        int var19Lifetime1Lifetime2;
        int var19Lifetime1Lifetime3;
        int var19Lifetime3Lifetime1;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var20Lifetime1Lifetime3;
        int var20Lifetime3Lifetime1;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime1Lifetime3;
        int var21Lifetime1Lifetime4;
        int var21Lifetime3Lifetime1;
        int var22Lifetime1Lifetime1;
        int var22Lifetime1Lifetime2;
        int var22Lifetime1Lifetime3;
        int var22Lifetime1Lifetime4;
        int var22Lifetime3Lifetime1;
        int var23Lifetime1Lifetime1;
        int var23Lifetime1Lifetime2;
        int var23Lifetime1Lifetime3;
        int var23Lifetime3Lifetime1;
        int var24Lifetime1Lifetime1;
        int var24Lifetime1Lifetime2;
        int var24Lifetime1Lifetime3;
        int var24Lifetime2Lifetime1;
        int var25Lifetime1Lifetime1;
        int var25Lifetime1Lifetime2;
        int var25Lifetime1Lifetime3;
        int var25Lifetime2Lifetime1;
        int var26Lifetime1Lifetime1;
        int var26Lifetime1Lifetime2;
        int var26Lifetime1Lifetime3;
        int var26Lifetime2Lifetime1;
        int var27Lifetime1Lifetime1;
        int var27Lifetime1Lifetime2;
        int var27Lifetime1Lifetime3;
        int var27Lifetime2Lifetime1;
        int var28Lifetime1Lifetime1;
        int var28Lifetime2Lifetime1;
        int var29Lifetime1Lifetime1;
        int var30Lifetime1Lifetime1;
        int var31Lifetime1Lifetime1;
        int var32Lifetime1Lifetime1;
        int var31Lifetime3;
        int var21Lifetime3Lifetime2;
        int var22Lifetime3Lifetime2;
        int var25Lifetime1Lifetime4;
        int var24Lifetime1Lifetime2Lifetime1;
        int var25Lifetime1Lifetime2Lifetime1;
        int var26Lifetime1Lifetime2Lifetime1;
        int var27Lifetime1Lifetime1Lifetime1;
        int var27Lifetime1Lifetime2Lifetime1;
        int var27Lifetime1Lifetime2Lifetime2;
        int var28Lifetime1Lifetime1Lifetime1;
        int var29Lifetime1Lifetime1Lifetime1;
        if (this.field_D.h()) {
          throw new IllegalStateException();
        }
        boolean decompiledFrameRemainder1 = true;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var9 = 0;
          var10 = 0;
          var11 = this.field_D.field_f;
          var12 = this.field_g + this.field_o + this.field_m;
          var13 = this.field_z + this.field_p + this.field_l;
          var14 = (var12 << 16) / param2;
          var15 = (var13 << 16) / param3;
          if (this.field_g > 0) {
            var16 = ((this.field_g << 16) + var14 - 1) / var14;
            param0 = param0 + var16;
            var9 = var9 + (var16 * var14 - (this.field_g << 16));
          }
          if (this.field_z > 0) {
            var16Lifetime1 = ((this.field_z << 16) + var15 - 1) / var15;
            param1 = param1 + var16Lifetime1;
            var10 = var10 + (var16Lifetime1 * var15 - (this.field_z << 16));
          }
          if (this.field_o < var12) {
            param2 = ((this.field_o << 16) - var9 + var14 - 1) / var14;
          }
          if (this.field_p < var13) {
            param3 = ((this.field_p << 16) - var10 + var15 - 1) / var15;
          }
          var16Lifetime2 = param0 + param1 * var11;
          var17 = var11 - param2;
          if (param1 + param3 > this.field_D.field_D) {
            param3 = param3 - (param1 + param3 - this.field_D.field_D);
          }
          if (param1 < this.field_D.field_w) {
            var18_int = this.field_D.field_w - param1;
            param3 = param3 - var18_int;
            var16Lifetime2 = var16Lifetime2 + var18_int * var11;
            var10 = var10 + var15 * var18_int;
          }
          if (param0 + param2 > this.field_D.field_k) {
            var18_intLifetime1 = param0 + param2 - this.field_D.field_k;
            param2 = param2 - var18_intLifetime1;
            var17 = var17 + var18_intLifetime1;
          }
          if (param0 < this.field_D.field_z) {
            var18_intLifetime2 = this.field_D.field_z - param0;
            param2 = param2 - var18_intLifetime2;
            var16Lifetime2 = var16Lifetime2 + var18_intLifetime2;
            var9 = var9 + var14 * var18_intLifetime2;
            var17 = var17 + var18_intLifetime2;
          }
          var35 = this.field_D.field_E;
          var34 = var35;
          var18 = var34;
          if (param6 == 0) {
            if (param4 == 1) {
              var19 = var9;
              for (var20 = -param3; var20 < 0; var20++) {
                var21 = (var10 >> 16) * this.field_o;
                for (var22 = -param2; var22 < 0; var22++) {
                  incrementValue$13 = var16Lifetime2;
                  var16Lifetime2++;
                  var18[incrementValue$13] = this.field_E[this.field_F[(var9 >> 16) + var21] & 255];
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (param4 == 0) {
                var19Lifetime5 = (param5 & 16711680) >> 16;
                var20Lifetime6 = (param5 & 65280) >> 8;
                var21Lifetime6 = param5 & 255;
                var22Lifetime6 = var9;
                for (var23 = -param3; var23 < 0; var23++) {
                  var24 = (var10 >> 16) * this.field_o;
                  for (var25 = -param2; var25 < 0; var25++) {
                    var26 = this.field_E[this.field_F[(var9 >> 16) + var24] & 255];
                    var27 = (var26 & 16711680) * var19Lifetime5 & -16777216;
                    var28 = (var26 & 65280) * var20Lifetime6 & 16711680;
                    var29 = (var26 & 255) * var21Lifetime6 & 65280;
                    incrementValue$12 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$12] = (var27 | var28 | var29) >>> 8;
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var22Lifetime6;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 == 3) {
                var19Lifetime6 = var9;
                for (var20Lifetime7 = -param3; var20Lifetime7 < 0; var20Lifetime7++) {
                  var21Lifetime7 = (var10 >> 16) * this.field_o;
                  for (var22Lifetime7 = -param2; var22Lifetime7 < 0; var22Lifetime7++) {
                    var23Lifetime6 = this.field_F[(var9 >> 16) + var21Lifetime7];
                    if (var23Lifetime6 <= 0) {
                      stackIn_44_0 = 0;
                    } else {
                      stackIn_44_0 = this.field_E[var23Lifetime6];
                    }
                    var24Lifetime5 = stackIn_44_0;
                    var25Lifetime5 = var24Lifetime5 + param5;
                    var26Lifetime5 = (var24Lifetime5 & 16711935) + (param5 & 16711935);
                    var27Lifetime5 = (var26Lifetime5 & 16777472) + (var25Lifetime5 - var26Lifetime5 & 65536);
                    incrementValue$11 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$11] = var25Lifetime5 - var27Lifetime5 | var27Lifetime5 - (var27Lifetime5 >>> 8);
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime6;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 != 2) {
                throw new IllegalArgumentException();
              }
              var19Lifetime7 = param5 >>> 24;
              var20Lifetime8 = 256 - var19Lifetime7;
              var21Lifetime8 = (param5 & 16711935) * var20Lifetime8 & -16711936;
              var22Lifetime8 = (param5 & 65280) * var20Lifetime8 & 16711680;
              param5 = (var21Lifetime8 | var22Lifetime8) >>> 8;
              var23Lifetime7 = var9;
              for (var24Lifetime6 = -param3; var24Lifetime6 < 0; var24Lifetime6++) {
                var25Lifetime6 = (var10 >> 16) * this.field_o;
                for (var26Lifetime6 = -param2; var26Lifetime6 < 0; var26Lifetime6++) {
                  var27Lifetime6 = this.field_E[this.field_F[(var9 >> 16) + var25Lifetime6] & 255];
                  var21Lifetime9 = (var27Lifetime6 & 16711935) * var19Lifetime7 & -16711936;
                  var22Lifetime9 = (var27Lifetime6 & 65280) * var19Lifetime7 & 16711680;
                  incrementValue$10 = var16Lifetime2;
                  var16Lifetime2++;
                  var18[incrementValue$10] = ((var21Lifetime9 | var22Lifetime9) >>> 8) + param5;
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var23Lifetime7;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
          }
          if (decompiledFrameRemainder1) {
            if (param6 != 1) {
              if (param6 != 2) {
                throw new IllegalArgumentException();
              }
              if (param4 == 1) {
                var19Lifetime1 = var9;
                for (var20Lifetime1 = -param3; var20Lifetime1 < 0; var20Lifetime1++) {
                  var21Lifetime1 = (var10 >> 16) * this.field_o;
                  for (var22Lifetime1 = -param2; var22Lifetime1 < 0; var22Lifetime1++) {
                    var23Lifetime1 = this.field_F[(var9 >> 16) + var21Lifetime1];
                    if (var23Lifetime1 == 0) {
                      var16Lifetime2++;
                    } else {
                      var24Lifetime1 = this.field_E[var23Lifetime1 & 255];
                      var25Lifetime1 = var35[var16Lifetime2];
                      var26Lifetime1 = var24Lifetime1 + var25Lifetime1;
                      var27Lifetime1 = (var24Lifetime1 & 16711935) + (var25Lifetime1 & 16711935);
                      var25Lifetime1Lifetime4 = (var27Lifetime1 & 16777472) + (var26Lifetime1 - var27Lifetime1 & 65536);
                      incrementValue$3 = var16Lifetime2;
                      var16Lifetime2++;
                      var18[incrementValue$3] = var26Lifetime1 - var25Lifetime1Lifetime4 | var25Lifetime1Lifetime4 - (var25Lifetime1Lifetime4 >>> 8);
                    }
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime1;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 == 0) {
                var19Lifetime1Lifetime1 = var9;
                var20Lifetime1Lifetime1 = (param5 & 16711680) >> 16;
                var21Lifetime1Lifetime1 = (param5 & 65280) >> 8;
                var22Lifetime1Lifetime1 = param5 & 255;
                for (var23Lifetime1Lifetime1 = -param3; var23Lifetime1Lifetime1 < 0; var23Lifetime1Lifetime1++) {
                  var24Lifetime1Lifetime1 = (var10 >> 16) * this.field_o;
                  for (var25Lifetime1Lifetime1 = -param2; var25Lifetime1Lifetime1 < 0; var25Lifetime1Lifetime1++) {
                    var26Lifetime1Lifetime1 = this.field_F[(var9 >> 16) + var24Lifetime1Lifetime1];
                    if (var26Lifetime1Lifetime1 == 0) {
                      var16Lifetime2++;
                    } else {
                      var27Lifetime1Lifetime1 = this.field_E[var26Lifetime1Lifetime1 & 255];
                      var28Lifetime1 = (var27Lifetime1Lifetime1 & 16711680) * var20Lifetime1Lifetime1 & -16777216;
                      var29Lifetime1 = (var27Lifetime1Lifetime1 & 65280) * var21Lifetime1Lifetime1 & 16711680;
                      var30 = (var27Lifetime1Lifetime1 & 255) * var22Lifetime1Lifetime1 & 65280;
                      var27Lifetime1Lifetime1Lifetime1 = (var28Lifetime1 | var29Lifetime1 | var30) >>> 8;
                      var31 = var35[var16Lifetime2];
                      var32 = var27Lifetime1Lifetime1Lifetime1 + var31;
                      var33 = (var27Lifetime1Lifetime1Lifetime1 & 16711935) + (var31 & 16711935);
                      var31Lifetime3 = (var33 & 16777472) + (var32 - var33 & 65536);
                      incrementValue$2 = var16Lifetime2;
                      var16Lifetime2++;
                      var18[incrementValue$2] = var32 - var31Lifetime3 | var31Lifetime3 - (var31Lifetime3 >>> 8);
                    }
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime1Lifetime1;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 == 3) {
                var19Lifetime1Lifetime2 = var9;
                for (var20Lifetime1Lifetime2 = -param3; var20Lifetime1Lifetime2 < 0; var20Lifetime1Lifetime2++) {
                  var21Lifetime1Lifetime2 = (var10 >> 16) * this.field_o;
                  for (var22Lifetime1Lifetime2 = -param2; var22Lifetime1Lifetime2 < 0; var22Lifetime1Lifetime2++) {
                    var23Lifetime1Lifetime2 = this.field_F[(var9 >> 16) + var21Lifetime1Lifetime2];
                    if (var23Lifetime1Lifetime2 <= 0) {
                      stackIn_142_0 = 0;
                    } else {
                      stackIn_142_0 = this.field_E[var23Lifetime1Lifetime2];
                    }
                    var24Lifetime1Lifetime2 = stackIn_142_0;
                    var25Lifetime1Lifetime2 = var24Lifetime1Lifetime2 + param5;
                    var26Lifetime1Lifetime2 = (var24Lifetime1Lifetime2 & 16711935) + (param5 & 16711935);
                    var27Lifetime1Lifetime2 = (var26Lifetime1Lifetime2 & 16777472) + (var25Lifetime1Lifetime2 - var26Lifetime1Lifetime2 & 65536);
                    var24Lifetime1Lifetime2Lifetime1 = var25Lifetime1Lifetime2 - var27Lifetime1Lifetime2 | var27Lifetime1Lifetime2 - (var27Lifetime1Lifetime2 >>> 8);
                    var27Lifetime1Lifetime2Lifetime1 = var35[var16Lifetime2];
                    var25Lifetime1Lifetime2Lifetime1 = var24Lifetime1Lifetime2Lifetime1 + var27Lifetime1Lifetime2Lifetime1;
                    var26Lifetime1Lifetime2Lifetime1 = (var24Lifetime1Lifetime2Lifetime1 & 16711935) + (var27Lifetime1Lifetime2Lifetime1 & 16711935);
                    var27Lifetime1Lifetime2Lifetime2 = (var26Lifetime1Lifetime2Lifetime1 & 16777472) + (var25Lifetime1Lifetime2Lifetime1 - var26Lifetime1Lifetime2Lifetime1 & 65536);
                    incrementValue$1 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$1] = var25Lifetime1Lifetime2Lifetime1 - var27Lifetime1Lifetime2Lifetime2 | var27Lifetime1Lifetime2Lifetime2 - (var27Lifetime1Lifetime2Lifetime2 >>> 8);
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime1Lifetime2;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 != 2) {
                throw new IllegalArgumentException();
              }
              var19Lifetime1Lifetime3 = param5 >>> 24;
              var20Lifetime1Lifetime3 = 256 - var19Lifetime1Lifetime3;
              var21Lifetime1Lifetime3 = (param5 & 16711935) * var20Lifetime1Lifetime3 & -16711936;
              var22Lifetime1Lifetime3 = (param5 & 65280) * var20Lifetime1Lifetime3 & 16711680;
              param5 = (var21Lifetime1Lifetime3 | var22Lifetime1Lifetime3) >>> 8;
              var23Lifetime1Lifetime3 = var9;
              for (var24Lifetime1Lifetime3 = -param3; var24Lifetime1Lifetime3 < 0; var24Lifetime1Lifetime3++) {
                var25Lifetime1Lifetime3 = (var10 >> 16) * this.field_o;
                for (var26Lifetime1Lifetime3 = -param2; var26Lifetime1Lifetime3 < 0; var26Lifetime1Lifetime3++) {
                  var27Lifetime1Lifetime3 = this.field_F[(var9 >> 16) + var25Lifetime1Lifetime3];
                  if (var27Lifetime1Lifetime3 == 0) {
                    var16Lifetime2++;
                  } else {
                    var28Lifetime1Lifetime1 = this.field_E[var27Lifetime1Lifetime3 & 255];
                    var21Lifetime1Lifetime4 = (var28Lifetime1Lifetime1 & 16711935) * var19Lifetime1Lifetime3 & -16711936;
                    var22Lifetime1Lifetime4 = (var28Lifetime1Lifetime1 & 65280) * var19Lifetime1Lifetime3 & 16711680;
                    var28Lifetime1Lifetime1Lifetime1 = ((var21Lifetime1Lifetime4 | var22Lifetime1Lifetime4) >>> 8) + param5;
                    var29Lifetime1Lifetime1 = var35[var16Lifetime2];
                    var30Lifetime2 = var28Lifetime1Lifetime1Lifetime1 + var29Lifetime1Lifetime1;
                    var31Lifetime2 = (var28Lifetime1Lifetime1Lifetime1 & 16711935) + (var29Lifetime1Lifetime1 & 16711935);
                    var29Lifetime1Lifetime1Lifetime1 = (var31Lifetime2 & 16777472) + (var30Lifetime2 - var31Lifetime2 & 65536);
                    incrementValue$0 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$0] = var30Lifetime2 - var29Lifetime1Lifetime1Lifetime1 | var29Lifetime1Lifetime1Lifetime1 - (var29Lifetime1Lifetime1Lifetime1 >>> 8);
                  }
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var23Lifetime1Lifetime3;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            if (param4 == 1) {
              var19Lifetime2 = var9;
              for (var20Lifetime2 = -param3; var20Lifetime2 < 0; var20Lifetime2++) {
                var21Lifetime2 = (var10 >> 16) * this.field_o;
                for (var22Lifetime2 = -param2; var22Lifetime2 < 0; var22Lifetime2++) {
                  var23Lifetime2 = this.field_F[(var9 >> 16) + var21Lifetime2];
                  if (var23Lifetime2 == 0) {
                    var16Lifetime2++;
                  } else {
                    incrementValue$9 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$9] = this.field_E[var23Lifetime2 & 255];
                  }
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime2;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            if (param4 != 0) {
              if (param4 != 3) {
                if (param4 != 2) {
                  throw new IllegalArgumentException();
                }
                var19Lifetime3 = param5 >>> 24;
                var20Lifetime3 = 256 - var19Lifetime3;
                var21Lifetime3 = (param5 & 16711935) * var20Lifetime3 & -16711936;
                var22Lifetime3 = (param5 & 65280) * var20Lifetime3 & 16711680;
                param5 = (var21Lifetime3 | var22Lifetime3) >>> 8;
                var23Lifetime3 = var9;
                for (var24Lifetime2 = -param3; var24Lifetime2 < 0; var24Lifetime2++) {
                  var25Lifetime2 = (var10 >> 16) * this.field_o;
                  for (var26Lifetime2 = -param2; var26Lifetime2 < 0; var26Lifetime2++) {
                    var27Lifetime2 = this.field_F[(var9 >> 16) + var25Lifetime2];
                    if (var27Lifetime2 == 0) {
                      var16Lifetime2++;
                    } else {
                      var28Lifetime2 = this.field_E[var27Lifetime2 & 255];
                      var21Lifetime3Lifetime2 = (var28Lifetime2 & 16711935) * var19Lifetime3 & -16711936;
                      var22Lifetime3Lifetime2 = (var28Lifetime2 & 65280) * var19Lifetime3 & 16711680;
                      incrementValue$4 = var16Lifetime2;
                      var16Lifetime2++;
                      var18[incrementValue$4] = ((var21Lifetime3Lifetime2 | var22Lifetime3Lifetime2) >>> 8) + param5;
                    }
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var23Lifetime3;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              var19Lifetime3Lifetime1 = var9;
              var20Lifetime3Lifetime1 = param5 >>> 24;
              var21Lifetime3Lifetime1 = 256 - var20Lifetime3Lifetime1;
              for (var22Lifetime3Lifetime1 = -param3; var22Lifetime3Lifetime1 < 0; var22Lifetime3Lifetime1++) {
                var23Lifetime3Lifetime1 = (var10 >> 16) * this.field_o;
                for (var24Lifetime2Lifetime1 = -param2; var24Lifetime2Lifetime1 < 0; var24Lifetime2Lifetime1++) {
                  var25Lifetime2Lifetime1 = this.field_F[(var9 >> 16) + var23Lifetime3Lifetime1];
                  if (var25Lifetime2Lifetime1 <= 0) {
                    stackIn_97_0 = 0;
                  } else {
                    stackIn_97_0 = this.field_E[var25Lifetime2Lifetime1];
                  }
                  var26Lifetime2Lifetime1 = stackIn_97_0;
                  var27Lifetime2Lifetime1 = var26Lifetime2Lifetime1 + param5;
                  var28Lifetime2Lifetime1 = (var26Lifetime2Lifetime1 & 16711935) + (param5 & 16711935);
                  var29Lifetime2 = (var28Lifetime2Lifetime1 & 16777472) + (var27Lifetime2Lifetime1 - var28Lifetime2Lifetime1 & 65536);
                  var29Lifetime2 = var27Lifetime2Lifetime1 - var29Lifetime2 | var29Lifetime2 - (var29Lifetime2 >>> 8);
                  if (var26Lifetime2Lifetime1 == 0 &&
                    var20Lifetime3Lifetime1 != 255) {
                    var26Lifetime2Lifetime1 = var29Lifetime2;
                    var29Lifetime2 = var35[var16Lifetime2];
                    var29Lifetime2 = ((var26Lifetime2Lifetime1 & 16711935) * var20Lifetime3Lifetime1 + (var29Lifetime2 & 16711935) * var21Lifetime3Lifetime1 & -16711936) + ((var26Lifetime2Lifetime1 & 65280) * var20Lifetime3Lifetime1 + (var29Lifetime2 & 65280) * var21Lifetime3Lifetime1 & 16711680) >> 8;
                  }
                  var18[var16Lifetime2++] = var29Lifetime2;
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime3Lifetime1;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            var19Lifetime4 = var9;
            if ((param5 & 16777215) == 16777215) {
              var20Lifetime4 = param5 >>> 24;
              var21Lifetime4 = 256 - var20Lifetime4;
              for (var22Lifetime4 = -param3; var22Lifetime4 < 0; var22Lifetime4++) {
                var23Lifetime4 = (var10 >> 16) * this.field_o;
                for (var24Lifetime3 = -param2; var24Lifetime3 < 0; var24Lifetime3++) {
                  var25Lifetime3 = this.field_F[(var9 >> 16) + var23Lifetime4];
                  if (var25Lifetime3 == 0) {
                    var16Lifetime2++;
                  } else {
                    var26Lifetime3 = this.field_E[var25Lifetime3 & 255];
                    var27Lifetime3 = var35[var16Lifetime2];
                    incrementValue$8 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$8] = ((var26Lifetime3 & 16711935) * var20Lifetime4 + (var27Lifetime3 & 16711935) * var21Lifetime4 & -16711936) + ((var26Lifetime3 & 65280) * var20Lifetime4 + (var27Lifetime3 & 65280) * var21Lifetime4 & 16711680) >> 8;
                  }
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime4;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            var20Lifetime5 = (param5 & 16711680) >> 16;
            var21Lifetime5 = (param5 & 65280) >> 8;
            var22Lifetime5 = param5 & 255;
            var23Lifetime5 = param5 >>> 24;
            var24Lifetime4 = 256 - var23Lifetime5;
            for (var25Lifetime4 = -param3; var25Lifetime4 < 0; var25Lifetime4++) {
              var26Lifetime4 = (var10 >> 16) * this.field_o;
              for (var27Lifetime4 = -param2; var27Lifetime4 < 0; var27Lifetime4++) {
                boolean decompiledFrameRemainder0 = true;
                var28Lifetime3 = this.field_F[(var9 >> 16) + var26Lifetime4];
                if (var28Lifetime3 == 0) {
                  var16Lifetime2++;
                } else {
                  var29Lifetime3 = this.field_E[var28Lifetime3 & 255];
                  if (var23Lifetime5 != 255) {
                    var30Lifetime1 = (var29Lifetime3 & 16711680) * var20Lifetime5 & -16777216;
                    var31Lifetime1 = (var29Lifetime3 & 65280) * var21Lifetime5 & 16711680;
                    var32Lifetime1 = (var29Lifetime3 & 255) * var22Lifetime5 & 65280;
                    var29Lifetime3 = (var30Lifetime1 | var31Lifetime1 | var32Lifetime1) >>> 8;
                    var33Lifetime1 = var35[var16Lifetime2];
                    incrementValue$7 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$7] = ((var29Lifetime3 & 16711935) * var23Lifetime5 + (var33Lifetime1 & 16711935) * var24Lifetime4 & -16711936) + ((var29Lifetime3 & 65280) * var23Lifetime5 + (var33Lifetime1 & 65280) * var24Lifetime4 & 16711680) >> 8;
                    var9 = var9 + var14;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var30Lifetime1Lifetime1 = (var29Lifetime3 & 16711680) * var20Lifetime5 & -16777216;
                    var31Lifetime1Lifetime1 = (var29Lifetime3 & 65280) * var21Lifetime5 & 16711680;
                    var32Lifetime1Lifetime1 = (var29Lifetime3 & 255) * var22Lifetime5 & 65280;
                    incrementValue$6 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$6] = (var30Lifetime1Lifetime1 | var31Lifetime1Lifetime1 | var32Lifetime1Lifetime1) >>> 8;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var9 = var9 + var14;
                }
              }
              var10 = var10 + var15;
              var9 = var19Lifetime4;
              var16Lifetime2 = var16Lifetime2 + var17;
            }
            return;
          }
        }

    }
}
