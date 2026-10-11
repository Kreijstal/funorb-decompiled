/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jfa extends da {
    private int[] field_g;
    private sob field_c;
    private int[] field_e;
    private int[] field_f;
    private int[] field_h;
    private int[] field_i;
    private byte[][] field_d;

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        int var24 = 0;
        int var29 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        Object var17;
        tka var17_ref;
        int[] var18;
        int[] var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var28;
        int[] var30;
        int[] var31;
        int var23Lifetime1;
        int var28Lifetime1;
        var17 = null;
        var17_ref = (tka) (param13);
        var31 = var17_ref.field_a;
        var30 = var31;
        var18 = var30;
        var19 = var17_ref.field_b;
        var20 = param10 - this.field_c.field_H;
        var21 = param11;
        if (param15 > var21) {
          var21 = param15;
          param5 = param5 + (param15 - param11) * this.field_c.field_i;
          param4 = param4 + (param15 - param11) * param12;
        }
        if (param15 + var31.length >= param11 + param7) {
          stackIn_5_0 = param11 + param7;
        } else {
          stackIn_5_0 = param15 + var31.length;
        }
        var22 = stackIn_5_0;
        var23 = 0;
        for (var24 = var21; var24 < var22; var24++) {
          boolean decompiledFrameRemainder0 = true;
          var25 = var18[var24 - param15] + param14;
          var26 = var19[var24 - param15];
          var27 = param6;
          if (var20 <= var25) {
            var28 = var25 - var20;
            if (var28 >= param6) {
              param4 = param4 + (param6 + param9);
              param5 = param5 + (param6 + param8);
              decompiledFrameRemainder0 = false;
            }
            else {
              param4 = param4 + var28;
              var27 = var27 - var28;
              param5 = param5 + var28;
            }
          } else {
            var28 = var20 - var25;
            if (var28 >= var26) {
              param4 = param4 + (param6 + param9);
              param5 = param5 + (param6 + param8);
              decompiledFrameRemainder0 = false;
            }
            else {
              var26 = var26 - var28;
            }
          }
          if (decompiledFrameRemainder0) {
            var28Lifetime1 = 0;
            if (var27 >= var26) {
              var28Lifetime1 = var27 - var26;
            } else {
              var26 = var27;
            }
            for (var29 = -var26; var29 < 0; var29++) {
              incrementValue$0 = param4;
              param4++;
              dupTemp$1 = param0[incrementValue$0];
              var23Lifetime1 = dupTemp$1;
              if (dupTemp$1 == 0) {
                param5++;
              } else {
                incrementValue$2 = param5;
                param5++;
                param1[incrementValue$2] = param2[var23Lifetime1 & 255];
              }
            }
            param4 = param4 + (var28Lifetime1 + param9);
            param5 = param5 + (var28Lifetime1 + param8);
          }
        }
    }

    jfa(sob param0, sw param1, ima[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_c = param0;
        this.field_c = param0;
        this.field_h = param3;
        this.field_g = param4;
        this.field_d = new byte[param2.length][];
        this.field_i = new int[param2.length];
        this.field_e = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
          this.field_d[var6] = param2[var6].field_h;
          this.field_i[var6] = param2[var6].field_g;
          this.field_e[var6] = param2[var6].field_c;
        }
        this.field_f = param2[0].field_b;
    }

    private final void a(byte[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var12 = 0;
        int incrementValue$3 = 0;
        byte dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        byte dupTemp$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var11;
        int var13;
        int var11Lifetime1;
        int var13Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var11Lifetime1Lifetime3;
        int var11Lifetime1Lifetime4;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var11 = 0;
        for (var12 = -param6; var12 < 0; var12++) {
          for (var13 = var10; var13 < 0; var13++) {
            incrementValue$3 = param3;
            param3++;
            dupTemp$4 = param0[incrementValue$3];
            var11Lifetime1 = dupTemp$4;
            if (dupTemp$4 == 0) {
              param4++;
            } else {
              incrementValue$5 = param4;
              param4++;
              param1[incrementValue$5] = param2[var11Lifetime1 & 255];
            }
            incrementValue$6 = param3;
            param3++;
            dupTemp$7 = param0[incrementValue$6];
            var11Lifetime1Lifetime2 = dupTemp$7;
            if (dupTemp$7 == 0) {
              param4++;
            } else {
              incrementValue$8 = param4;
              param4++;
              param1[incrementValue$8] = param2[var11Lifetime1Lifetime2 & 255];
            }
            incrementValue$9 = param3;
            param3++;
            dupTemp$10 = param0[incrementValue$9];
            var11Lifetime1Lifetime3 = dupTemp$10;
            if (dupTemp$10 == 0) {
              param4++;
            } else {
              incrementValue$11 = param4;
              param4++;
              param1[incrementValue$11] = param2[var11Lifetime1Lifetime3 & 255];
            }
            incrementValue$12 = param3;
            param3++;
            dupTemp$13 = param0[incrementValue$12];
            var11Lifetime1Lifetime4 = dupTemp$13;
            if (dupTemp$13 == 0) {
              param4++;
            } else {
              incrementValue$14 = param4;
              param4++;
              param1[incrementValue$14] = param2[var11Lifetime1Lifetime4 & 255];
            }
          }
          for (var13Lifetime1 = param5; var13Lifetime1 < 0; var13Lifetime1++) {
            incrementValue$0 = param3;
            param3++;
            dupTemp$1 = param0[incrementValue$0];
            var11Lifetime1Lifetime1 = dupTemp$1;
            if (dupTemp$1 == 0) {
              param4++;
            } else {
              incrementValue$2 = param4;
              param4++;
              param1[incrementValue$2] = param2[var11Lifetime1Lifetime1 & 255];
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int var22 = 0;
        int var27 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        tka var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var23;
        int var24;
        int var25;
        int var26;
        int[] var28;
        int[] var29;
        int var26Lifetime1;
        var16 = null;
        var16_ref = (tka) (param12);
        var29 = var16_ref.field_a;
        var28 = var29;
        var17 = var28;
        var18 = var16_ref.field_b;
        var19 = param9 - this.field_c.field_H;
        var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.field_c.field_i;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var29.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var29.length;
        }
        var21 = stackIn_5_0;
        for (var22 = var20; var22 < var21; var22++) {
          boolean decompiledFrameRemainder0 = true;
          var23 = var17[var22 - param14] + param13;
          var24 = var18[var22 - param14];
          var25 = param5;
          if (var19 <= var23) {
            var26 = var23 - var19;
            if (var26 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var26;
              var25 = var25 - var26;
              param4 = param4 + var26;
            }
          } else {
            var26 = var19 - var23;
            if (var26 >= var24) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              var24 = var24 - var26;
            }
          }
          if (decompiledFrameRemainder0) {
            var26Lifetime1 = 0;
            if (var25 >= var24) {
              var26Lifetime1 = var25 - var24;
            } else {
              var24 = var25;
            }
            for (var27 = -var24; var27 < 0; var27++) {
              if (param0[param3++] == 0) {
                param4++;
              } else {
                param1[param4++] = param2;
              }
            }
            param3 = param3 + (var26Lifetime1 + param3);
            param4 = param4 + (var26Lifetime1 + param7);
          }
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var16 = 0;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param5 == null) {
          this.fa(param0, param1, param2, param3, param4);
          return;
        }
        param1 = param1 + this.field_e[param0];
        param2 = param2 + this.field_i[param0];
        int var9 = this.field_h[param0];
        int var10 = this.field_g[param0];
        int var11 = this.field_c.field_i;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_c.field_n) {
          var16 = this.field_c.field_n - param2;
          var10 = var10 - var16;
          param2 = this.field_c.field_n;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_c.field_p) {
          var10 = var10 - (param2 + var10 - this.field_c.field_p);
        }
        if (param1 < this.field_c.field_H) {
          var16Lifetime1 = this.field_c.field_H - param1;
          var9 = var9 - var16Lifetime1;
          param1 = this.field_c.field_H;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (param1 + var9 > this.field_c.field_A) {
          var16Lifetime2 = param1 + var9 - this.field_c.field_A;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        if (param4) {
          this.a(this.field_d[param0], this.field_c.field_k, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        } else {
          this.a(this.field_d[param0], this.field_c.field_k, this.field_f, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          for (var12Lifetime1 = param5; var12Lifetime1 < 0; var12Lifetime1++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        param1 = param1 + this.field_e[param0];
        param2 = param2 + this.field_i[param0];
        int var6 = this.field_h[param0];
        int var7 = this.field_g[param0];
        int var8 = this.field_c.field_i;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_c.field_n) {
          var13 = this.field_c.field_n - param2;
          var7 = var7 - var13;
          param2 = this.field_c.field_n;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_c.field_p) {
          var7 = var7 - (param2 + var7 - this.field_c.field_p);
        }
        if (param1 < this.field_c.field_H) {
          var13Lifetime1 = this.field_c.field_H - param1;
          var6 = var6 - var13Lifetime1;
          param1 = this.field_c.field_H;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + var6 > this.field_c.field_A) {
          var13Lifetime2 = param1 + var6 - this.field_c.field_A;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        if (param4) {
          this.a(this.field_d[param0], this.field_c.field_k, param3, var12, var9, var6, var7, var10, var11);
        } else {
          this.a(this.field_d[param0], this.field_c.field_k, this.field_f, var12, var9, var6, var7, var10, var11);
        }
    }
}
