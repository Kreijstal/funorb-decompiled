/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends da {
    byte[] field_n;
    static String field_i;
    fe[] field_k;
    ab[] field_o;
    int field_p;
    private int[] field_m;
    byte[] field_l;
    byte[] field_q;
    short[] field_j;

    public static void a(int param0) {
        if (param0 != 1012) {
          field_i = (String) null;
        }
        field_i = null;
    }

    final boolean a(u param0, int[] param1, byte param2, byte[] param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = 1;
          if (param2 < 8) {
            fb.a(-110);
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; 128 > var8; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_m[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) != 0) {
                    var7 = param0.a(107, var9 >> 2, param1);
                  } else {
                    var7 = param0.a(-1, param1, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_k[var8] = (fe) (var7);
                  this.field_m[var8] = 0;
                }
              }
            }
          }
          stackIn_20_0 = var5_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("fb.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_m = null;
        if (param0 > -125) {
          this.field_n = (byte[]) null;
        }
    }

    fb(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        ab dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_205_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ab[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        ab var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        uf var38 = null;
        byte[] var39 = null;
        ab var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ab var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ab var48 = null;
        ab var49 = null;
        ab var50 = null;
        ab var51 = null;
        ab var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var27Lifetime12;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_l = new byte[128];
          this.field_m = new int[128];
          this.field_n = new byte[128];
          this.field_o = new ab[128];
          this.field_j = new short[128];
          this.field_k = new fe[128];
          this.field_q = new byte[128];
          var38 = new uf(param0);
          for (var3 = 0; var38.field_m[var38.field_q + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.d((byte) 123);
          }
          var38.field_q = var38.field_q + 1;
          var3++;
          var5Lifetime1 = var38.field_q;
          var38.field_q = var38.field_q + var3;
          for (var6 = 0; var38.field_m[var6 + var38.field_q] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.d((byte) 111);
          }
          var6++;
          var38.field_q = var38.field_q + 1;
          var8Lifetime1 = var38.field_q;
          var38.field_q = var38.field_q + var6;
          for (var9 = 0; var38.field_m[var38.field_q + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.d((byte) 120);
          }
          var9++;
          var38.field_q = var38.field_q + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (1 < var9) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.j(-122);
              if (0 != var15_int) {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new ab[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new ab();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.j(-107);
            if (0 < var16_int) {
              var15_ref.field_k = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.j(-109);
            if (0 < var16_intLifetime1) {
              var15_ref.field_b = new byte[var16_intLifetime1 * 2 + 2];
              var40.field_b[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.j(-112);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.j(-122);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; var38.field_m[var38.field_q + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.d((byte) 86);
          }
          var38.field_q = var38.field_q + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.j(-125);
            this.field_j[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.j(-111);
            this.field_j[var20Lifetime1] = (short)(this.field_j[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var54.length > var21) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.f(-98);
            }
            this.field_j[var23] = (short)(this.field_j[var23] + jh.a(32768, var22 - 1 << 14));
            this.field_m[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (0 != this.field_m[var24]) {
              if (0 == var20Lifetime3) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_m[incrementValue$5] - 1;
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.field_q[var24] = (byte)var23Lifetime1;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (0 != this.field_m[var25_int]) {
              if (0 == var20Lifetime4) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_m[incrementValue$3] + 16 << 2;
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              this.field_n[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (this.field_m[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length <= var21Lifetime3) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              this.field_o[var26] = (ab) (var25);
              var20Lifetime5--;
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var54.length <= var21Lifetime4) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_m[var27] > 0) {
                var26Lifetime1 = var38.j(-102) + 1;
              }
            }
            var20Lifetime6--;
            this.field_l[var27] = (byte)var26Lifetime1;
          }
          this.field_p = var38.j(-95) + 1;
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_k != null) {
              for (var29 = 1; var29 < var45.field_k.length; var29 += 2) {
                var45.field_k[var29] = var38.d((byte) 89);
              }
            }
            if (null != var45.field_b) {
              for (var29Lifetime5 = 3; var45.field_b.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_b[var29Lifetime5] = var38.d((byte) 117);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.d((byte) 91);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var58.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.d((byte) 115);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_b != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_b.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.j(-118) + var19Lifetime3 + 1;
                var48.field_b[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_k != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_k.length; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + var19Lifetime4 + var38.j(-106);
                var49.field_k[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.j(-108);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + var19Lifetime5 + var38.j(-123);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_l[var29Lifetime3] = (byte)(this.field_l[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (-var27Lifetime6Lifetime1 + var30) * var28 + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = c.a(var30 - var27Lifetime6Lifetime1, 1067751487, var32);
                this.field_l[var33] = (byte)(this.field_l[var33] * var34 + 32 >> 6);
                var32 = var32 + (-var28 + var31);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_l[var30Lifetime2] = (byte)(var28 * this.field_l[var30Lifetime2] + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.j(-95);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var58.length; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + var19Lifetime6 + var38.j(-123);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28Lifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (this.field_n[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_n[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var29Lifetime4Lifetime1 < var58.length) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = c.a(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, 1067751487, var32Lifetime1);
                var35 = var34Lifetime1 + (255 & this.field_n[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                this.field_n[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (this.field_n[var30Lifetime1Lifetime2] & 255);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_n[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_i = var38.j(-98);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_k) {
              var50.field_c = var38.j(-122);
            }
            if (var50.field_b != null) {
              var50.field_f = var38.j(-113);
            }
            if (var50.field_i > 0) {
              var50.field_h = var38.j(-110);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_j = var38.j(-107);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (0 < var51.field_j) {
              var51.field_a = var38.j(-128);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_a > 0) {
              var52.field_l = var38.j(-86);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_204_0 = var2;
          stackIn_204_1 = new StringBuilder().append("fb.<init>(");
          if (param0 == null) {
            stackIn_205_2 = "null";
          } else {
            stackIn_205_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_204_0), ((StringBuilder) (Object) stackIn_204_1).append(stackIn_205_2).append(')').toString());
        }
    }

    static {
        field_i = "to keep fullscreen or";
    }
}
