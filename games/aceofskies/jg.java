/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends mk {
    int[] field_E;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var22Lifetime2;
        int var23Lifetime1;
        int var24Lifetime1;
        if (this.field_D.h()) {
          throw new IllegalStateException();
        }
        int var6 = this.field_D.field_f;
        param0 = param0 + this.field_g;
        param1 = param1 + this.field_z;
        int var7 = param1 * var6 + param0;
        int var8 = 0;
        int var9 = this.field_p;
        int var10 = this.field_o;
        int var11 = var6 - var10;
        int var12 = 0;
        if (param1 < this.field_D.field_w) {
          int var13_int = this.field_D.field_w - param1;
          var9 = var9 - var13_int;
          param1 = this.field_D.field_w;
          var8 = var8 + var13_int * var10;
          var7 = var7 + var13_int * var6;
        }
        if (param1 + var9 > this.field_D.field_D) {
          var9 = var9 - (param1 + var9 - this.field_D.field_D);
        }
        if (param0 < this.field_D.field_z) {
          int var13_intLifetime1 = this.field_D.field_z - param0;
          var10 = var10 - var13_intLifetime1;
          param0 = this.field_D.field_z;
          var8 = var8 + var13_intLifetime1;
          var7 = var7 + var13_intLifetime1;
          var12 = var12 + var13_intLifetime1;
          var11 = var11 + var13_intLifetime1;
        }
        if (param0 + var10 > this.field_D.field_k) {
          int var13_intLifetime2 = param0 + var10 - this.field_D.field_k;
          var10 = var10 - var13_intLifetime2;
          var12 = var12 + var13_intLifetime2;
          var11 = var11 + var13_intLifetime2;
        }
        if (var10 > 0) {
          if (var9 <= 0) {
            return;
          }
          int[] var27 = this.field_D.field_E;
          int[] var26 = var27;
          int[] var13 = var26;
          if (param4 == 0) {
            if (param2 == 1) {
              for (int var14 = -var9; var14 < 0; var14++) {
                int var15 = var7 + var10 - 3;
                while (var7 < var15) {
                  int incrementValue$27 = var7;
                  var7++;
                  int incrementValue$28 = var8;
                  var8++;
                  var13[incrementValue$27] = this.field_E[incrementValue$28];
                  int incrementValue$29 = var7;
                  var7++;
                  int incrementValue$30 = var8;
                  var8++;
                  var13[incrementValue$29] = this.field_E[incrementValue$30];
                  int incrementValue$31 = var7;
                  var7++;
                  int incrementValue$32 = var8;
                  var8++;
                  var13[incrementValue$31] = this.field_E[incrementValue$32];
                  int incrementValue$33 = var7;
                  var7++;
                  int incrementValue$34 = var8;
                  var8++;
                  var13[incrementValue$33] = this.field_E[incrementValue$34];
                }
                var15 += 3;
                while (var7 < var15) {
                  int incrementValue$25 = var7;
                  var7++;
                  int incrementValue$26 = var8;
                  var8++;
                  var13[incrementValue$25] = this.field_E[incrementValue$26];
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 0) {
              int var14Lifetime6 = (param3 & 16711680) >> 16;
              int var15Lifetime6 = (param3 & 65280) >> 8;
              int var16 = param3 & 255;
              for (int var17 = -var9; var17 < 0; var17++) {
                for (int var18 = -var10; var18 < 0; var18++) {
                  int incrementValue$23 = var8;
                  var8++;
                  int var19 = this.field_E[incrementValue$23];
                  int var20 = (var19 & 16711680) * var14Lifetime6 & -16777216;
                  int var21 = (var19 & 65280) * var15Lifetime6 & 16711680;
                  int var22 = (var19 & 255) * var16 & 65280;
                  int incrementValue$24 = var7;
                  var7++;
                  var13[incrementValue$24] = (var20 | var21 | var22) >>> 8;
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 3) {
              for (int var14Lifetime7 = -var9; var14Lifetime7 < 0; var14Lifetime7++) {
                for (int var15Lifetime7 = -var10; var15Lifetime7 < 0; var15Lifetime7++) {
                  int incrementValue$21 = var8;
                  var8++;
                  int var16Lifetime7 = this.field_E[incrementValue$21];
                  int var17Lifetime7 = var16Lifetime7 + param3;
                  int var18Lifetime6 = (var16Lifetime7 & 16711935) + (param3 & 16711935);
                  int var19Lifetime6 = (var18Lifetime6 & 16777472) + (var17Lifetime7 - var18Lifetime6 & 65536);
                  int incrementValue$22 = var7;
                  var7++;
                  var13[incrementValue$22] = var17Lifetime7 - var19Lifetime6 | var19Lifetime6 - (var19Lifetime6 >>> 8);
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 != 2) {
              throw new IllegalArgumentException();
            }
            int var14Lifetime8 = param3 >>> 24;
            int var15Lifetime8 = 256 - var14Lifetime8;
            int var16Lifetime8 = (param3 & 16711935) * var15Lifetime8 & -16711936;
            int var17Lifetime8 = (param3 & 65280) * var15Lifetime8 & 16711680;
            param3 = (var16Lifetime8 | var17Lifetime8) >>> 8;
            for (int var18Lifetime7 = -var9; var18Lifetime7 < 0; var18Lifetime7++) {
              for (int var19Lifetime7 = -var10; var19Lifetime7 < 0; var19Lifetime7++) {
                int incrementValue$19 = var8;
                var8++;
                int var20Lifetime5 = this.field_E[incrementValue$19];
                int var16Lifetime9 = (var20Lifetime5 & 16711935) * var14Lifetime8 & -16711936;
                int var17Lifetime9 = (var20Lifetime5 & 65280) * var14Lifetime8 & 16711680;
                int incrementValue$20 = var7;
                var7++;
                var13[incrementValue$20] = ((var16Lifetime9 | var17Lifetime9) >>> 8) + param3;
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
              for (int var14Lifetime1 = -var9; var14Lifetime1 < 0; var14Lifetime1++) {
                for (int var15Lifetime1 = -var10; var15Lifetime1 < 0; var15Lifetime1++) {
                  int incrementValue$6 = var8;
                  var8++;
                  int var16Lifetime1 = this.field_E[incrementValue$6];
                  if (var16Lifetime1 == 0) {
                    var7++;
                  } else {
                    int var17Lifetime1 = var27[var7];
                    int var18Lifetime1 = var16Lifetime1 + var17Lifetime1;
                    int var19Lifetime1 = (var16Lifetime1 & 16711935) + (var17Lifetime1 & 16711935);
                    int var17Lifetime1Lifetime5 = (var19Lifetime1 & 16777472) + (var18Lifetime1 - var19Lifetime1 & 65536);
                    int incrementValue$7 = var7;
                    var7++;
                    var13[incrementValue$7] = var18Lifetime1 - var17Lifetime1Lifetime5 | var17Lifetime1Lifetime5 - (var17Lifetime1Lifetime5 >>> 8);
                  }
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 0) {
              int var14Lifetime1Lifetime1 = (param3 & 16711680) >> 16;
              int var15Lifetime1Lifetime1 = (param3 & 65280) >> 8;
              int var16Lifetime1Lifetime1 = param3 & 255;
              for (int var17Lifetime1Lifetime1 = -var9; var17Lifetime1Lifetime1 < 0; var17Lifetime1Lifetime1++) {
                for (int var18Lifetime1Lifetime1 = -var10; var18Lifetime1Lifetime1 < 0; var18Lifetime1Lifetime1++) {
                  int incrementValue$4 = var8;
                  var8++;
                  int var19Lifetime1Lifetime1 = this.field_E[incrementValue$4];
                  if (var19Lifetime1Lifetime1 == 0) {
                    var7++;
                  } else {
                    int var20Lifetime1 = (var19Lifetime1Lifetime1 & 16711680) * var14Lifetime1Lifetime1 & -16777216;
                    int var21Lifetime1 = (var19Lifetime1Lifetime1 & 65280) * var15Lifetime1Lifetime1 & 16711680;
                    int var22Lifetime1 = (var19Lifetime1Lifetime1 & 255) * var16Lifetime1Lifetime1 & 65280;
                    var19Lifetime1Lifetime1 = (var20Lifetime1 | var21Lifetime1 | var22Lifetime1) >>> 8;
                    int var23 = var27[var7];
                    int var24 = var19Lifetime1Lifetime1 + var23;
                    int var25 = (var19Lifetime1Lifetime1 & 16711935) + (var23 & 16711935);
                    int var23Lifetime4 = (var25 & 16777472) + (var24 - var25 & 65536);
                    int incrementValue$5 = var7;
                    var7++;
                    var13[incrementValue$5] = var24 - var23Lifetime4 | var23Lifetime4 - (var23Lifetime4 >>> 8);
                  }
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 == 3) {
              for (int var14Lifetime1Lifetime2 = -var9; var14Lifetime1Lifetime2 < 0; var14Lifetime1Lifetime2++) {
                for (int var15Lifetime1Lifetime2 = -var10; var15Lifetime1Lifetime2 < 0; var15Lifetime1Lifetime2++) {
                  int incrementValue$2 = var8;
                  var8++;
                  int var16Lifetime1Lifetime2 = this.field_E[incrementValue$2];
                  int var17Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + param3;
                  int var18Lifetime1Lifetime2 = (var16Lifetime1Lifetime2 & 16711935) + (param3 & 16711935);
                  int var19Lifetime1Lifetime2 = (var18Lifetime1Lifetime2 & 16777472) + (var17Lifetime1Lifetime2 - var18Lifetime1Lifetime2 & 65536);
                  int var16Lifetime1Lifetime2Lifetime1 = var17Lifetime1Lifetime2 - var19Lifetime1Lifetime2 | var19Lifetime1Lifetime2 - (var19Lifetime1Lifetime2 >>> 8);
                  int var19Lifetime1Lifetime2Lifetime1 = var27[var7];
                  int var17Lifetime1Lifetime2Lifetime1 = var16Lifetime1Lifetime2Lifetime1 + var19Lifetime1Lifetime2Lifetime1;
                  int var18Lifetime1Lifetime2Lifetime1 = (var16Lifetime1Lifetime2Lifetime1 & 16711935) + (var19Lifetime1Lifetime2Lifetime1 & 16711935);
                  int var19Lifetime1Lifetime2Lifetime2 = (var18Lifetime1Lifetime2Lifetime1 & 16777472) + (var17Lifetime1Lifetime2Lifetime1 - var18Lifetime1Lifetime2Lifetime1 & 65536);
                  int incrementValue$3 = var7;
                  var7++;
                  var13[incrementValue$3] = var17Lifetime1Lifetime2Lifetime1 - var19Lifetime1Lifetime2Lifetime2 | var19Lifetime1Lifetime2Lifetime2 - (var19Lifetime1Lifetime2Lifetime2 >>> 8);
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            if (param2 != 2) {
              throw new IllegalArgumentException();
            }
            int var14Lifetime1Lifetime3 = param3 >>> 24;
            int var15Lifetime1Lifetime3 = 256 - var14Lifetime1Lifetime3;
            int var16Lifetime1Lifetime3 = (param3 & 16711935) * var15Lifetime1Lifetime3 & -16711936;
            int var17Lifetime1Lifetime3 = (param3 & 65280) * var15Lifetime1Lifetime3 & 16711680;
            param3 = (var16Lifetime1Lifetime3 | var17Lifetime1Lifetime3) >>> 8;
            for (int var18Lifetime1Lifetime3 = -var9; var18Lifetime1Lifetime3 < 0; var18Lifetime1Lifetime3++) {
              for (int var19Lifetime1Lifetime3 = -var10; var19Lifetime1Lifetime3 < 0; var19Lifetime1Lifetime3++) {
                int incrementValue$0 = var8;
                var8++;
                int var20Lifetime1Lifetime1 = this.field_E[incrementValue$0];
                if (var20Lifetime1Lifetime1 == 0) {
                  var7++;
                } else {
                  int var16Lifetime1Lifetime4 = (var20Lifetime1Lifetime1 & 16711935) * var14Lifetime1Lifetime3 & -16711936;
                  int var17Lifetime1Lifetime4 = (var20Lifetime1Lifetime1 & 65280) * var14Lifetime1Lifetime3 & 16711680;
                  var20Lifetime1Lifetime1 = ((var16Lifetime1Lifetime4 | var17Lifetime1Lifetime4) >>> 8) + param3;
                  int var21Lifetime1Lifetime1 = var27[var7];
                  int var22Lifetime1Lifetime1 = var20Lifetime1Lifetime1 + var21Lifetime1Lifetime1;
                  int var23Lifetime3 = (var20Lifetime1Lifetime1 & 16711935) + (var21Lifetime1Lifetime1 & 16711935);
                  int var21Lifetime1Lifetime1Lifetime1 = (var23Lifetime3 & 16777472) + (var22Lifetime1Lifetime1 - var23Lifetime3 & 65536);
                  int incrementValue$1 = var7;
                  var7++;
                  var13[incrementValue$1] = var22Lifetime1Lifetime1 - var21Lifetime1Lifetime1Lifetime1 | var21Lifetime1Lifetime1Lifetime1 - (var21Lifetime1Lifetime1Lifetime1 >>> 8);
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 == 1) {
            for (int var14Lifetime2 = -var9; var14Lifetime2 < 0; var14Lifetime2++) {
              for (int var15Lifetime2 = -var10; var15Lifetime2 < 0; var15Lifetime2++) {
                int incrementValue$17 = var8;
                var8++;
                int var16Lifetime2 = this.field_E[incrementValue$17];
                int var17Lifetime2 = var16Lifetime2 >>> 24;
                int var18Lifetime2 = 256 - var17Lifetime2;
                int var19Lifetime2 = var27[var7];
                int incrementValue$18 = var7;
                var7++;
                var13[incrementValue$18] = (((var16Lifetime2 & 16711935) * var17Lifetime2 + (var19Lifetime2 & 16711935) * var18Lifetime2 & -16711936) >> 8) + (((var16Lifetime2 & -16711936) >>> 8) * var17Lifetime2 + ((var19Lifetime2 & -16711936) >>> 8) * var18Lifetime2 & -16711936);
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 == 0) {
            if ((param3 & 16777215) == 16777215) {
              for (int var14Lifetime3 = -var9; var14Lifetime3 < 0; var14Lifetime3++) {
                for (int var15Lifetime3 = -var10; var15Lifetime3 < 0; var15Lifetime3++) {
                  int incrementValue$15 = var8;
                  var8++;
                  int var16Lifetime3 = this.field_E[incrementValue$15];
                  int var17Lifetime3 = (var16Lifetime3 >>> 24) * (param3 >>> 24) >> 8;
                  int var18Lifetime3 = 256 - var17Lifetime3;
                  int var19Lifetime3 = var27[var7];
                  int incrementValue$16 = var7;
                  var7++;
                  var13[incrementValue$16] = ((var16Lifetime3 & 16711935) * var17Lifetime3 + (var19Lifetime3 & 16711935) * var18Lifetime3 & -16711936) + ((var16Lifetime3 & 65280) * var17Lifetime3 + (var19Lifetime3 & 65280) * var18Lifetime3 & 16711680) >> 8;
                }
                var7 = var7 + var11;
                var8 = var8 + var12;
              }
              return;
            }
            int var14Lifetime3Lifetime1 = (param3 & 16711680) >> 16;
            int var15Lifetime3Lifetime1 = (param3 & 65280) >> 8;
            int var16Lifetime3Lifetime1 = param3 & 255;
            for (int var17Lifetime3Lifetime1 = -var9; var17Lifetime3Lifetime1 < 0; var17Lifetime3Lifetime1++) {
              for (int var18Lifetime3Lifetime1 = -var10; var18Lifetime3Lifetime1 < 0; var18Lifetime3Lifetime1++) {
                int incrementValue$12 = var8;
                var8++;
                int var19Lifetime3Lifetime1 = this.field_E[incrementValue$12];
                int var20Lifetime2 = (var19Lifetime3Lifetime1 >>> 24) * (param3 >>> 24) >> 8;
                int var21Lifetime2 = 256 - var20Lifetime2;
                if (var20Lifetime2 == 255) {
                  var22Lifetime2 = (var19Lifetime3Lifetime1 & 16711680) * var14Lifetime3Lifetime1 & -16777216;
                  var23Lifetime1 = (var19Lifetime3Lifetime1 & 65280) * var15Lifetime3Lifetime1 & 16711680;
                  var24Lifetime1 = (var19Lifetime3Lifetime1 & 255) * var16Lifetime3Lifetime1 & 65280;
                  int incrementValue$13 = var7;
                  var7++;
                  var13[incrementValue$13] = (var22Lifetime2 | var23Lifetime1 | var24Lifetime1) >>> 8;
                } else {
                  var22Lifetime2 = (var19Lifetime3Lifetime1 & 16711680) * var14Lifetime3Lifetime1 & -16777216;
                  var23Lifetime1 = (var19Lifetime3Lifetime1 & 65280) * var15Lifetime3Lifetime1 & 16711680;
                  var24Lifetime1 = (var19Lifetime3Lifetime1 & 255) * var16Lifetime3Lifetime1 & 65280;
                  var19Lifetime3Lifetime1 = (var22Lifetime2 | var23Lifetime1 | var24Lifetime1) >>> 8;
                  int var25Lifetime1 = var27[var7];
                  int incrementValue$14 = var7;
                  var7++;
                  var13[incrementValue$14] = ((var19Lifetime3Lifetime1 & 16711935) * var20Lifetime2 + (var25Lifetime1 & 16711935) * var21Lifetime2 & -16711936) + ((var19Lifetime3Lifetime1 & 65280) * var20Lifetime2 + (var25Lifetime1 & 65280) * var21Lifetime2 & 16711680) >> 8;
                }
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 == 3) {
            for (int var14Lifetime4 = -var9; var14Lifetime4 < 0; var14Lifetime4++) {
              for (int var15Lifetime4 = -var10; var15Lifetime4 < 0; var15Lifetime4++) {
                int incrementValue$10 = var8;
                var8++;
                int var16Lifetime4 = this.field_E[incrementValue$10];
                int var17Lifetime4 = var16Lifetime4 + param3;
                int var18Lifetime4 = (var16Lifetime4 & 16711935) + (param3 & 16711935);
                int var19Lifetime4 = (var18Lifetime4 & 16777472) + (var17Lifetime4 - var18Lifetime4 & 65536);
                var19Lifetime4 = var17Lifetime4 - var19Lifetime4 | var19Lifetime4 - (var19Lifetime4 >>> 8);
                int var20Lifetime3 = (var19Lifetime4 >>> 24) * (param3 >>> 24) >> 8;
                int var21Lifetime3 = 256 - var20Lifetime3;
                if (var20Lifetime3 != 255) {
                  int var16Lifetime4Lifetime1 = var19Lifetime4;
                  var19Lifetime4 = var27[var7];
                  var19Lifetime4 = ((var16Lifetime4Lifetime1 & 16711935) * var20Lifetime3 + (var19Lifetime4 & 16711935) * var21Lifetime3 & -16711936) + ((var16Lifetime4Lifetime1 & 65280) * var20Lifetime3 + (var19Lifetime4 & 65280) * var21Lifetime3 & 16711680) >> 8;
                }
                var13[var7++] = var19Lifetime4;
              }
              var7 = var7 + var11;
              var8 = var8 + var12;
            }
            return;
          }
          if (param2 != 2) {
            throw new IllegalArgumentException();
          }
          int var14Lifetime5 = param3 >>> 24;
          int var15Lifetime5 = 256 - var14Lifetime5;
          int var16Lifetime5 = (param3 & 16711935) * var15Lifetime5 & -16711936;
          int var17Lifetime5 = (param3 & 65280) * var15Lifetime5 & 16711680;
          param3 = (var16Lifetime5 | var17Lifetime5) >>> 8;
          for (int var18Lifetime5 = -var9; var18Lifetime5 < 0; var18Lifetime5++) {
            for (int var19Lifetime5 = -var10; var19Lifetime5 < 0; var19Lifetime5++) {
              int incrementValue$8 = var8;
              var8++;
              int var20Lifetime4 = this.field_E[incrementValue$8];
              int var21Lifetime4 = var20Lifetime4 >>> 24;
              int var22Lifetime3 = 256 - var21Lifetime4;
              int var16Lifetime6 = (var20Lifetime4 & 16711935) * var14Lifetime5 & -16711936;
              int var17Lifetime6 = (var20Lifetime4 & 65280) * var14Lifetime5 & 16711680;
              int var20Lifetime4Lifetime1 = ((var16Lifetime6 | var17Lifetime6) >>> 8) + param3;
              int var23Lifetime2 = var27[var7];
              int incrementValue$9 = var7;
              var7++;
              var13[incrementValue$9] = ((var20Lifetime4Lifetime1 & 16711935) * var21Lifetime4 + (var23Lifetime2 & 16711935) * var22Lifetime3 & -16711936) + ((var20Lifetime4Lifetime1 & 65280) * var21Lifetime4 + (var23Lifetime2 & 65280) * var22Lifetime3 & 16711680) >> 8;
            }
            var7 = var7 + var11;
            var8 = var8 + var12;
          }
          return;
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var29Lifetime2;
        int var30Lifetime1;
        int var31Lifetime1;
        if (this.field_D.h()) {
          throw new IllegalStateException();
        }
        boolean decompiledFrameRemainder0 = true;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          int var9 = 0;
          int var10 = 0;
          int var11 = this.field_D.field_f;
          int var12 = this.field_g + this.field_o + this.field_m;
          int var13 = this.field_z + this.field_p + this.field_l;
          int var14 = (var12 << 16) / param2;
          int var15 = (var13 << 16) / param3;
          if (this.field_g > 0) {
            int var16 = ((this.field_g << 16) + var14 - 1) / var14;
            param0 = param0 + var16;
            var9 = var9 + (var16 * var14 - (this.field_g << 16));
          }
          if (this.field_z > 0) {
            int var16Lifetime1 = ((this.field_z << 16) + var15 - 1) / var15;
            param1 = param1 + var16Lifetime1;
            var10 = var10 + (var16Lifetime1 * var15 - (this.field_z << 16));
          }
          if (this.field_o < var12) {
            param2 = ((this.field_o << 16) - var9 + var14 - 1) / var14;
          }
          if (this.field_p < var13) {
            param3 = ((this.field_p << 16) - var10 + var15 - 1) / var15;
          }
          int var16Lifetime2 = param0 + param1 * var11;
          int var17 = var11 - param2;
          if (param1 + param3 > this.field_D.field_D) {
            param3 = param3 - (param1 + param3 - this.field_D.field_D);
          }
          if (param1 < this.field_D.field_w) {
            int var18_int = this.field_D.field_w - param1;
            param3 = param3 - var18_int;
            var16Lifetime2 = var16Lifetime2 + var18_int * var11;
            var10 = var10 + var15 * var18_int;
          }
          if (param0 + param2 > this.field_D.field_k) {
            int var18_intLifetime1 = param0 + param2 - this.field_D.field_k;
            param2 = param2 - var18_intLifetime1;
            var17 = var17 + var18_intLifetime1;
          }
          if (param0 < this.field_D.field_z) {
            int var18_intLifetime2 = this.field_D.field_z - param0;
            param2 = param2 - var18_intLifetime2;
            var16Lifetime2 = var16Lifetime2 + var18_intLifetime2;
            var9 = var9 + var14 * var18_intLifetime2;
            var17 = var17 + var18_intLifetime2;
          }
          int[] var34 = this.field_D.field_E;
          int[] var33 = var34;
          int[] var18 = var33;
          if (param6 == 0) {
            if (param4 == 1) {
              int var19 = var9;
              for (int var20 = -param3; var20 < 0; var20++) {
                int var21 = (var10 >> 16) * this.field_o;
                for (int var22 = -param2; var22 < 0; var22++) {
                  int incrementValue$13 = var16Lifetime2;
                  var16Lifetime2++;
                  var18[incrementValue$13] = this.field_E[(var9 >> 16) + var21];
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (param4 == 0) {
                int var19Lifetime6 = (param5 & 16711680) >> 16;
                int var20Lifetime6 = (param5 & 65280) >> 8;
                int var21Lifetime7 = param5 & 255;
                int var22Lifetime7 = var9;
                for (int var23 = -param3; var23 < 0; var23++) {
                  int var24 = (var10 >> 16) * this.field_o;
                  for (int var25 = -param2; var25 < 0; var25++) {
                    int var26 = this.field_E[(var9 >> 16) + var24];
                    int var27 = (var26 & 16711680) * var19Lifetime6 & -16777216;
                    int var28 = (var26 & 65280) * var20Lifetime6 & 16711680;
                    int var29 = (var26 & 255) * var21Lifetime7 & 65280;
                    int incrementValue$12 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$12] = (var27 | var28 | var29) >>> 8;
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var22Lifetime7;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 == 3) {
                int var19Lifetime7 = var9;
                for (int var20Lifetime7 = -param3; var20Lifetime7 < 0; var20Lifetime7++) {
                  int var21Lifetime8 = (var10 >> 16) * this.field_o;
                  for (int var22Lifetime8 = -param2; var22Lifetime8 < 0; var22Lifetime8++) {
                    int var23Lifetime6 = this.field_E[(var9 >> 16) + var21Lifetime8];
                    int var24Lifetime6 = var23Lifetime6 + param5;
                    int var25Lifetime6 = (var23Lifetime6 & 16711935) + (param5 & 16711935);
                    int var26Lifetime6 = (var25Lifetime6 & 16777472) + (var24Lifetime6 - var25Lifetime6 & 65536);
                    int incrementValue$11 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$11] = var24Lifetime6 - var26Lifetime6 | var26Lifetime6 - (var26Lifetime6 >>> 8);
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime7;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              if (param4 != 2) {
                throw new IllegalArgumentException();
              }
              int var19Lifetime8 = param5 >>> 24;
              int var20Lifetime8 = 256 - var19Lifetime8;
              int var21Lifetime9 = (param5 & 16711935) * var20Lifetime8 & -16711936;
              int var22Lifetime9 = (param5 & 65280) * var20Lifetime8 & 16711680;
              param5 = (var21Lifetime9 | var22Lifetime9) >>> 8;
              int var23Lifetime7 = var9;
              for (int var24Lifetime7 = -param3; var24Lifetime7 < 0; var24Lifetime7++) {
                int var25Lifetime7 = (var10 >> 16) * this.field_o;
                for (int var26Lifetime7 = -param2; var26Lifetime7 < 0; var26Lifetime7++) {
                  int var27Lifetime5 = this.field_E[(var9 >> 16) + var25Lifetime7];
                  int var21Lifetime10 = (var27Lifetime5 & 16711935) * var19Lifetime8 & -16711936;
                  int var22Lifetime10 = (var27Lifetime5 & 65280) * var19Lifetime8 & 16711680;
                  int incrementValue$10 = var16Lifetime2;
                  var16Lifetime2++;
                  var18[incrementValue$10] = ((var21Lifetime10 | var22Lifetime10) >>> 8) + param5;
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var23Lifetime7;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param6 != 1) {
              if (param6 != 2) {
                throw new IllegalArgumentException();
              }
              if (param4 == 1) {
                int var19Lifetime1 = var9;
                for (int var20Lifetime1 = -param3; var20Lifetime1 < 0; var20Lifetime1++) {
                  int var21Lifetime1 = (var10 >> 16) * this.field_o;
                  for (int var22Lifetime1 = -param2; var22Lifetime1 < 0; var22Lifetime1++) {
                    int var23Lifetime1 = this.field_E[(var9 >> 16) + var21Lifetime1];
                    if (var23Lifetime1 == 0) {
                      var16Lifetime2++;
                    } else {
                      int var24Lifetime1 = var34[var16Lifetime2];
                      int var25Lifetime1 = var23Lifetime1 + var24Lifetime1;
                      int var26Lifetime1 = (var23Lifetime1 & 16711935) + (var24Lifetime1 & 16711935);
                      int var24Lifetime1Lifetime4 = (var26Lifetime1 & 16777472) + (var25Lifetime1 - var26Lifetime1 & 65536);
                      int incrementValue$3 = var16Lifetime2;
                      var16Lifetime2++;
                      var18[incrementValue$3] = var25Lifetime1 - var24Lifetime1Lifetime4 | var24Lifetime1Lifetime4 - (var24Lifetime1Lifetime4 >>> 8);
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
                int var19Lifetime1Lifetime1 = var9;
                int var20Lifetime1Lifetime1 = (param5 & 16711680) >> 16;
                int var21Lifetime1Lifetime1 = (param5 & 65280) >> 8;
                int var22Lifetime1Lifetime1 = param5 & 255;
                for (int var23Lifetime1Lifetime1 = -param3; var23Lifetime1Lifetime1 < 0; var23Lifetime1Lifetime1++) {
                  int var24Lifetime1Lifetime1 = (var10 >> 16) * this.field_o;
                  for (int var25Lifetime1Lifetime1 = -param2; var25Lifetime1Lifetime1 < 0; var25Lifetime1Lifetime1++) {
                    int var26Lifetime1Lifetime1 = this.field_E[(var9 >> 16) + var24Lifetime1Lifetime1];
                    if (var26Lifetime1Lifetime1 == 0) {
                      var16Lifetime2++;
                    } else {
                      int var27Lifetime1 = (var26Lifetime1Lifetime1 & 16711680) * var20Lifetime1Lifetime1 & -16777216;
                      int var28Lifetime1 = (var26Lifetime1Lifetime1 & 65280) * var21Lifetime1Lifetime1 & 16711680;
                      int var29Lifetime1 = (var26Lifetime1Lifetime1 & 255) * var22Lifetime1Lifetime1 & 65280;
                      var26Lifetime1Lifetime1 = (var27Lifetime1 | var28Lifetime1 | var29Lifetime1) >>> 8;
                      int var30 = var34[var16Lifetime2];
                      int var31 = var26Lifetime1Lifetime1 + var30;
                      int var32 = (var26Lifetime1Lifetime1 & 16711935) + (var30 & 16711935);
                      int var30Lifetime4 = (var32 & 16777472) + (var31 - var32 & 65536);
                      int incrementValue$2 = var16Lifetime2;
                      var16Lifetime2++;
                      var18[incrementValue$2] = var31 - var30Lifetime4 | var30Lifetime4 - (var30Lifetime4 >>> 8);
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
                int var19Lifetime1Lifetime2 = var9;
                for (int var20Lifetime1Lifetime2 = -param3; var20Lifetime1Lifetime2 < 0; var20Lifetime1Lifetime2++) {
                  int var21Lifetime1Lifetime2 = (var10 >> 16) * this.field_o;
                  for (int var22Lifetime1Lifetime2 = -param2; var22Lifetime1Lifetime2 < 0; var22Lifetime1Lifetime2++) {
                    int var23Lifetime1Lifetime2 = this.field_E[(var9 >> 16) + var21Lifetime1Lifetime2];
                    int var24Lifetime1Lifetime2 = var23Lifetime1Lifetime2 + param5;
                    int var25Lifetime1Lifetime2 = (var23Lifetime1Lifetime2 & 16711935) + (param5 & 16711935);
                    int var26Lifetime1Lifetime2 = (var25Lifetime1Lifetime2 & 16777472) + (var24Lifetime1Lifetime2 - var25Lifetime1Lifetime2 & 65536);
                    int var23Lifetime1Lifetime2Lifetime1 = var24Lifetime1Lifetime2 - var26Lifetime1Lifetime2 | var26Lifetime1Lifetime2 - (var26Lifetime1Lifetime2 >>> 8);
                    int var26Lifetime1Lifetime2Lifetime1 = var34[var16Lifetime2];
                    int var24Lifetime1Lifetime2Lifetime1 = var23Lifetime1Lifetime2Lifetime1 + var26Lifetime1Lifetime2Lifetime1;
                    int var25Lifetime1Lifetime2Lifetime1 = (var23Lifetime1Lifetime2Lifetime1 & 16711935) + (var26Lifetime1Lifetime2Lifetime1 & 16711935);
                    int var26Lifetime1Lifetime2Lifetime2 = (var25Lifetime1Lifetime2Lifetime1 & 16777472) + (var24Lifetime1Lifetime2Lifetime1 - var25Lifetime1Lifetime2Lifetime1 & 65536);
                    int incrementValue$1 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$1] = var24Lifetime1Lifetime2Lifetime1 - var26Lifetime1Lifetime2Lifetime2 | var26Lifetime1Lifetime2Lifetime2 - (var26Lifetime1Lifetime2Lifetime2 >>> 8);
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
              int var19Lifetime1Lifetime3 = param5 >>> 24;
              int var20Lifetime1Lifetime3 = 256 - var19Lifetime1Lifetime3;
              int var21Lifetime1Lifetime3 = (param5 & 16711935) * var20Lifetime1Lifetime3 & -16711936;
              int var22Lifetime1Lifetime3 = (param5 & 65280) * var20Lifetime1Lifetime3 & 16711680;
              param5 = (var21Lifetime1Lifetime3 | var22Lifetime1Lifetime3) >>> 8;
              int var23Lifetime1Lifetime3 = var9;
              for (int var24Lifetime1Lifetime3 = -param3; var24Lifetime1Lifetime3 < 0; var24Lifetime1Lifetime3++) {
                int var25Lifetime1Lifetime3 = (var10 >> 16) * this.field_o;
                for (int var26Lifetime1Lifetime3 = -param2; var26Lifetime1Lifetime3 < 0; var26Lifetime1Lifetime3++) {
                  int var27Lifetime1Lifetime1 = this.field_E[(var9 >> 16) + var25Lifetime1Lifetime3];
                  if (var27Lifetime1Lifetime1 == 0) {
                    var16Lifetime2++;
                  } else {
                    int var21Lifetime1Lifetime4 = (var27Lifetime1Lifetime1 & 16711935) * var19Lifetime1Lifetime3 & -16711936;
                    int var22Lifetime1Lifetime4 = (var27Lifetime1Lifetime1 & 65280) * var19Lifetime1Lifetime3 & 16711680;
                    var27Lifetime1Lifetime1 = ((var21Lifetime1Lifetime4 | var22Lifetime1Lifetime4) >>> 8) + param5;
                    int var28Lifetime1Lifetime1 = var34[var16Lifetime2];
                    int var29Lifetime1Lifetime1 = var27Lifetime1Lifetime1 + var28Lifetime1Lifetime1;
                    int var30Lifetime3 = (var27Lifetime1Lifetime1 & 16711935) + (var28Lifetime1Lifetime1 & 16711935);
                    int var28Lifetime1Lifetime1Lifetime1 = (var30Lifetime3 & 16777472) + (var29Lifetime1Lifetime1 - var30Lifetime3 & 65536);
                    int incrementValue$0 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$0] = var29Lifetime1Lifetime1 - var28Lifetime1Lifetime1Lifetime1 | var28Lifetime1Lifetime1Lifetime1 - (var28Lifetime1Lifetime1Lifetime1 >>> 8);
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
              int var19Lifetime2 = var9;
              for (int var20Lifetime2 = -param3; var20Lifetime2 < 0; var20Lifetime2++) {
                int var21Lifetime2 = (var10 >> 16) * this.field_o;
                for (int var22Lifetime2 = -param2; var22Lifetime2 < 0; var22Lifetime2++) {
                  int var23Lifetime2 = this.field_E[(var9 >> 16) + var21Lifetime2];
                  int var24Lifetime2 = var23Lifetime2 >>> 24;
                  int var25Lifetime2 = 256 - var24Lifetime2;
                  int var26Lifetime2 = var34[var16Lifetime2];
                  int incrementValue$9 = var16Lifetime2;
                  var16Lifetime2++;
                  var18[incrementValue$9] = (((var23Lifetime2 & 16711935) * var24Lifetime2 + (var26Lifetime2 & 16711935) * var25Lifetime2 & -16711936) >> 8) + (((var23Lifetime2 & -16711936) >>> 8) * var24Lifetime2 + ((var26Lifetime2 & -16711936) >>> 8) * var25Lifetime2 & -16711936);
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime2;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            if (param4 == 0) {
              int var19Lifetime3 = var9;
              if ((param5 & 16777215) == 16777215) {
                for (int var20Lifetime3 = -param3; var20Lifetime3 < 0; var20Lifetime3++) {
                  int var21Lifetime3 = (var10 >> 16) * this.field_o;
                  for (int var22Lifetime3 = -param2; var22Lifetime3 < 0; var22Lifetime3++) {
                    int var23Lifetime3 = this.field_E[(var9 >> 16) + var21Lifetime3];
                    int var24Lifetime3 = (var23Lifetime3 >>> 24) * (param5 >>> 24) >> 8;
                    int var25Lifetime3 = 256 - var24Lifetime3;
                    int var26Lifetime3 = var34[var16Lifetime2];
                    int incrementValue$8 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$8] = ((var23Lifetime3 & 16711935) * var24Lifetime3 + (var26Lifetime3 & 16711935) * var25Lifetime3 & -16711936) + ((var23Lifetime3 & 65280) * var24Lifetime3 + (var26Lifetime3 & 65280) * var25Lifetime3 & 16711680) >> 8;
                    var9 = var9 + var14;
                  }
                  var10 = var10 + var15;
                  var9 = var19Lifetime3;
                  var16Lifetime2 = var16Lifetime2 + var17;
                }
                return;
              }
              int var20Lifetime3Lifetime1 = (param5 & 16711680) >> 16;
              int var21Lifetime3Lifetime1 = (param5 & 65280) >> 8;
              int var22Lifetime3Lifetime1 = param5 & 255;
              for (int var23Lifetime3Lifetime1 = -param3; var23Lifetime3Lifetime1 < 0; var23Lifetime3Lifetime1++) {
                int var24Lifetime3Lifetime1 = (var10 >> 16) * this.field_o;
                for (int var25Lifetime3Lifetime1 = -param2; var25Lifetime3Lifetime1 < 0; var25Lifetime3Lifetime1++) {
                  int var26Lifetime3Lifetime1 = this.field_E[(var9 >> 16) + var24Lifetime3Lifetime1];
                  int var27Lifetime2 = (var26Lifetime3Lifetime1 >>> 24) * (param5 >>> 24) >> 8;
                  int var28Lifetime2 = 256 - var27Lifetime2;
                  if (var27Lifetime2 == 255) {
                    var29Lifetime2 = (var26Lifetime3Lifetime1 & 16711680) * var20Lifetime3Lifetime1 & -16777216;
                    var30Lifetime1 = (var26Lifetime3Lifetime1 & 65280) * var21Lifetime3Lifetime1 & 16711680;
                    var31Lifetime1 = (var26Lifetime3Lifetime1 & 255) * var22Lifetime3Lifetime1 & 65280;
                    int incrementValue$6 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$6] = (var29Lifetime2 | var30Lifetime1 | var31Lifetime1) >>> 8;
                  } else {
                    var29Lifetime2 = (var26Lifetime3Lifetime1 & 16711680) * var20Lifetime3Lifetime1 & -16777216;
                    var30Lifetime1 = (var26Lifetime3Lifetime1 & 65280) * var21Lifetime3Lifetime1 & 16711680;
                    var31Lifetime1 = (var26Lifetime3Lifetime1 & 255) * var22Lifetime3Lifetime1 & 65280;
                    var26Lifetime3Lifetime1 = (var29Lifetime2 | var30Lifetime1 | var31Lifetime1) >>> 8;
                    int var32Lifetime1 = var34[var16Lifetime2];
                    int incrementValue$7 = var16Lifetime2;
                    var16Lifetime2++;
                    var18[incrementValue$7] = ((var26Lifetime3Lifetime1 & 16711935) * var27Lifetime2 + (var32Lifetime1 & 16711935) * var28Lifetime2 & -16711936) + ((var26Lifetime3Lifetime1 & 65280) * var27Lifetime2 + (var32Lifetime1 & 65280) * var28Lifetime2 & 16711680) >> 8;
                  }
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime3;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            if (param4 == 3) {
              int var19Lifetime4 = var9;
              for (int var20Lifetime4 = -param3; var20Lifetime4 < 0; var20Lifetime4++) {
                int var21Lifetime4 = (var10 >> 16) * this.field_o;
                for (int var22Lifetime4 = -param2; var22Lifetime4 < 0; var22Lifetime4++) {
                  int var23Lifetime4 = this.field_E[(var9 >> 16) + var21Lifetime4];
                  int var24Lifetime4 = var23Lifetime4 + param5;
                  int var25Lifetime4 = (var23Lifetime4 & 16711935) + (param5 & 16711935);
                  int var26Lifetime4 = (var25Lifetime4 & 16777472) + (var24Lifetime4 - var25Lifetime4 & 65536);
                  var26Lifetime4 = var24Lifetime4 - var26Lifetime4 | var26Lifetime4 - (var26Lifetime4 >>> 8);
                  int var27Lifetime3 = (var26Lifetime4 >>> 24) * (param5 >>> 24) >> 8;
                  int var28Lifetime3 = 256 - var27Lifetime3;
                  if (var27Lifetime3 != 255) {
                    int var23Lifetime4Lifetime1 = var26Lifetime4;
                    var26Lifetime4 = var34[var16Lifetime2];
                    var26Lifetime4 = ((var23Lifetime4Lifetime1 & 16711935) * var27Lifetime3 + (var26Lifetime4 & 16711935) * var28Lifetime3 & -16711936) + ((var23Lifetime4Lifetime1 & 65280) * var27Lifetime3 + (var26Lifetime4 & 65280) * var28Lifetime3 & 16711680) >> 8;
                  }
                  var18[var16Lifetime2++] = var26Lifetime4;
                  var9 = var9 + var14;
                }
                var10 = var10 + var15;
                var9 = var19Lifetime4;
                var16Lifetime2 = var16Lifetime2 + var17;
              }
              return;
            }
            if (param4 != 2) {
              throw new IllegalArgumentException();
            }
            int var19Lifetime5 = param5 >>> 24;
            int var20Lifetime5 = 256 - var19Lifetime5;
            int var21Lifetime5 = (param5 & 16711935) * var20Lifetime5 & -16711936;
            int var22Lifetime5 = (param5 & 65280) * var20Lifetime5 & 16711680;
            param5 = (var21Lifetime5 | var22Lifetime5) >>> 8;
            int var23Lifetime5 = var9;
            for (int var24Lifetime5 = -param3; var24Lifetime5 < 0; var24Lifetime5++) {
              int var25Lifetime5 = (var10 >> 16) * this.field_o;
              for (int var26Lifetime5 = -param2; var26Lifetime5 < 0; var26Lifetime5++) {
                int var27Lifetime4 = this.field_E[(var9 >> 16) + var25Lifetime5];
                int var28Lifetime4 = var27Lifetime4 >>> 24;
                int var29Lifetime3 = 256 - var28Lifetime4;
                int var21Lifetime6 = (var27Lifetime4 & 16711935) * var19Lifetime5 & -16711936;
                int var22Lifetime6 = (var27Lifetime4 & 65280) * var19Lifetime5 & 16711680;
                int var27Lifetime4Lifetime1 = ((var21Lifetime6 | var22Lifetime6) >>> 8) + param5;
                int var30Lifetime2 = var34[var16Lifetime2];
                int incrementValue$4 = var16Lifetime2;
                var16Lifetime2++;
                var18[incrementValue$4] = ((var27Lifetime4Lifetime1 & 16711935) * var28Lifetime4 + (var30Lifetime2 & 16711935) * var29Lifetime3 & -16711936) + ((var27Lifetime4Lifetime1 & 65280) * var28Lifetime4 + (var30Lifetime2 & 65280) * var29Lifetime3 & 16711680) >> 8;
                var9 = var9 + var14;
              }
              var10 = var10 + var15;
              var9 = var23Lifetime5;
              var16Lifetime2 = var16Lifetime2 + var17;
            }
            return;
          }
        }

    }

    jg(kj param0, int[] param1, int param2, int param3) {
        super(param0, param2, param3);
        this.field_E = param1;
    }

    final void b(int param0, int param1) {
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
        int[] var3 = this.field_D.field_E;
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
                  int incrementValue$24 = var6;
                  var6++;
                  var11 = incrementValue$24;
                  int[] var31 = var3;
                  int[] var22 = var31;
                  var12 = var22;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 == 1) {
                        var15 = this.field_E[var10];
                        var16 = var31[var11];
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                      } else if (var13 == 0) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var15 = (var16 | var17 | var18) >>> 8;
                        var19 = var31[var11];
                        var20 = var15 + var19;
                        var21 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 3) {
                        var15 = this.field_E[var10];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var31[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 2) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var15 = ((var16 | var17) >>> 8) + field_s;
                        var18 = var31[var11];
                        var19 = var15 + var18;
                        var20 = (var15 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                      }
                    } else if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = var31[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 >>> 24) * field_C >> 8;
                      var17 = 256 - var16;
                      if ((field_d & 16777215) == 16777215) {
                        var18 = var31[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                      } else if (var16 == 255) {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var18 | var19 | var20) >>> 8;
                      } else {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var15 = (var18 | var19 | var20) >>> 8;
                        var21 = var31[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                      }
                    } else if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = (var15 & 16711935) * field_C & -16711936;
                      var19 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var18 | var19) >>> 8) + field_s;
                      var20 = var31[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                    } else {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                      var20 = (var15 >>> 24) * field_C >> 8;
                      var21 = 256 - var20;
                      if (var20 != 255) {
                        var15 = var19;
                        var19 = var31[var11];
                        var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                      }
                      var31[var11] = var19;
                    }
                  } else if (var13 == 1) {
                    var12[var11] = this.field_E[var10];
                  } else if (var13 == 0) {
                    int incrementValue$26 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$26];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var12[var11] = ((var16 | var17) >>> 8) + field_s;
                  } else {
                    int incrementValue$25 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$25];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                  int incrementValue$18 = var6;
                  var6++;
                  var11 = incrementValue$18;
                  int[] var33 = var3;
                  int[] var24 = var33;
                  var12 = var24;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 == 1) {
                        var15 = this.field_E[var10];
                        var16 = var33[var11];
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                      } else if (var13 == 0) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var15 = (var16 | var17 | var18) >>> 8;
                        var19 = var33[var11];
                        var20 = var15 + var19;
                        var21 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 3) {
                        var15 = this.field_E[var10];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var33[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 2) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var15 = ((var16 | var17) >>> 8) + field_s;
                        var18 = var33[var11];
                        var19 = var15 + var18;
                        var20 = (var15 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                      }
                    } else if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = var33[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 >>> 24) * field_C >> 8;
                      var17 = 256 - var16;
                      if ((field_d & 16777215) == 16777215) {
                        var18 = var33[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                      } else if (var16 == 255) {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var18 | var19 | var20) >>> 8;
                      } else {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var15 = (var18 | var19 | var20) >>> 8;
                        var21 = var33[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                      }
                    } else if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = (var15 & 16711935) * field_C & -16711936;
                      var19 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var18 | var19) >>> 8) + field_s;
                      var20 = var33[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                    } else {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                      var20 = (var15 >>> 24) * field_C >> 8;
                      var21 = 256 - var20;
                      if (var20 != 255) {
                        var15 = var19;
                        var19 = var33[var11];
                        var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                      }
                      var33[var11] = var19;
                    }
                  } else if (var13 == 1) {
                    var12[var11] = this.field_E[var10];
                  } else if (var13 == 0) {
                    int incrementValue$20 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$20];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var12[var11] = ((var16 | var17) >>> 8) + field_s;
                  } else {
                    int incrementValue$19 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$19];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                  int incrementValue$21 = var6;
                  var6++;
                  var11 = incrementValue$21;
                  int[] var32 = var3;
                  int[] var23 = var32;
                  var12 = var23;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 == 1) {
                        var15 = this.field_E[var10];
                        var16 = var32[var11];
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                      } else if (var13 == 0) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var15 = (var16 | var17 | var18) >>> 8;
                        var19 = var32[var11];
                        var20 = var15 + var19;
                        var21 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 3) {
                        var15 = this.field_E[var10];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var32[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 2) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var15 = ((var16 | var17) >>> 8) + field_s;
                        var18 = var32[var11];
                        var19 = var15 + var18;
                        var20 = (var15 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                      }
                    } else if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = var32[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 >>> 24) * field_C >> 8;
                      var17 = 256 - var16;
                      if ((field_d & 16777215) == 16777215) {
                        var18 = var32[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                      } else if (var16 == 255) {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var18 | var19 | var20) >>> 8;
                      } else {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var15 = (var18 | var19 | var20) >>> 8;
                        var21 = var32[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                      }
                    } else if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = (var15 & 16711935) * field_C & -16711936;
                      var19 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var18 | var19) >>> 8) + field_s;
                      var20 = var32[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                    } else {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                      var20 = (var15 >>> 24) * field_C >> 8;
                      var21 = 256 - var20;
                      if (var20 != 255) {
                        var15 = var19;
                        var19 = var32[var11];
                        var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                      }
                      var32[var11] = var19;
                    }
                  } else if (var13 == 1) {
                    var12[var11] = this.field_E[var10];
                  } else if (var13 == 0) {
                    int incrementValue$23 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$23];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var12[var11] = ((var16 | var17) >>> 8) + field_s;
                  } else {
                    int incrementValue$22 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$22];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                  int incrementValue$6 = var6;
                  var6++;
                  var11 = incrementValue$6;
                  int[] var37 = var3;
                  int[] var28 = var37;
                  var12 = var28;
                  var13 = param0;
                  var14 = param1;
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        throw new IllegalArgumentException();
                      }
                      if (var13 == 1) {
                        var15 = this.field_E[var10];
                        var16 = var37[var11];
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                      } else if (var13 == 0) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711680) * field_n & -16777216;
                        var17 = (var15 & 65280) * field_e & 16711680;
                        var18 = (var15 & 255) * field_b & 65280;
                        var15 = (var16 | var17 | var18) >>> 8;
                        var19 = var37[var11];
                        var20 = var15 + var19;
                        var21 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 3) {
                        var15 = this.field_E[var10];
                        var16 = field_d;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var37[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                      } else if (var13 == 2) {
                        var15 = this.field_E[var10];
                        var16 = (var15 & 16711935) * field_C & -16711936;
                        var17 = (var15 & 65280) * field_C & 16711680;
                        var15 = ((var16 | var17) >>> 8) + field_s;
                        var18 = var37[var11];
                        var19 = var15 + var18;
                        var20 = (var15 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                      }
                    } else if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = var37[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 >>> 24) * field_C >> 8;
                      var17 = 256 - var16;
                      if ((field_d & 16777215) == 16777215) {
                        var18 = var37[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                      } else if (var16 == 255) {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var12[var11] = (var18 | var19 | var20) >>> 8;
                      } else {
                        var18 = (var15 & 16711680) * field_n & -16777216;
                        var19 = (var15 & 65280) * field_e & 16711680;
                        var20 = (var15 & 255) * field_b & 65280;
                        var15 = (var18 | var19 | var20) >>> 8;
                        var21 = var37[var11];
                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                      }
                    } else if (var13 != 3) {
                      if (var13 != 2) {
                        throw new IllegalArgumentException();
                      }
                      var15 = this.field_E[var10];
                      var16 = var15 >>> 24;
                      var17 = 256 - var16;
                      var18 = (var15 & 16711935) * field_C & -16711936;
                      var19 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var18 | var19) >>> 8) + field_s;
                      var20 = var37[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                    } else {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                      var20 = (var15 >>> 24) * field_C >> 8;
                      var21 = 256 - var20;
                      if (var20 != 255) {
                        var15 = var19;
                        var19 = var37[var11];
                        var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                      }
                      var37[var11] = var19;
                    }
                  } else if (var13 == 1) {
                    var12[var11] = this.field_E[var10];
                  } else if (var13 == 0) {
                    int incrementValue$8 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$8];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var16 | var17 | var18) >>> 8;
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var12[var11] = ((var16 | var17) >>> 8) + field_s;
                  } else {
                    int incrementValue$7 = var10;
                    var10++;
                    var15 = this.field_E[incrementValue$7];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                int incrementValue$0 = var6;
                var6++;
                var11 = incrementValue$0;
                int[] var39 = var3;
                int[] var30 = var39;
                var12 = var30;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var39[var11];
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var15 = (var16 | var17 | var18) >>> 8;
                      var19 = var39[var11];
                      var20 = var15 + var19;
                      var21 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 3) {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var15 = var17 - var19 | var19 - (var19 >>> 8);
                      var19 = var39[var11];
                      var17 = var15 + var19;
                      var18 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 2) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711935) * field_C & -16711936;
                      var17 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var16 | var17) >>> 8) + field_s;
                      var18 = var39[var11];
                      var19 = var15 + var18;
                      var20 = (var15 & 16711935) + (var18 & 16711935);
                      var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                      var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                    }
                  } else if (var13 == 1) {
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = var39[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                  } else if (var13 == 0) {
                    var15 = this.field_E[var10];
                    var16 = (var15 >>> 24) * field_C >> 8;
                    var17 = 256 - var16;
                    if ((field_d & 16777215) == 16777215) {
                      var18 = var39[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var16 == 255) {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var18 | var19 | var20) >>> 8;
                    } else {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var15 = (var18 | var19 | var20) >>> 8;
                      var21 = var39[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                    }
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = (var15 & 16711935) * field_C & -16711936;
                    var19 = (var15 & 65280) * field_C & 16711680;
                    var15 = ((var18 | var19) >>> 8) + field_s;
                    var20 = var39[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                  } else {
                    var15 = this.field_E[var10];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var19 = var17 - var19 | var19 - (var19 >>> 8);
                    var20 = (var15 >>> 24) * field_C >> 8;
                    var21 = 256 - var20;
                    if (var20 != 255) {
                      var15 = var19;
                      var19 = var39[var11];
                      var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                    }
                    var39[var11] = var19;
                  }
                } else if (var13 == 1) {
                  var12[var11] = this.field_E[var10];
                } else if (var13 == 0) {
                  int incrementValue$2 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$2];
                  var16 = (var15 & 16711680) * field_n & -16777216;
                  var17 = (var15 & 65280) * field_e & 16711680;
                  var18 = (var15 & 255) * field_b & 65280;
                  var12[var11] = (var16 | var17 | var18) >>> 8;
                } else if (var13 != 3) {
                  if (var13 != 2) {
                    throw new IllegalArgumentException();
                  }
                  var15 = this.field_E[var10];
                  var16 = (var15 & 16711935) * field_C & -16711936;
                  var17 = (var15 & 65280) * field_C & 16711680;
                  var12[var11] = ((var16 | var17) >>> 8) + field_s;
                } else {
                  int incrementValue$1 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$1];
                  var16 = field_d;
                  var17 = var15 + var16;
                  var18 = (var15 & 16711935) + (var16 & 16711935);
                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                  var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                int incrementValue$3 = var6;
                var6++;
                var11 = incrementValue$3;
                int[] var38 = var3;
                int[] var29 = var38;
                var12 = var29;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var38[var11];
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var15 = (var16 | var17 | var18) >>> 8;
                      var19 = var38[var11];
                      var20 = var15 + var19;
                      var21 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 3) {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var15 = var17 - var19 | var19 - (var19 >>> 8);
                      var19 = var38[var11];
                      var17 = var15 + var19;
                      var18 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 2) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711935) * field_C & -16711936;
                      var17 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var16 | var17) >>> 8) + field_s;
                      var18 = var38[var11];
                      var19 = var15 + var18;
                      var20 = (var15 & 16711935) + (var18 & 16711935);
                      var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                      var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                    }
                  } else if (var13 == 1) {
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = var38[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                  } else if (var13 == 0) {
                    var15 = this.field_E[var10];
                    var16 = (var15 >>> 24) * field_C >> 8;
                    var17 = 256 - var16;
                    if ((field_d & 16777215) == 16777215) {
                      var18 = var38[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var16 == 255) {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var18 | var19 | var20) >>> 8;
                    } else {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var15 = (var18 | var19 | var20) >>> 8;
                      var21 = var38[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                    }
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = (var15 & 16711935) * field_C & -16711936;
                    var19 = (var15 & 65280) * field_C & 16711680;
                    var15 = ((var18 | var19) >>> 8) + field_s;
                    var20 = var38[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                  } else {
                    var15 = this.field_E[var10];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var19 = var17 - var19 | var19 - (var19 >>> 8);
                    var20 = (var15 >>> 24) * field_C >> 8;
                    var21 = 256 - var20;
                    if (var20 != 255) {
                      var15 = var19;
                      var19 = var38[var11];
                      var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                    }
                    var38[var11] = var19;
                  }
                } else if (var13 == 1) {
                  var12[var11] = this.field_E[var10];
                } else if (var13 == 0) {
                  int incrementValue$5 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$5];
                  var16 = (var15 & 16711680) * field_n & -16777216;
                  var17 = (var15 & 65280) * field_e & 16711680;
                  var18 = (var15 & 255) * field_b & 65280;
                  var12[var11] = (var16 | var17 | var18) >>> 8;
                } else if (var13 != 3) {
                  if (var13 != 2) {
                    throw new IllegalArgumentException();
                  }
                  var15 = this.field_E[var10];
                  var16 = (var15 & 16711935) * field_C & -16711936;
                  var17 = (var15 & 65280) * field_C & 16711680;
                  var12[var11] = ((var16 | var17) >>> 8) + field_s;
                } else {
                  int incrementValue$4 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$4];
                  var16 = field_d;
                  var17 = var15 + var16;
                  var18 = (var15 & 16711935) + (var16 & 16711935);
                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                  var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
                int incrementValue$15 = var6;
                var6++;
                var11 = incrementValue$15;
                int[] var34 = var3;
                int[] var25 = var34;
                var12 = var25;
                var13 = param0;
                var14 = param1;
                if (var14 != 0) {
                  if (var14 != 1) {
                    if (var14 != 2) {
                      throw new IllegalArgumentException();
                    }
                    if (var13 == 1) {
                      var15 = this.field_E[var10];
                      var16 = var34[var11];
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                    } else if (var13 == 0) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711680) * field_n & -16777216;
                      var17 = (var15 & 65280) * field_e & 16711680;
                      var18 = (var15 & 255) * field_b & 65280;
                      var15 = (var16 | var17 | var18) >>> 8;
                      var19 = var34[var11];
                      var20 = var15 + var19;
                      var21 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                      var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 3) {
                      var15 = this.field_E[var10];
                      var16 = field_d;
                      var17 = var15 + var16;
                      var18 = (var15 & 16711935) + (var16 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var15 = var17 - var19 | var19 - (var19 >>> 8);
                      var19 = var34[var11];
                      var17 = var15 + var19;
                      var18 = (var15 & 16711935) + (var19 & 16711935);
                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                      var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                    } else if (var13 == 2) {
                      var15 = this.field_E[var10];
                      var16 = (var15 & 16711935) * field_C & -16711936;
                      var17 = (var15 & 65280) * field_C & 16711680;
                      var15 = ((var16 | var17) >>> 8) + field_s;
                      var18 = var34[var11];
                      var19 = var15 + var18;
                      var20 = (var15 & 16711935) + (var18 & 16711935);
                      var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                      var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                    }
                  } else if (var13 == 1) {
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = var34[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                  } else if (var13 == 0) {
                    var15 = this.field_E[var10];
                    var16 = (var15 >>> 24) * field_C >> 8;
                    var17 = 256 - var16;
                    if ((field_d & 16777215) == 16777215) {
                      var18 = var34[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                    } else if (var16 == 255) {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var12[var11] = (var18 | var19 | var20) >>> 8;
                    } else {
                      var18 = (var15 & 16711680) * field_n & -16777216;
                      var19 = (var15 & 65280) * field_e & 16711680;
                      var20 = (var15 & 255) * field_b & 65280;
                      var15 = (var18 | var19 | var20) >>> 8;
                      var21 = var34[var11];
                      var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                    }
                  } else if (var13 != 3) {
                    if (var13 != 2) {
                      throw new IllegalArgumentException();
                    }
                    var15 = this.field_E[var10];
                    var16 = var15 >>> 24;
                    var17 = 256 - var16;
                    var18 = (var15 & 16711935) * field_C & -16711936;
                    var19 = (var15 & 65280) * field_C & 16711680;
                    var15 = ((var18 | var19) >>> 8) + field_s;
                    var20 = var34[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                  } else {
                    var15 = this.field_E[var10];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var19 = var17 - var19 | var19 - (var19 >>> 8);
                    var20 = (var15 >>> 24) * field_C >> 8;
                    var21 = 256 - var20;
                    if (var20 != 255) {
                      var15 = var19;
                      var19 = var34[var11];
                      var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                    }
                    var34[var11] = var19;
                  }
                } else if (var13 == 1) {
                  var12[var11] = this.field_E[var10];
                } else if (var13 == 0) {
                  int incrementValue$17 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$17];
                  var16 = (var15 & 16711680) * field_n & -16777216;
                  var17 = (var15 & 65280) * field_e & 16711680;
                  var18 = (var15 & 255) * field_b & 65280;
                  var12[var11] = (var16 | var17 | var18) >>> 8;
                } else if (var13 != 3) {
                  if (var13 != 2) {
                    throw new IllegalArgumentException();
                  }
                  var15 = this.field_E[var10];
                  var16 = (var15 & 16711935) * field_C & -16711936;
                  var17 = (var15 & 65280) * field_C & 16711680;
                  var12[var11] = ((var16 | var17) >>> 8) + field_s;
                } else {
                  int incrementValue$16 = var10;
                  var10++;
                  var15 = this.field_E[incrementValue$16];
                  var16 = field_d;
                  var17 = var15 + var16;
                  var18 = (var15 & 16711935) + (var16 & 16711935);
                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                  var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
              int incrementValue$9 = var6;
              var6++;
              var11 = incrementValue$9;
              int[] var36 = var3;
              int[] var27 = var36;
              var12 = var27;
              var13 = param0;
              var14 = param1;
              if (var14 != 0) {
                if (var14 != 1) {
                  if (var14 != 2) {
                    throw new IllegalArgumentException();
                  }
                  if (var13 == 1) {
                    var15 = this.field_E[var10];
                    var16 = var36[var11];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                  } else if (var13 == 0) {
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var15 = (var16 | var17 | var18) >>> 8;
                    var19 = var36[var11];
                    var20 = var15 + var19;
                    var21 = (var15 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                  } else if (var13 == 3) {
                    var15 = this.field_E[var10];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var15 = var17 - var19 | var19 - (var19 >>> 8);
                    var19 = var36[var11];
                    var17 = var15 + var19;
                    var18 = (var15 & 16711935) + (var19 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                  } else if (var13 == 2) {
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var15 = ((var16 | var17) >>> 8) + field_s;
                    var18 = var36[var11];
                    var19 = var15 + var18;
                    var20 = (var15 & 16711935) + (var18 & 16711935);
                    var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                    var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                  }
                } else if (var13 == 1) {
                  var15 = this.field_E[var10];
                  var16 = var15 >>> 24;
                  var17 = 256 - var16;
                  var18 = var36[var11];
                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                } else if (var13 == 0) {
                  var15 = this.field_E[var10];
                  var16 = (var15 >>> 24) * field_C >> 8;
                  var17 = 256 - var16;
                  if ((field_d & 16777215) == 16777215) {
                    var18 = var36[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                  } else if (var16 == 255) {
                    var18 = (var15 & 16711680) * field_n & -16777216;
                    var19 = (var15 & 65280) * field_e & 16711680;
                    var20 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var18 | var19 | var20) >>> 8;
                  } else {
                    var18 = (var15 & 16711680) * field_n & -16777216;
                    var19 = (var15 & 65280) * field_e & 16711680;
                    var20 = (var15 & 255) * field_b & 65280;
                    var15 = (var18 | var19 | var20) >>> 8;
                    var21 = var36[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                  }
                } else if (var13 != 3) {
                  if (var13 != 2) {
                    throw new IllegalArgumentException();
                  }
                  var15 = this.field_E[var10];
                  var16 = var15 >>> 24;
                  var17 = 256 - var16;
                  var18 = (var15 & 16711935) * field_C & -16711936;
                  var19 = (var15 & 65280) * field_C & 16711680;
                  var15 = ((var18 | var19) >>> 8) + field_s;
                  var20 = var36[var11];
                  var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                } else {
                  var15 = this.field_E[var10];
                  var16 = field_d;
                  var17 = var15 + var16;
                  var18 = (var15 & 16711935) + (var16 & 16711935);
                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                  var19 = var17 - var19 | var19 - (var19 >>> 8);
                  var20 = (var15 >>> 24) * field_C >> 8;
                  var21 = 256 - var20;
                  if (var20 != 255) {
                    var15 = var19;
                    var19 = var36[var11];
                    var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                  }
                  var36[var11] = var19;
                }
              } else if (var13 == 1) {
                var12[var11] = this.field_E[var10];
              } else if (var13 == 0) {
                int incrementValue$11 = var10;
                var10++;
                var15 = this.field_E[incrementValue$11];
                var16 = (var15 & 16711680) * field_n & -16777216;
                var17 = (var15 & 65280) * field_e & 16711680;
                var18 = (var15 & 255) * field_b & 65280;
                var12[var11] = (var16 | var17 | var18) >>> 8;
              } else if (var13 != 3) {
                if (var13 != 2) {
                  throw new IllegalArgumentException();
                }
                var15 = this.field_E[var10];
                var16 = (var15 & 16711935) * field_C & -16711936;
                var17 = (var15 & 65280) * field_C & 16711680;
                var12[var11] = ((var16 | var17) >>> 8) + field_s;
              } else {
                int incrementValue$10 = var10;
                var10++;
                var15 = this.field_E[incrementValue$10];
                var16 = field_d;
                var17 = var15 + var16;
                var18 = (var15 & 16711935) + (var16 & 16711935);
                var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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
              int incrementValue$12 = var6;
              var6++;
              var11 = incrementValue$12;
              int[] var35 = var3;
              int[] var26 = var35;
              var12 = var26;
              var13 = param0;
              var14 = param1;
              if (var14 != 0) {
                if (var14 != 1) {
                  if (var14 != 2) {
                    throw new IllegalArgumentException();
                  }
                  if (var13 == 1) {
                    var15 = this.field_E[var10];
                    var16 = var35[var11];
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                  } else if (var13 == 0) {
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711680) * field_n & -16777216;
                    var17 = (var15 & 65280) * field_e & 16711680;
                    var18 = (var15 & 255) * field_b & 65280;
                    var15 = (var16 | var17 | var18) >>> 8;
                    var19 = var35[var11];
                    var20 = var15 + var19;
                    var21 = (var15 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                  } else if (var13 == 3) {
                    var15 = this.field_E[var10];
                    var16 = field_d;
                    var17 = var15 + var16;
                    var18 = (var15 & 16711935) + (var16 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var15 = var17 - var19 | var19 - (var19 >>> 8);
                    var19 = var35[var11];
                    var17 = var15 + var19;
                    var18 = (var15 & 16711935) + (var19 & 16711935);
                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                  } else if (var13 == 2) {
                    var15 = this.field_E[var10];
                    var16 = (var15 & 16711935) * field_C & -16711936;
                    var17 = (var15 & 65280) * field_C & 16711680;
                    var15 = ((var16 | var17) >>> 8) + field_s;
                    var18 = var35[var11];
                    var19 = var15 + var18;
                    var20 = (var15 & 16711935) + (var18 & 16711935);
                    var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                    var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                  }
                } else if (var13 == 1) {
                  var15 = this.field_E[var10];
                  var16 = var15 >>> 24;
                  var17 = 256 - var16;
                  var18 = var35[var11];
                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                } else if (var13 == 0) {
                  var15 = this.field_E[var10];
                  var16 = (var15 >>> 24) * field_C >> 8;
                  var17 = 256 - var16;
                  if ((field_d & 16777215) == 16777215) {
                    var18 = var35[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                  } else if (var16 == 255) {
                    var18 = (var15 & 16711680) * field_n & -16777216;
                    var19 = (var15 & 65280) * field_e & 16711680;
                    var20 = (var15 & 255) * field_b & 65280;
                    var12[var11] = (var18 | var19 | var20) >>> 8;
                  } else {
                    var18 = (var15 & 16711680) * field_n & -16777216;
                    var19 = (var15 & 65280) * field_e & 16711680;
                    var20 = (var15 & 255) * field_b & 65280;
                    var15 = (var18 | var19 | var20) >>> 8;
                    var21 = var35[var11];
                    var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                  }
                } else if (var13 != 3) {
                  if (var13 != 2) {
                    throw new IllegalArgumentException();
                  }
                  var15 = this.field_E[var10];
                  var16 = var15 >>> 24;
                  var17 = 256 - var16;
                  var18 = (var15 & 16711935) * field_C & -16711936;
                  var19 = (var15 & 65280) * field_C & 16711680;
                  var15 = ((var18 | var19) >>> 8) + field_s;
                  var20 = var35[var11];
                  var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                } else {
                  var15 = this.field_E[var10];
                  var16 = field_d;
                  var17 = var15 + var16;
                  var18 = (var15 & 16711935) + (var16 & 16711935);
                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                  var19 = var17 - var19 | var19 - (var19 >>> 8);
                  var20 = (var15 >>> 24) * field_C >> 8;
                  var21 = 256 - var20;
                  if (var20 != 255) {
                    var15 = var19;
                    var19 = var35[var11];
                    var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                  }
                  var35[var11] = var19;
                }
              } else if (var13 == 1) {
                var12[var11] = this.field_E[var10];
              } else if (var13 == 0) {
                int incrementValue$14 = var10;
                var10++;
                var15 = this.field_E[incrementValue$14];
                var16 = (var15 & 16711680) * field_n & -16777216;
                var17 = (var15 & 65280) * field_e & 16711680;
                var18 = (var15 & 255) * field_b & 65280;
                var12[var11] = (var16 | var17 | var18) >>> 8;
              } else if (var13 != 3) {
                if (var13 != 2) {
                  throw new IllegalArgumentException();
                }
                var15 = this.field_E[var10];
                var16 = (var15 & 16711935) * field_C & -16711936;
                var17 = (var15 & 65280) * field_C & 16711680;
                var12[var11] = ((var16 | var17) >>> 8) + field_s;
              } else {
                int incrementValue$13 = var10;
                var10++;
                var15 = this.field_E[incrementValue$13];
                var16 = field_d;
                var17 = var15 + var16;
                var18 = (var15 & 16711935) + (var16 & 16711935);
                var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
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

    jg(kj param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        super(param0, param4, param5);
        if (param6) {
          this.field_E = new int[param4 * param5];
        } else {
          this.field_E = param1;
        }
        param3 = param3 - this.field_o;
        int var8 = 0;
        for (int var9 = 0; var9 < param5; var9++) {
          for (int var10 = 0; var10 < param4; var10++) {
            int incrementValue$0 = var8;
            var8++;
            int incrementValue$1 = param2;
            param2++;
            this.field_E[incrementValue$0] = param1[incrementValue$1];
          }
          param2 = param2 + param3;
        }
    }
}
